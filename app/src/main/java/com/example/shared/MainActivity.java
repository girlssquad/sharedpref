package com.example.shared;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etID, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = findViewById(R.id.etEmailID);
        etPassword = findViewById(R.id.etPassword);
    }

    public void loginUser(View v){
        String userID = etID.getText().toString();
        String userToken = "tttooookkkkeeennn";
        AppData appData = new AppData(this);
        appData.saveToken(userID, userToken);

        Toast.makeText(this,
                "hello",
                Toast.LENGTH_LONG).show();
    }

    public void registerUser(View v){
        String[] result = new String[2];
        AppData appData = new AppData(this);
        result = appData.getToken();

        Toast.makeText(this,
                "id: " + result[0] + " token: " + result[1],
                Toast.LENGTH_LONG).show();
    }
}
