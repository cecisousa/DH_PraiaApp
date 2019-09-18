package br.com.digitalhouse.dh_praiaapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnPraiaAlmada;
    private Button btnPraiaDaJusta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPraiaAlmada = findViewById(R.id.button1);
        btnPraiaDaJusta = findViewById(R.id.button2);

        public void recarregaFragment(Fragment fragment){
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.container, fragment);
            transaction.commit();
        }

        btnPraiaAlmada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recarregaFragment(new PraiaAlmadaFragment());
            }
        });

        btnPraiaDaJusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recarregaFragment(new PraiaDaJustaFragment());
            }
        });



    }

}
