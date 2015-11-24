// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.Session;
import android.content.Intent;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import android.content.Context;
import com.twitter.library.client.az;
import android.content.DialogInterface;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.DialogInterface$OnClickListener;

final class lw implements DialogInterface$OnClickListener
{
    final /* synthetic */ TwitterFragmentActivity a;
    final /* synthetic */ long b;
    
    lw(final TwitterFragmentActivity a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final Session b = az.a((Context)this.a).b();
        final Context applicationContext = this.a.getApplicationContext();
        as.a(applicationContext).a(new op(applicationContext, b, this.b), new lx(this, applicationContext));
        final Intent intent = new Intent();
        intent.putExtra("deleted", this.b);
        this.a.setResult(1, intent);
        this.a.finish();
    }
}
