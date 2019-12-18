package com.example.aiub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private WebView aiub;
    private Button buttonView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aiub = (WebView) findViewById(R.id.aiubID);
        WebSettings webSettings = aiub.getSettings();
        webSettings.setJavaScriptEnabled(true);
        aiub.setWebViewClient(new WebViewClient());
        aiub.loadUrl("https://www.aiub.edu/");
        buttonView = (Button) findViewById(R.id.aiubID);
        buttonView.setOnClickListener();
    }

    @Override
    public void onBackPressed() {
        if(aiub.canGoBack()) {

        aiub.goBack();

        }
        else {
        super.onBackPressed();

        }
        }
    }

