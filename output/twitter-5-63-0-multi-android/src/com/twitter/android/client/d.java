// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.provider.k;
import com.twitter.library.scribe.ScribeDatabaseHelper;
import com.twitter.library.provider.bg;
import com.twitter.library.client.Session$LoginStatus;
import com.twitter.library.client.az;
import android.content.Context;

class d implements Runnable
{
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ c d;
    
    d(final c d, final Context a, final String b, final long c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        if (az.a(this.a).b(this.b).b() == Session$LoginStatus.a) {
            bg.b(this.a, this.c);
            ScribeDatabaseHelper.b(this.c);
            final k a = k.a(this.a);
            a.c(this.b);
            a.b(this.b);
        }
    }
}
