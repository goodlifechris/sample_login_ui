package ke.co.testpinterestlogin;

import android.net.http.SslError;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlcActivity extends AppCompatActivity {

    WebView webViewAlc;

    static String url="https://andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webViewAlc = (WebView) findViewById(R.id.webviewAlc);
        webViewAlc.setWebViewClient(new MyBrowser());

        webViewAlc.getSettings().setLoadsImagesAutomatically(true);
        webViewAlc.getSettings().setJavaScriptEnabled(true);
        webViewAlc.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webViewAlc.loadUrl(url);

    }
}

class MyBrowser extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler,
                                   SslError error) {
        handler.proceed();
    }
}


