// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.p;
import java.io.File;
import android.view.View;
import android.view.View$OnClickListener;

class ws implements View$OnClickListener
{
    private static final String[] z;
    final Advanced a;
    
    static {
        final String[] z2 = new String[2];
        String s = "'N\u001bZ\u0000\u001bYTl\u0000\u0014H\u0001N\f\u0004";
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
                        c2 = 'i';
                        break;
                    }
                    case 0: {
                        c2 = 'w';
                        break;
                    }
                    case 1: {
                        c2 = '<';
                        break;
                    }
                    case 2: {
                        c2 = 't';
                        break;
                    }
                    case 3: {
                        c2 = '<';
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
                    s = "6J\u0015H\b\u0005O";
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
    
    ws(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.S.c();
        p.a(new File(this.a.getFilesDir(), ws.z[1]));
        p.a(new File(App.M, ws.z[0]));
        App.S.e().a(0, 0);
        new atj((j5)null).start();
    }
}
