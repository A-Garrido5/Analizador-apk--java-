// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import android.app.PendingIntent;

class y1 implements aqq
{
    private static final String[] z;
    final o6 a;
    final String b;
    final String c;
    
    static {
        final String[] z2 = new String[2];
        String s = "E.|zQI/`kL";
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
                        c2 = '\u0018';
                        break;
                    }
                    case 0: {
                        c2 = '\u0007';
                        break;
                    }
                    case 1: {
                        c2 = '{';
                        break;
                    }
                    case 2: {
                        c2 = '%';
                        break;
                    }
                    case 3: {
                        c2 = '%';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "n\u0015DUh";
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
    
    y1(final o6 a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a() {
        final Bundle buyIntent = o6.b(this.a).c.getBuyIntent(3, o6.a(this.a), this.b, y1.z[1], this.c);
        final int a = o6.a(this.a, buyIntent);
        if (a == 0) {
            o6.g().a((PendingIntent)buyIntent.getParcelable(y1.z[0]));
            if (!App.I) {
                return;
            }
        }
        o6.g().a(a);
    }
}
