// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.c;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ev implements DialogInterface$OnClickListener
{
    final /* synthetic */ long a;
    final /* synthetic */ String b;
    final /* synthetic */ DialogActivity c;
    
    ev(final DialogActivity c, final long a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final c a = this.c.a;
        final long a2 = this.a;
        final String[] array = { this.b, "", "friends_dialog", "", null };
        String s;
        if (n == -1) {
            s = "accept";
        }
        else {
            s = "dismiss";
        }
        array[4] = s;
        a.a(a2, array);
        if (n == -1) {
            new FollowFlowController("discover").a(true).a(new String[] { "follow_friends" }).b(this.c);
        }
    }
}
