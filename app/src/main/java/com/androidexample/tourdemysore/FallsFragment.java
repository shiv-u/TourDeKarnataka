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

public class FallsFragment extends Fragment {

    public FallsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<Info> falls = new ArrayList<>();

        falls.add(new Info(getString(R.string.Jog), R.drawable.jog, 5));
        falls.add(new Info(getString(R.string.Abbey), R.drawable.abbey, 4));
        falls.add(new Info(getString(R.string.Barachukki), R.drawable.chukki, 4));
        falls.add(new Info(getString(R.string.Gokak), R.drawable.gokak, 5));

        ListView listView = rootView.findViewById(R.id.list_view);

        final InfoAdapter infoAdapter = new InfoAdapter(getActivity(), falls);

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
