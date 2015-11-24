// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import java.lang.ref.WeakReference;
import android.os.Bundle;

public class th
{
    public final Class a;
    public final Bundle b;
    public final String c;
    private String d;
    private WeakReference e;
    
    th(final Class a, final Bundle b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    Fragment a(final FragmentManager fragmentManager) {
        final WeakReference e = this.e;
        Fragment fragmentByTag = null;
        if (e != null) {
            fragmentByTag = (Fragment)this.e.get();
            if (fragmentByTag == null) {
                fragmentByTag = fragmentManager.findFragmentByTag(this.d);
                if (fragmentByTag != null) {
                    this.e = new WeakReference(fragmentByTag);
                }
            }
        }
        return fragmentByTag;
    }
    
    public String a() {
        return this.d;
    }
    
    void a(final Fragment fragment) {
        this.e = new WeakReference((T)fragment);
        this.d = fragment.getTag();
    }
}
