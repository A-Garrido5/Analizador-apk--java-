// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift;

import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.e;
import org.apache.thrift.protocol.a;

public abstract class TUnion implements TBase
{
    protected d setField_;
    protected Object value_;
    
    protected TUnion() {
        this.setField_ = null;
        this.value_ = null;
    }
    
    private static String a(final byte[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int min = Math.min(array.length, 128), i = 0; i < min; ++i) {
            if (i != 0) {
                sb.append(" ");
            }
            String s = Integer.toHexString(0xFF & array[i]);
            if (s.length() <= 1) {
                s = "0" + s;
            }
            sb.append(s);
        }
        if (array.length > 128) {
            sb.append(" ...");
        }
        return sb.toString();
    }
    
    protected abstract a a(final d p0);
    
    protected abstract e a();
    
    protected abstract void a(final d p0, final Object p1);
    
    @Override
    public void a(final org.apache.thrift.protocol.d d) {
        if (this.b() == null || this.c() == null) {
            throw new TProtocolException("Cannot write a TUnion with no set value!");
        }
        d.a(this.a());
        d.a(this.a(this.setField_));
        this.b(d);
        d.b();
        d.c();
        d.a();
    }
    
    public d b() {
        return this.setField_;
    }
    
    public void b(final d setField_, final Object value_) {
        this.a(setField_, value_);
        this.setField_ = setField_;
        this.value_ = value_;
    }
    
    protected abstract void b(final org.apache.thrift.protocol.d p0);
    
    public boolean b(final d d) {
        return this.setField_ == d;
    }
    
    public Object c() {
        return this.value_;
    }
    
    @Override
    public String toString() {
        final String string = "<" + this.getClass().getSimpleName() + " ";
        String string2;
        if (this.b() != null) {
            final Object c = this.c();
            String s;
            if (c instanceof byte[]) {
                s = a((byte[])c);
            }
            else {
                s = c.toString();
            }
            string2 = string + this.a(this.b()).a + ":" + s;
        }
        else {
            string2 = string;
        }
        return string2 + ">";
    }
}
