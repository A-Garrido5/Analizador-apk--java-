// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.view.View;
import android.view.View$OnClickListener;

class ad implements View$OnClickListener
{
    final /* synthetic */ String a;
    final /* synthetic */ ac b;
    
    ad(final ac b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.b.D.b(this.a);
    }
}
