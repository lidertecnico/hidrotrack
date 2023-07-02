package unal.todosalau.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WaterConsumptionActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_water_consumption);
    Button volver = findViewById(R.id.btnBackWaterRegister);
    volver.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent back = new Intent(WaterConsumptionActivity.this, MainActivity.class);
            startActivity(back);
        }
    });
}
}