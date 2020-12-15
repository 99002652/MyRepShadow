package com.ltts.shadowproject.Repo;

import com.ltts.shadowproject.model.Datamodel;

import java.util.ArrayList;
import java.util.HashMap;

public class DataFragmentRepo {
    private ArrayList<Datamodel> dataholder;
    private HashMap<String, Datamodel> objDetails;

    public ArrayList<Datamodel> getDatamodel() {
        if (dataholder == null) {
         dataholder = new ArrayList<>();
          Datamodel dm1 =  new Datamodel();
          dm1.setCategory("Health");
            dm1.settask("Task1");
        dataholder.add(dm1);


            Datamodel dm2 =  new Datamodel();
            dm2.setCategory("Health");
            dm2.settask("Task1");
            dataholder.add(dm2);

            Datamodel dm3 =  new Datamodel();
            dm3.setCategory("Health");
            dm3.settask("Task1");
            dataholder.add(dm2);
        }
        return dataholder;
    }

    public Datamodel getobjDetails(String category) {
        if (objDetails == null) {
            createobjDetailsMap();
        }
        return objDetails.get(category);
    }
    public void createobjDetailsMap(){
        objDetails=new HashMap<String,Datamodel>();
        Datamodel obj=new Datamodel();
        obj.setCategory("Songs Playlist");
        obj.setCategoryCount(2);
        objDetails.put("Songs Playlist", obj);


        obj=new Datamodel();
        obj.setCategory("Recipes");
        obj.setCategoryCount(2);
        objDetails.put("Recipes", obj);

        obj=new Datamodel();
        obj.setCategory("Bucket list");
        obj.setCategoryCount(4);
        objDetails.put("Bucket list", obj);


        obj=new Datamodel();
        obj.setCategory("Wish list");
        obj.setCategoryCount(0);
        objDetails.put("Wish list", obj);
    }
}
