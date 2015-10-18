// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.FragmentActivity;
import android.content.Context;
import com.twitter.library.provider.bg;
import com.twitter.library.provider.b;
import android.os.AsyncTask;

class as extends AsyncTask
{
    final /* synthetic */ BaseDMMessageDialog a;
    private final long b;
    private final long c;
    
    public as(final BaseDMMessageDialog a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Void a(final Void... array) {
        final FragmentActivity activity = this.a.getActivity();
        if (activity != null) {
            final b b = new b(activity.getContentResolver());
            bg.a((Context)activity, this.c).e(this.b, b);
            b.a();
        }
        return null;
    }
}
