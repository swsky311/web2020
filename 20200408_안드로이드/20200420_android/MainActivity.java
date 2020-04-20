package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private WebView webV1;
    private WebView webV2;
    private WebView webV3;
    private WebView webV4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button btnPrev,btnNext;
        final ViewFlipper vFlipper;

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);
        vFlipper = (ViewFlipper) findViewById(R.id.viewFlip);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showPrevious();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showNext();
            }
        });


        webV1 = (WebView) findViewById(R.id.webViewOne);
        webV2 = (WebView) findViewById(R.id.webViewTwo);
        webV3 = (WebView) findViewById(R.id.webViewThree);
        webV4 = (WebView) findViewById(R.id.webViewFour);

        webV1.getSettings().setJavaScriptEnabled(true);
        webV1.loadUrl("http://www.naver.com");
        webV1.setWebChromeClient(new WebChromeClient());
        webV1.setWebViewClient(new WebViewClientClass());



        webV2.getSettings().setJavaScriptEnabled(true);
        webV2.loadUrl("http://www.daum.net");
        webV2.setWebChromeClient(new WebChromeClient());
        webV2.setWebViewClient(new WebViewClientClass());

        webV3.getSettings().setJavaScriptEnabled(true);
        webV3.loadUrl("https://www.youtube.com/playlist?list=PLqjikBbNQr7zi98fI1b7FPMPcw4ESjeAM");
        webV3.setWebChromeClient(new WebChromeClient());
        webV3.setWebViewClient(new WebViewClientClass());
        webV3.getSettings().setUseWideViewPort(true);

        webV4.getSettings().setJavaScriptEnabled(true);
        webV4.loadUrl("https://www.youtube.com/playlist?list=PL5wb9LgS1DNeTgTAujafF-7sNtJIdwjda");
        webV4.setWebChromeClient(new WebChromeClient());
        webV4.setWebViewClient(new WebViewClientClass());
        webV4.getSettings().setUseWideViewPort(true);


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {//뒤로가기 버튼 이벤트
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webV1.canGoBack()) {//웹뷰에서 뒤로가기 버튼을 누르면 뒤로가짐
            webV1.goBack();
            return true;
        }
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webV2.canGoBack()) {//웹뷰에서 뒤로가기 버튼을 누르면 뒤로가짐
            webV2.goBack();
            return true;
        }
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webV3.canGoBack()) {//웹뷰에서 뒤로가기 버튼을 누르면 뒤로가짐
            webV3.goBack();
            return true;
        }
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webV4.canGoBack()) {//웹뷰에서 뒤로가기 버튼을 누르면 뒤로가짐
            webV4.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }






    private class WebViewClientClass extends WebViewClient {//페이지 이동
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
