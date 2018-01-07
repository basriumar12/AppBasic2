package com.blogbasbas.hari3.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.blogbasbas.hari3.R;

/**
 * Created by Server on 24/09/2017.
 */

public class RsEkaActivity extends AppCompatActivity {
   WebView htmlweb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs_arifin);
        htmlweb = (WebView)findViewById(R.id.webhtml);
        htmlweb.getSettings().setJavaScriptEnabled(true);
        htmlweb.loadUrl("file:///android_asset/RsEka.html");
    }
}
