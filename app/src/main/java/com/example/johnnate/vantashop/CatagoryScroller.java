package com.example.johnnate.vantashop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by JohnNate on 5/3/17.
 */

public class CatagoryScroller extends Fragment {

    @BindView(R.id.menuBtn) Button menuBtn;
    @BindView(R.id.searchBtn) Button searchBtn;

    @BindView(R.id.graphiccards)
    FrameLayout gpus;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.category_scroller, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.menuBtn)
    public void openMenu ()
    {
        ((BaseActivity)getActivity()).openDrawer();
    }

    @OnClick(R.id.graphiccards)
    public void openSubCatagory()
    {
        ((BaseActivity)getActivity()).changeFragment("gpu");
    }
}
