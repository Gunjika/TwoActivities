package gunjika.varshney.gla.twoactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "onstart", Toast.LENGTH_SHORT).show();
        Log.e("MainActivity:onstart","called");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this, "onresume", Toast.LENGTH_SHORT).show();
        Log.e("MainActivity:onrseume","or called");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(MainActivity.this, "onpause", Toast.LENGTH_SHORT).show();
        Log.e("MainActivity:onPause","op called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(MainActivity.this, "onstop", Toast.LENGTH_SHORT).show();
        Log.e("MainActivity:onstop","os called");
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Toast.makeText(MainActivity.this, "ondestroy", Toast.LENGTH_SHORT).show();
        Log.e("MainActivity:ondestroy","od called");
    }
}
