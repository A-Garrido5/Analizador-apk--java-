// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class F extends RuntimeException
{
    private static final long serialVersionUID = -7466929953374883507L;
    private static final String[] z;
    private final List a;
    
    static {
        final String[] z2 = new String[3];
        final char[] charArray = "\u000b6\\]O!6\u000fCG5 F@If!J_[/!JJ\u000e :JBJ5i\u000f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '.';
                    break;
                }
                case 0: {
                    c2 = 'F';
                    break;
                }
                case 1: {
                    c2 = 'S';
                    break;
                }
                case 2: {
                    c2 = '/';
                    break;
                }
                case 3: {
                    c2 = '.';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "js".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '.';
                    break;
                }
                case 0: {
                    c4 = 'F';
                    break;
                }
                case 1: {
                    c4 = 'S';
                    break;
                }
                case 2: {
                    c4 = '/';
                    break;
                }
                case 3: {
                    c4 = '.';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u000b6\\]O!6\u000fYO5sBG]5:AI\u000e46^[G46K\u000eH/6CJ]hs\u000f\u0006b/'J\u000e\\3=[GC#sLA[*7\u000f@A2sKKZ#!BG@#sXFG%;\u000fHG#?K]\u000e16]K\u000e+:\\]G(4\u0006\u0000".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '.';
                    break;
                }
                case 0: {
                    c6 = 'F';
                    break;
                }
                case 1: {
                    c6 = 'S';
                    break;
                }
                case 2: {
                    c6 = '/';
                    break;
                }
                case 3: {
                    c6 = '.';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        z = z2;
    }
    
    public F(final ci ci) {
        super(F.z[2]);
        this.a = null;
    }
    
    public F(final List a) {
        super(a(a));
        this.a = a;
    }
    
    private static String a(final List list) {
        final boolean b = dt.b;
        final StringBuilder sb = new StringBuilder(F.z[0]);
        final Iterator<String> iterator = list.iterator();
        int n = 1;
    Label_0069_Outer:
        while (true) {
            while (true) {
                Label_0080: {
                    if (!iterator.hasNext()) {
                        break Label_0080;
                    }
                    final String s = iterator.next();
                    if (n != 0) {
                        if (!b) {
                            break Label_0080;
                        }
                        n = 0;
                    }
                    try {
                        sb.append(F.z[1]);
                        sb.append(s);
                        if (b) {
                            return sb.toString();
                        }
                        continue Label_0069_Outer;
                    }
                    catch (F f) {
                        throw f;
                    }
                }
                n = 0;
                continue;
            }
        }
    }
    
    public List a() {
        return Collections.unmodifiableList((List<?>)this.a);
    }
    
    public bg b() {
        return new bg(this.getMessage());
    }
}
