// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import java.util.Collections;
import java.util.List;

public class j
{
    private final List a;
    
    public j(final List list) {
        this.a = Collections.unmodifiableList((List<?>)list);
    }
    
    public List a() {
        return this.a;
    }
}
