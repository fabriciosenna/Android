package signos.cursoandroid.com.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos = {"Áries","Touro","Gêmeos","Câncer","Leão","Virgem",
            "Libra", "Escorpião","Sagitário","Capricórnio","Aquário", "Peixes"
    };

    private String[] perfis = {
            "Características de Áries: Impulsividade, Espontaneidade e Ingenuidade",
            "Características de Touro: Realização, Teimosia e Sensualidade  ",
            "Características de Gêmeos: Inteligência, Versatilidade e Comunicação",
            "Características de Câncer: Emoção, Afeição, Imaginação ",
            "Características de Leão: Generosidade, Nobreza e Criatividade",
            "Características de Virgem: Perfeccionismo, Inteligência e Opinativo",
            "Características de Libra: Vaidade, Gentileza e Idealização",
            "Características de Escorpião: Intensidade, Transformação e Mistério",
            "Características de Sagitário: Originalidade, Intuição e Inspiração",
            "Características de Capricórnio: Responsabilidade, Persistência e Esforço ",
            "Características de Aquário: Inovação, Originalidade e Visão",
            "Características de Peixes: Solidariedade, Sensibilidade e Intuição "
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;

                Toast.makeText(getApplicationContext(),perfis[codigoPosicao],Toast.LENGTH_LONG).show();
            }
        });

    }
}
