package com.example.trabajomen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoPizza extends AppCompatActivity {

    private TextView tvnom,tvtam,tvingre,tvvalor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_pizza);

        tvnom=findViewById(R.id.tvNombre);
        tvtam=findViewById(R.id.tvTamaño);
        tvingre=findViewById(R.id.tvIngre);
        tvvalor=findViewById(R.id.tvValor);


        Pizza pizza =(Pizza) getIntent().getSerializableExtra("mipizza");

        tvnom.setText(pizza.getCliente());
        tvtam.setText(pizza.getTam());
        tvingre.setText(pizza.getIng());
        tvvalor.setText(String.valueOf(pizza.getPrecio()));

    }
}