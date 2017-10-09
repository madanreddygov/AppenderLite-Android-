package greendevelopers.aprenderlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PerformanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance);
    }

    public void backToMain(View v){
        finish();
    }
}
