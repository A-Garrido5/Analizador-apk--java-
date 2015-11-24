// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal;

public final class Conversions
{
    public static Object booleanObject(final boolean b) {
        return new Boolean(b);
    }
    
    public static boolean booleanValue(final Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Boolean) {
            return (boolean)o;
        }
        throw new ClassCastException(new StringBuffer().append(o.getClass().getName()).append(" can not be converted to boolean").toString());
    }
    
    public static Object byteObject(final byte b) {
        return new Byte(b);
    }
    
    public static byte byteValue(final Object o) {
        if (o == null) {
            return 0;
        }
        if (o instanceof Number) {
            return ((Number)o).byteValue();
        }
        throw new ClassCastException(new StringBuffer().append(o.getClass().getName()).append(" can not be converted to byte").toString());
    }
    
    public static Object charObject(final char c) {
        return new Character(c);
    }
    
    public static char charValue(final Object o) {
        if (o == null) {
            return '\0';
        }
        if (o instanceof Character) {
            return (char)o;
        }
        throw new ClassCastException(new StringBuffer().append(o.getClass().getName()).append(" can not be converted to char").toString());
    }
    
    public static Object doubleObject(final double n) {
        return new Double(n);
    }
    
    public static double doubleValue(final Object o) {
        if (o == null) {
            return 0.0;
        }
        if (o instanceof Number) {
            return ((Number)o).doubleValue();
        }
        throw new ClassCastException(new StringBuffer().append(o.getClass().getName()).append(" can not be converted to double").toString());
    }
    
    public static Object floatObject(final float n) {
        return new Float(n);
    }
    
    public static float floatValue(final Object o) {
        if (o == null) {
            return 0.0f;
        }
        if (o instanceof Number) {
            return ((Number)o).floatValue();
        }
        throw new ClassCastException(new StringBuffer().append(o.getClass().getName()).append(" can not be converted to float").toString());
    }
    
    public static Object intObject(final int n) {
        return new Integer(n);
    }
    
    public static int intValue(final Object o) {
        if (o == null) {
            return 0;
        }
        if (o instanceof Number) {
            return ((Number)o).intValue();
        }
        throw new ClassCastException(new StringBuffer().append(o.getClass().getName()).append(" can not be converted to int").toString());
    }
    
    public static Object longObject(final long n) {
        return new Long(n);
    }
    
    public static long longValue(final Object o) {
        if (o == null) {
            return 0L;
        }
        if (o instanceof Number) {
            return ((Number)o).longValue();
        }
        throw new ClassCastException(new StringBuffer().append(o.getClass().getName()).append(" can not be converted to long").toString());
    }
    
    public static Object shortObject(final short n) {
        return new Short(n);
    }
    
    public static short shortValue(final Object o) {
        if (o == null) {
            return 0;
        }
        if (o instanceof Number) {
            return ((Number)o).shortValue();
        }
        throw new ClassCastException(new StringBuffer().append(o.getClass().getName()).append(" can not be converted to short").toString());
    }
    
    public static Object voidObject() {
        return null;
    }
    
    public static Object voidValue(final Object o) {
        if (o == null) {}
        return o;
    }
}
