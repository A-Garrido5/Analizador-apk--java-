// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.os.Message;
import android.widget.Filter$FilterListener;
import android.os.Looper;
import android.widget.Filterable;
import java.lang.ref.WeakReference;
import android.os.Handler;

class ac extends Handler
{
    private final WeakReference a;
    private Filterable b;
    private ad c;
    
    public ac(final Looper looper, final Filter$FilterListener filter$FilterListener) {
        super(looper);
        this.a = new WeakReference((T)filter$FilterListener);
    }
    
    public void a(final Filterable b) {
        this.b = b;
    }
    
    public void a(final ad c) {
        this.c = c;
    }
    
    public void handleMessage(final Message message) {
        final Filter$FilterListener filter$FilterListener = (Filter$FilterListener)this.a.get();
        if (this.b != null && filter$FilterListener != null) {
            final CharSequence charSequence = (CharSequence)message.obj;
            this.b.getFilter().filter(charSequence, filter$FilterListener);
            if (message.arg1 == 1 && this.c != null) {
                this.c.a(charSequence);
            }
        }
    }
}
