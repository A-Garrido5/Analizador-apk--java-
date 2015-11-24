// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.bh;
import android.os.Parcelable;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.widget.bg;
import android.content.Context;

class b implements Runnable
{
    final /* synthetic */ Context a;
    final /* synthetic */ bg b;
    final /* synthetic */ a c;
    
    b(final a c, final Context a, final bg b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final c c = new c(this, this.c.a(this.a, this.b));
        if (this.c.j > 0 && this.c.k != null) {
            this.c.k.postDelayed((Runnable)c, (long)this.c.j);
            return;
        }
        c.run();
    }
}
