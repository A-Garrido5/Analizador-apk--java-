// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import android.content.DialogInterface;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;
import com.twitter.ui.dialog.e;

class vb implements e
{
    final /* synthetic */ Session a;
    final /* synthetic */ Tweet b;
    final /* synthetic */ ul c;
    
    vb(final ul c, final Session a, final Tweet b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n2 == -1) {
            as.a(this.c.g).a(new op(this.c.g, this.a, this.b.E), new vc(this));
            this.c.a("delete", this.b, null);
        }
    }
}
