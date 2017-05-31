package com.example.android.tourguidepoznan;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FourthFragment extends Fragment {

    public FourthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Item> words = new ArrayList<Item>();
        words.add(new Item(R.string.restaurant_1));
        words.add(new Item(R.string.restaurant_2));
        words.add(new Item(R.string.restaurant_3));
        words.add(new Item(R.string.restaurant_4));
        words.add(new Item(R.string.restaurant_5));
        words.add(new Item(R.string.restaurant_6));
        words.add(new Item(R.string.restaurant_7));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), words, R.color.colorFourthFragment);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) view.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return view;
    }

}
