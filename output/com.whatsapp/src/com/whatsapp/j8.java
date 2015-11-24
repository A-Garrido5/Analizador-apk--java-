// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class j8 extends ViewOutlineProvider
{
    final Conversation a;
    
    j8(final Conversation a) {
        this.a = a;
    }
    
    public void getOutline(final View view, final Outline outline) {
        final int n = (int)(48.0f * vc.b().b);
        outline.setOval(0, 0, n, n);
    }
}
