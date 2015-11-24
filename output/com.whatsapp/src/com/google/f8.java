// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;

class f8 implements Entry
{
    private static final String z;
    private Entry a;
    
    static {
        final char[] charArray = "B9{*6g=m7P`7vs\u001f`4xs\u0005}=es\u0016a*!\u001e\u0015}+`4\u0015]=u\u007fPo6es\u0004f=!%\u0011b-ds\u001fhxL6\u0003}9f6#k,!>\u0005},!1\u0015.9os\u0019`+u2\u001em=!<\u0016.\u0015d \u0003o?d\u001f\u0019z=".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'p';
                    break;
                }
                case 0: {
                    c2 = '\u000e';
                    break;
                }
                case 1: {
                    c2 = 'X';
                    break;
                }
                case 2: {
                    c2 = '\u0001';
                    break;
                }
                case 3: {
                    c2 = 'S';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private f8(final Entry a) {
        this.a = a;
    }
    
    f8(final Entry entry, final aO ao) {
        this(entry);
    }
    
    public cQ a() {
        return this.a.getValue();
    }
    
    @Override
    public Object getKey() {
        return this.a.getKey();
    }
    
    @Override
    public Object getValue() {
        final cQ cq = this.a.getValue();
        if (cq == null) {
            return null;
        }
        return cq.c();
    }
    
    @Override
    public Object setValue(final Object o) {
        try {
            if (!(o instanceof ci)) {
                throw new IllegalArgumentException(f8.z);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.a.getValue().a((ci)o);
    }
}
