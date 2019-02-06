package com.example.fptshop.fragmentwithrecyclerview.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fptshop.fragmentwithrecyclerview.Contact;
import com.example.fptshop.fragmentwithrecyclerview.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    Context mContext;
    List<Contact> mData;

    public RecyclerViewAdapter(Context mcontext, List<Contact> mData) {
        this.mContext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_contact,viewGroup,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        holder.tv_name.setText(mData.get(i).getName());
        holder.tv_phone.setText(mData.get(i).getPhone());
        holder.img.setImageResource(mData.get(i).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView    tv_name;
        private TextView    tv_phone;
        private ImageView   img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = (TextView)itemView.findViewById(R.id.name_contact);
            tv_phone =(TextView)itemView.findViewById(R.id.phone_contact);
            img = (ImageView)itemView.findViewById(R.id.img_contact);
        }
    }

}
