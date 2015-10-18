// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;

public abstract class di implements ci
{
    public static int a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "8{\u0015Vs\u0007w\u001dV|\f>\u0013P2\n>\u0005Ff\u000e>\u0006M`\ngGKz\u0019{\u0010\u001fs\u0005>.pW\u0013}\u0002Of\u0002q\t\u001f:\u0018v\bJ~\u000f>\tZd\u000elGWs\u001bn\u0002Q;E".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0012';
                    break;
                }
                case 0: {
                    c2 = 'k';
                    break;
                }
                case 1: {
                    c2 = '\u001e';
                    break;
                }
                case 2: {
                    c2 = 'g';
                    break;
                }
                case 3: {
                    c2 = '?';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "8{\u0015Vs\u0007w\u001dV|\f>\u0013P2\n>%Ff\u000eM\u0013M{\u0005yGKz\u0019{\u0010\u001fs\u0005>.pW\u0013}\u0002Of\u0002q\t\u001f:\u0018v\bJ~\u000f>\tZd\u000elGWs\u001bn\u0002Q;E".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0012';
                    break;
                }
                case 0: {
                    c4 = 'k';
                    break;
                }
                case 1: {
                    c4 = '\u001e';
                    break;
                }
                case 2: {
                    c4 = 'g';
                    break;
                }
                case 3: {
                    c4 = '?';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    F a() {
        return new F(this);
    }
    
    @Override
    public byte[] a() {
        try {
            final byte[] array = new byte[this.getSerializedSize()];
            final ep b = ep.b(array);
            this.writeTo(b);
            b.a();
            return array;
        }
        catch (IOException ex) {
            throw new RuntimeException(di.z[0], ex);
        }
    }
    
    @Override
    public hv b() {
        try {
            final ap a = hv.a(this.getSerializedSize());
            this.writeTo(a.b());
            return a.a();
        }
        catch (IOException ex) {
            throw new RuntimeException(di.z[1], ex);
        }
    }
}
