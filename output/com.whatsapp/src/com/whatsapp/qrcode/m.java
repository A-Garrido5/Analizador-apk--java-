// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import android.view.animation.Transformation;
import android.view.animation.Animation;

class m extends Animation
{
    final QrCodeOverlay a;
    
    private m(final QrCodeOverlay a) {
        this.a = a;
    }
    
    m(final QrCodeOverlay qrCodeOverlay, final e e) {
        this(qrCodeOverlay);
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        final int width = this.a.getWidth();
        final int height = this.a.getHeight();
        final int n2 = 3 * Math.min(width, height) / 4;
        final int n3 = (width - n2) / 2;
        final int n4 = (height - n2) / 2;
        this.a.invalidate(n3, n4, n3 + n2, n2 + n4);
    }
}
