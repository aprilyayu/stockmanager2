package com.ace.navv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Aze Chan on 07/03/2018.
 */

public class login extends AppCompatActivity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.login );

        Button mEmailSignInButton = (Button) findViewById( R.id.btn );
        mEmailSignInButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( login.this, Dashboard.class ) );
            }
        } );
    }
}
