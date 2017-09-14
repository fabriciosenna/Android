package listview.cursoandroid.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaItens;
    private String[] itens = {"Angra dos Reis", "Caldas Novas", "Campos do Jordão",
            "Florianópolis", "Balneário Camboriú","Garopaba","Blumenau",
            "Buenos Aires", "Santiago", "Cancun", "Budapeste", "Praga"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItens = (ListView) findViewById(R.id.listViewId);

        //Adapta o conteúdo do Array no formato adequado para ser exibido no ListView
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
                );

        listaItens.setAdapter(adaptador);


        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //pega a posição do item clicado na lista
                int codigoPosicao = position;

                //pega o valor do item clicado na lista
                String valorClicado = (String) listaItens.getItemAtPosition(codigoPosicao);

                //exibe a mensagem referente ao item clicado na lista
                Toast.makeText(getApplicationContext(),valorClicado,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
