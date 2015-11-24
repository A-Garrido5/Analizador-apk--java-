// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.view.View;
import android.view.View$OnClickListener;

class af implements View$OnClickListener
{
    final /* synthetic */ long a;
    final /* synthetic */ ac b;
    
    af(final ac b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.b.a(this.a);
    }
}
