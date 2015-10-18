// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import java.util.Comparator;

class af implements Comparator
{
    public int a(final ad ad, final ad ad2) {
        if (ad.e > ad2.e) {
            return -1;
        }
        if (ad.e < ad2.e) {
            return 1;
        }
        return 0;
    }
}
