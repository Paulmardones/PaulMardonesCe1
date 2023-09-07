package cl.paul.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    ImageButton btatras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btatras  =(ImageButton) findViewById(R.id.btatras);
        Intent intent3 = new Intent(this,MainActivity.class);
        btatras.setOnClickListener(view -> startActivity(intent3));

    }
}