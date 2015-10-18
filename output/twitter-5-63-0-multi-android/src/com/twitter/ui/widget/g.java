// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$Callback;

class g implements Drawable$Callback
{
    final /* synthetic */ f a;
    
    g(final f a) {
        this.a = a;
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        this.a.invalidateSelf();
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.a.scheduleSelf(runnable, n);
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}
