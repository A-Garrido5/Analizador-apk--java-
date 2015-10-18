// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.TwitterSearchSummary;
import com.twitter.library.api.TwitterSearchFilter;
import com.twitter.library.api.TwitterSearchHighlight;
import com.twitter.library.api.TwitterSearchSuggestion;

public class ro
{
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public int g;
    public TwitterSearchSuggestion h;
    public String i;
    public TwitterSearchHighlight j;
    public xa k;
    public TwitterSearchFilter l;
    public TwitterSearchSummary m;
    public boolean n;
    
    public ro(final long a, final int b, final int c, final int d, final int e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = 4;
        this.f = f;
    }
    
    public static int a(final int n) {
        if (2 == n) {
            return 28;
        }
        return 11;
    }
}
