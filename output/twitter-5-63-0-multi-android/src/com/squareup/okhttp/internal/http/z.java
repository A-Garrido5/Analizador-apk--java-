// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.util.Comparator;

final class z implements Comparator
{
    public int a(final String s, final String s2) {
        if (s == s2) {
            return 0;
        }
        if (s == null) {
            return -1;
        }
        if (s2 == null) {
            return 1;
        }
        return String.CASE_INSENSITIVE_ORDER.compare(s, s2);
    }
}
