package com.example.platformadapterdemo05;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int versionNumber= Build.VERSION.SDK_INT;
        System.out.println("versionNumber="+versionNumber);
        if(versionNumber>=Build.VERSION_CODES.HONEYCOMB){
            Toast.makeText(this, "当前手机运行的版本号高于3.0,可以使用3.0新特性!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "当前手机运行的版本号低于3.0,不能使用3.0新特性!", Toast.LENGTH_SHORT).show();
        }
    }
}
