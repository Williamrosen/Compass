/*

External code usage:

How to create a compass app:
https://www.wlsdevelop.com/index.php/en/blog?option=com_content&view=article&id=38




 */


package com.example.compass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCompass(View view) {
        Intent intent = new Intent(this, CompassActivity.class);
        startActivity(intent);

    }

}
