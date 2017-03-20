package com.example.pc.studentinfosql.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pc.studentinfosql.R;
import com.example.pc.studentinfosql.model.ListItem;
import com.example.pc.studentinfosql.views.ContactDtails;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 3/16/2017.
 */

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder> {
    private List<ListItem> listitems = new ArrayList<>();

    //private LayoutInflater inflater;
    private Context ctx;

    public RecAdapter(List<ListItem> listitems, Context context) {
        this.listitems = listitems;
        this.ctx = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new ViewHolder(view,ctx, (ArrayList<ListItem>) listitems);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ListItem listItem = listitems.get(position);

        holder.textViewHeader.setText(listItem.getHead());
        holder.textViewDesc.setText(listItem.getDesc());



    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView textViewHeader;
        public TextView textViewDesc;
        ArrayList<ListItem> listitems = new ArrayList<>();
        Context ctx;

        public ViewHolder(View itemView,Context ctx,ArrayList<ListItem>listitems ) {
            super(itemView);
            this.listitems = listitems;
            this.ctx=ctx;
            itemView.setOnClickListener(this);
            textViewHeader = (TextView) itemView.findViewById(R.id.textViewHead);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDesc);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            ListItem listItem = this.listitems.get(position);
            Intent intent = new Intent(ctx, ContactDtails.class);
            intent.putExtra("head",listItem.getHead());
            intent.putExtra("des",listItem.getDesc());
            this.ctx.startActivity(intent);
        }
    }



    }

