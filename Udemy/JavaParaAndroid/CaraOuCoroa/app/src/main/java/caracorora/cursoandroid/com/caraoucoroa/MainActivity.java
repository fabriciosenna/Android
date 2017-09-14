package caracorora.cursoandroid.com.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String[] opcao = {"cara","coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (ImageView) findViewById(R.id.jogarId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Gerar número aleatório
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(2);

                //0 cara - 1 coroa
                //opcao[numeroAleatorio]
                Intent intent = new Intent(MainActivity.this,DetalheActivity.class);

                //Envia as informações para a Activity
                intent.putExtra("opcao", opcao[numeroAleatorio]);

                //Vai para DetalheActivity
                startActivity(intent);

            }
        });

    }
}
