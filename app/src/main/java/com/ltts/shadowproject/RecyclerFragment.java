package com.ltts.shadowproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ltts.shadowproject.adpaters.Adap;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecyclerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecyclerFragment extends Fragment {
    private RecyclerView mRecyclerview;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RecyclerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RecyclerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RecyclerFragment newInstance(String param1, String param2) {
        RecyclerFragment fragment = new RecyclerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ArrayList<Listfragment> exlist=new ArrayList<>();
        exlist.add(new Listfragment(R.drawable.s,"Blood Test","Thrusday @9PM"));
        exlist.add(new Listfragment(R.drawable.s,"Temprature Check","Friday @10PM"));
        exlist.add(new Listfragment(R.drawable.s,"Doc appointment","Monday @9PM"));
        exlist.add(new Listfragment(R.drawable.s,"Medicine Purchase","Thrusday @9PM"));
        exlist.add(new Listfragment(R.drawable.s,"Get prescription","Thrusday @9PM"));
        exlist.add(new Listfragment(R.drawable.s,"Books","Monday @9PM"));
        exlist.add(new Listfragment(R.drawable.s,"Sleep","Friday @9PM"));
        exlist.add(new Listfragment(R.drawable.s,"Health","Thrusday @9PM"));
        exlist.add(new Listfragment(R.drawable.s,"Books","Thrusday @9PM"));
        exlist.add(new Listfragment(R.drawable.s,"Sleep","Friday @9PM"));
        exlist.add(new Listfragment(R.drawable.s,"Health","Thrusday @9PM"));
        exlist.add(new Listfragment(R.drawable.s,"Books","Monday @9PM"));

        View rootView = inflater.inflate(R.layout.fragment_recycler, container, false);
        rootView.findViewById(R.id.recyclerview);
        mRecyclerview=rootView.findViewById(R.id.recyclerview);
        mLayoutManager=new LinearLayoutManager(this.getContext());
        mAdapter=new Adap(exlist);
        mRecyclerview.setLayoutManager(mLayoutManager);
        mRecyclerview.setAdapter(mAdapter);
        return rootView;
        //return inflater.inflate(R.layout.fragment_recycler, container, false);
    }
}