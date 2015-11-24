// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.view.KeyEvent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnKeyListener;

class h implements DialogInterface$OnKeyListener
{
    final /* synthetic */ RetweetOptionsActivity a;
    
    h(final RetweetOptionsActivity a) {
        this.a = a;
    }
    
    public boolean onKey(final DialogInterface dialogInterface, final int n, final KeyEvent keyEvent) {
        if (n == 4) {
            this.a.finish();
        }
        return true;
    }
}
