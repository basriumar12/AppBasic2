package com.blogbasbas.hari3.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import com.blogbasbas.hari3.R;

public class MyBrowserActivity extends AppCompatActivity {
    Button button;
    WebView webView;
    EditText txtUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_browser);
        webView = (WebView)findViewById(R.id.webView);
        txtUrl = (EditText) findViewById(R.id.txtURL);
        button = (Button) findViewById(R.id.btnGo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilkanWebView();
            }
        });

    }

    private void TampilkanWebView() {
        // dapatkan url dari editext
        String url_tujuan = txtUrl.getText().toString();
        // siapkan webview
        webView.getSettings().setJavaScriptEnabled(true); // aktifkan javascript
        webView.getSettings().getTextZoom();
        // setting web client
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                //txtURL.setText(view.getUrl().toString());
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        webView.loadUrl(url_tujuan);
    }
}
