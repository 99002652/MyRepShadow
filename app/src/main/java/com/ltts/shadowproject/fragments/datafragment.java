package com.ltts.shadowproject.fragments;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ltts.shadowproject.R;
import com.ltts.shadowproject.Repo.DataFragmentRepo;
import com.ltts.shadowproject.ViewModel.FragmentViewModel;
import com.ltts.shadowproject.adpaters.myadapter;

import java.util.ArrayList;

import static android.view.View.*;


public class datafragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<String> dataholder;
    FloatingActionButton add;
    FragmentViewModel viewm;
    DataFragmentRepo repo;
    private myadapter myadap;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_datafragment, container, false);
        setHasOptionsMenu(true);

        add = view.findViewById(R.id.button_add_note);
        add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialogue_Fragment mydialog = new Dialogue_Fragment();
                mydialog.show(getFragmentManager(), "Dialogue_Fragment");
            }
        });


        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        dataholder = new ArrayList<String>();
//        String da1 = "Health";
//        dataholder.add(da1);
//        datamodel da2 = new datamodel("Songs");
//        dataholder.add(da2);
//        datamodel da4 = new datamodel("Books");
//        dataholder.add(da4);
//        datamodel da5 = new datamodel("Drives");
//        dataholder.add(da5);
//        datamodel da6 = new datamodel("Bdy");
//        dataholder.add(da6);
//        datamodel da7 = new datamodel("Party");
//        dataholder.add(da7);
//        recyclerView.setAdapter(new myadapter(dataholder));


        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu, menu);
        MenuItem item = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });

        super.onCreateOptionsMenu(menu, inflater);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        boolean showMessage = false;

        String message = "You click ";


        if (itemId == R.id.share) {
            showMessage = true;
            message += "share";
        } else if (itemId == R.id.delete) {
            showMessage = true;
            message += "delete";
        }

        if (showMessage) {
            AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();
            alertDialog.setMessage(message);
            alertDialog.show();
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        viewm= ViewModelProviders.of(this.getActivity()).get(FragmentViewModel.class);
        recyclerView.setAdapter(new myadapter(viewm.getobjList()));
        //get variables needed to display
    }
}
