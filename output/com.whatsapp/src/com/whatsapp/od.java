// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build;
import android.os.Build$VERSION;
import java.io.File;

public abstract class od
{
    public static int b;
    private static final String[] z;
    protected File a;
    protected int c;
    
    static {
        final String[] z2 = new String[9];
        String s = "6\u001di\u0006,";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0018';
                        break;
                    }
                    case 0: {
                        c2 = 'u';
                        break;
                    }
                    case 1: {
                        c2 = '/';
                        break;
                    }
                    case 2: {
                        c2 = 'X';
                        break;
                    }
                    case 3: {
                        c2 = '6';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "&bux!E\u001fh";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "[@(Ck";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "&bux!E\u001f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "&@6O";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0006N5Em\u001bH";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "6\u001di\u0006-";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0014Z<_wZ@?Q#UL7R}\u0016\\eYh\u0000\\";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "&bux!E\u001f";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static od a(final String s, final String s2) {
        if (od.z[7].equals(s2)) {
            return new o0(s + od.z[2]);
        }
        if (Build$VERSION.SDK_INT >= 16 && Build.MANUFACTURER.equals(od.z[4]) && !Build.MODEL.equals(od.z[0]) && !Build.MODEL.equals(od.z[6])) {
            final o8 o8 = new o8(s);
            o8.a(5);
            return o8;
        }
        if (Build$VERSION.SDK_INT >= 16 && Build.MANUFACTURER.equals(od.z[5]) && Build.MODEL.contains(od.z[3]) && !Build.MODEL.equals(od.z[8]) && !Build.MODEL.equals(od.z[1])) {
            return new o8(s);
        }
        return new oa(s, s2);
    }
    
    public File a() {
        return this.a;
    }
    
    public int b() {
        return this.c;
    }
    
    public abstract void c();
    
    public abstract void d();
    
    public abstract void e();
    
    public abstract void f();
}
