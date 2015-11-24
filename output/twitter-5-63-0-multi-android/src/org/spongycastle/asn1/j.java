// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public abstract class j extends q
{
    @Override
    abstract void a(final o p0);
    
    @Override
    boolean a(final q q) {
        return q instanceof j;
    }
    
    @Override
    public int hashCode() {
        return -1;
    }
    
    @Override
    public String toString() {
        return "NULL";
    }
}
