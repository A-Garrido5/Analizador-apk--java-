// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import javax.net.ssl.HttpsURLConnection;

final class ow
{
    private static final String[] z;
    private final HttpsURLConnection a;
    private String b;
    private String c;
    
    static {
        final String[] z2 = new String[7];
        String s = "\u000bSZ\u000f\u0004\u0014JSW";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'p';
                        break;
                    }
                    case 0: {
                        c2 = 'm';
                        break;
                    }
                    case 1: {
                        c2 = ':';
                        break;
                    }
                    case 2: {
                        c2 = '6';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000bSZ\u000f\u0018\fI^W";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000bSZ\u000f\u0004\u0014JSW";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000bSZ\u000f\u0004\u0014JSW";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "5\u0017a+] _B\u000b\u0014\fNW";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000bSZ\u000f\u0018\fI^W";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000bSZ\u000f\u0018\fI^W";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ow(final HttpsURLConnection a) {
        this.a = a;
    }
    
    public String a() {
        return this.c;
    }
    
    public String b() {
        return this.b;
    }
    
    public ow c() {
        final boolean i = App.I;
        final String headerField = this.a.getHeaderField(ow.z[4]);
        if (headerField != null) {
            final String s = ow.z[2];
            final int index = headerField.indexOf(ow.z[3]);
            Label_0099: {
                if (index >= 0) {
                    final int n = index + ow.z[0].length();
                    final int index2 = headerField.indexOf(59, n);
                    if (index2 >= 0) {
                        this.c = headerField.substring(n, index2);
                        if (!i) {
                            break Label_0099;
                        }
                    }
                    this.c = headerField.substring(n);
                }
            }
            final String s2 = ow.z[5];
            final int index3 = headerField.indexOf(ow.z[6]);
            if (index3 >= 0) {
                final int n2 = index3 + ow.z[1].length();
                final int index4 = headerField.indexOf(59, n2);
                if (index4 >= 0) {
                    this.b = headerField.substring(n2, index4);
                    if (!i) {
                        return this;
                    }
                }
                this.b = headerField.substring(n2);
                return this;
            }
        }
        return this;
    }
}
