package com.mohamedsnoussi.basicfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class MyDynamicFragment extends Fragment {
    public MyDynamicFragment() {


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_my_dynamic, container, false);



    }

}
