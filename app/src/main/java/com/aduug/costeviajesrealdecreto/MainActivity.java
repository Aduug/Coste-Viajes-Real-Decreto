package com.aduug.costeviajesrealdecreto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String titulo;
    Spinner spinner;
    Button calcular;
    EditText noches;
    EditText personas;
    double icAloj1 = 0;
    double icManu1 = 0;
    double icAloj2 = 0;
    double icManu2 = 0;
    double icAloj3 = 0;
    double icManu3 = 0;
    double costeAlojF = 0;
    double costeManuF = 0;
    double costeTF = 0;

    DecimalFormat df = new DecimalFormat("#.##");
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        calcular = (Button) findViewById(R.id.calcular);
        spinner = (Spinner) findViewById(R.id.spinner);
        calcular.setOnClickListener(this);
        noches = (EditText) findViewById(R.id.noches);
        personas = (EditText) findViewById(R.id.pers);

        List list = new ArrayList();
        //List pais = new ArrayList( { "España", "Reino Unido", "Alemania", "Francia", "Italia", "Estados Unidos", "Suecia", "Suiza", "Austria", "Noruega", "Países Bajos", "Polonia", "Portugal", "Canadá", "Finlandia", "China", "Japón", "India", "Irlanda", "Dinamarca", "Bélgica", "Luxemburgo", "Mexico", "Andorra", "Angola", "Arabia Saudita", "Argelia", "Argentina", "Australia", "Bolivia", "Bosnia-Herzegovina", "Brasil", "Bulgaria", "Camerún", "Chile", "Colombia", "Corea", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "R.Dominicana", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eslovaquia", "Etiopía", "Filipinas", "Gabón", "Ghana", "Grecia", "Guatemala", "Guinea Ecuatorial", "Haití", "Honduras", "Hong Kong", "Hungría", "Indonesia", "Irak", "Iran", "Israel", "Italia", "Jamaica", "Jordania", "Kenia", "Kuwait", "Líbano", "Libia", "Malasia", "Malta", "Marruecos", "Mauritania", "Mozambique", "Nicaragua", "Nigeria", "Nueva Zelanda", "Pakistán", "Panamá", "Paraguay", "Perú", "República Checa", "Rumania", "Rusia", "Senegal", "Singapur", "Siria", "Sudáfrica", "Tailandia", "Taiwán", "Tanzania", "Túnez", "Turquía", "Uruguay", "Venezuela", "Yemen", "Yugoslavia", "Zaire/Congo", "Zimbawe", "Resto del Mundo" });
        list.add("España");
        list.add("Alemania");
        list.add("Andorra");
        list.add("Angola");
        list.add("Arabia Saudita");
        list.add("Argelia");
        list.add("Argentina");
        list.add("Australia");
        list.add("Austria");
        list.add("Bélgica");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.calcular:

                int index;
                index= spinner.getSelectedItemPosition();
                switch (index) {

                    case 0:
                        //España
                        icAloj1 = 102.56;
                        icManu1 = 53.34;
                        icAloj2 = 65.97;
                        icManu2 = 37.40;
                        icAloj3 = 48.92;
                        icManu3 = 28.21;
                        break;
                    case 1:
                        //Alemania
                        icAloj1 = 155.66;
                        icManu1 = 68.52;
                        icAloj2 = 132.82;
                        icManu2 = 59.50;
                        icAloj3 = 117.20;
                        icManu3 = 56.50;
                        break;

                }

                DietasViajes viaje = new DietasViajes(icAloj1, icManu1, 0,1);
                costeAlojF= viaje.calculaCosteAloj();
                costeManuF= viaje.calculaCosteManu();
                costeTF= viaje.calculaCoste();


                Intent intent = new Intent(this, ResultadoCosteViaje.class);
                intent.putExtra("CosteAlojF",costeAlojF);
                intent.putExtra("CosteManuF",costeManuF);
                intent.putExtra("CosteTF",costeTF);
                startActivity(intent);

                break;
            default:
                Toast.makeText(getApplicationContext(), "Faltan datos por seleccionar", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.aduug.costeviajesrealdecreto/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.aduug.costeviajesrealdecreto/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
