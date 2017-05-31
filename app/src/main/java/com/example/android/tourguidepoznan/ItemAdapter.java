package com.example.android.tourguidepoznan;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Naatay on 04.05.2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    int mColor;

    public ItemAdapter(Activity context, ArrayList<Item> words){
        super(context, 0 ,words);
    }

    public ItemAdapter(Activity context, ArrayList<Item> words,  int color){
        super(context, 0 ,words);
        this.mColor = color;
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Item currentItem = getItem(position);
        TextView textView = (TextView) listItemView.findViewById(R.id.text);

        String text = listItemView.getResources().getString(currentItem.getTemp());
        textView.setText(text);

        View backGround = (View) listItemView.findViewById(R.id.text);
        if(currentItem.hasImage()) {
            backGround.setBackground(ContextCompat.getDrawable(getContext(), currentItem.getImageId()));
        }
        else{
            int col = ContextCompat.getColor(getContext(), mColor);
            backGround.setBackgroundColor(col);
        }
        return listItemView;
    }
}
