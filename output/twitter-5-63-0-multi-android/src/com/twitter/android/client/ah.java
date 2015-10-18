// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.support.v4.app.NotificationCompat$Builder;

public class ah
{
    public final String a;
    final NotificationCompat$Builder b;
    
    public ah(final long n, final long n2) {
        this(new af().a(n).a("statusId", n2).toString(), null);
    }
    
    ah(final String a, final NotificationCompat$Builder b) {
        this.a = a;
        this.b = b;
    }
}
