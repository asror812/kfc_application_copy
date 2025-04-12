package com.example.app_v4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_v4.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    List<Product> products = new ArrayList<>();

    ListView productList;

    @Override
    public void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);

        setContentView(R.layout.menu);

        if(products.isEmpty()){
            initializeMenu();
        }

        productList = (ListView) findViewById(R.id.productList);
        ProductAdapter adapter = new ProductAdapter(this, R.layout.list_item, products);
        productList.setAdapter(adapter);
    }

    private void initializeMenu(){
        int id = 0;
        products.add(new Product(++id, "CHIZBURGER", "asfdgnhkfdsadhgfh", R.drawable.burger_placeholder, 23000L));
        products.add(new Product(++id, "CHIZBURGER", "asfdgnhkfdsadhgfh", R.drawable.burger_placeholder, 23000L));
        products.add(new Product(++id, "CHIZBURGER", "asfdgnhkfdsadhgfh", R.drawable.burger_placeholder, 23000L));
        products.add(new Product(++id, "CHIZBURGER", "asfdgnhkfdsadhgfh", R.drawable.burger_placeholder, 23000L));
        products.add(new Product(++id, "CHIZBURGER", "asfdgnhkfdsadhgfh", R.drawable.burger_placeholder, 23000L));
        products.add(new Product(++id, "CHIZBURGER", "asfdgnhkfdsadhgfh", R.drawable.burger_placeholder, 23000L));
    }
}
