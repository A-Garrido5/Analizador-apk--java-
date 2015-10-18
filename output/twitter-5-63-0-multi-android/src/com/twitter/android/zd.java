// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.view.x;

final class zd extends x
{
    zd(final int n, final float n2, final float n3, final int n4) {
        super(n, n2, n3, n4);
    }
    
    @Override
    public String a(final int n) {
        final StringBuilder sb = new StringBuilder(5);
        final int n2 = n / 1000;
        sb.append(n2 / 60).append(':');
        final int n3 = n2 % 60;
        if (n3 < 10) {
            sb.append('0');
        }
        sb.append(n3);
        return sb.toString();
    }
}
