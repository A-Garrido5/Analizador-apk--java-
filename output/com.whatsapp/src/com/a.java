// 
// Decompiled by Procyon v0.5.30
// 

package com;

import com.whatsapp.DialogToastActivity;
import java.security.Provider;

final class a extends Provider
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "6jIU\u0001*Qig";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'y';
                        break;
                    }
                    case 0: {
                        c2 = 'z';
                        break;
                    }
                    case 1: {
                        c2 = '\u0003';
                        break;
                    }
                    case 2: {
                        c2 = '\'';
                        break;
                    }
                    case 3: {
                        c2 = ' ';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ")fDU\u000b\u001fQFN\u001d\u0015n\ts1;2wr7=";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ")fDU\u000b\u001fQFN\u001d\u0015n\ts1;2wr7=#nM\t\u0016fJE\u0017\u000efCi\u0017";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ";#kI\u0017\u000f{\nS\t\u001f`NF\u0010\u0019#UA\u0017\u001elJ\u0000\u0017\u000fnEE\u000bZsUO\u000f\u0013gBRY\u000ekFTY\u000fpBSYUgBVV\u000fqFN\u001d\u0015n";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = ")lAT\u000e\u001bqB";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public a() {
        final int a = b.a;
        super(com.a.z[0], 1.0, com.a.z[3]);
        this.put(com.a.z[1], c.class.getName());
        this.put(com.a.z[2], com.a.z[4]);
        if (DialogToastActivity.h) {
            b.a = a + 1;
        }
    }
}
