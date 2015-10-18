// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.Iterator;
import android.view.View;
import android.support.v4.view.ViewCompat;

class ax implements Runnable
{
    final /* synthetic */ av a;
    
    private ax(final av a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.b()) {
            this.a.c();
        }
        else {
            Object e;
            if (this.a.c.d() == null) {
                e = null;
            }
            else {
                e = this.a.c.d().e();
            }
            if (e != null) {
                ViewCompat.postOnAnimation((View)e, this);
            }
        }
    }
}
