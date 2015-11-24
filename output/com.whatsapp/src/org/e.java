// 
// Decompiled by Procyon v0.5.30
// 

package org;

public class e extends RuntimeException
{
    public static boolean a = false;
    private static final long serialVersionUID = 5563335279583210658L;
    
    public e(final String s) {
        super(s);
    }
    
    public e(final String s, final Throwable t) {
        super(s, t);
    }
    
    @Deprecated
    public Throwable a() {
        return super.getCause();
    }
}
