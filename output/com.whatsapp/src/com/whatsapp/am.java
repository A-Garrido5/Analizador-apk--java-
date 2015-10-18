// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;

class am implements Runnable
{
    final DialogToastListActivity a;
    
    am(final DialogToastListActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.k.focusableViewAvailable((View)this.a.k);
    }
}
