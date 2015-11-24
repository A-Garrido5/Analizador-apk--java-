// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.content.Context;

public abstract class ch
{
    private Context a;
    private boolean b;
    
    protected final void b(final Context context) {
        while (true) {
            synchronized (this) {
                if (this.b) {
                    return;
                }
                if (context == null) {
                    throw new IllegalArgumentException("context cannot be null.");
                }
            }
            this.a = (Context)new cp(context.getApplicationContext(), this.y());
            this.b = true;
            this.e();
        }
    }
    
    protected abstract void e();
    
    public final Context w() {
        return this.a;
    }
    
    public final boolean x() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final String y() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}
