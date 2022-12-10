package com.example.sprint2g103;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.sprint2g103.Adapters.ProductAdapter;
import com.example.sprint2g103.Entities.Product;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {
    private ListView listViewProducts;
    private ProductAdapter productAdapter;
    private ArrayList<Product> arrayProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        arrayProducts = new ArrayList<>();
        //Creacion de productos manuales
        Product product1 = new Product("Producto 1", "Descripcion 1", 1000, R.drawable.pp1 );
        Product product2 = new Product("Producto 2", "Descripcion 2", 2000, R.drawable.pp2 );
        Product product3 = new Product("Producto 3", "Descripcion 3", 3000, R.drawable.pp3 );
        Product product4 = new Product("Producto 4", "Descripcion 4", 4000, R.drawable.pp4 );

        arrayProducts.add(product1);
        arrayProducts.add(product2);
        arrayProducts.add(product3);
        arrayProducts.add(product4);

        listViewProducts = (ListView) findViewById(R.id.listViewProducts);
        productAdapter = new ProductAdapter(this, arrayProducts);
        listViewProducts.setAdapter(productAdapter);
    }
}