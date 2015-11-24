// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.resilient;

import com.twitter.library.client.Session;
import android.content.Context;

public abstract class b
{
    public final Class a;
    public final String b;
    
    public b(final String b, final Class a) {
        this.a = a;
        this.b = b;
    }
    
    public abstract a b(final Context p0, final Session p1, final c p2);
    
    @Override
    public String toString() {
        return "(" + this.b + ", " + this.a.getName() + ")";
    }
}
