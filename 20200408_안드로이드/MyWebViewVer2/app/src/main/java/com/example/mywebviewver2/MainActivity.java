package com.example.mywebviewver2;

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
    WebView webV1;
    WebView webV2;
    WebView webV3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button btnPrev, btnNext;
        final ViewFlipper vFlipper;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

//버튼
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
//버튼끝

        //웹뷰시작
        webV1 = (WebView) findViewById(R.id.webViewOne);
        webV1.getSettings().setJavaScriptEnabled(true);
        webV1.loadUrl("http://ghktla.dothome.co.kr/main");
        webV1.setWebChromeClient(new WebChromeClient());
        webV1.setWebViewClient(new WebviewClientClass());


        webV2 = (WebView) findViewById(R.id.webViewTwo);
        webV2.getSettings().setJavaScriptEnabled(true);
        webV2.loadUrl("http://ksw311.dothome.co.kr/main");
        webV2.setWebChromeClient(new WebChromeClient());
        webV2.setWebViewClient(new WebviewClientClass());

        webV3 = (WebView) findViewById(R.id.webViewThree);
        webV3.getSettings().setJavaScriptEnabled(true);
        webV3.loadUrl("http://www.naver.com");
        webV3.setWebChromeClient(new WebChromeClient());
        webV3.setWebViewClient(new WebviewClientClass());

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
        return super.onKeyDown(keyCode, event);
    }
    private class WebviewClientClass extends WebViewClient {//페이지 이동
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
