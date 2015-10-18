// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.android.client.c;
import android.view.View$OnFocusChangeListener;

class kj implements View$OnFocusChangeListener
{
    final /* synthetic */ c a;
    final /* synthetic */ long b;
    final /* synthetic */ LoginActivity c;
    
    kj(final LoginActivity c, final c a, final long b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onFocusChange(final View view, final boolean b) {
        if (b) {
            this.a.a(this.b, "login:::password:select");
        }
    }
}
