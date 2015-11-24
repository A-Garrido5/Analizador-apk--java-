// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.math.BigInteger;

public final class f5 extends fL
{
    private static final Class[] b;
    private Object c;
    
    static {
        b = new Class[] { Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class };
    }
    
    public f5(final Number n) {
        this.b(n);
    }
    
    public f5(final String s) {
        this.b(s);
    }
    
    private static boolean a(final f5 f5) {
        if (f5.c instanceof Number) {
            final Number n = (Number)f5.c;
            return n instanceof BigInteger || n instanceof Long || n instanceof Integer || n instanceof Short || n instanceof Byte;
        }
        return false;
    }
    
    private static boolean a(final Object o) {
        final boolean a = fL.a;
        if (!(o instanceof String)) {
            final Class<?> class1 = o.getClass();
            final Class[] b = f5.b;
            final int length = b.length;
            int i = 0;
            while (i < length) {
                if (b[i].isAssignableFrom(class1)) {
                    return true;
                }
                ++i;
                if (a) {
                    break;
                }
            }
            return false;
        }
        return true;
    }
    
    Boolean a() {
        return (Boolean)this.c;
    }
    
    void b(final Object c) {
        final boolean a = fL.a;
        Label_0054: {
            if (c instanceof Character) {
                this.c = String.valueOf((char)c);
                if (!a) {
                    break Label_0054;
                }
            }
            J.a(c instanceof Number || a(c));
            this.c = c;
        }
        if (e_.a) {
            boolean a2 = false;
            if (!a) {
                a2 = true;
            }
            fL.a = a2;
        }
    }
    
    public boolean c() {
        if (this.d()) {
            return this.a();
        }
        return Boolean.parseBoolean(this.g());
    }
    
    public boolean d() {
        return this.c instanceof Boolean;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final f5 f5 = (f5)o;
            if (this.c == null) {
                if (f5.c != null) {
                    return false;
                }
            }
            else if (a(this) && a(f5)) {
                if (this.h().longValue() != f5.h().longValue()) {
                    return false;
                }
            }
            else {
                if (this.c instanceof Number && f5.c instanceof Number) {
                    final double doubleValue = this.h().doubleValue();
                    final double doubleValue2 = f5.h().doubleValue();
                    if (doubleValue != doubleValue2) {
                        final boolean naN = Double.isNaN(doubleValue);
                        boolean b = false;
                        if (!naN) {
                            return b;
                        }
                        final boolean naN2 = Double.isNaN(doubleValue2);
                        b = false;
                        if (!naN2) {
                            return b;
                        }
                    }
                    return true;
                }
                return this.c.equals(f5.c);
            }
        }
        return true;
    }
    
    public boolean f() {
        return this.c instanceof Number;
    }
    
    public String g() {
        if (this.f()) {
            return this.h().toString();
        }
        if (this.d()) {
            return this.a().toString();
        }
        return (String)this.c;
    }
    
    public Number h() {
        if (this.c instanceof String) {
            return new fn((String)this.c);
        }
        return (Number)this.c;
    }
    
    @Override
    public int hashCode() {
        if (this.c == null) {
            return 31;
        }
        if (a(this)) {
            final long longValue = this.h().longValue();
            return (int)(longValue ^ longValue >>> 32);
        }
        if (this.c instanceof Number) {
            final long doubleToLongBits = Double.doubleToLongBits(this.h().doubleValue());
            return (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        }
        return this.c.hashCode();
    }
}
