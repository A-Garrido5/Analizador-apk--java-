// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.FloatingChildLayout;
import android.os.Build$VERSION;

class aac implements Runnable
{
    final QuickContactActivity a;
    
    aac(final QuickContactActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        QuickContactActivity.d(this.a).invalidate();
        if (Build$VERSION.SDK_INT >= 21) {
            this.a.getWindow().setStatusBarColor(this.a.getResources().getColor(2131624026));
        }
        FloatingChildLayout.a((View)QuickContactActivity.d(this.a), new fk(this));
    }
}
