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



        login.setOnClickListener (
                new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {

                        String username, password;
                        username=eduser.getText().toString();
                        password=edpassword.getText().toString();
                        if((username.equals("") || username.equals(null)) && (password.equals("") || password.equals(null))){
                            eduser.setError("Error");
                            eduser.setBackgroundResource(R.drawable.edittext_error);
                            edpassword.setError("Error");
                            edpassword.setBackgroundResource(R.drawable.edittext_error);
                        }
                        else if(!username.equals("") || !username.equals(null) && (password.equals("") || password.equals(null))){

                            edpassword.setError("Error");
                            edpassword.setBackgroundResource(R.drawable.edittext_error);
                            eduser.setBackgroundResource(0);
                        }
                        else if((username.equals("") || username.equals(null)) && (!password.equals("") || !password.equals(null))){
                            edpassword.setBackgroundResource(0);
                            eduser.setError("Error");
                            eduser.setBackgroundResource(R.drawable.edittext_error);
                        }
                        else if(!username.equals("") && !username.equals(null) && !password.equals("") && !password.equals(null)){
                            Intent i = new Intent ( getApplicationContext (), Home.class );
                            startActivity ( i );
                        }
                        else
                            {

                            }


                    }
                } );


    }
}
