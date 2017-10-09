package greendevelopers.aprenderlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void Continue(View v) {

        System.out.println("Clicked register");
        startActivity(new Intent(this, CourseMenuActivity.class));

    }
}
