package com.android.bayu.mystyle;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.bayu.mystyle.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bayu on 9/12/2018.
 */

public class BodyPartsFragment extends Fragment {
    //variable global untuk memanggil list gambar
    private List<Integer> mImageIds;
    private Integer mListIndex;
    //variabel untuk menyimpan instance state atau session
    private static String TAG="BodyPartsFragment";
    public static final String IMAGE_ID_LIST ="image_ids";
    public static final String LIST_INDEX = "list_index";

    //menyimpan array dalam session
     @Override
     public void onSaveInstanceState(@NonNull Bundle currentState){
         currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
         currentState.putInt(LIST_INDEX,mListIndex);
     }
     //setter untuk menentukan nilai pada variable
    public void setmImageIds(List<Integer> mImageIds){
        this.mImageIds = mImageIds;
    }
    //setter untuk menentukan nilai pada variable
    public void setmListIndex(Integer mListIndex){
        this.mListIndex = mListIndex;
    }

    public BodyPartsFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // array akan memanggil keadaan sebelumnya
        if(savedInstanceState!=null){
            mImageIds=savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex=savedInstanceState.getInt(LIST_INDEX);
        }

        //inisiasi activity tersebut sebagai fragment
        View rootView = inflater.inflate(R.layout.body_part_layout_fragment, container, false);
        //memanggil id yang ada di layout fragment
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.ImageView_body_part_layout_fragment);
        //ambil gambar untuk ditampilkan
        imageView.setImageResource(mImageIds.get(mListIndex));
        //untuk menentukan isi list array dengan list asset gambar yang akan di panggil
        imageView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if(mListIndex<mImageIds.size()-1){
                    mListIndex++;
                }
                else{
                    mListIndex=0;
                }
                imageView.setImageResource(mImageIds.get(mListIndex));
            }

        });

        return rootView;
    }


}
