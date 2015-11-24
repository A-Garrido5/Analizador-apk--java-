// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

public enum TaxType
{
    a("UNKNOWN", 0, -1), 
    b("CALCULATED", 1, 1), 
    c("INCLUDED_IN_PRICE", 2, 2), 
    d("ESTIMATED", 3, 3);
    
    private final int mValue;
    
    private TaxType(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static TaxType a(final int n) {
        for (final TaxType taxType : values()) {
            if (taxType.ordinal() == n) {
                return taxType;
            }
        }
        return TaxType.a;
    }
    
    public static TaxType a(final String s) {
        if (s == null) {
            return TaxType.a;
        }
        try {
            return valueOf(s);
        }
        catch (IllegalArgumentException ex) {
            return TaxType.a;
        }
    }
    
    public int a() {
        return this.mValue;
    }
}
