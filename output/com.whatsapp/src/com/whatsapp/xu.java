// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.apache.http.Header;
import android.os.ConditionVariable;

final class xu implements a6i
{
    private static final String z;
    final StringBuffer a;
    final ConditionVariable b;
    
    static {
        final char[] charArray = "GG7!0p\u000b\u0006482,\u000b=92#\u0006".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\\';
                    break;
                }
                case 0: {
                    c2 = '\u001f';
                    break;
                }
                case 1: {
                    c2 = 'j';
                    break;
                }
                case 2: {
                    c2 = 'b';
                    break;
                }
                case 3: {
                    c2 = 'Q';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    xu(final StringBuffer a, final ConditionVariable b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final int n) {
    }
    
    @Override
    public void a(final Header[] array, final String s) {
        final boolean i = App.I;
        final int length = array.length;
        int j = 0;
        while (j < length) {
            final Header header = array[j];
            if (header.getName().equals(xu.z)) {
                this.a.append(header.getValue());
                if (!i) {
                    break;
                }
            }
            ++j;
            if (i) {
                break;
            }
        }
        this.b.open();
    }
}
