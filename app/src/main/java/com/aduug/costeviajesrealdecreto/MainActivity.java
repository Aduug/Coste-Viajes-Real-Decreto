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
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner;
    Button calcular;
    EditText noches;
    EditText personas;
    RadioGroup radioGroup;
    double icAloj1 = 0;
    double icManu1 = 0;
    double icAloj2 = 0;
    double icManu2 = 0;
    double icAloj3 = 0;
    double icManu3 = 0;
    double costeAlojF = 0;
    double costeManuF = 0;
    double costeTF = 0;
    String costeAlojFS = "";
    String costeManuFS = "";
    String costeTFS = "";
    int nochesInt = 0;
    int persInt = 0;
    String paisRes = "";

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
        radioGroup = (RadioGroup) findViewById(R.id.radiog);




        List list = new ArrayList();
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
        list.add("Bolivia");
        list.add("Bosnia-Herzegovina");
        list.add("Brasil");
        list.add("Bulgaria");
        list.add("Camerún");
        list.add("Canadá");
        list.add("Chile");
        list.add("China");
        list.add("Colombia");
        list.add("Corea");
        list.add("Costa de Marfil");
        list.add("Costa Rica");
        list.add("Croacia");
        list.add("Cuba");
        list.add("Dinamarca");
        list.add("R.Dominicana");
        list.add("Ecuador");
        list.add("Egipto");
        list.add("El Salvador");
        list.add("Emiratos Árabes Unidos");
        list.add("Eslovaquia");
        list.add("Estados Unidos");
        list.add("Etiopía");
        list.add("Filipinas");
        list.add("Finlandia");
        list.add("Francia");
        list.add("Gabón");
        list.add("Ghana");
        list.add("Grecia");
        list.add("Guatemala");
        list.add("Guinea Ecuatorial");
        list.add("Haití");
        list.add("Honduras");
        list.add("Hong Kong");
        list.add("Hungría");
        list.add("India");
        list.add("Indonesia");
        list.add("Irak");
        list.add("Irán");
        list.add("Irlanda");
        list.add("Israel");
        list.add("Italia");
        list.add("Jamaica");
        list.add("Japón");
        list.add("Jordania");
        list.add("Kenia");
        list.add("Kuwait");
        list.add("Líbano");
        list.add("Libia");
        list.add("Luxemburgo");
        list.add("Malasia");
        list.add("Malta");
        list.add("Marruecos");
        list.add("Mauritania");
        list.add("Mexico");
        list.add("Mozambique");
        list.add("Nicaragua");
        list.add("Nigeria");
        list.add("Noruega");
        list.add("Nueva Zelanda");
        list.add("Países Bajos");
        list.add("Pakistán");
        list.add("Panamá");
        list.add("Paraguay");
        list.add("Perú");
        list.add("Polonia");
        list.add("Portugal");
        list.add("Reino Unido");
        list.add("República Checa");
        list.add("Rumania");
        list.add("Rusia");
        list.add("Senegal");
        list.add("Singapur");
        list.add("Siria");
        list.add("Sudáfrica");
        list.add("Suecia");
        list.add("Suiza");
        list.add("Tailandia");
        list.add("Taiwán");
        list.add("Tanzania");
        list.add("Túnez");
        list.add("Turquía");
        list.add("Uruguay");
        list.add("Venezuela");
        list.add("Yemen");
        list.add("Yugoslavia");
        list.add("Zaire-Congo");
        list.add("Zimbawe");
        list.add("Resto del mundo");

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

        nochesInt = Integer.parseInt(noches.getText().toString());
        persInt = Integer.parseInt(personas.getText().toString());

        switch (v.getId()) {
            case R.id.calcular:

                int index;
                index = spinner.getSelectedItemPosition();
                switch (index) {

                    case 0:
                        paisRes = "España";
                        icAloj1 = 102.56;
                        icManu1 = 53.34;
                        icAloj2 = 65.97;
                        icManu2 = 37.40;
                        icAloj3 = 48.92;
                        icManu3 = 28.21;
                        break;
                    case 1:
                        paisRes = "Alemania";
                        icAloj1 = 155.66;
                        icManu1 = 68.52;
                        icAloj2 = 132.82;
                        icManu2 = 59.50;
                        icAloj3 = 117.20;
                        icManu3 = 56.50;
                        break;
                    case 2:
                        paisRes = "Andorra";
                        icAloj1 = 54.69;
                        icManu1 = 44.47;
                        icAloj2 = 46.88;
                        icManu2 = 37.86;
                        icAloj3 = 41.47;
                        icManu3 = 34.86;
                        break;
                    case 3:
                        paisRes = "Angola";
                        icAloj1 = 158.67;
                        icManu1 = 66.71;
                        icAloj2 = 135.23;
                        icManu2 = 59.50;
                        icAloj3 = 119;
                        icManu3 = 55.89;
                        break;
                    case 4:
                        paisRes = "Arabia Saudita";
                        icAloj1 = 86.55;
                        icManu1 = 60.70;
                        icAloj2 = 73.92;
                        icManu2 = 54.09;
                        icAloj3 = 64.91;
                        icManu3 = 50.49;
                        break;
                    case 5:
                        paisRes = "Argelia";
                        icAloj1 = 119;
                        icManu1 = 51.09;
                        icAloj2 = 101.57;
                        icManu2 = 44.47;
                        icAloj3 = 89.55;
                        icManu3 = 42.07;
                        break;
                    case 6:
                        paisRes = "Argentina";
                        icAloj1 = 130.42;
                        icManu1 = 64.91;
                        icAloj2 = 111.19;
                        icManu2 = 55.29;
                        icAloj3 = 97.96;
                        icManu3 = 50.49;
                        break;
                    case 7:
                        paisRes = "Australia";
                        icAloj1 = 94.96;
                        icManu1 = 57.10;
                        icAloj2 = 81.14;
                        icManu2 = 51.09;
                        icAloj3 = 71.52;
                        icManu3 = 48.08;
                        break;
                    case 8:
                        paisRes = "Austria";
                        icAloj1 = 112.39;
                        icManu1 = 66.11;
                        icAloj2 = 95.56;
                        icManu2 = 58.90;
                        icAloj3 = 84.74;
                        icManu3 = 55.29;
                        break;
                    case 9:
                        paisRes = "Bélgica";
                        icAloj1 = 174.29;
                        icManu1 = 91.35;
                        icAloj2 = 148.45;
                        icManu2 = 82.94;
                        icAloj3 = 131.02;
                        icManu3 = 78.73;
                        break;
                    case 10:
                        paisRes = "Bolivia";
                        icAloj1 = 60.10;
                        icManu1 = 42.67;
                        icAloj2 = 51.09;
                        icManu2 = 36.66;
                        icAloj3 = 45.08;
                        icManu3 = 33.66;
                        break;
                    case 11:
                        paisRes = "Bosnia-Herzegovina";
                        icAloj1 = 85.34;
                        icManu1 = 57.70;
                        icAloj2 = 72.72;
                        icManu2 = 49.88;
                        icAloj3 = 64.31;
                        icManu3 = 45.68;
                        break;
                    case 12:
                        paisRes = "Brasil";
                        icAloj1 = 150.25;
                        icManu1 = 91.35;
                        icAloj2 = 128.02;
                        icManu2 = 79.33;
                        icAloj3 = 112.99;
                        icManu3 = 74.53;
                        break;
                    case 13:
                        paisRes = "Bulgaria";
                        icAloj1 = 62.51;
                        icManu1 = 44.47;
                        icAloj2 = 53.49;
                        icManu2 = 37.86;
                        icAloj3 = 46.88;
                        icManu3 = 35.46;
                        break;
                    case 14:
                        paisRes = "Camerún";
                        icAloj1 = 103.37;
                        icManu1 = 55.29;
                        icAloj2 = 88.35;
                        icManu2 = 48.68;
                        icAloj3 = 77.53;
                        icManu3 = 45.68;
                        break;
                    case 15:
                        paisRes = "Canadá";
                        icAloj1 = 110.59;
                        icManu1 = 58.30;
                        icAloj2 = 94.36;
                        icManu2 = 51.69;
                        icAloj3 = 82.94;
                        icManu3 = 48.68;
                        break;
                    case 16:
                        paisRes = "Chile";
                        icAloj1 = 120.20;
                        icManu1 = 57.70;
                        icAloj2 = 102.17;
                        icManu2 = 50.49;
                        icAloj3 = 90.15;
                        icManu3 = 46.88;
                        break;
                    case 17:
                        paisRes = "China";
                        icAloj1 = 84.14;
                        icManu1 = 51.69;
                        icAloj2 = 71.52;
                        icManu2 = 46.28;
                        icAloj3 = 63.11;
                        icManu3 = 43.27;
                        break;
                    case 18:
                        paisRes = "Colombia";
                        icAloj1 = 145.44;
                        icManu1 = 90.15;
                        icAloj2 = 123.81;
                        icManu2 = 78.13;
                        icAloj3 = 109.38;
                        icManu3 = 73.32;
                        break;
                    case 19:
                        paisRes = "Corea";
                        icAloj1 = 120.20;
                        icManu1 = 62.51;
                        icAloj2 = 102.17;
                        icManu2 = 55.29;
                        icAloj3 = 90.15;
                        icManu3 = 52.89;
                        break;
                    case 20:
                        paisRes = "Costa de Marfil";
                        icAloj1 = 72.12;
                        icManu1 = 55.89;
                        icAloj2 = 61.30;
                        icManu2 = 49.28;
                        icAloj3 = 54.09;
                        icManu3 = 46.28;
                        break;
                    case 21:
                        paisRes = "Costa Rica";
                        icAloj1 = 76.93;
                        icManu1 = 52.29;
                        icAloj2 = 65.51;
                        icManu2 = 44.47;
                        icAloj3 = 57.70;
                        icManu3 = 40.87;
                        break;
                    case 22:
                        paisRes = "Croacia";
                        icAloj1 = 85.34;
                        icManu1 = 57.70;
                        icAloj2 = 72.72;
                        icManu2 = 49.88;
                        icAloj3 = 64.31;
                        icManu3 = 45.68;
                        break;
                    case 23:
                        paisRes = "Cuba";
                        icAloj1 = 66.11;
                        icManu1 = 38.46;
                        icAloj2 = 56.50;
                        icManu2 = 33.06;
                        icAloj3 = 49.88;
                        icManu3 = 29.45;
                        break;
                    case 24:
                        paisRes = "Dinamarca";
                        icAloj1 = 144.24;
                        icManu1 = 72.12;
                        icAloj2 = 122.61;
                        icManu2 = 64.91;
                        icAloj3 = 108.18;
                        icManu3 = 62.51;
                        break;
                    case 25:
                        paisRes = "R.Dominicana";
                        icAloj1 = 75.13;
                        icManu1 = 42.07;
                        icAloj2 = 64.31;
                        icManu2 = 36.66;
                        icAloj3 = 56.50;
                        icManu3 = 34.26;
                        break;
                    case 26:
                        paisRes = "Ecuador";
                        icAloj1 = 75.73;
                        icManu1 = 50.49;
                        icAloj2 = 64.91;
                        icManu2 = 43.27;
                        icAloj3 = 57.10;
                        icManu3 = 39.67;
                        break;
                    case 27:
                        paisRes = "Egipto";
                        icAloj1 = 106.98;
                        icManu1 = 44.47;
                        icAloj2 = 91.35;
                        icManu2 = 39.07;
                        icAloj3 = 80.54;
                        icManu3 = 36.66;
                        break;
                    case 28:
                        paisRes = "El Salvador";
                        icAloj1 = 77.53;
                        icManu1 = 50.49;
                        icAloj2 = 66.11;
                        icManu2 = 43.27;
                        icAloj3 = 58.30;
                        icManu3 = 39.67;
                        break;
                    case 29:
                        paisRes = "Emiratos Arabes Unidos";
                        icAloj1 = 119;
                        icManu1 = 63.71;
                        icAloj2 = 101.57;
                        icManu2 = 56.50;
                        icAloj3 = 89.55;
                        icManu3 = 52.89;
                        break;
                    case 30:
                        paisRes = "Eslovaquia";
                        icAloj1 = 88.95;
                        icManu1 = 49.88;
                        icAloj2 = 75.73;
                        icManu2 = 43.27;
                        icAloj3 = 66.71;
                        icManu3 = 40.87;
                        break;
                    case 31:
                        paisRes = "Estados Unidos";
                        icAloj1 = 168.28;
                        icManu1 = 77.53;
                        icAloj2 = 143.04;
                        icManu2 = 69.72;
                        icAloj3 = 126.21;
                        icManu3 = 66.11;
                        break;
                    case 32:
                        paisRes = "Etiopía";
                        icAloj1 = 140.04;
                        icManu1 = 43.87;
                        icAloj2 = 119.60;
                        icManu2 = 37.86;
                        icAloj3 = 105.18;
                        icManu3 = 34.86;
                        break;
                    case 33:
                        paisRes = "Filipinas";
                        icAloj1 = 84.14;
                        icManu1 = 45.08;
                        icAloj2 = 71.52;
                        icManu2 = 39.67;
                        icAloj3 = 63.11;
                        icManu3 = 36.66;
                        break;
                    case 34:
                        paisRes = "Finlandia";
                        icAloj1 = 134.63;
                        icManu1 = 72.72;
                        icAloj2 = 114.79;
                        icManu2 = 65.51;
                        icAloj3 = 100.97;
                        icManu3 = 62.51;
                        break;
                    case 35:
                        paisRes = "Francia";
                        icAloj1 = 144.24;
                        icManu1 = 72.72;
                        icAloj2 = 122.61;
                        icManu2 = 65.51;
                        icAloj3 = 108.18;
                        icManu3 = 61.90;
                        break;
                    case 36:
                        paisRes = "Gabón";
                        icAloj1 = 117.80;
                        icManu1 = 59.50;
                        icAloj2 = 100.37;
                        icManu2 = 52.89;
                        icAloj3 = 88.35;
                        icManu3 = 49.28;
                        break;
                    case 37:
                        paisRes = "Ghana";
                        icAloj1 = 78.13;
                        icManu1 = 42.67;
                        icAloj2 = 66.71;
                        icManu2 = 37.26;
                        icAloj3 = 58.90;
                        icManu3 = 34.26;
                        break;
                    case 38:
                        paisRes = "Grecia";
                        icAloj1 = 81.14;
                        icManu1 = 45.08;
                        icAloj2 = 69.12;
                        icManu2 = 39.07;
                        icAloj3 = 61.30;
                        icManu3 = 36.66;
                        break;
                    case 39:
                        paisRes = "Guatemala";
                        icAloj1 = 105.18;
                        icManu1 = 49.28;
                        icAloj2 = 89.55;
                        icManu2 = 42.67;
                        icAloj3 = 79.33;
                        icManu3 = 39.67;
                        break;
                    case 40:
                        paisRes = "Guinea Ecuatorial";
                        icAloj1 = 102.77;
                        icManu1 = 56.50;
                        icAloj2 = 87.75;
                        icManu2 = 50.49;
                        icAloj3 = 77.53;
                        icManu3 = 47.48;
                        break;
                    case 41:
                        paisRes = "Haití";
                        icAloj1 = 52.89;
                        icManu1 = 43.87;
                        icAloj2 = 45.08;
                        icManu2 = 37.86;
                        icAloj3 = 39.67;
                        icManu3 = 34.26;
                        break;
                    case 42:
                        paisRes = "Honduras";
                        icAloj1 = 81.74;
                        icManu1 = 49.28;
                        icAloj2 = 69.72;
                        icManu2 = 42.07;
                        icAloj3 = 61.30;
                        icManu3 = 38.46;
                        break;
                    case 43:
                        paisRes = "Hong Kong";
                        icAloj1 = 142.44;
                        icManu1 = 57.70;
                        icAloj2 = 121.40;
                        icManu2 = 51.69;
                        icAloj3 = 106.98;
                        icManu3 = 48.68;
                        break;
                    case 44:
                        paisRes = "Hungria";
                        icAloj1 = 135.23;
                        icManu1 = 52.89;
                        icAloj2 = 115.39;
                        icManu2 = 46.28;
                        icAloj3 = 101.57;
                        icManu3 = 42.67;
                        break;
                    case 45:
                        paisRes = "India";
                        icAloj1 = 117.20;
                        icManu1 = 44.47;
                        icAloj2 = 99.77;
                        icManu2 = 38.46;
                        icAloj3 = 88.35;
                        icManu3 = 36.06;
                        break;
                    case 46:
                        paisRes = "Indonesia";
                        icAloj1 = 120.20;
                        icManu1 = 48.68;
                        icAloj2 = 102.17;
                        icManu2 = 42.67;
                        icAloj3 = 90.15;
                        icManu3 = 39.67;
                        break;
                    case 47:
                        paisRes = "Irak";
                        icAloj1 = 77.53;
                        icManu1 = 44.47;
                        icAloj2 = 66.11;
                        icManu2 = 39.07;
                        icAloj3 = 58.30;
                        icManu3 = 36.66;
                        break;
                    case 48:
                        paisRes = "Irán";
                        icAloj1 = 94.36;
                        icManu1 = 51.69;
                        icAloj2 = 80.54;
                        icManu2 = 44.47;
                        icAloj3 = 70.92;
                        icManu3 = 40.87;
                        break;
                    case 49:
                        paisRes = "Irlanda";
                        icAloj1 = 109.38;
                        icManu1 = 54.09;
                        icAloj2 = 93.16;
                        icManu2 = 48.08;
                        icAloj3 = 82.34;
                        icManu3 = 44.47;
                        break;
                    case 50:
                        paisRes = "Israel";
                        icAloj1 = 108.78;
                        icManu1 = 63.71;
                        icAloj2 = 92.56;
                        icManu2 = 56.50;
                        icAloj3 = 81.74;
                        icManu3 = 52.29;
                        break;
                    case 51:
                        paisRes = "Italia";
                        icAloj1 = 153.86;
                        icManu1 = 69.72;
                        icAloj2 = 131.02;
                        icManu2 = 63.11;
                        icAloj3 = 115.39;
                        icManu3 = 59.50;
                        break;
                    case 52:
                        paisRes = "Jamaica";
                        icAloj1 = 90.15;
                        icManu1 = 51.69;
                        icAloj2 = 76.93;
                        icManu2 = 46.28;
                        icAloj3 = 67.91;
                        icManu3 = 43.87;
                        break;
                    case 53:
                        paisRes = "Japón";
                        icAloj1 = 187.52;
                        icManu1 = 108.18;
                        icAloj2 = 159.87;
                        icManu2 = 96.76;
                        icAloj3 = 140.64;
                        icManu3 = 92.56;
                        break;
                    case 54:
                        paisRes = "Jordania";
                        icAloj1 = 109.38;
                        icManu1 = 48.68;
                        icAloj2 = 93.16;
                        icManu2 = 42.67;
                        icAloj3 = 82.34;
                        icManu3 = 39.67;
                        break;
                    case 55:
                        paisRes = "Kenia";
                        icAloj1 = 96.76;
                        icManu1 = 45.08;
                        icAloj2 = 82.34;
                        icManu2 = 39.67;
                        icAloj3 = 72.72;
                        icManu3 = 36.66;
                        break;
                    case 56:
                        paisRes = "Kuwait";
                        icAloj1 = 144.24;
                        icManu1 = 50.49;
                        icAloj2 = 122.61;
                        icManu2 = 44.47;
                        icAloj3 = 108.18;
                        icManu3 = 41.47;
                        break;
                    case 57:
                        paisRes = "Líbano";
                        icAloj1 = 135.23;
                        icManu1 = 40.87;
                        icAloj2 = 115.39;
                        icManu2 = 34.86;
                        icAloj3 = 101.57;
                        icManu3 = 33.06;
                        break;
                    case 58:
                        paisRes = "Libia";
                        icAloj1 = 119.60;
                        icManu1 = 62.51;
                        icAloj2 = 102.17;
                        icManu2 = 54.69;
                        icAloj3 = 90.15;
                        icManu3 = 51.69;
                        break;
                    case 59:
                        paisRes = "Luxemburgo";
                        icAloj1 = 159.27;
                        icManu1 = 63.11;
                        icAloj2 = 135.83;
                        icManu2 = 55.89;
                        icAloj3 = 119.60;
                        icManu3 = 53.49;
                        break;
                    case 60:
                        paisRes = "Malasia";
                        icAloj1 = 108.18;
                        icManu1 = 39.67;
                        icAloj2 = 91.95;
                        icManu2 = 34.26;
                        icAloj3 = 81.14;
                        icManu3 = 31.25;
                        break;
                    case 61:
                        paisRes = "Malta";
                        icAloj1 = 54.09;
                        icManu1 = 37.26;
                        icAloj2 = 46.28;
                        icManu2 = 31.85;
                        icAloj3 = 40.87;
                        icManu3 = 28.25;
                        break;
                    case 62:
                        paisRes = "Marruecos";
                        icAloj1 = 116.60;
                        icManu1 = 45.68;
                        icAloj2 = 99.17;
                        icManu2 = 39.67;
                        icAloj3 = 87.75;
                        icManu3 = 36.06;
                        break;
                    case 63:
                        paisRes = "Mauritania";
                        icAloj1 = 57.70;
                        icManu1 = 45.08;
                        icAloj2 = 49.28;
                        icManu2 = 39.07;
                        icAloj3 = 43.27;
                        icManu3 = 36.06;
                        break;
                    case 64:
                        paisRes = "Mexico";
                        icAloj1 = 96.16;
                        icManu1 = 49.88;
                        icAloj2 = 81.74;
                        icManu2 = 43.27;
                        icAloj3 = 72.12;
                        icManu3 = 39.07;
                        break;
                    case 65:
                        paisRes = "Mozambique";
                        icAloj1 = 78.73;
                        icManu1 = 48.08;
                        icAloj2 = 67.31;
                        icManu2 = 42.67;
                        icAloj3 = 59.50;
                        icManu3 = 40.27;
                        break;
                    case 66:
                        paisRes = "Nicaragua";
                        icAloj1 = 110.59;
                        icManu1 = 61.90;
                        icAloj2 = 94.36;
                        icManu2 = 52.89;
                        icAloj3 = 82.94;
                        icManu3 = 48.08;
                        break;
                    case 67:
                        paisRes = "Nigeria";
                        icAloj1 = 138.23;
                        icManu1 = 51.69;
                        icAloj2 = 117.80;
                        icManu2 = 46.88;
                        icAloj3 = 103.98;
                        icManu3 = 43.87;
                        break;
                    case 68:
                        paisRes = "Noruega";
                        icAloj1 = 156.26;
                        icManu1 = 89.55;
                        icAloj2 = 132.82;
                        icManu2 = 80.54;
                        icAloj3 = 117.20;
                        icManu3 = 76.93;
                        break;
                    case 69:
                        paisRes = "Nueva Zelanda";
                        icAloj1 = 76.93;
                        icManu1 = 46.28;
                        icAloj2 = 65.51;
                        icManu2 = 40.27;
                        icAloj3 = 57.70;
                        icManu3 = 37.26;
                        break;
                    case 70:
                        paisRes = "Países Bajos";
                        icAloj1 = 149.05;
                        icManu1 = 71.52;
                        icAloj2 = 126.81;
                        icManu2 = 64.31;
                        icAloj3 = 111.79;
                        icManu3 = 61.90;
                        break;
                    case 71:
                        paisRes = "Pakistán";
                        icAloj1 = 68.52;
                        icManu1 = 43.27;
                        icAloj2 = 58.30;
                        icManu2 = 37.26;
                        icAloj3 = 51.69;
                        icManu3 = 34.86;
                        break;
                    case 72:
                        paisRes = "Panamá";
                        icAloj1 = 75.73;
                        icManu1 = 42.07;
                        icAloj2 = 64.91;
                        icManu2 = 36.66;
                        icAloj3 = 57.10;
                        icManu3 = 33.66;
                        break;
                    case 73:
                        paisRes = "Paraguay";
                        icAloj1 = 53.49;
                        icManu1 = 38.46;
                        icAloj2 = 45.68;
                        icManu2 = 33.06;
                        icAloj3 = 40.27;
                        icManu3 = 30.05;
                        break;
                    case 74:
                        paisRes = "Perú";
                        icAloj1 = 93.76;
                        icManu1 = 50.49;
                        icAloj2 = 79.93;
                        icManu2 = 43.27;
                        icAloj3 = 70.32;
                        icManu3 = 39.07;
                        break;
                    case 75:
                        paisRes = "Polonia";
                        icAloj1 = 117.20;
                        icManu1 = 48.68;
                        icAloj2 = 99.77;
                        icManu2 = 42.67;
                        icAloj3 = 88.35;
                        icManu3 = 39.67;
                        break;
                    case 76:
                        paisRes = "Portugal";
                        icAloj1 = 114.19;
                        icManu1 = 51.09;
                        icAloj2 = 97.36;
                        icManu2 = 43.87;
                        icAloj3 = 84.94;
                        icManu3 = 41.47;
                        break;
                    case 77:
                        paisRes = "Reino Unido";
                        icAloj1 = 183.91;
                        icManu1 = 91.35;
                        icAloj2 = 156.86;
                        icManu2 = 82.94;
                        icAloj3 = 138.23;
                        icManu3 = 79.33;
                        break;
                    case 78:
                        paisRes = "República Checa";
                        icAloj1 = 119;
                        icManu1 = 49.88;
                        icAloj2 = 101.57;
                        icManu2 = 43.27;
                        icAloj3 = 89.55;
                        icManu3 = 40.87;
                        break;
                    case 79:
                        paisRes = "Rumania";
                        icAloj1 = 149.05;
                        icManu1 = 44.47;
                        icAloj2 = 126.81;
                        icManu2 = 38.46;
                        icAloj3 = 111.79;
                        icManu3 = 35.46;
                        break;
                    case 80:
                        paisRes = "Rusia";
                        icAloj1 = 267.45;
                        icManu1 = 83.54;
                        icAloj2 = 227.78;
                        icManu2 = 73.32;
                        icAloj3 = 200.74;
                        icManu3 = 68.52;
                        break;
                    case 81:
                        paisRes = "Senegal";
                        icAloj1 = 79.33;
                        icManu1 = 51.09;
                        icAloj2 = 67.91;
                        icManu2 = 45.08;
                        icAloj3 = 59.50;
                        icManu3 = 42.07;
                        break;
                    case 82:
                        paisRes = "Singapur";
                        icAloj1 = 99.77;
                        icManu1 = 54.09;
                        icAloj2 = 85.34;
                        icManu2 = 48.08;
                        icAloj3 = 75.13;
                        icManu3 = 45.08;
                        break;
                    case 83:
                        paisRes = "Siria";
                        icAloj1 = 97.96;
                        icManu1 = 52.29;
                        icAloj2 = 83.54;
                        icManu2 = 46.28;
                        icAloj3 = 73.92;
                        icManu3 = 43.87;
                        break;
                    case 84:
                        paisRes = "Sudáfrica";
                        icAloj1 = 75.13;
                        icManu1 = 55.89;
                        icAloj2 = 64.31;
                        icManu2 = 48.08;
                        icAloj3 = 56.50;
                        icManu3 = 43.87;
                        break;
                    case 85:
                        paisRes = "Suecia";
                        icAloj1 = 173.09;
                        icManu1 = 82.34;
                        icAloj2 = 147.25;
                        icManu2 = 75.13;
                        icAloj3 = 129.82;
                        icManu3 = 69.72;
                        break;
                    case 86:
                        paisRes = "Suiza";
                        icAloj1 = 174.29;
                        icManu1 = 69.12;
                        icAloj2 = 148.45;
                        icManu2 = 61.30;
                        icAloj3 = 131.02;
                        icManu3 = 57.70;
                        break;
                    case 87:
                        paisRes = "Tailandia";
                        icAloj1 = 81.14;
                        icManu1 = 45.08;
                        icAloj2 = 69.12;
                        icManu2 = 39.07;
                        icAloj3 = 61.30;
                        icManu3 = 36.66;
                        break;
                    case 88:
                        paisRes = "Taiwán";
                        icAloj1 = 96.16;
                        icManu1 = 54.09;
                        icAloj2 = 81.74;
                        icManu2 = 48.68;
                        icAloj3 = 72.12;
                        icManu3 = 45.68;
                        break;
                    case 89:
                        paisRes = "Tanzania";
                        icAloj1 = 90.15;
                        icManu1 = 34.86;
                        icAloj2 = 76.93;
                        icManu2 = 30.05;
                        icAloj3 = 67.91;
                        icManu3 = 26.44;
                        break;
                    case 90:
                        paisRes = "Túnez";
                        icAloj1 = 60.70;
                        icManu1 = 54.09;
                        icAloj2 = 51.69;
                        icManu2 = 46.28;
                        icAloj3 = 45.68;
                        icManu3 = 42.07;
                        break;
                    case 91:
                        paisRes = "Turquía";
                        icAloj1 = 72.12;
                        icManu1 = 45.08;
                        icAloj2 = 61.30;
                        icManu2 = 39.07;
                        icAloj3 = 54.09;
                        icManu3 = 36.06;
                        break;
                    case 92:
                        paisRes = "Uruguay";
                        icAloj1 = 67.31;
                        icManu1 = 46.68;
                        icAloj2 = 57.70;
                        icManu2 = 41.47;
                        icAloj3 = 50.49;
                        icManu3 = 37.86;
                        break;
                    case 93:
                        paisRes = "Venezuela";
                        icAloj1 = 91.35;
                        icManu1 = 42.07;
                        icAloj2 = 78.13;
                        icManu2 = 36.06;
                        icAloj3 = 68.52;
                        icManu3 = 33.66;
                        break;
                    case 94:
                        paisRes = "Yemen";
                        icAloj1 = 156.26;
                        icManu1 = 49.28;
                        icAloj2 = 132.82;
                        icManu2 = 43.27;
                        icAloj3 = 117.20;
                        icManu3 = 40.27;
                        break;
                    case 95:
                        paisRes = "Yugoslavia";
                        icAloj1 = 115.39;
                        icManu1 = 57.70;
                        icAloj2 = 98.57;
                        icManu2 = 49.88;
                        icAloj3 = 86.55;
                        icManu3 = 45.68;
                        break;
                    case 96:
                        paisRes = "Zaire-Congo";
                        icAloj1 = 119;
                        icManu1 = 60.70;
                        icAloj2 = 101.57;
                        icManu2 = 54.09;
                        icAloj3 = 89.55;
                        icManu3 = 51.69;
                        break;
                    case 97:
                        paisRes = "Zimbawe";
                        icAloj1 = 90.15;
                        icManu1 = 45.08;
                        icAloj2 = 76.93;
                        icManu2 = 39.07;
                        icAloj3 = 67.91;
                        icManu3 = 36.06;
                        break;
                    case 98:
                        paisRes = "Resto del Mundo";
                        icAloj1 = 127.41;
                        icManu1 = 46.88;
                        icAloj2 = 108.78;
                        icManu2 = 40.87;
                        icAloj3 = 95.56;
                        icManu3 = 37.26;
                        break;


                }

                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if (checkedId==R.id.g1){
                            DietasViajes viaje = new DietasViajes(icAloj1, icManu1, nochesInt, persInt);
                            costeAlojF = viaje.calculaCosteAloj();
                            costeManuF = viaje.calculaCosteManu();
                            costeTF = viaje.calculaCoste();
                            costeAlojFS = df.format(costeAlojF);
                            costeManuFS = df.format(costeManuF);
                            costeTFS = df.format(costeTF);

                        }
                        else if (checkedId==R.id.g2){
                            DietasViajes viaje = new DietasViajes(icAloj2, icManu2, nochesInt, persInt);
                            costeAlojF = viaje.calculaCosteAloj();
                            costeManuF = viaje.calculaCosteManu();
                            costeTF = viaje.calculaCoste();
                            costeAlojFS = df.format(costeAlojF);
                            costeManuFS = df.format(costeManuF);
                            costeTFS = df.format(costeTF);

                        }
                        else if (checkedId==R.id.g3){
                            DietasViajes viaje = new DietasViajes(icAloj3, icManu3, nochesInt, persInt);
                            costeAlojF = viaje.calculaCosteAloj();
                            costeManuF = viaje.calculaCosteManu();
                            costeTF = viaje.calculaCoste();
                            costeAlojFS = df.format(costeAlojF);
                            costeManuFS = df.format(costeManuF);
                            costeTFS = df.format(costeTF);

                        }
                    }
                });


                Intent intent = new Intent(this, ResultadoCosteViaje.class);
                intent.putExtra("CosteAlojF", costeAlojFS);
                intent.putExtra("CosteManuF", costeManuFS);
                intent.putExtra("CosteTF", costeTFS);
                intent.putExtra("paisF", paisRes);
                intent.putExtra("nochesInt", nochesInt);
                intent.putExtra("persInt", persInt);
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
