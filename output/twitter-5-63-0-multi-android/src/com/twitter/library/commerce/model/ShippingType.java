// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

public enum ShippingType
{
    a("UNKNOWN", 0, -1), 
    b("CALCULATED", 1, 1), 
    c("INCLUDED_IN_PRICE", 2, 2);
    
    private final int mValue;
    
    private ShippingType(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static ShippingType a(final int n) {
        for (final ShippingType shippingType : values()) {
            if (shippingType.ordinal() == n) {
                return shippingType;
            }
        }
        return ShippingType.a;
    }
    
    public static ShippingType a(final String s) {
        if (s == null) {
            return ShippingType.a;
        }
        try {
            return valueOf(s);
        }
        catch (IllegalArgumentException ex) {
            return ShippingType.a;
        }
    }
    
    public int a() {
        return this.mValue;
    }
}
