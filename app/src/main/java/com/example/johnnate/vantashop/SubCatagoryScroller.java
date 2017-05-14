package com.example.johnnate.vantashop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by JohnNate on 5/12/17.
 */

public class SubCatagoryScroller extends Fragment implements AdapterView.OnItemClickListener {

    @BindView(R.id.menuBtn) Button menuBtn;
    @BindView(R.id.searchBtn) Button searchBtn;
    @BindView(R.id.products) ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.subcatagory_scroller, container, false);

        ButterKnife.bind(this, view);

        populateListView();

        return view;
    }

    public void populateListView()
    {
        //Add new mock products
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1,"GTX TITAN", 1000000, getResources().getDrawable(R.drawable.gpu)));
        products.add(new Product(2,"GTX 1080", 900000, getResources().getDrawable(R.drawable.gpu)));


//       Array Adapter
        CatagoryCard catagoryCard = new CatagoryCard(getContext(), products);

        //Attach to list view
        listView.setAdapter(catagoryCard);

    }

    @OnClick(R.id.menuBtn)
    public void openMenu ()
    {
        ((BaseActivity)getActivity()).openDrawer();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Toast.makeText(getContext(),String.valueOf(i), Toast.LENGTH_LONG);

    }
}
