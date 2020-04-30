package uz.islombek.musenarium;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class Oybek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oybek);
        final Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+998712480900"));
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
