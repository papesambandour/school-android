package app.corp.anp.school;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FormationActivity extends AppCompatActivity {
 private  String tabFormations[],tabDetails[];
 private  String formation,detail;
 private ListView listFormation ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formation);
        listFormation = findViewById(R.id.listFormation);
        tabFormations = getResources().getStringArray(R.array.tab_formations);
        tabDetails = getResources().getStringArray(R.array.tab_details);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FormationActivity.this,android.R.layout.simple_list_item_1,tabFormations);
        listFormation.setAdapter(adapter);
        listFormation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    formation = tabFormations[position];
                    detail = tabDetails[position];
                    AlertDialog.Builder dialog =  new AlertDialog.Builder(FormationActivity.this);
                    dialog.setIcon(R.mipmap.ic_launcher);
                    dialog.setTitle(formation);
                    dialog.setMessage(detail);
                    dialog.setPositiveButton(R.string.inscription, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(FormationActivity.this,InscriptionActivity.class);
                            startActivity(intent);
                        }
                    });
                    dialog.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    dialog.show();

            }
        });
    }


}
