package com.busenazkose.childapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.busenazkose.childapp.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FirebaseAuth auth;
    LanguageManager lang = new LanguageManager(this);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        auth = FirebaseAuth.getInstance();

        Button SignInButton = findViewById(R.id.signInButton);
        Button SignUpButton = findViewById(R.id.signUpButton);
        Button EnglishButton = findViewById(R.id.enBtn);
        Button TurkishButton = findViewById(R.id.trBtn);
        SignInButton.setOnClickListener(this::SignInClicked);
        SignUpButton.setOnClickListener(this::SignUpClicked);
        EnglishButton.setOnClickListener(v -> translateEN());
        TurkishButton.setOnClickListener(v -> translateTR());
    }


    private void SignInClicked(View view){

        String email = binding.emailText.getText().toString();
        String password = binding.passwordText.getText().toString();

        if(email.equals("")||password.equals("")){
            Toast.makeText(this,"Invalid Email Or Password",Toast.LENGTH_LONG).show();
        }else{
            auth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Intent intent = new Intent(MainActivity.this,page1.class);
                    startActivity(intent);
                    //finish();
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this, e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }
            });
        }

    }
    private void SignUpClicked(View view){

        String email = binding.emailText.getText().toString();
        String password = binding.passwordText.getText().toString();

        if(email.equals("") ||password.equals("")){
            Toast.makeText(this,"Invalid Email Or Password", Toast.LENGTH_LONG).show();
        }else{
            auth.createUserWithEmailAndPassword(email, password).addOnSuccessListener(authResult -> {
                Intent intent = new Intent(MainActivity.this,page1.class);
                startActivity(intent);
            }).addOnFailureListener(e -> Toast.makeText(MainActivity.this, e.getLocalizedMessage(),Toast.LENGTH_LONG).show());
        }

    }

    private void translateEN() {
        lang.updateLang("en");
        recreate();
    }

    private void translateTR() {
        lang.updateLang("tr");
        recreate();
    }



}