// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import android.view.animation.Transformation;
import android.view.animation.Animation;

class c extends Animation
{
    final QrEducationView a;
    
    private c(final QrEducationView a) {
        this.a = a;
    }
    
    c(final QrEducationView qrEducationView, final n n) {
        this(qrEducationView);
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        QrEducationView.a(this.a, n);
        this.a.invalidate();
    }
}
