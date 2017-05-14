package com.example.johnnate.vantashop;

import android.graphics.drawable.Drawable;

/**
 * Created by JohnNate on 5/14/17.
 */

public class Product {
    public String name;
    public int price, id;
    Drawable image;

    public Product(int id, String name, int price, Drawable image)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
    }
}
