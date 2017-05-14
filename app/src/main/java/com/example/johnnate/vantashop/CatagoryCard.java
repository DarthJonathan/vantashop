package com.example.johnnate.vantashop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by JohnNate on 5/14/17.
 */

public class CatagoryCard extends ArrayAdapter{

    public CatagoryCard (Context context, ArrayList<Product> products)
    {
        super(context,0,products);
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent)
    {
        // Get the data item for this position
        Product product = (Product) getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.catagory_card, parent, false);
        }

        TextView prodName = (TextView) convertView.findViewById(R.id.productName);
        TextView prodPrice = (TextView) convertView.findViewById(R.id.productPrice);
        ImageView prodImage = (ImageView) convertView.findViewById(R.id.productImage);

        prodImage.setImageDrawable(product.image);
        prodName.setText(product.name);
        prodPrice.setText(String.valueOf(product.price));

        return convertView;
    }
}
