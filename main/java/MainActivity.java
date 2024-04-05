package com.myapplication.ronakproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button animation
        Button runDiagnosticsButton = findViewById(R.id.run_diagnostics_button);
        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        runDiagnosticsButton.startAnimation(scaleAnimation);

        // Handle click on "Run Diagnostics" button
        runDiagnosticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add more advanced animation here (e.g., transition animation)
                startActivity(new Intent(MainActivity.this, DiagnosticsActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}
