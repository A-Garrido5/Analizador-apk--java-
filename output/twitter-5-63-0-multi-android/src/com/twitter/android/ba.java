// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.graphics.Bitmap;
import java.util.concurrent.Callable;

class ba implements Callable
{
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ Bitmap d;
    final /* synthetic */ az e;
    
    ba(final az e, final String a, final String b, final String c, final Bitmap d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public Intent a() {
        return this.e.a(this.a, this.b, this.c, this.d);
    }
}
