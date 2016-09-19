package fr.joeybronner.chromedevtoolscheatsheetapp.cards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import fr.joeybronner.chromedevtoolscheatsheetapp.R;
import fr.joeybronner.chromedevtoolscheatsheetapp.interfaces.OnCommandClickListener;
import fr.joeybronner.chromedevtoolscheatsheetapp.interfaces.OnShareClickListener;
import fr.joeybronner.chromedevtoolscheatsheetapp.objects.Command;

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