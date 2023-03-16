package com.mehditmimi.myapplication.actions;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mehditmimi.myapplication.MainActivity;
import com.mehditmimi.myapplication.beans.User;

public class AuthentificationAction implements View.OnClickListener{
    private EditText emailInput;
    private EditText pwdInput;
    private MainActivity mainActivity ;
    public AuthentificationAction(MainActivity mainActivity){
        this.mainActivity = mainActivity;
        emailInput = mainActivity.getEmailInput();
        pwdInput = mainActivity.getPasswordInput();
    }
    @Override
    public void onClick(View view) {
        
        if (emailInput.getText().equals("") || pwdInput.getText().equals("")){
            Toast.makeText(mainActivity, "all fields are required", Toast.LENGTH_SHORT).show();
        }
        // authentification
        User user = mainActivity.getServices().authenticate(emailInput.getText().toString(),pwdInput.getText().toString());
        if(user !=null){
            Toast.makeText(mainActivity, "welcome " + user.getName(), Toast.LENGTH_SHORT).show();
            
        } else {
            Toast.makeText(mainActivity, "wrong cridintials", Toast.LENGTH_SHORT).show();
        }
    }
}
