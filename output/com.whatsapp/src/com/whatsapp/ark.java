// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.View;
import android.view.View$OnClickListener;

class ark implements View$OnClickListener
{
    final View a;
    final View b;
    final boolean c;
    final View d;
    final ahh e;
    
    ark(final ahh e, final View a, final boolean c, final View b, final View d) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public void onClick(final View view) {
        this.a.startAnimation((Animation)new awz(this.e, this.a, this.d, this.b, this.c));
    }
}
