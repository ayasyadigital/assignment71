package com.niketgoel.assignment71;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    //For Assignment 7.1 for Entering Search Text
    private EditText editTextInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInput = (EditText) findViewById(R.id.editTextInput);

    }

    //For Assignment 7.1 for Entering Search Text
    public void onSearchClick(View v) {
        try {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            String term = editTextInput.getText().toString();
            intent.putExtra(SearchManager.QUERY, term);
            startActivity(intent);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
