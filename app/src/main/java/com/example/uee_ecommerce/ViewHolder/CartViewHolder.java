package com.example.uee_ecommerce.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uee_ecommerce.Interface.ItemClickListner;
import com.example.uee_ecommerce.R;

public class CartViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView txtProductName, txtProductQuantity, txtProductPrice;
    public ItemClickListner itemClickListner;

    public CartViewHolder(@NonNull View itemView) {
        super(itemView);

//        imageView = (ImageView) itemView.findViewById(R.id.product_image);
        txtProductName = (TextView) itemView.findViewById(R.id.cart_product_name);
        txtProductQuantity = (TextView) itemView.findViewById(R.id.cart_product_quantity);
        txtProductPrice = (TextView) itemView.findViewById(R.id.cart_product_price);
    }

    @Override
    public void onClick(View view) {

        itemClickListner.onClick(view,getAdapterPosition(),false);

    }

    public void setItemClickListner(ItemClickListner itemClickListner){
        this.itemClickListner = itemClickListner;
    }
}
