package unal.todosalau.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_info);
    Button volver = findViewById(R.id.btnBackInfo);
    volver.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent back = new Intent(InfoActivity.this, MainActivity.class);
            startActivity(back);
        }
    });
}
}