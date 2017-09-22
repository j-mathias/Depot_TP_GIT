package clementdumazy.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SommeDeuxNombres extends AppCompatActivity {
    Integer res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_somme_deux_nombres);
        if (savedInstanceState != null && savedInstanceState.get("resultat") != null) {
            res = savedInstanceState.getInt("resultat");
            ((TextView) findViewById(R.id.result)).setText("Résultat obtenu : " + res);
        } else {
            res = 0;
        }


    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("resultat", res);
    }

    public void sum(View view) {
        res = Integer.parseInt(((EditText) findViewById(R.id.ed_nombre1)).getText().toString()) + Integer.parseInt(((EditText) findViewById(R.id.ed_nombre2)).getText().toString());
        ((TextView) findViewById(R.id.result)).setText("Résultat obtenu : " + res);

    }


}
