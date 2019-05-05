package gunjika.varshney.gla.twoactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(NewActivity.this,"onStart:called", Toast.LENGTH_SHORT).show();
        Log.i("NewActivity","onStart:called");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(NewActivity.this,"onResume:called",Toast.LENGTH_SHORT).show();
        Log.i("NewActivity","or called");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(NewActivity.this,"onPause:called",Toast.LENGTH_SHORT).show();
        Log.i("NewActivity","op called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(NewActivity.this,"onStop: called",Toast.LENGTH_SHORT).show();
        Log.i("NewActivity","os called");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(NewActivity.this,"onDestroy:called",Toast.LENGTH_SHORT).show();
        Log.i("NewActivity","od called");
    }
}
