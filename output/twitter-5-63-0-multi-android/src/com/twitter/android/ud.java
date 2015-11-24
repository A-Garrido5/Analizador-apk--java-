// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.ScribeAssociation;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.DialogInterface;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.library.provider.Tweet;
import android.content.DialogInterface$OnClickListener;

final class ud implements DialogInterface$OnClickListener
{
    final /* synthetic */ Tweet a;
    final /* synthetic */ c b;
    final /* synthetic */ az c;
    final /* synthetic */ FragmentActivity d;
    final /* synthetic */ TwitterScribeAssociation e;
    
    ud(final Tweet a, final c b, final az c, final FragmentActivity d, final TwitterScribeAssociation e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.a(((TwitterScribeLog)new TwitterScribeLog(this.c.b().g()).a((Context)this.d, this.a, this.e, null).b(new String[] { TwitterScribeLog.a(this.e, Tweet.b(this.a), null, "dismiss") })).a(this.e));
        this.b.a(this.a);
    }
}
