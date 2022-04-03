package com.example.androidmvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        //we need to create a button that when the user
        //clicked it, it will display text in textview.

        //1- implementing MVC Pattern

    }

    public MyModel GetAppFromModel(){
        return new MyModel("MVC App",900,4);
    }

    public void DisplayAppInText(View view){
        textView.setText(GetAppFromModel().getAppName() + "Downloads" +GetAppFromModel().getAppDownload());

    }


    //View:TextView
    //Model : Mymodel Class
    //Controller: MainActivity.
}