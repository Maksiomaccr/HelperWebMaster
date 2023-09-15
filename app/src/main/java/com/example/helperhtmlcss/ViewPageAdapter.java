package com.example.helperhtmlcss;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.helperhtmlcss.screen.Favorite;
import com.example.helperhtmlcss.screen.Home;
import com.example.helperhtmlcss.screen.Statistics;

public class ViewPageAdapter extends FragmentStateAdapter {
    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new Home();
            case 1: return new Favorite();
            case 2: return new Statistics();
            default: return new Home();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
