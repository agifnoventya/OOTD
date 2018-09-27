package com.android.bayu.mystyle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CoverScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_screen);
    }
    //memanggil halaman baru
    public void toActivity2 (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
