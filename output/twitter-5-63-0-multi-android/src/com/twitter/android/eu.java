// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import com.twitter.library.service.y;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.client.as;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class eu implements DialogInterface$OnClickListener
{
    final /* synthetic */ long a;
    final /* synthetic */ DialogActivity b;
    
    eu(final DialogActivity b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (n == -1) {
            final Context applicationContext = this.b.getApplicationContext();
            as.a(applicationContext).a(new pe(applicationContext, this.b.a.a().b(), this.a, null));
        }
    }
}
