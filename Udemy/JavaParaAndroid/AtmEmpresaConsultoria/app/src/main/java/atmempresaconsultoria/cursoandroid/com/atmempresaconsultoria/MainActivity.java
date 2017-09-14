package atmempresaconsultoria.cursoandroid.com.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView botaoEmpresa;
    private ImageView botaoServicos;
    private ImageView botaoClientes;
    private ImageView botaoContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Empresa
        botaoEmpresa = (ImageView) findViewById(R.id.empresaId);

        botaoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,EmpresaActivity.class));
            }
        });

        //Servicos
        botaoServicos = (ImageView) findViewById(R.id.servicoId);

        botaoServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ServicoActivity.class));
            }
        });

        //Clientes
        botaoClientes = (ImageView) findViewById(R.id.clienteId);

        botaoClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,ClienteActivity.class));
            }
        });

        //Contato
        botaoContato = (ImageView) findViewById(R.id.contatoId);

        botaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,ContatoActivity.class));
            }
        });

    }
}
