package com.androidexample.tourdemysore;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shivu on 24-07-2018.
 */

public class InfoAdapter extends ArrayAdapter<Info> {

    InfoAdapter(Activity context, ArrayList<Info> info) {
        super(context, 0, info);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.place_list, parent, false);
        }
        Info info = getItem(position);
        TextView place = listItemView.findViewById(R.id.textView);
        place.setText(info.getmPlace());

        ImageView imageView = listItemView.findViewById(R.id.thumbnail);
        imageView.setImageResource(info.getmImage());

        int stars = info.getmRatings();
        ArrayList<View> images = new ArrayList<>();
        images.add(listItemView.findViewById(R.id.star1));
        images.add(listItemView.findViewById(R.id.star2));
        images.add(listItemView.findViewById(R.id.star3));
        images.add(listItemView.findViewById(R.id.star4));
        images.add(listItemView.findViewById(R.id.star5));
        for (int i = 0; i < stars; i++) {
            images.get(i).setBackgroundResource(R.drawable.favorite);

        }
        return listItemView;
    }

}
