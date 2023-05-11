package com.example.appbdsqlitecerda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListaProductos extends AppCompatActivity {
    public TextView tvSalidaPrecio;
    public ListView lvProductos;
    //arreglo para lista de productos
    public String productos[]={"Smart Tv","Tablet","PC","Radio","Smart wactch"};

    //arreglo para imprimir precios
    public String precio[]={"10000","900","4000","500","300"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);

        //integrar xml a java
        tvSalidaPrecio=findViewById(R.id.tvSalidaPrecio);
        lvProductos=(ListView)findViewById(R.id.lvProductos);
        //definicio de un adapter paa list producto
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,productos);
        lvProductos.setAdapter(adapter);
        //Programar evento click para seleccionaar producto de la lista y se imprima precio
        lvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long id) {
                tvSalidaPrecio.setText("Precio de venta:"+precio[posicion]);
            }
        });

    }//fin on create
}//fina clase listap