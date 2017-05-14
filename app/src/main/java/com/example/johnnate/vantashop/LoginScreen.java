package com.example.johnnate.vantashop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by JohnNate on 5/1/17.
 */

public class LoginScreen extends AppCompatActivity {

    @BindView(R.id.username) EditText username;
    @BindView(R.id.password) EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(R.style.LoginScreen);
        setContentView(R.layout.login_screen);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.loginButton)
    public void loginButton ()
    {
        Toast.makeText(getApplicationContext(), username.getText(), Toast.LENGTH_SHORT).show();
    }
}
