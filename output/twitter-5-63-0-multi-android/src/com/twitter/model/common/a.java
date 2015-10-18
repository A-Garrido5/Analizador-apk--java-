// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.common;

public abstract class a
{
    protected void av_() {
    }
    
    public boolean aw_() {
        return true;
    }
    
    protected abstract Object b();
    
    public final Object f() {
        if (this.aw_()) {
            this.av_();
            return this.b();
        }
        throw new IllegalStateException("The builder configuration is invalid.");
    }
}
