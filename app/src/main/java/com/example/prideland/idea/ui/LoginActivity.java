package com.example.prideland.idea.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.prideland.idea.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.loginbutton) Button mLoginbutton;
    @BindView(R.id.logintext) TextView mLogintext;

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        mLogintext.setOnClickListener(this);

//        Typeface righteousFonts = Typeface.createFromAsset(getAssets(), "fonts/Righteous/Righteous-Regular.ttf");
//        mLogintext.setTypeface(righteousFonts);


    }

    @Override
    public void onClick(View v) {
        if(v == mLoginbutton){
            Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(intent);
        }
    }
}
