package com.example.johnnate.vantashop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by JohnNate on 5/4/17.
 */

public class SignUpScreen extends AppCompatActivity {

    @BindView(R.id.username) EditText username;
    @BindView(R.id.password) EditText password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(R.style.LoginScreen);
        setContentView(R.layout.signup_screen);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.signupButton)
    public void loginButton ()
    {
        Toast.makeText(getApplicationContext(), username.toString(), Toast.LENGTH_LONG).show();
    }
}
