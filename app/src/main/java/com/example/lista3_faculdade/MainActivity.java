package com.example.lista3_faculdade;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    private EditText nomeEditText, quantidadeEditText, valorEditText;
    private Button cadastrarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEditText = findViewById(R.id.nomeEditText);
        quantidadeEditText = findViewById(R.id.quantidadeEditText);
        valorEditText = findViewById(R.id.valorEditText);
        cadastrarButton = findViewById(R.id.cadastrarButton);

        cadastrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrarProduto();
            }
        });


        Button navegarButton = findViewById(R.id.navegarButton);
        navegarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        Button navegarButton2 = findViewById(R.id.navegarButton2);
        navegarButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }

    private void cadastrarProduto() {
        String nome = nomeEditText.getText().toString();
        String quantidade = quantidadeEditText.getText().toString();
        String valor = valorEditText.getText().toString();

        // Aqui você pode fazer a validação dos campos e o cadastro propriamente dito
        if (!nome.isEmpty() && !quantidade.isEmpty() && !valor.isEmpty()) {
            // Aqui você pode chamar um método para inserir os dados em um banco de dados ou realizar outra ação de cadastro
            exibirMensagem("Produto cadastrado com sucesso!");
            limparCampos();
        } else {
            exibirMensagem("Preencha todos os campos.");
        }
    }

    private void exibirMensagem(String mensagem) {
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }

    private void limparCampos() {
        nomeEditText.setText("");
        quantidadeEditText.setText("");
        valorEditText.setText("");
    }
}
