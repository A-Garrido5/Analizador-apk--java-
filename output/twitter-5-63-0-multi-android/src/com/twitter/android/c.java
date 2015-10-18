// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.bh;
import android.os.Parcelable;
import com.twitter.android.widget.bg;
import android.content.Context;
import android.os.Handler;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.app.Activity;
import android.content.Intent;

class c implements Runnable
{
    final /* synthetic */ Intent a;
    final /* synthetic */ b b;
    
    c(final b b, final Intent a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.b.c.h) {
            ((Activity)this.b.a).startActivityForResult(this.a, this.b.c.a);
            return;
        }
        this.b.a.startActivity(this.a);
    }
}
