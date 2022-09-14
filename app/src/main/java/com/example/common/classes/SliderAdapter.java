package com.example.common.classes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class SliderAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> list;

    public SliderAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        list = new ArrayList<>();
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addSlide(int layoutid) {
        Fragment frag = new SlideFragment(layoutid);
        list.add(frag);
    }

    public static class SlideFragment extends Fragment {

        private int layoutid;

        public SlideFragment(int _layoutid) {
            layoutid = _layoutid;
        }

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return getLayoutInflater().inflate(layoutid, null);
        }
    }
}
