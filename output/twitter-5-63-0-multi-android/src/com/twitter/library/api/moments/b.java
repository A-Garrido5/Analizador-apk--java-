// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.moments;

import com.twitter.internal.android.util.Size;
import com.twitter.model.common.a;

public class b extends a
{
    int a;
    int b;
    int c;
    int d;
    Size e;
    
    public b() {
        this.e = Size.a;
    }
    
    public b a(final int a) {
        this.a = a;
        return this;
    }
    
    public b a(final Size e) {
        this.e = e;
        return this;
    }
    
    public b b(final int b) {
        this.b = b;
        return this;
    }
    
    protected CropData c() {
        return new CropData(this, null);
    }
    
    public b c(final int c) {
        this.c = c;
        return this;
    }
    
    public b d(final int d) {
        this.d = d;
        return this;
    }
}
