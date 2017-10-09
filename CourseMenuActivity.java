package greendevelopers.aprenderlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CourseMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_menu);
    }

    public void Continue(View v) {

        //System.out.println("Clicked register");
        //startActivity(new Intent(this, CourseHomeActivity.class));

        Intent intent=new Intent(getApplicationContext(),CourseHomeActivity.class);
        switch (v.getId()){
            case R.id.imageButton:
                intent.putExtra("course",1);
                break;
            case R.id.imageButton2:
                intent.putExtra("course",2);
                break;
            case R.id.imageButton3:
                intent.putExtra("course",3);
                break;
            case R.id.imageButton4:
                intent.putExtra("course",4);
                break;
        }

        startActivity(intent);
    }
}
