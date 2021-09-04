package fernando.example.ejercicioguardarestado;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String STATE_MENSAJE="estado_iniciado";
    private EditText Editmail, Editcontraceña;
    private TextView textInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Editmail=(EditText)findViewById(R.id.email);
        Editcontraceña=(EditText)findViewById(R.id.contaseña);
        textInicio=(TextView)findViewById(R.id.iniciar_cesion);
    }

    public void onClickInicio(View view){
        textInicio.setText("La sesion a sido iniciada correctamente"+ " " +Editmail.getText());

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_MENSAJE,textInicio.getText().toString());
    }
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textInicio.setText(savedInstanceState.getString(STATE_MENSAJE));
    }

}
