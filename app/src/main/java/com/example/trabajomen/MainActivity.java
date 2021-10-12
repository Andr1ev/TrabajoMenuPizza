package com.example.trabajomen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private RadioButton rb1,rb2,rb3;
    private CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=findViewById(R.id.etNombre);
        rb1=findViewById(R.id.rbPeq);
        rb2=findViewById(R.id.rbMed);
        rb3=findViewById(R.id.rbGra);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        cb5=findViewById(R.id.cb5);
        cb6=findViewById(R.id.cb6);
        cb7=findViewById(R.id.cb7);
        btnAceptar=findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nom=etNombre.getText().toString();
                String tamaño="";
                String ingre="";
                int precio=0;

                if(nom.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Ingrese Nombre", Toast.LENGTH_SHORT).show();
                }

                if (rb1.isChecked()) {
                     tamaño=rb1.getHint().toString();
                     precio=precio+1500;
                } else if (rb2.isChecked()) {
                     tamaño=rb2.getHint().toString();
                    precio=precio+3000;
                } else if (rb3.isChecked()) {
                     tamaño=rb3.getHint().toString();
                    precio=precio+5000;
                } else {
                    Toast.makeText(MainActivity.this,"Elija tamaño de pizza", Toast.LENGTH_SHORT).show();
                }


                if (cb1.isChecked()){
                    ingre=ingre + "Carne ";
                    precio=precio+400;
                }if (cb2.isChecked()){
                    ingre=ingre + "Peperoni ";
                    precio=precio+200;
                }if (cb3.isChecked()){
                    ingre=ingre + "Tocino ";
                    precio=precio+450;
                }if (cb4.isChecked()){
                    ingre=ingre + "Champiñon ";
                    precio=precio+250;
                }if (cb5.isChecked()){
                    ingre=ingre + "Tomate ";
                    precio=precio+200;
                }if (cb6.isChecked()){
                    ingre=ingre + "Choclo ";
                    precio=precio+200;
                }if (cb7.isChecked()){
                    ingre=ingre + "Aceituna ";
                    precio=precio+250;
                }

                if (ingre.equals("")){
                    Toast.makeText(MainActivity.this,"Debe seleccionar al menos 1 ingrediente", Toast.LENGTH_SHORT).show();
                }
                else {




                    Pizza pizza = new Pizza(nom,tamaño,ingre,precio);

                    Intent intento = new Intent(getApplicationContext(),ResultadoPizza.class);
                    intento.putExtra("mipizza", pizza);
                    startActivity(intento);


                }

            }
        });




    }
}