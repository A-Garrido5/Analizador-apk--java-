// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import android.view.MenuItem;
import android.view.Menu;
import com.viewpagerindicator.CirclePageIndicator;
import android.support.v4.view.PagerAdapter;
import android.support.v4.app.Fragment;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;

public class Information extends ActionBarActivity
{
    public static Integer[] mImagesId;
    public static Integer tama\u00f1o;
    Context mContext;
    viewPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;
    
    static {
        Information.mImagesId = new Integer[] { 2130837579, 2130837583, 2130837573, 2130837619, 2130837611, 2130837590, 2130837571, 2130837596, 2130837570 };
        Information.tama\u00f1o = Information.mImagesId.length;
    }
    
    public Information() {
        this.mContext = (Context)this;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968602);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getSupportActionBar().setIcon(2130837578);
        this.getSupportActionBar().setBackgroundDrawable((Drawable)new ColorDrawable(this.getResources().getColor(2131427362)));
        this.mSectionsPagerAdapter = new viewPagerAdapter(this.getSupportFragmentManager());
        this.mViewPager = (ViewPager)this.findViewById(2131492949);
        this.mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(0, Information.mImagesId[0], Information.tama\u00f1o, this.mContext));
        this.mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(1, Information.mImagesId[1], Information.tama\u00f1o, this.mContext));
        this.mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(2, Information.mImagesId[2], Information.tama\u00f1o, this.mContext));
        this.mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(3, Information.mImagesId[3], Information.tama\u00f1o, this.mContext));
        this.mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(4, Information.mImagesId[4], Information.tama\u00f1o, this.mContext));
        this.mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(5, Information.mImagesId[5], Information.tama\u00f1o, this.mContext));
        this.mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(6, Information.mImagesId[6], Information.tama\u00f1o, this.mContext));
        this.mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(7, Information.mImagesId[7], Information.tama\u00f1o, this.mContext));
        this.mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(8, Information.mImagesId[8], Information.tama\u00f1o, this.mContext));
        this.mViewPager.setAdapter(this.mSectionsPagerAdapter);
        ((CirclePageIndicator)this.findViewById(2131492948)).setViewPager(this.mViewPager);
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.getMenuInflater().inflate(2131558406, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        menuItem.getItemId();
        this.onBackPressed();
        return super.onOptionsItemSelected(menuItem);
    }
}
