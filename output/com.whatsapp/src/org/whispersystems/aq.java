// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class aq
{
    public static int b;
    private final V a;
    private final String c;
    
    public aq(final String c, final V a) {
        this.c = c;
        this.a = a;
    }
    
    public String a() {
        return this.c;
    }
    
    public V b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != null && o instanceof aq) {
            final aq aq = (aq)o;
            if (this.c.equals(aq.c) && this.a.equals(aq.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode() ^ this.a.hashCode();
    }
}
