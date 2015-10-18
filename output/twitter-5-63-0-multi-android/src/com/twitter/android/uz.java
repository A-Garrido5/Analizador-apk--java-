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

class uz implements e
{
    final /* synthetic */ Tweet a;
    final /* synthetic */ Session b;
    final /* synthetic */ FriendshipCache c;
    final /* synthetic */ ul d;
    
    uz(final ul d, final Tweet a, final Session b, final FriendshipCache c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n2 == -1) {
            this.d.a("unblock_dialog", "unblock", this.a, null);
            as.a(this.d.g).a(new od(this.d.g, this.b, this.a.C, this.a.j, 3), new va(this));
            return;
        }
        this.d.a("unblock_dialog", "cancel", this.a, null);
    }
}
