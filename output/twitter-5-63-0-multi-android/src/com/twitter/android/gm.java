// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.media.filters.Filters;
import android.content.Context;
import java.lang.ref.WeakReference;

class gm extends gn
{
    final WeakReference a;
    
    private gm(final ga ga, final Context context) {
        super(context, null);
        this.a = new WeakReference((T)ga);
    }
    
    @Override
    protected void a(Filters filters) {
        final ga ga = (ga)this.a.get();
        if (ga == null && filters != null) {
            filters.b();
            filters = null;
        }
        if (ga != null) {
            ga.a(filters);
        }
    }
}
