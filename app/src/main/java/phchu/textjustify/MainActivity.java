package phchu.textjustify;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {
    private static final String TEXT_JUSTIFY = "file:///android_asset/text_justify.html?info=";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView desWebView = (WebView)findViewById(R.id.content_description_webview);
        String content = getResources().getString(R.string.content);
        desWebView.getSettings().setJavaScriptEnabled(true);
        desWebView.setBackgroundColor(0x00000000);
        try{
            desWebView.loadUrl(TEXT_JUSTIFY + URLEncoder.encode(content, "utf-8"));
        }catch (UnsupportedEncodingException uee){
            uee.printStackTrace();
        }
    }
}
