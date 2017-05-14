package com.example.johnnate.vantashop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by JohnNate on 5/12/17.
 */

public class ProductView extends Fragment{

    @BindView(R.id.menuBtn) Button menuBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.product_view, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.menuBtn)
    public void openmenu ()
    {
        ((BaseActivity)getActivity()).openDrawer();
    }
}
