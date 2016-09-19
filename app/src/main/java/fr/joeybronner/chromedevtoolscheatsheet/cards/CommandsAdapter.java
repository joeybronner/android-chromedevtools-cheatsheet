package fr.joeybronner.chromedevtoolscheatsheet.cards;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import fr.joeybronner.chromedevtoolscheatsheet.R;
import fr.joeybronner.chromedevtoolscheatsheet.interfaces.OnCommandClickListener;
import fr.joeybronner.chromedevtoolscheatsheet.interfaces.OnItemClickListener;
import fr.joeybronner.chromedevtoolscheatsheet.interfaces.OnShareClickListener;
import fr.joeybronner.chromedevtoolscheatsheet.objects.Command;

public class CommandsAdapter extends RecyclerView.Adapter<CommandsViewHolder> {

    List<Command> list;
    OnCommandClickListener listener;
    OnShareClickListener listenerShare;

    // Custructor following a list of objects
    public CommandsAdapter(List<Command> list, OnCommandClickListener listener, OnShareClickListener listenerShare) {
        this.list = list;
        this.listener = listener;
        this.listenerShare = listenerShare;
    }

    // This function creates the viewHolder for all the entries in the list
    @Override
    public CommandsViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_command,viewGroup,false);
        return new CommandsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CommandsViewHolder holder, int position) {
        Command command = list.get(position);
        holder.bind(command, listener, listenerShare);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}