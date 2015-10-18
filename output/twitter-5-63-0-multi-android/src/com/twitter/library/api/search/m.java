// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import com.twitter.library.api.TwitterSearchSummary;
import com.twitter.library.api.TwitterSearchFilter;
import com.twitter.library.api.TwitterSearchSuggestion;
import java.util.ArrayList;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.bp;

public class m
{
    public final int a;
    public final bp b;
    public final TwitterUser c;
    public final ArrayList d;
    public final TwitterSearchSuggestion e;
    public final String[] f;
    public final ArrayList g;
    public final xa h;
    public final TwitterSearchFilter i;
    public final TwitterSearchSummary j;
    public final boolean k;
    public final ArrayList l;
    public final boolean m;
    
    public m(final int a, final bp b, final TwitterUser c, final ArrayList d, final TwitterSearchSuggestion e, final String[] f, final ArrayList g, final xa h, final TwitterSearchFilter i, final TwitterSearchSummary j, final boolean k, final ArrayList l, final boolean m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = k;
        this.l = l;
        this.m = m;
        this.j = j;
    }
}
