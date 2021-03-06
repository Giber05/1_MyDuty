package com.example.myduty.ui.assignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myduty.R;
import java.util.ArrayList;
import java.util.Collections;


/**
 * A fragment representing a listRecycleView of Items.
 */
public class AssignmentList extends Fragment {

    ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    public void addData()
    {
        assignments.add(new Assignment("Matematika","Integral","02-April-2021",4,"Cepat bereskan"));
        assignments.add(new Assignment("IPA","Adaptasi","22-April-2021",5,"Yu bisa"));
        assignments.add(new Assignment("IPS","Sistem Kasta","22-April-2021",3,"Pengumpulan via Google Classroom"));
        assignments.add(new Assignment("B.Indonesia","Struktur Kalimat","22-April-2021",1,"Yu bisa"));
        assignments.add(new Assignment("PLH","Kebersihan lingkungan","22-April-2021",2,"Yu bisa"));
        assignments.add(new Assignment("PLH","Kebersihan Sekolah","23-April-2021",1,"Yu bisa"));
        assignments.add(new Assignment("Penjas","PencakSilat","25-April-2021",5,"Yu bisa"));
        assignments.add(new Assignment("B.Inggris","Tenses","25-April-2021",4,"Yu bisa"));
        assignments.add(new Assignment("B.Inggris","Tenses","25-April-2021",4,"Yu bisa"));
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_assignment_list_list, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.listRecycleView);
        addData();
        Collections.sort(assignments);
        AssigmentAdapter adapter = new AssigmentAdapter(assignments);
        recyclerView.setAdapter(adapter);

        return view;
    }




}