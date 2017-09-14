package dadosactivity.cursoandroid.com.dadosactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Preparando a informação a ser passada desta Activity para outra

                Intent intent = new Intent(MainActivity.this,SegundaActivity.class);

                intent.putExtra("nome","Fabricio Baixo");

                startActivity(intent);
            }
        });
    }
}
