package com.example.mytabsver01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private FragmentA_Activity fragment_a;
    private FragmentB_Activity fragment_b;
    private FrangmentC_Activity frangment_c;
    private FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        fragmentManager = getSupportFragmentManager();
        fragment_a = new FragmentA_Activity();
        fragment_b = new FragmentB_Activity();
        frangment_c = new FrangmentC_Activity();
        transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.frameLayout,fragment_a).commitAllowingStateLoss();

    }
    public void clickHandler(View view){
        transaction = fragmentManager.beginTransaction();
        switch (view.getId()) {
            case R.id.btnHome:
                transaction.replace(R.id.frameLayout,fragment_a).commitAllowingStateLoss();
                break;
            case R.id.btnLogin:
                transaction.replace(R.id.frameLayout,fragment_b).commitAllowingStateLoss();
                break;
            case R.id.btnMy:
                transaction.replace(R.id.frameLayout,frangment_c).commitAllowingStateLoss();
                break;


        }
    }
}
