package com.example.mytabsver1;


import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class FragmentA_Activity extends Fragment {
    private WebView webV1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a, container, false);


        webV1 = (WebView) v.findViewById(R.id.webViewOne);
        webV1.getSettings().setJavaScriptEnabled(true);
        webV1.loadUrl("http://hanyong0807.dothome.co.kr/main/");
        webV1.setWebChromeClient(new WebChromeClient());
        webV1.setWebViewClient(new WebViewClientClass());


        return v;
    }


    private class WebViewClientClass extends WebViewClient {//페이지 이동
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }



}
