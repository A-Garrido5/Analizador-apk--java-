// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class bx implements View$OnClickListener
{
    private static final String[] z;
    final q a;
    final ViewSharedContactActivity b;
    
    static {
        final String[] z2 = new String[2];
        String s = " \u001a[l)(\u0010\u0011w(5\u0011Qjh \u0017Kw)/ZiW\u0003\u0016";
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
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = 'A';
                        break;
                    }
                    case 1: {
                        c2 = 't';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = '\u001e';
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
                    s = "\u0014&s";
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
    
    bx(final ViewSharedContactActivity b, final q a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (ViewSharedContactActivity.c(this.b)) {
            ViewSharedContactActivity.a(this.b, view);
            if (!App.I) {
                return;
            }
        }
        if (this.a.d.equals(bx.z[1])) {
            this.b.startActivity(new Intent(bx.z[0], Uri.parse(view.getTag().toString())));
        }
    }
}
