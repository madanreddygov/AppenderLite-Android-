package greendevelopers.aprenderlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class LoginActivity extends AppCompatActivity{

    LoginButton fbloginButton;
    TextView textView;
    CallbackManager callbackManager;
    Button bLogin;
    EditText etUsername, etPassword;
    Button bRegister;
    Button bContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Fb Login
        FacebookSdk.sdkInitialize(getApplicationContext());

        setContentView(R.layout.activity_login);

        //etUsername = (EditText) findViewById(R.id.usernameET);
        //etPassword = (EditText) findViewById(R.id.passwordET);
        bLogin = (Button) findViewById(R.id.login);
        bRegister = (Button) findViewById(R.id.register);
        bContinue = (Button) findViewById(R.id.button5);

        bContinue.setVisibility(View.GONE);

        //Fb Login
        fbloginButton = (LoginButton) findViewById(R.id.fb_login_button);
        textView = (TextView) findViewById(R.id.newuser);
        callbackManager = CallbackManager.Factory.create();

        fbloginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                //textView.setText("Login Success: "+ loginResult.getAccessToken().getUserId()+"\n"+
                //loginResult.getAccessToken().getToken());
                textView.setText("Login Successful !!");
                bRegister.setVisibility(View.GONE);
                bContinue.setVisibility(View.VISIBLE);
            }

            @Override
            public void onCancel() {
                textView.setText("Login Cancelled");
            }

            @Override
            public void onError(FacebookException error) {

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        callbackManager.onActivityResult(requestCode,resultCode, data);
    }

    public void registerClick(View v) {

        //System.out.println("Clicked register");
        startActivity(new Intent(this, RegisterActivity.class));

    }

    public void onClick(View v){
        Intent i = new Intent(this, WelcomeActivity.class);
        startActivity(i);
    }

    public void validate(View v){

        etUsername = (EditText) findViewById(R.id.usernameET);
        etPassword = (EditText) findViewById(R.id.passwordET);
        System.out.println(etUsername.getText()+" Hi "+etPassword.getText());

        if(etUsername.getText().toString().equals("bearcat") && etPassword.getText().toString().equals("bearcat")){
            Intent i = new Intent(this, WelcomeActivity.class);
            startActivity(i);
        }else{
            Toast.makeText(LoginActivity.this, "Incorrect credentials", Toast.LENGTH_SHORT).show();
        }
    }

    /*
    public void authenticate(User user){
        ServerRequests serverRequests = new ServerRequests(this);
        serverRequests.fetchUserDataInBackground(user, new GetUserCallback() {
            @Override
            public void flagged(boolean flag) {}

            @Override
            public void done(User returnedUser) {
                if (returnedUser == null){
                    showErrorMessage();
                } else {
                    logUserIn(returnedUser);
                }
            }
        });
    }

    public void showErrorMessage(){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Login.this);
        dialogBuilder.setMessage("Invalid Username / Password");
        dialogBuilder.setPositiveButton("OK",null);
        dialogBuilder.show();
    }*/
}
