// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.protocol;

public class a
{
    public final String a;
    public final byte b;
    public final short c;
    
    public a() {
        this("", (byte)0, (short)0);
    }
    
    public a(final String a, final byte b, final short c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public String toString() {
        return "<TField name:'" + this.a + "' type:" + this.b + " field-id:" + this.c + ">";
    }
}
