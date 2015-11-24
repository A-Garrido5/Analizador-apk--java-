// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.util.regex.Pattern;
import android.text.TextUtils;
import android.content.Context;
import java.io.Serializable;

public enum CreditCard$Type implements Serializable
{
    a("INVALID", 0, (String)null, (String)null, 3), 
    b("VISA", 1, "^4(([0-9]{15})|([0-9]{12}))?", "^4[0-9]{3}?", 3), 
    c("MASTERCARD", 2, "^5[1-5][0-9]{14}$", "^5[1-5][0-9]{2}$", 3), 
    d("AMEX", 3, "^3[47][0-9]{13}$", "^3[47][0-9]{2}$", 4), 
    e("DISCOVER", 4, "^6(?:011|5[0-9]{2})[0-9]{12}$", "^6(?:011|5[0-9]{2})$", 3), 
    f("DINERS", 5, "^3(?:0[0-5]|[68][0-9])[0-9]{11}$", "^3(?:0[0-5]|[68][0-9])[0-9]$", 3), 
    g("JCB", 6, "^(?:2131|1800|2100|35\\d{3})\\d{11}$", "^(?:2131|1800|2100|35\\d{2})$", 3);
    
    private int mCCVDigits;
    private String mFullValidationRegex;
    private String mPartialValidationRegex;
    
    private CreditCard$Type(final String s, final int n, final String mFullValidationRegex, final String mPartialValidationRegex, final int mccvDigits) {
        this.mPartialValidationRegex = mPartialValidationRegex;
        this.mFullValidationRegex = mFullValidationRegex;
        this.mCCVDigits = mccvDigits;
    }
    
    public static String a(final Context context, final CreditCard$Type creditCard$Type) {
        switch (com.twitter.library.commerce.model.c.a[creditCard$Type.ordinal()]) {
            default: {
                return null;
            }
            case 2: {
                return context.getString(lg.commerce_cc_visa);
            }
            case 3: {
                return context.getString(lg.commerce_cc_mastercard);
            }
            case 1: {
                return context.getString(lg.commerce_cc_amex);
            }
            case 6: {
                return context.getString(lg.commerce_cc_discover);
            }
            case 5: {
                return context.getString(lg.commerce_cc_diners);
            }
            case 4: {
                return context.getString(lg.commerce_cc_jcb);
            }
        }
    }
    
    public static boolean b(final String s) {
        boolean b = true;
        if (s == null) {
            return false;
        }
        while (true) {
            while (true) {
                int n;
                int n2;
                int n3;
                int int1;
                try {
                    n = -1 + s.length();
                    n2 = 0;
                    n3 = 0;
                    if (n < 0) {
                        if (n3 % 10 != 0) {
                            b = false;
                        }
                        return b;
                    }
                    int1 = Integer.parseInt(s.substring(n, n + 1));
                    if (n2 != 0) {
                        int1 *= 2;
                        if (int1 > 9) {
                            int1 -= 9;
                        }
                    }
                }
                catch (NumberFormatException ex) {
                    return false;
                }
                n3 += int1;
                final boolean b2 = n2 == 0 && b;
                --n;
                n2 = (b2 ? 1 : 0);
                continue;
            }
        }
    }
    
    public static int c(final String s) {
        return e(s).mCCVDigits;
    }
    
    public static CreditCard$Type e(final String s) {
        for (final CreditCard$Type creditCard$Type : values()) {
            if (creditCard$Type.a(s)) {
                return creditCard$Type;
            }
        }
        return CreditCard$Type.a;
    }
    
    public static CreditCard$Type f(final String s) {
        final String upperCase = s.toUpperCase();
        switch (upperCase) {
            default: {
                return CreditCard$Type.a;
            }
            case "VISA": {
                return CreditCard$Type.b;
            }
            case "MASTERCARD": {
                return CreditCard$Type.c;
            }
            case "AMEX": {
                return CreditCard$Type.d;
            }
            case "DISCOVER": {
                return CreditCard$Type.e;
            }
            case "DINERS": {
                return CreditCard$Type.f;
            }
            case "JCB": {
                return CreditCard$Type.g;
            }
        }
    }
    
    protected String a() {
        return this.mFullValidationRegex;
    }
    
    public boolean a(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s) && s.length() >= 4) {
            final String b = this.b();
            if (b != null) {
                return Pattern.compile(b).matcher(s.substring(0, 4)).matches();
            }
        }
        return false;
    }
    
    protected String b() {
        return this.mPartialValidationRegex;
    }
    
    public int c() {
        return this.mCCVDigits;
    }
    
    public boolean d(final String s) {
        if (s != null) {
            final String a = this.a();
            if (a != null && Pattern.compile(a).matcher(s).matches() && b(s)) {
                return true;
            }
        }
        return false;
    }
}
