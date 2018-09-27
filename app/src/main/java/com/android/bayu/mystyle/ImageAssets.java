package com.android.bayu.mystyle;

import com.android.bayu.mystyle.R;

import java.util.ArrayList;
import java.util.List;

public class ImageAssets {

    //variable ini adalah variable pengelompokan arraylist bodies
    private static List<Integer> bodies = new ArrayList<Integer>(){{
        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
        add(R.drawable.body4);
        add(R.drawable.body5);

    }};
    //variable ini adalah variable pengelompokan arraylist legs
    private static List<Integer> legs = new ArrayList<Integer>(){{
        add(R.drawable.legs1);
        add(R.drawable.legs2);

    }};
    // ini adalah method yang digunakan untuk memanggil variable head
//    public static List<Integer> getHeads(){
//        return heads;
//    }

    // ini adalah method yang digunakan untuk memanggil variable bodies
    public static List<Integer> getBodies(){
        return bodies;
    }

    // ini adalah method yang digunakan untuk memanggil variable legs
    public static List<Integer> getLegs(){
        return legs;
    }
}
