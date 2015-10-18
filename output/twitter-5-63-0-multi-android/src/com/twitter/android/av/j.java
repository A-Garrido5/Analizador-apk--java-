// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.content.Intent;
import com.twitter.android.widget.bg;
import android.content.Context;

class j implements Runnable
{
    final /* synthetic */ Context a;
    final /* synthetic */ i b;
    
    j(final i b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (bg.b() && this.b.a != null) {
            bg.a().b(String.valueOf(this.b.a.D), 2);
        }
        final Intent a = this.b.a(this.a);
        a.setFlags(268435456);
        this.a.startActivity(a);
    }
}
