package com.aduug.costeviajesrealdecreto;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultadoCosteViaje extends AppCompatActivity {

    TextView costeAlojF;
    TextView costeManuF;
    TextView costeTF;
    TextView paisF;
    TextView npers;
    TextView nnoches;
    TextView grupoProf;

    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_coste_viaje);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        costeAlojF = (TextView) findViewById(R.id.calojf);
        costeManuF = (TextView) findViewById(R.id.cmanuf);
        costeTF = (TextView) findViewById(R.id.ctotalf);
        paisF = (TextView) findViewById(R.id.paisF);
        npers = (TextView) findViewById(R.id.npers);
        nnoches = (TextView) findViewById(R.id.nnoches);
        grupoProf = (TextView) findViewById(R.id.grupoProf);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {


            String cadena1 = (bundle.get("CosteAlojF")).toString();
            costeAlojF.setText(cadena1 + " € ");
            String cadena2 = (bundle.get("CosteManuF")).toString();
            costeManuF.setText(cadena2 + " €");
            String cadena3 = (bundle.get("CosteTF")).toString();
            costeTF.setText(cadena3 + " €");
            String cadena4 = (bundle.get("paisF")).toString();
            paisF.setText("Para un viaje a " + cadena4);
            String cadena5 = (bundle.get("persInt")).toString();
            npers.setText("para " + cadena5 + " personas ");
            String cadena6 = (bundle.get("nochesInt")).toString();
            nnoches.setText(" y " + cadena6 + " noches de Hotel");
            String cadena7 = (bundle.getString("grupoProf"));
            grupoProf.setText("en el "+cadena7);

        }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
