package com.batch2.m0nk3y.webview;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    public String string;
    public WebView WV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //string=getIntent().getStringExtra("WEB_URL");
        string = "http://google.com";
        WV= findViewById(R.id.webview);
        WV.loadUrl(string);
        WV.getSettings().setJavaScriptEnabled(true);
        WV.setWebViewClient(new myBrowser());
        // WV = findViewById(R.id.webview);
        //WV.loadUrl("https://leagueoflegends.com");

    }

    public class myBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }
    }
}
