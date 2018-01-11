package com.example.hp.madose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Variation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variation);
       TextView entrees=findViewById(R.id.listeE);
        TextView demande=findViewById(R.id.listeD);
        TextView sortie=findViewById(R.id.listeS);
        TextView stock=findViewById(R.id.stock);
        TextView demand=findViewById(R.id.textView9);






        entrees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Variation.this,Affichage.class);
                intent.putExtra("passage","entree");
                startActivity(intent);
            }
        });

        demande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Variation.this,CoutTotalBesoin.class);
                intent.putExtra("passage","demande");
                startActivity(intent);
            }
        });

        sortie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Variation.this,Affichage.class);
                intent.putExtra("passage","sortie");
                startActivity(intent);
            }
        });

        stock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Variation.this,Affichage.class);
                intent.putExtra("passage","stock");
                startActivity(intent);
            }
        });

        demand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Variation.this,Affichage.class);
                intent.putExtra("passage","demande");
                startActivity(intent);
            }
        });
        TextView rupture= findViewById(R.id.rupture);


        rupture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Variation.this,Affichage.class);
                intent.putExtra("passage","Rupture");
                startActivity(intent);
            }
        });


    }

}

