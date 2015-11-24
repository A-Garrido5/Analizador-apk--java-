// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.library.api.conversations.x;
import android.view.View$OnClickListener;

class el implements View$OnClickListener
{
    final /* synthetic */ x a;
    final /* synthetic */ ek b;
    
    el(final ek b, final x a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.b.k.a(this.a.e);
    }
}
