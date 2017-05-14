package com.example.johnnate.vantashop;

import android.content.Intent;
import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by JohnNate on 5/3/17.
 */

public class BaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {

    @BindView(R.id.my_navigation_view) NavigationView mNav;
    @BindView(R.id.drawer_layout) DrawerLayout mDrawer;


    Home home = new Home();
    CatagoryScroller catagoryScroller = new CatagoryScroller();
    SubCatagoryScroller sub = new SubCatagoryScroller();
    ProductView prod = new ProductView();
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Theme and Layout
        setTheme(R.style.CatrgoryScroller);
        setContentView(R.layout.menu_wrapper);

//        ButterKnife
        ButterKnife.bind(this);

        //Load fragment
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, home);
        fragmentTransaction.commit();

//        Listener for click
        mNav.setNavigationItemSelectedListener(this);
    }

    public void openDrawer ()
    {
        mDrawer.openDrawer(Gravity.LEFT);
    }

    public void selectProduct(int prodId)
    {

    }

    public void changeFragment (String type)
    {
        switch(type)
        {
            case "catagory":
            {
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.frame, catagoryScroller);
                fragmentTransaction.commit();
            }break;

            case "gpu":
            {
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.frame, sub);
                fragmentTransaction.commit();
            }break;

            case "gtxtitan":
            {
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.frame, prod);
                fragmentTransaction.commit();
            }break;
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


//        Close Drawer
        mDrawer.closeDrawers();

        switch (item.getItemId())
        {
            case R.id.nav_item_1:
            {
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.replace(R.id.frame, catagoryScroller);
                fragmentTransaction.commit();
                return true;
            }

            case R.id.nav_item_2:
            {
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.replace(R.id.frame, prod);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                return true;
            }

            case R.id.login_drawer:
            {
                Intent login = new Intent(BaseActivity.this, LoginScreen.class);
                startActivity(login);
                item.setChecked(false);
                return true;
            }

            default:
                return false;
        }
    }
}
