package com.jameel_achive.comingsoon;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class DepartmentsFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Department> lstDepartment;

    public DepartmentsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.departments_frag, container, false);

        myrecyclerview = (RecyclerView) v.findViewById(R.id.department_recyclerView);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstDepartment);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstDepartment = new ArrayList<>();
        lstDepartment.add(new Department("Emergency", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Urology", "Click for details", R.drawable.images));
        lstDepartment.add(new Department("Operations Theatre", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Out Patient Department", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Laboratory & Pathology", "Click for details", R.drawable.laboratory));
        lstDepartment.add(new Department("Radiology", "Click for details", R.drawable.radiology));
        lstDepartment.add(new Department("Administration", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Orthopedic", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Human Resources", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Cardiology", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Operations Theatre", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Out Patient Department", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Emergency", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Urology", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Operations Theatre", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Out Patient Department", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Emergency", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Urology", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Operations Theatre", "Click for details", R.drawable.image));
        lstDepartment.add(new Department("Out Patient Department", "Click for details", R.drawable.image));

        }
}
