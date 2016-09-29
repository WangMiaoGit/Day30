package com.example.screenadapterdemo04.fragment;

import android.app.ListFragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.screenadapterdemo04.MyApp;
import com.example.screenadapterdemo04.R;
import com.example.screenadapterdemo04.activity.DetailActivity;

import java.util.ArrayList;

/**
 * Created by wangmiao on 2016/9/29.
 */
public class LeftFragment extends ListFragment {


    private ArrayAdapter<String> adapter;
    private ArrayList<String> data;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        this.adapter=getAdapter();
        this.setListAdapter(adapter);
    }

    private ArrayAdapter<String> getAdapter() {
        this.data = this.getData();
        this.adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data);
        return this.adapter;
    }

    private ArrayList<String> getData() {
        this.data = new ArrayList<>();
        for(int i = 0;i<15;i++){
            data.add("小白"+i);
        }
        return data;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        String name=data.get(position);
        Toast.makeText(getActivity(), "name="+name, Toast.LENGTH_SHORT).show();

        //得到全局应用程序对象
        MyApp myApp= (MyApp) getActivity().getApplication();
        //设置姓名
        myApp.setName(name);

        //获取当前手机的屏幕方向
        int screenOrientation=getResources().getConfiguration().orientation;
        //Configuration.ORIENTATION_PORTRAIT:代表当前手机方向为竖屏
        if(screenOrientation== Configuration.ORIENTATION_PORTRAIT){
            Intent intent=new Intent(getActivity(), DetailActivity.class);
            startActivity(intent);

            // Configuration.ORIENTATION_LANDSCAPE:代表当前手机方向为横屏
        }else if(screenOrientation==Configuration.ORIENTATION_LANDSCAPE){
            ContentFragment contentFagment= (ContentFragment) getFragmentManager().findFragmentById(R.id.fragment_content);
            contentFagment.assignValue();
        }

    }
}
