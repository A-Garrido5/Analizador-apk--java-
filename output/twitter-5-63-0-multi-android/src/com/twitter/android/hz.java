// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import java.lang.ref.WeakReference;
import android.os.Bundle;

public class hz
{
    public final Class a;
    public final Bundle b;
    public final String c;
    public boolean d;
    private WeakReference e;
    
    public hz(final Bundle b, final Class a, final String c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public Fragment a(final FragmentActivity fragmentActivity) {
        if (this.e == null || this.e.get() == null) {
            Fragment fragment = fragmentActivity.getSupportFragmentManager().findFragmentByTag(this.c);
            if (fragment == null) {
                fragment = Fragment.instantiate((Context)fragmentActivity, this.a.getName(), this.b);
            }
            this.e = new WeakReference(fragment);
            return fragment;
        }
        return (Fragment)this.e.get();
    }
}
