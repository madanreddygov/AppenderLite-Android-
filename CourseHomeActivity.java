package greendevelopers.aprenderlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CourseHomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_home);

        int course = getIntent().getIntExtra("course",-1);
        System.out.println(course);
        TextView textView=(TextView) findViewById(R.id.textView);
        switch (course){
            case 1:
                textView.setText("ANDROID");
                break;
            case 2:
                textView.setText("DATABASE");
                break;
            case 3:
                textView.setText("HTML");
                break;
            case 4:
                textView.setText("JAVA");
                break;
        }
    }

    public void course(View view){
        Intent intent=new Intent(this,StartCourseActivity.class);
        startActivity(intent);
    }
    public void videos(View view){
        Intent intent=new Intent(this, VideosActivity.class);
        startActivity(intent);
    }
    public void takeTest(View view){
        Intent intent=new Intent(this, CourseTest.class);
        startActivity(intent);
    }
    public void performance(View view){
        Intent intent=new Intent(this, PerformanceActivity.class);
        startActivity(intent);
    }

}
