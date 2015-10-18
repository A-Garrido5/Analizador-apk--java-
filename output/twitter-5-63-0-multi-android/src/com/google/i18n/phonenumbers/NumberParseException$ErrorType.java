// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

public enum NumberParseException$ErrorType
{
    a("INVALID_COUNTRY_CODE", 0), 
    b("NOT_A_NUMBER", 1), 
    c("TOO_SHORT_AFTER_IDD", 2), 
    d("TOO_SHORT_NSN", 3), 
    e("TOO_LONG", 4);
    
    private NumberParseException$ErrorType(final String s, final int n) {
    }
}
