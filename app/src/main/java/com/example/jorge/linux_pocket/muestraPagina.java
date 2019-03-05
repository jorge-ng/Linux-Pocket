package com.example.jorge.linux_pocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class muestraPagina extends AppCompatActivity {

    WebView webView;

    int pos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_pagina);

        Bundle extras = getIntent().getExtras();

        pos= extras.getInt("posicion");

        WebView myWebView = (WebView) findViewById(R.id.web);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

        switch (pos){
            case 0:
                myWebView.loadUrl("file:///android_asset/400comandos/index.html");
                break;
            case 1:
                myWebView.loadUrl("file:///android_asset/comandos_basicos/index.html");
                break;
            case 2:
                myWebView.loadUrl("file:///android_asset/modo_ficheros/index.html");
                break;
            case 3:
                myWebView.loadUrl("file:///android_asset/dpkg/index.html");
                break;
        }

    }
}
