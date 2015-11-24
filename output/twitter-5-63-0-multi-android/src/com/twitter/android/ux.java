// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.scribe.TwitterScribeItem;
import android.content.DialogInterface;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.client.Session;
import com.twitter.library.provider.Tweet;
import com.twitter.ui.dialog.e;

class ux implements e
{
    final /* synthetic */ Tweet a;
    final /* synthetic */ Session b;
    final /* synthetic */ FriendshipCache c;
    final /* synthetic */ ul d;
    
    ux(final ul d, final Tweet a, final Session b, final FriendshipCache c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n2 == -1) {
            this.d.a("block_dialog", "block", this.a, null);
            as.a(this.d.g).a(new od(this.d.g, this.b, this.a.C, this.a.j, 1), new uy(this));
            return;
        }
        this.d.a("block_dialog", "cancel", this.a, null);
    }
}
