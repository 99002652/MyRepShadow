package com.ltts.shadowproject.adpaters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.ltts.shadowproject.R;
import com.ltts.shadowproject.RecyclerFragment;
import com.ltts.shadowproject.model.Datamodel;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder> {
    ArrayList<Datamodel> dataholder;


    public myadapter(ArrayList<Datamodel> dataholder) {
        this.dataholder = dataholder;

    }

    @NonNull

    @Override
    public myadapter.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_design, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.text_view_priority.setText(dataholder.get(position).gettask());
        holder.text_view_title.setText(dataholder.get(position).getCategory());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) v.getContext();
                RecyclerFragment blankFragment = new RecyclerFragment();
                appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer, blankFragment).addToBackStack(null).commit();

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {

        TextView text_view_priority, text_view_title;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            text_view_title = itemView.findViewById(R.id.text_view_title);
            text_view_priority = itemView.findViewById(R.id.text_view_priority);


        }
    }
}
