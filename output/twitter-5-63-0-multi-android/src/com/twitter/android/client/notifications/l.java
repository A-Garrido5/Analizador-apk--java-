// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import java.util.ArrayList;
import com.twitter.library.platform.d;
import com.twitter.library.platform.c;

public abstract class l extends m
{
    private c[] b;
    
    public l(final d d, final String s, final long n) {
        super(d, s, n);
    }
    
    protected abstract boolean a(final c p0);
    
    public c[] b() {
        if (this.b != null) {
            return this.b;
        }
        final c[] t = this.c.t;
        if (t.length == 0) {
            throw new IllegalArgumentException("InteractionNotifThresholdAggregator should not be used with an empty inbox");
        }
        final ArrayList<c> list = new ArrayList<c>();
        for (final c c : t) {
            if (this.a(c)) {
                list.add(c);
            }
        }
        return this.b = list.toArray(com.twitter.library.platform.d.a);
    }
}
