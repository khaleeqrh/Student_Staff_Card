package com.example.student_staff_card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

EditText eduser, edpassword;
    public Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        setContentView ( R.layout.activity_login );
        eduser=findViewById(R.id.user);
        edpassword=findViewById(R.id.password);
        login= findViewById ( R.id.login );
        eduser.setHint(R.string.username);
        edpassword.setHint(R.string.password);



        login.setOnClickListener (
                new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {

                        String username, password;
                        username=eduser.getText().toString();
                        password=edpassword.getText().toString();
                        int loginvalid=0;
                        if((username.equals("") || username.equals(null))){
                            eduser.setError(R.string.errorusername+"");
                            eduser.setBackgroundResource(R.drawable.edittext_error);
                        loginvalid=1;
                        }
                        if((password.equals("") || password.equals(null))){

                            edpassword.setError(R.string.errorpassword+"");
                            edpassword.setBackgroundResource(R.drawable.edittext_error);

                        loginvalid=1;
                        }
                        if(loginvalid==0) {
                            Intent i = new Intent ( getApplicationContext (), Home.class );
                            startActivity ( i );

                        }


                    }
                } );


    }
}
