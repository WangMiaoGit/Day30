package com.example.screenadapterdemo04.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.screenadapterdemo04.MyApp;
import com.example.screenadapterdemo04.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends Fragment {


    private TextView textView_content;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_content, container, false);
        textView_content= (TextView) view.findViewById(R.id.textView_content);


        assignValue();
        System.out.println("=======================");
        return view;
    }

    public void assignValue() {
        MyApp myApp= (MyApp) getActivity().getApplication();
        String name=myApp.getName();
        System.out.println("name"+name);
        if(!TextUtils.isEmpty(name)){
            textView_content.setText(name);
        }
    }

}
