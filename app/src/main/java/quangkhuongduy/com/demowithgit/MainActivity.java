package quangkhuongduy.com.demowithgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                Toast.makeText(this, i + "", Toast.LENGTH_SHORT).show();
            }
            i++;
        }


    }
}
