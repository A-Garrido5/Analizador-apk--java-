// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Iterator;
import java.util.Collection;
import com.twitter.library.util.ak;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.util.x;
import android.support.v4.app.Fragment;

public class CacheFragment extends Fragment
{
    private bi a;
    private x b;
    
    public CacheFragment() {
        this.setRetainInstance(true);
    }
    
    public static CacheFragment a(final FragmentActivity fragmentActivity, final String s, final bi a) {
        final FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        CacheFragment cacheFragment = (CacheFragment)supportFragmentManager.findFragmentByTag(s);
        if (cacheFragment == null) {
            cacheFragment = new CacheFragment();
            supportFragmentManager.beginTransaction().add(cacheFragment, s).commit();
        }
        cacheFragment.a = a;
        cacheFragment.a(fragmentActivity.getApplicationContext());
        return cacheFragment;
    }
    
    private void a(final Context context) {
        if (this.b == null) {
            this.b = this.a.a(context);
        }
    }
    
    public ak a() {
        return this.b;
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (this.b != null) {
            final Collection b = this.b.b();
            this.b.a();
            final Iterator<Object> iterator = b.iterator();
            while (iterator.hasNext()) {
                this.a.a(iterator.next());
            }
        }
    }
    
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        if (this.b != null) {
            this.b.a();
        }
    }
}
