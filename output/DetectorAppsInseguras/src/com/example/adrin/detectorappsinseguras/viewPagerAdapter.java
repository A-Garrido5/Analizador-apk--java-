// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import java.util.ArrayList;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import java.util.List;
import android.support.v4.app.FragmentPagerAdapter;

public class viewPagerAdapter extends FragmentPagerAdapter
{
    List<Fragment> fragments;
    
    public viewPagerAdapter(final FragmentManager fragmentManager) {
        super(fragmentManager);
        this.fragments = new ArrayList<Fragment>();
    }
    
    public void addFragment(final Fragment fragment) {
        this.fragments.add(fragment);
    }
    
    @Override
    public int getCount() {
        return this.fragments.size();
    }
    
    @Override
    public Fragment getItem(final int n) {
        return this.fragments.get(n);
    }
}
