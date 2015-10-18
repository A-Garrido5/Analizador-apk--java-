// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.media.util.m;
import com.twitter.util.c;
import com.twitter.library.util.x;
import android.content.Context;
import com.twitter.android.CacheFragment;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.util.ab;
import com.twitter.android.bi;

public class cp implements bi, ab
{
    public CacheFragment a(final FragmentActivity fragmentActivity) {
        return CacheFragment.a(fragmentActivity, "ImageCacheFragment", this);
    }
    
    @Override
    public x a(final Context context) {
        return new x(c.a(context) / 32, this);
    }
    
    public void a(final cq cq) {
        cq.a.recycle();
    }
    
    public int b(final cq cq) {
        return m.b(cq.a);
    }
}
