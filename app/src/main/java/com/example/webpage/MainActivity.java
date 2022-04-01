package com.example.webpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    WebView web;
    String userInput;
    String refesh = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextSearchID);
        web = findViewById(R.id.webViewID);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
    }

    public void searchOnWeb(View v) {
        userInput = editText.getText().toString();
        refesh = editText.getText().toString();
        web.loadUrl("http://" + userInput);
    }

    public void refreshPage(View v) {
        if(refesh.isEmpty() == false) {
            web.loadUrl("http://" + refesh);
        }
    }
}