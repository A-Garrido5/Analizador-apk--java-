// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.card.CardDebugLog;
import android.support.v4.view.PagerAdapter;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.support.v4.view.ViewPager;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import java.util.ArrayList;
import android.support.v4.app.FragmentPagerAdapter;

class br extends FragmentPagerAdapter
{
    final /* synthetic */ CardPreviewerActivity a;
    private ArrayList b;
    
    public br(final CardPreviewerActivity a, final FragmentManager fragmentManager) {
        this.a = a;
        super(fragmentManager);
        this.b = new ArrayList();
        final Resources resources = a.getResources();
        final Bundle bundle = new Bundle();
        bundle.putString("host", a.a);
        this.b.add(new bs(this, CardPreviewerFragment.class, bundle, resources.getString(2131298183)));
        this.b.add(new bs(this, CardDebugFragment.class, null, resources.getString(2131298180)));
    }
    
    public String a(final int n) {
        return this.b.get(n).b;
    }
    
    @Override
    public int getCount() {
        return this.b.size();
    }
    
    @Override
    public Fragment getItem(final int n) {
        final bs bs = this.b.get(n);
        return Fragment.instantiate((Context)this.a, bs.c.getName(), bs.a);
    }
}
