// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class a9z implements View$OnClickListener
{
    private static final String[] z;
    final a8h a;
    final ada b;
    
    static {
        final String[] z2 = new String[3];
        String s = "bS\u001b&hoH";
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
                        c2 = '\r';
                        break;
                    }
                    case 0: {
                        c2 = '\u0001';
                        break;
                    }
                    case 1: {
                        c2 = '<';
                        break;
                    }
                    case 2: {
                        c2 = 'u';
                        break;
                    }
                    case 3: {
                        c2 = 'R';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "uU\u0001>h";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "tN\u0019";
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
    }
    
    a9z(final a8h a, final ada b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        SearchFAQ.a(this.a.a).add(this.b.a);
        final Intent intent = new Intent((Context)this.a.a, (Class)FaqItemActivity.class);
        intent.putExtra(a9z.z[1], this.b.b);
        intent.putExtra(a9z.z[0], this.b.c);
        intent.putExtra(a9z.z[2], this.b.a);
        this.a.a.startActivityForResult(intent, 1);
        this.a.a.overridePendingTransition(2130968589, 2130968590);
        SearchFAQ.a(this.a.a, this.b.a.substring(1 + this.b.a.lastIndexOf(47)));
    }
}
