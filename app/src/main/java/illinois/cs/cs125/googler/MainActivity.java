package illinois.cs.cs125.googler;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        System.out.println("test 1123adsfea");
        Intent intent = new Intent(Intent.ACTION_VIEW);
        String temp = "https://www.google.com/";
        intent.setData(Uri.parse(temp));
        startActivity(intent);
    }

    //final Button googler = findViewById(R.id.button);
    //googler.OnClickListener()
}
