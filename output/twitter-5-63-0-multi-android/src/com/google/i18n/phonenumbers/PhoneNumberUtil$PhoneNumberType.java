// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

public enum PhoneNumberUtil$PhoneNumberType
{
    a("FIXED_LINE", 0), 
    b("MOBILE", 1), 
    c("FIXED_LINE_OR_MOBILE", 2), 
    d("TOLL_FREE", 3), 
    e("PREMIUM_RATE", 4), 
    f("SHARED_COST", 5), 
    g("VOIP", 6), 
    h("PERSONAL_NUMBER", 7), 
    i("PAGER", 8), 
    j("UAN", 9), 
    k("VOICEMAIL", 10), 
    l("UNKNOWN", 11);
    
    private PhoneNumberUtil$PhoneNumberType(final String s, final int n) {
    }
}
