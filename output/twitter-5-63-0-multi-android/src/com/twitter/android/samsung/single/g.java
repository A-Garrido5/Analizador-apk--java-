// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.content.Intent;
import com.twitter.library.client.Session;
import com.twitter.library.client.au;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import android.widget.Toast;
import android.content.Context;
import android.content.DialogInterface;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.az;
import android.content.DialogInterface$OnClickListener;

class g implements DialogInterface$OnClickListener
{
    final /* synthetic */ az a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ Tweet d;
    final /* synthetic */ RetweetOptionsActivity e;
    
    g(final RetweetOptionsActivity e, final az a, final String b, final boolean c, final Tweet d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (n == -1) {
            if (!n.c((Context)this.e)) {
                Toast.makeText((Context)this.e, (CharSequence)this.e.getResources().getString(2131296290), 0).show();
                this.e.finish();
            }
            else {
                final Session b = this.a.b(this.b);
                if (b != null) {
                    final Context applicationContext = this.e.getApplicationContext();
                    ol ol;
                    int n2;
                    if (this.c) {
                        ol = new ol(applicationContext, b, this.d.D, this.d.H, this.d.m());
                        n2 = 2;
                    }
                    else {
                        final oq oq = new oq(this.e.getApplicationContext(), b, this.d.D, this.d.E, this.d.j);
                        n2 = 1;
                        ol = (ol)oq;
                    }
                    ol.k("Widget retweets are triggered by a user action. The app will not be visible when the user is interacting with the widget.");
                    as.a(applicationContext).a(ol, n2, 0, this.e);
                }
            }
            return;
        }
        if (n == -3) {
            final Intent p2 = com.twitter.android.composer.au.a((Context)this.e).a(this.b).b(this.d).p();
            p2.setFlags(268435456);
            this.e.startActivity(p2);
            this.e.finish();
            return;
        }
        this.e.finish();
    }
}
