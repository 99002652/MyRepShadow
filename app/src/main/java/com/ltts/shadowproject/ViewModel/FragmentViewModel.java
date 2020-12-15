package com.ltts.shadowproject.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ltts.shadowproject.Repo.DataFragmentRepo;
import com.ltts.shadowproject.model.Datamodel;

import java.util.ArrayList;

public class FragmentViewModel  extends ViewModel {
    private MutableLiveData<String> selectedDatamodel= new MutableLiveData<>();
    private DataFragmentRepo repo=new DataFragmentRepo();


    public void selectDatamodel(String categoryName){
        selectedDatamodel.setValue(categoryName);
    }


    public MutableLiveData<String> getSelectedDatamodel(){
        return selectedDatamodel;
    }


    public ArrayList<Datamodel> getobjList(){
        return repo.getDatamodel();
    }


    public Datamodel getobjDetails(String category){
        return repo.getobjDetails(category);
    }


    public ArrayList<Datamodel> getDatamodel() {
        return repo.getDatamodel();
    }
}
