package tubes.hamda.app.running;

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

    public void run1(View view) {
        Intent intent = new Intent(MainActivity.this, Artikel1Activity.class);
        startActivity(intent);

    }

    public void run2(View view) {
        Intent intent = new Intent(MainActivity.this, Artikel2Activity.class);
        startActivity(intent);
    }

    public void run3(View view) {
        Intent intent = new Intent(MainActivity.this, Artikel3Activity.class);
        startActivity(intent);
    }
}
