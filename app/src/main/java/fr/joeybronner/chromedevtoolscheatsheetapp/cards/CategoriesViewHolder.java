package fr.joeybronner.chromedevtoolscheatsheetapp.cards;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import fr.joeybronner.chromedevtoolscheatsheetapp.R;
import fr.joeybronner.chromedevtoolscheatsheetapp.interfaces.OnItemClickListener;
import fr.joeybronner.chromedevtoolscheatsheetapp.objects.Category;

public class CategoriesViewHolder extends RecyclerView.ViewHolder {

    private TextView textViewView;
    private ImageView imageView;

    // itemView is the view for one cell
    public CategoriesViewHolder(View itemView) {
        super(itemView);
        textViewView = (TextView) itemView.findViewById(R.id.text);
        imageView = (ImageView) itemView.findViewById(R.id.image);
    }

    // Set the values/images to the object
    public void bind(final Category category, final OnItemClickListener listener){
        textViewView.setText(category.getText());
        imageView.setImageResource(category.getImageUrl());
        //Picasso.with(imageView.getContext()).load(category.getImageUrl()).centerCrop().fit().into(imageView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                listener.onItemClick(category);
            }
        });
    }
}