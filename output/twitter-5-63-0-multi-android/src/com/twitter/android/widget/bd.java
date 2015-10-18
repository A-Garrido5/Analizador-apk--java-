// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Rect;

public class bd implements bc
{
    private Rect b;
    
    public bd() {
        this.b = new Rect();
    }
    
    @Override
    public Rect a() {
        return this.b;
    }
    
    public void a(final Rect rect) {
        this.b.set(rect);
    }
    
    @Override
    public void b() {
    }
}
