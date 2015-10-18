// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.tv;

import com.twitter.android.SearchResultsFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.support.v4.app.FragmentPagerAdapter;

public class b extends FragmentPagerAdapter
{
    private final List a;
    private final ViewPager b;
    
    public b(final FragmentManager fragmentManager, final List a, final ViewPager b) {
        super(fragmentManager);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int getCount() {
        return 0;
    }
    
    @Override
    public Fragment getItem(final int n) {
        return new SearchResultsFragment();
    }
}
