package com.example.mytabsver1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private  FragmentA_Activity fragment_a;
    private  FragmentB_Activity fragment_b;
    private  FragmentC_Activity fragment_c;
    private  FragmentD_Activity fragment_d;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        fragmentManager = getSupportFragmentManager();

        fragment_a = new FragmentA_Activity();
        fragment_b = new FragmentB_Activity();
        fragment_c = new FragmentC_Activity();
        fragment_d = new FragmentD_Activity();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout,fragment_a).commitAllowingStateLoss();

    }
    public void clickHandler(View view){
        transaction = fragmentManager.beginTransaction();
        switch(view.getId())
        {
            case R.id.btnHome:
                transaction.replace(R.id.frameLayout,fragment_a).commitAllowingStateLoss();
                break;
            case R.id.btnNaver:
                transaction.replace(R.id.frameLayout,fragment_b).commitAllowingStateLoss();
                break;

            case R.id.btnMyMovie:
                transaction.replace(R.id.frameLayout,fragment_c).commitAllowingStateLoss();
                break;

            case R.id.btnWeather:
                transaction.replace(R.id.frameLayout,fragment_d).commitAllowingStateLoss();
                break;
        }
    }
}
