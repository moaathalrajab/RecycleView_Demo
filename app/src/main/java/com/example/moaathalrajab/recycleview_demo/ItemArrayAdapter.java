package com.example.moaathalrajab.recycleview_demo;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.ViewHolder> {

    private List<Item> items;

    public static final int SENDER = 0;
    public static final int RECIPIENT = 1;

    public ItemArrayAdapter(Context context, List<Item> messages) {
        items = messages;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView1;
        public TextView mTextView2;
        public ViewHolder(LinearLayout v) {
            super(v);
            mTextView1 = (TextView) v.findViewById(R.id.text);

        }
    }

    @Override
    public ItemArrayAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 1) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item_purple, parent, false);
            ViewHolder vh = new ViewHolder((LinearLayout) v);
            return vh;
        } else {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item_green, parent, false);
            ViewHolder vh = new ViewHolder((LinearLayout) v);
            return vh;
        }
    }

    public void remove(int pos) {
        int position = pos;
        items.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, items.size());

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mTextView1.setText(items.get(position).getMessage());


        holder.mTextView1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                remove(position);
                return false;
            }
        } );
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        Item message = items.get(position);

        if (message.getSenderName().equals("Noor")) {
            return SENDER;
        } else {
            return RECIPIENT;
        }

    }

}