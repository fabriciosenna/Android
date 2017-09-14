package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "O inferno está cheio de boas intenções.",
            "O desejo de alegrar o próximo atrai a saúde. O desejo de ser agradado pelos outros atrai a doença.",
            "A atmosfera do indivíduo a primeira impressão o magnetismo pessoal a simpatia tudo depende da mente da pessoa",
            "Seja sempre alegre. Estudando e trabalhando com alegria, você progredirá cada vez mais.",
            "Seu tempo é limitado, então não o perca vivendo a vida de outra pessoa.",
            "Não deixe o ruído das opiniões de outras pessoas calar a sua própria voz interior.",
            "Tenha coragem de seguir seu coração e intuição, de alguma maneira eles já sabem o que você realmente quer se tornar.",
            "Se você não pode fazer um milagre, torne-se um.",
            "Nossa vida é o que nossos pensamentos fazem dela.",
            "Se você quer mudar tudo, basta mudar a sua atitude.",
            "No fim tudo da certo, se não deu certo é porque ainda não chegou ao fim"
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);



        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);


                textoNovaFrase.setText(frases[numeroAleatorio]);


            }
        });

    }
}
