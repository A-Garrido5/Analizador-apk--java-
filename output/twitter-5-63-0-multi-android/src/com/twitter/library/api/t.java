// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.model.common.a;

public abstract class t extends a
{
    int a;
    int b;
    
    public t() {
        this.a = -1;
        this.b = -1;
    }
    
    public t(final Entity entity) {
        this.a = -1;
        this.b = -1;
        this.a = entity.start;
        this.b = entity.end;
    }
    
    public t a(final int a) {
        this.a = a;
        return this;
    }
    
    public t b(final int b) {
        this.b = b;
        return this;
    }
}
