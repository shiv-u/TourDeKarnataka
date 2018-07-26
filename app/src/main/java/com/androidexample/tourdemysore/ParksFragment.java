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

public class ParksFragment extends Fragment {

    public ParksFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle onSavedInstance) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<Info> parks = new ArrayList<>();

        parks.add(new Info("Bandipur National Park", R.drawable.bandipur, 3));
        parks.add(new Info("Nagarahole National Park", R.drawable.nagarahole, 4));
        parks.add(new Info("Kali Tiger Reserve", R.drawable.kali, 5));
        parks.add(new Info("Bhadra Reserve Forest", R.drawable.bhadra, 5));

        ListView listView = rootView.findViewById(R.id.list_view);

        final InfoAdapter infoAdapter = new InfoAdapter(getActivity(), parks);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent search = new Intent(Intent.ACTION_VIEW);
                String url = "https://www.google.com/search?q=";
                search.setData(Uri.parse(url + infoAdapter.getItem(position).getmPlace()));
                startActivity(search);
            }
        });

        listView.setAdapter(infoAdapter);
        return rootView;
    }
}
