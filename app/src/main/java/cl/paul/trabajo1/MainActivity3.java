package cl.paul.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {
    ImageButton atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        atras =(ImageButton) findViewById(R.id.atras);
        Intent intent4 = new Intent(this,MainActivity.class);
        atras.setOnClickListener(view -> startActivity(intent4));
    }
}