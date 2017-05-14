package com.example.johnnate.vantashop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by JohnNate on 5/14/17.
 */

public class Home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.menuBtn)
    public void menu ()
    {
        ((BaseActivity)getActivity()).openDrawer();
    }
}
