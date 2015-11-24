// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;

public final class fy extends IOException
{
    private static final long serialVersionUID = 1L;
    
    public fy(final String s) {
        super(s);
    }
    
    public fy(final String s, final Throwable t) {
        super(s);
        this.initCause(t);
    }
    
    public fy(final Throwable t) {
        this.initCause(t);
    }
}
