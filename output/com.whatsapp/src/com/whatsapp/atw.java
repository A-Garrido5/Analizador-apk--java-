// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;

final class atw implements Runnable
{
    private static final String[] z;
    final String a;
    final byte[] b;
    
    static {
        final String[] z2 = new String[2];
        String s = "*S";
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
                        c2 = 'a';
                        break;
                    }
                    case 0: {
                        c2 = 'X';
                        break;
                    }
                    case 1: {
                        c2 = '0';
                        break;
                    }
                    case 2: {
                        c2 = 'R';
                        break;
                    }
                    case 3: {
                        c2 = '?';
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
                    s = "*S\u0018V\u0005";
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
    
    atw(final byte[] b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final Bundle bundle = new Bundle();
        bundle.putByteArray(atw.z[0], this.b);
        bundle.putString(atw.z[1], this.a);
        App.ap().sendMessage(App.ap().obtainMessage(0, (Object)bundle));
    }
}
