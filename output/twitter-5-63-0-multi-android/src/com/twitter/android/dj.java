// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.library.api.conversations.x;
import android.view.View$OnClickListener;

class dj implements View$OnClickListener
{
    final /* synthetic */ x a;
    final /* synthetic */ di b;
    
    dj(final di b, final x a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.b.n.a(this.a.e);
    }
}
