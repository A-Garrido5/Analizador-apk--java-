// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.List;

public class jk extends j1
{
    private static final String[] z;
    String b;
    List c;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u000bWfbr\u0014QXbi\t\u0005Znh\u0014Q\u0003!";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001d';
                        break;
                    }
                    case 0: {
                        c2 = 'z';
                        break;
                    }
                    case 1: {
                        c2 = '%';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = '\u0001';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "ZFQd~\u0011VLl'Z";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public jk(final List c, final String b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public String b() {
        return jk.z[0] + this.c.size() + jk.z[1] + this.b;
    }
    
    @Override
    public void c() {
        App.a(this.c, this.b);
    }
}
