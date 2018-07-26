package com.androidexample.tourdemysore;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by shivu on 24-07-2018.
 */

public class SimpleFragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentAdapter(Context context, FragmentManager fm) {

        super(fm);
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return context.getString(R.string.category_heritage);

        } else if (position == 1) {
            return context.getString(R.string.category_cuisine);
        } else if (position == 2) {
            return context.getString(R.string.category_falls);
        } else {
            return context.getString(R.string.category_parks);
        }


    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HeritageFragment();
        } else if (position == 1) {
            return new CuisineFragment();
        } else if (position == 2) {
            return new FallsFragment();
        } else {
            return new ParksFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
