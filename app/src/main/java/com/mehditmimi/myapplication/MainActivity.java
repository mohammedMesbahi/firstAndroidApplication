package com.mehditmimi.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.mehditmimi.myapplication.actions.AuthentificationAction;
import com.mehditmimi.myapplication.businsess.Services;

public class MainActivity extends Activity {
    private Button loginButton ;
    private EditText passwordInput;
    private EditText emailInput;
    Services services;

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(Button loginButton) {
        this.loginButton = loginButton;
    }

    public EditText getPasswordInput() {
        return passwordInput;
    }

    public void setPasswordInput(EditText passwordInput) {
        this.passwordInput = passwordInput;
    }

    public EditText getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(EditText emailInput) {
        this.emailInput = emailInput;
    }

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      //  Button button = new Button(this);
      //  button.setText("hello world");
      //  setContentView(button);
        setContentView(R.layout.activity_main);
        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);
        loginButton = findViewById(R.id.login_button);
        AuthentificationAction authentificationAction  = new AuthentificationAction(this);
        loginButton.setOnClickListener(authentificationAction);
        services = ((MyContext)getApplicationContext()).getServices();
    }
}
