package app.corp.anp.school;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FormationActivity extends AppCompatActivity {
 private  String tabFormations[],tabDetails[];
 private  String Formation,Detail;
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
    }
}
