package com.blogbasbas.hari3.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.blogbasbas.hari3.R;

public class RsArifinActivity extends AppCompatActivity {
    WebView htmlweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs_arifin);
        htmlweb = (WebView)findViewById(R.id.webhtml);
        htmlweb.getSettings().setJavaScriptEnabled(true);
        htmlweb.loadUrl("file:///android_asset/RsjiwaTampan.html");
    }
}
