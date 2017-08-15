package quangkhuongduy.com.demowithgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 10; i++) {
            Toast.makeText(this, i % 2 == 0 ? i + " La so chan" : i + " La so le", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Hoan Tat", Toast.LENGTH_SHORT).show();
    }
}
