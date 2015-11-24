// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

import android.app.Activity;
import com.twitter.library.client.af;

class j implements af
{
    final /* synthetic */ ir a;
    final /* synthetic */ h b;
    
    j(final h b, final ir a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final Activity activity) {
        ir.b().a(true);
    }
    
    @Override
    public void b(final Activity activity) {
        this.a.a(false);
    }
}
