// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.service.a;
import com.twitter.library.api.timeline.p;
import android.content.Context;
import com.twitter.library.client.as;
import android.content.DialogInterface;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.az;
import android.support.v4.app.FragmentActivity;
import android.content.DialogInterface$OnClickListener;

final class ue implements DialogInterface$OnClickListener
{
    final /* synthetic */ FragmentActivity a;
    final /* synthetic */ az b;
    final /* synthetic */ Tweet c;
    
    ue(final FragmentActivity a, final az b, final Tweet c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        as.a((Context)this.a).a(new p((Context)this.a, this.b.b(), this.c));
    }
}
