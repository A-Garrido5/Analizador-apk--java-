// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.util.List;

public class I extends Exception
{
    public I() {
    }
    
    public I(final String s) {
        super(s);
    }
    
    public I(final String s, final Throwable t) {
        super(s, t);
    }
    
    public I(final String s, final List list) {
        super(s, list.get(0));
    }
    
    public I(final Throwable t) {
        super(t);
    }
}
