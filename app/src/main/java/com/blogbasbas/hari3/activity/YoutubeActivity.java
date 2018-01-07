package com.blogbasbas.hari3.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.blogbasbas.hari3.R;

public class YoutubeActivity extends AppCompatActivity {
        WebView youtub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        youtub =(WebView)findViewById(R.id.yotubeweb);
        youtub.getSettings().setJavaScriptEnabled(true);
        youtub.setWebViewClient(new WebViewClient());
        youtub.loadUrl("http://youtube.com");
    }

    @Override
    public void onBackPressed() {
        if (youtub.canGoBack()) {
            youtub.goBack();
        } else {
            super.onBackPressed();
        }

    }}
