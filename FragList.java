package it.univaq.fragmentapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class FragList extends ListFragment {

    ItemSelected activity;


    public interface ItemSelected
    {
        void onItemSelected(int index); 
    }

    public FragList() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (ItemSelected) context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //creiamo un array con i valori da mettere nella lista
        ArrayList<String> data = new ArrayList<>();
        data.add("Item1");
        data.add("Item2");
        data.add("Item3");

        //carichiamo i dati appena creati nella lista
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data));
        //imposto di visionare nella textview la descrizione del primo elemento di default
        activity.onItemSelected(0);
    }


    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        activity.onItemSelected(position);
    }
}