// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.AssetFileDescriptor;
import com.twitter.media.filters.Filters;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.os.AsyncTask;

abstract class gn extends AsyncTask
{
    final WeakReference b;
    
    private gn(final Context context) {
        this.b = new WeakReference((T)context);
    }
    
    protected Filters a(final Void... array) {
        final Context context = (Context)this.b.get();
        Label_0065: {
            if (context == null) {
                break Label_0065;
            }
            final Filters filters = new Filters();
            final AssetFileDescriptor openRawResourceFd = context.getResources().openRawResourceFd(2131230723);
            try {
                if (filters.a(context, openRawResourceFd, true)) {
                    return filters;
                }
                filters.b();
                return null;
            }
            finally {
                yp.a(openRawResourceFd);
            }
        }
    }
    
    protected abstract void a(final Filters p0);
    
    protected void b(final Filters filters) {
        if (filters != null) {
            filters.b();
        }
    }
}
