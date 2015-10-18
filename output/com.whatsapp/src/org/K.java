// 
// Decompiled by Procyon v0.5.30
// 

package org;

import java.io.IOException;

public class K extends IOException
{
    public static int b = 0;
    private static final long serialVersionUID = -2602899129433221532L;
    private final long a;
    
    public K(final String s, final long a, final IOException ex) {
        super(s);
        this.initCause(ex);
        this.a = a;
    }
    
    public long a() {
        return this.a;
    }
    
    public IOException b() {
        return (IOException)this.getCause();
    }
}
