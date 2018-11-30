package app.corp.anp.school;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class InscriptionActivity extends AppCompatActivity {
    private EditText txtFisrtName,txtLastName;
    private String fisrtName,lastName ;
    private CheckBox cbOlevel,cbBachelor,cbMaster;
    private List<String> degrees ;
    private Button btnSaveInscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        degrees = new ArrayList<String>();
        txtFisrtName = findViewById(R.id.txtFisrtName);
        txtLastName = findViewById(R.id.txtLastName);
        cbOlevel = findViewById(R.id.cbOlevel);
        cbBachelor = findViewById(R.id.cbBachelor);
        cbMaster = findViewById(R.id.cbMaster);
        btnSaveInscription = findViewById(R.id.btnSaveInscription);

        btnSaveInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fisrtName = txtFisrtName.getText().toString();
                lastName = txtLastName.getText().toString();
                if(cbMaster.isChecked())
                {
                    degrees.add(cbMaster.getText().toString());
                }
                if(cbBachelor.isChecked())
                {
                    degrees.add(cbBachelor.getText().toString());
                }
                if(cbOlevel.isChecked())
                {
                    degrees.add(cbOlevel.getText().toString());
                }
                boolean isOk = true;
                if(fisrtName.isEmpty() || lastName.isEmpty())
                {
                    Toast.makeText(InscriptionActivity.this, getString(R.string.error_fields), Toast.LENGTH_LONG).show();
                    isOk = false;
                }
                if (degrees.isEmpty())
                {
                    Toast.makeText(InscriptionActivity.this, getString(R.string.degreesEmpty), Toast.LENGTH_LONG).show();
                    isOk = false ;
                }
                if (isOk)
                {
                    Intent intent = new Intent(InscriptionActivity.this,HomeActivity.class);
                    Toast.makeText(InscriptionActivity.this, "Inscription reussit avec succes", Toast.LENGTH_LONG).show();
                   startActivity(intent);

                }

            }
        });

    }
}
