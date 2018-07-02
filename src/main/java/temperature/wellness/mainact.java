package temperature.wellness;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



    public class mainact extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            Button simpleButton1 = (Button) findViewById(R.id.simpleButton1);
            simpleButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mainact.this, activity2.class);
                    startActivity(intent);
                    finish();
                }
            });


            Button simpleButton2 = (Button) findViewById(R.id.simpleButton2);
            simpleButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mainact.this, act3.class);
                    startActivity(intent);
                    finish();
                }
            });

            Button simpleButton3 = (Button) findViewById(R.id.simpleButton3);
            simpleButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mainact.this, act4.class);
                    startActivity(intent);
                    finish();
                }
            });
            Button simpleButton4 = (Button) findViewById(R.id.patreon);
            simpleButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goToUrl("https://www.paypal.me/AustinWhiteDeveloper");
                }
            });
        }
        private void goToUrl (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
    }