package fr.joeybronner.chromedevtoolscheatsheet.cards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import fr.joeybronner.chromedevtoolscheatsheet.R;
import fr.joeybronner.chromedevtoolscheatsheet.interfaces.OnItemClickListener;
import fr.joeybronner.chromedevtoolscheatsheet.objects.Category;

public class CategoryAdapter extends RecyclerView.Adapter<CategoriesViewHolder> {

    List<Category> list;
    OnItemClickListener listener;

    // Custructor following a list of objects
    public CategoryAdapter(List<Category> list, OnItemClickListener listener) {
        this.list = list;
        this.listener = listener;
    }

    // This function creates the viewHolder for all the entries in the list
    @Override
    public CategoriesViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_category,viewGroup,false);
        return new CategoriesViewHolder(view);
    }

    // Bind cell with his elements (text/images)
    @Override
    public void onBindViewHolder(CategoriesViewHolder categoriesViewHolder, int position) {
        Category category = list.get(position);
        categoriesViewHolder.bind(category, listener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}