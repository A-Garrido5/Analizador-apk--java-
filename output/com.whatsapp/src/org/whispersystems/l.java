// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.util.Arrays;
import java.math.BigInteger;

public class l implements ak
{
    private final byte[] a;
    
    l(final byte[] a) {
        this.a = a;
    }
    
    public int a(final ak ak) {
        return new BigInteger(this.a).compareTo(new BigInteger(((l)ak).a));
    }
    
    @Override
    public byte[] a() {
        return m.a(new byte[][] { { 5 }, this.a });
    }
    
    @Override
    public int b() {
        return 5;
    }
    
    public byte[] b() {
        return this.a;
    }
    
    @Override
    public int compareTo(final Object o) {
        return this.a((ak)o);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof l && Arrays.equals(this.a, ((l)o).a);
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
