package com.example.alumno.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button tbnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("martinez","La aplicacion acaba de ingresar a oncreate");
        Button btnGo = (Button) findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,DetalleActivity.class);
                MainActivity.this.startActivity(x);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("martinez","La aplicacion acaba de ingresar a onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Gracias por su uso xD...!!!", Toast.LENGTH_SHORT).show();
        Log.v("martinez","La aplicacion acaba de ingresar a onstart");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.v("martinez","La aplicacion acaba de ingresar a onstart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("martinez","La aplicacion acaba de ingresar a onstart");
    }
}
