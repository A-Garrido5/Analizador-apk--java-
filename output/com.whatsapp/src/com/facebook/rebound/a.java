// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class a
{
    private static final a b;
    private static final String[] z;
    private final Map a;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u007f\u001dc\u000f?k.~\b7e\n1\u000f\",\u001ft\u0017$e\u001ft\u0002";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Q';
                        break;
                    }
                    case 0: {
                        c2 = '\f';
                        break;
                    }
                    case 1: {
                        c2 = 'm';
                        break;
                    }
                    case 2: {
                        c2 = '\u0011';
                        break;
                    }
                    case 3: {
                        c2 = 'f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "o\u0002\u007f\u00008k#p\u000b4,\u0004bF#i\u001cd\u000f#i\t";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "h\bw\u0007$`\u00191\u0005>b\u000bx\u0001";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        b = new a(true);
    }
    
    a(final boolean b) {
        this.a = new HashMap();
        if (b) {
            this.a(o.b, com.facebook.rebound.a.z[2]);
        }
    }
    
    public static a a() {
        return a.b;
    }
    
    public boolean a(final o o, final String s) {
        if (o == null) {
            try {
                throw new IllegalArgumentException(com.facebook.rebound.a.z[0]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        if (s == null) {
            try {
                throw new IllegalArgumentException(com.facebook.rebound.a.z[1]);
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        try {
            if (this.a.containsKey(o)) {
                return false;
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        this.a.put(o, s);
        return true;
    }
    
    public Map b() {
        return Collections.unmodifiableMap((Map<?, ?>)this.a);
    }
}
