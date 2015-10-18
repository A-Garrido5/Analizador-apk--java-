// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.PromotedEvent;
import android.content.DialogInterface;
import com.twitter.library.provider.Tweet;
import android.view.View;
import android.content.DialogInterface$OnClickListener;

class uo implements DialogInterface$OnClickListener
{
    final /* synthetic */ View a;
    final /* synthetic */ Tweet b;
    final /* synthetic */ long c;
    final /* synthetic */ Runnable d;
    final /* synthetic */ ul e;
    
    uo(final ul e, final View a, final Tweet b, final long c, final Runnable d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.e.a(this.a, this.b, PromotedEvent.i, "", "dismiss", this.c);
        if (this.d != null) {
            this.d.run();
        }
    }
}
