package sg.edu.rp.c346.id21034676.mywebbrowser;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private Button openButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the WebView and Button
        webView = findViewById(R.id.webView);
        openButton = findViewById(R.id.openButton);

        // Set a WebViewClient to handle page navigation within the WebView
        webView.setWebViewClient(new WebViewClient());

        // Set a click listener for the Button
        openButton.setOnClickListener(view -> {
            // Load the URL when the button is clicked
            String url = "https://www.rp.edu.sg/soi/home";
            webView.loadUrl(url);
        });
    }
}

