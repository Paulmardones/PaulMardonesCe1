

package cl.paul.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
     ImageButton btSpa;
    ImageButton german;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btSpa=(ImageButton) findViewById(R.id.btSpa);
        german =(ImageButton) findViewById(R.id.german);
        Intent intent2 = new Intent(this, MainActivity3.class);
        Intent intent = new Intent(this, MainActivity2.class);
         btSpa.setOnClickListener(view -> startActivity(intent));

        german.setOnClickListener(view -> startActivity(intent2));


    }
}