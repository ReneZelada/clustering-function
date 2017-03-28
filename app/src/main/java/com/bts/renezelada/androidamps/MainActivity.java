package com.bts.renezelada.androidamps;

import android.content.Intent;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Maps,facebook,linkein,github;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Maps=(Button)findViewById(R.id.Maps);
        facebook=(Button)findViewById(R.id.button5);
        linkein =(Button)findViewById(R.id.button7);
        github =(Button)findViewById(R.id.button6);

        Maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Maps.class);
                startActivity(i);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.facebook.com/Razp92";
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
                builder.setShowTitle(true);
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(url));
            }
        });
        linkein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.linkedin.com/in/rené-zelada-b940a2108/";
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
                builder.setShowTitle(true);
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(url));
            }
        });
    github.setOnClickListener(new View.OnClickListener() {
          @Override
        public void onClick(View view) {
              String url = "https://github.com/ReneZelada";
              CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
              builder.setToolbarColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
              builder.setShowTitle(true);
              CustomTabsIntent customTabsIntent = builder.build();
              customTabsIntent.launchUrl(MainActivity.this, Uri.parse(url));
            }
        });

    }
}
