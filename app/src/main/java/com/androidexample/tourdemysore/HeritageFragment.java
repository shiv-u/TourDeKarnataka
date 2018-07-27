package com.androidexample.tourdemysore;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by shivu on 24-07-2018.
 */

public class HeritageFragment extends Fragment {

    public HeritageFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Info> places = new ArrayList<>();
        places.add(new Info(getString(R.string.mysuru), R.drawable.palace, 5));
        places.add(new Info(getString(R.string.hampi), R.drawable.hampi, 4));
        places.add(new Info(getString(R.string.belur), R.drawable.belur, 4));
        places.add(new Info(getString(R.string.pattadkall), R.drawable.pattadkal, 5));
        places.add(new Info(getString(R.string.gol_gumbaz), R.drawable.gol, 4));

        final InfoAdapter infoAdapter = new InfoAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent search = new Intent(Intent.ACTION_VIEW);
                String url =getString(R.string.query);
                search.setData(Uri.parse(url + infoAdapter.getItem(position).getmPlace()));
                startActivity(search);
            }
        });

        listView.setAdapter(infoAdapter);

        return rootView;
    }


}
