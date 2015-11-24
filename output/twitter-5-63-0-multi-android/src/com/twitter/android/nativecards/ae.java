// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.view.View;
import android.view.View$OnLongClickListener;

class ae implements View$OnLongClickListener
{
    final /* synthetic */ String a;
    final /* synthetic */ ac b;
    
    ae(final ac b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        this.b.a(this.a, this.a);
        return false;
    }
}
