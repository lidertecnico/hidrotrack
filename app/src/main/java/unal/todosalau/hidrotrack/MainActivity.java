package unal.todosalau.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Definir los botones
    //Botón registro de consumo
    Button registro = findViewById(R.id.btnRegistroConsumo);
    //Botón consejos
    Button consejos = findViewById(R.id.btnConsejos);
    //Botón seguimiento
    Button seguimiento = findViewById(R.id.btnSeguimientoProgreso);
    //Botón información
    Button informacion = findViewById(R.id.btnInformacion);
    //Botón configuración
    Button configuracion = findViewById(R.id.btnConfiguracion);

    //Añadir la navegación entre pantallas
    //Navegación botón registro de agua
    registro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent registroActivity = new Intent(MainActivity.this, WaterConsumptionActivity.class);
            startActivity(registroActivity);
        }
    });

    //Navegación del botón consejos
    consejos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent consejosActivity = new Intent(MainActivity.this, TipsActivity.class);
            startActivity(consejosActivity);
        }
    });
    //Navegación del botón seguimiento
    seguimiento.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent seguimientoActivity = new Intent(MainActivity.this, ProgressActivity.class);
            startActivity(seguimientoActivity);
        }
    });

    //navegación botón información
    informacion.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent informacionActivity = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(informacionActivity);
        }
    });

    //navegación boton configuración}
    configuracion.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent configuracionActivity = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(configuracionActivity);
        }
    });
    }
}