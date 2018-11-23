package app.corp.anp.school;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtLogin,txtpassword;
    private Button btnConnection,btnInscription;
    private String login,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLogin = findViewById(R.id.txtLogin);
        txtpassword = findViewById(R.id.txtPassword);
        btnInscription = findViewById(R.id.btnInscription);
        btnConnection = findViewById(R.id.btnConnection);
        btnConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login = txtLogin.getText().toString();
                password = txtpassword.getText().toString();
                if (login.isEmpty() || password.isEmpty())
                {
                    Toast.makeText(MainActivity.this, getString(R.string.error_fields), Toast.LENGTH_LONG).show();
                  //  AlertDialog alertDialog = new AlertDialog();
                }
                else {
                    Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }












}
