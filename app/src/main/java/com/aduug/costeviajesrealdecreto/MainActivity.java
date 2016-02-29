package com.aduug.costeviajesrealdecreto;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String titulo;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinner = (Spinner) findViewById(R.id.spinner);

        List list = new ArrayList();
        //list.toArray(new String[] { "España", "Reino Unido", "Alemania", "Francia", "Italia", "Estados Unidos", "Suecia", "Suiza", "Austria", "Noruega", "Países Bajos", "Polonia", "Portugal", "Canadá", "Finlandia", "China", "Japón", "India", "Irlanda", "Dinamarca", "Bélgica", "Luxemburgo", "Mexico", "Andorra", "Angola", "Arabia Saudita", "Argelia", "Argentina", "Australia", "Bolivia", "Bosnia-Herzegovina", "Brasil", "Bulgaria", "Camerún", "Chile", "Colombia", "Corea", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "R.Dominicana", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eslovaquia", "Etiopía", "Filipinas", "Gabón", "Ghana", "Grecia", "Guatemala", "Guinea Ecuatorial", "Haití", "Honduras", "Hong Kong", "Hungría", "Indonesia", "Irak", "Iran", "Israel", "Italia", "Jamaica", "Jordania", "Kenia", "Kuwait", "Líbano", "Libia", "Malasia", "Malta", "Marruecos", "Mauritania", "Mozambique", "Nicaragua", "Nigeria", "Nueva Zelanda", "Pakistán", "Panamá", "Paraguay", "Perú", "República Checa", "Rumania", "Rusia", "Senegal", "Singapur", "Siria", "Sudáfrica", "Tailandia", "Taiwán", "Tanzania", "Túnez", "Turquía", "Uruguay", "Venezuela", "Yemen", "Yugoslavia", "Zaire/Congo", "Zimbawe", "Resto del Mundo" });
        list.add("España");
        list.add("Francia");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);


        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                  //      .setAction("Action", null).show();
          //  }
        //});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
