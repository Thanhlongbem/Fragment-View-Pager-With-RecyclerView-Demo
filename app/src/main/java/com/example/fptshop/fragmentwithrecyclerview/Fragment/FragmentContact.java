package com.example.fptshop.fragmentwithrecyclerview.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fptshop.fragmentwithrecyclerview.Adapter.RecyclerViewAdapter;
import com.example.fptshop.fragmentwithrecyclerview.Contact;
import com.example.fptshop.fragmentwithrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;

    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);
        myrecyclerview = (RecyclerView)v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Me", "0977035780", R.drawable.img6));
        lstContact.add(new Contact("Vợ", "0916662195", R.drawable.img6));
        lstContact.add(new Contact("Bà", "01648854519", R.drawable.img6));
        lstContact.add(new Contact("Bố", "0912053701", R.drawable.img6));
        lstContact.add(new Contact("Mẹ", "0915863727", R.drawable.img6));
        lstContact.add(new Contact("Eliott", "01694061127", R.drawable.img6));
        lstContact.add(new Contact("Mẹ 2", "01672099075", R.drawable.img6));


    }
}
