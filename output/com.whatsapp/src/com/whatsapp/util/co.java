// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.os.SystemClock;
import android.view.View;
import android.view.View$OnClickListener;

public abstract class co implements View$OnClickListener
{
    private long a;
    
    public abstract void a(final View p0);
    
    public final void onClick(final View view) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.a > 1000L) {
            this.a = elapsedRealtime;
            this.a(view);
        }
    }
}
