package com.android.bayu.mystyle;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //pengecekan fragment
        if(savedInstanceState==null) {
            //inisiasi adapter untuk pengaktifan fragment
            FragmentManager fragmentManager = getSupportFragmentManager();
            //transaksi fragment
            //inisiasi object bodyfragment bertipe bodypartsFragment
            BodyPartsFragment bodyFragment;
            //membuat object fragment bodies
            bodyFragment = new BodyPartsFragment();
            bodyFragment.setmImageIds(ImageAssets.getBodies());
            bodyFragment.setmListIndex(0);
            //transaksi fragment bodies
            fragmentManager.beginTransaction().add(R.id.bodies_container, bodyFragment).commit();

            //membuat object fragment legs
            bodyFragment = new BodyPartsFragment();
            bodyFragment.setmImageIds(ImageAssets.getLegs());
            bodyFragment.setmListIndex(0);
            //transaksi fragment legs
            fragmentManager.beginTransaction().add(R.id.legs_container, bodyFragment).commit();



        }
    }
}