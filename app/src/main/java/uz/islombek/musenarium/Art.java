package uz.islombek.musenarium;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class Art extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);
        final Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+998712563943"));
        Button tel = (Button) findViewById(R.id.tel);
        tel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }
}
