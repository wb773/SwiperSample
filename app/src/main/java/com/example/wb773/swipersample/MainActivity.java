package com.example.wb773.swipersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView webView = (WebView) findViewById(R.id.webview);

        //各設定
        webView.setWebViewClient(new WebViewClient() {});       //標準のブラウザが開かないようにする
        webView.getSettings().setLoadWithOverviewMode(true);    //スケールの調整
        webView.getSettings().setUseWideViewPort(true);         //スケールの調整（Viewport）
        webView.getSettings().setJavaScriptEnabled(true);       //javascriptを有効にする

        webView.loadUrl("file:///android_asset/swipersample.html");

    }
}
