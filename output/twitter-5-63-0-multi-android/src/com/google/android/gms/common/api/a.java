// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import java.util.List;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;

public final class a
{
    private final f a;
    private final h b;
    private final ArrayList c;
    
    public a(final f a, final h b, final Scope... array) {
        this.a = a;
        this.b = b;
        this.c = new ArrayList((Collection<? extends E>)Arrays.asList(array));
    }
    
    public f a() {
        return this.a;
    }
    
    public List b() {
        return this.c;
    }
    
    public h c() {
        return this.b;
    }
}
