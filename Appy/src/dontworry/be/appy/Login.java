package dontworry.be.appy;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }
    
    public void checkRegistration(View view) {
    	Intent loginCheck = new Intent(this, DisplayMessageActivity.class);;
    	EditText rawUsername = (EditText) findViewById(R.id.username_box);
    	EditText rawPassword = (EditText) findViewById(R.id.password_box);

    	String username = rawUsername.getText().toString();
    	//find a way to salt it so it works out, tokenize?
    	String encryptedPassword = rawPassword.getText().toString();
    	
    	loginCheck.putExtra(EXTRA_MESSAGE, username);
    }
    
}
