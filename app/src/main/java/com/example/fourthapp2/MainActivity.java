package com.example.fourthapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add
                (R.id.f2, Fragment2.class,null).commit();
    }

    public void Cat(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment1 f1 = new Fragment1();
        FragmentTransaction ftransct = fragmentManager.beginTransaction();
        fragmentManager.beginTransaction();
        ftransct.replace(R.id.f1,f1,"f1");
        ftransct.commit();
    }

    public void Dog(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment1 f2 = new Fragment1();
        FragmentTransaction ftransct = fragmentManager.beginTransaction();
        fragmentManager.beginTransaction();
        ftransct.replace(R.id.f2,f2,"f2");
        ftransct.commit();
    }

    public void Bird(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment1 f3 = new Fragment1();
        FragmentTransaction ftransct = fragmentManager.beginTransaction();
        fragmentManager.beginTransaction();
        ftransct.replace(R.id.f3,f3,"f3");
        ftransct.commit();
    }
}