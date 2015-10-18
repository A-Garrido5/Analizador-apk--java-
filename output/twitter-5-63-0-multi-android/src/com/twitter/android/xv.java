// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.PromotedContent;
import java.util.ArrayList;

public class xv
{
    public final int a;
    public final int b;
    public final ArrayList c;
    public final long d;
    public final PromotedContent e;
    
    xv(final int b, final long d, final PromotedContent e) {
        this.a = 1;
        this.b = b;
        this.c = null;
        this.d = d;
        this.e = e;
    }
    
    xv(final ArrayList c) {
        this.a = 2;
        this.b = -1;
        this.c = c;
        this.d = -1L;
        this.e = null;
    }
}
