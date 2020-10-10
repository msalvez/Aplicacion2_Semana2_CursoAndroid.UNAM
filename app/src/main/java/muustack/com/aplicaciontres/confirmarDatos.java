package muustack.com.aplicaciontres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class confirmarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        final TextView editarNombre = (TextView)findViewById(R.id.editarNombre);
        final TextView editarFecha = (TextView)findViewById(R.id.editarFecha);
        final TextView editarTelefono = (TextView)findViewById(R.id.editarTelefono);
        final TextView editarEmail = (TextView)findViewById(R.id.editarEmail);
        final TextView editarDescripcion = (TextView)findViewById(R.id.editarDescripcion);


        Intent intent = getIntent();
        editarNombre.setText(intent.getStringExtra("nombre"));
        editarFecha.setText(intent.getStringExtra("fechanacimiento"));
        editarTelefono.setText(intent.getStringExtra("telefono"));
        editarEmail.setText(intent.getStringExtra("email"));
        editarDescripcion.setText(intent.getStringExtra("descripcion"));


        Button botonVolver = (Button) findViewById(R.id.atras);

        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


}