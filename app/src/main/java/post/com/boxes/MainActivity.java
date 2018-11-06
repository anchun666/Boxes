package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        public void boxes(View view){
            Log.d("MainActivity ","box");
            EditText edLength = findViewById(R.id.ed_length);
            EditText edWidth = findViewById(R.id.ed_width);
            EditText edHeight = findViewById(R.id.ed_height);
            }


    }
}
