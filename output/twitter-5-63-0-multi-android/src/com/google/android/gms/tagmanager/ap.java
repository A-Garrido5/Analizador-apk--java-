// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.util.Collections;
import com.google.android.gms.internal.c;
import java.util.Map;

public class ap
{
    private final Map a;
    private final c b;
    
    public Map a() {
        return Collections.unmodifiableMap((Map<?, ?>)this.a);
    }
    
    public void a(final String s, final c c) {
        this.a.put(s, c);
    }
    
    public c b() {
        return this.b;
    }
    
    @Override
    public String toString() {
        return "Properties: " + this.a() + " pushAfterEvaluate: " + this.b;
    }
}
