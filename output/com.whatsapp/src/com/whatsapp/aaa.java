// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class aaa implements View$OnClickListener
{
    private static final String z;
    final MultipleContactPicker a;
    
    static {
        final char[] charArray = "\u0017\u0006QT".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0012';
                    break;
                }
                case 0: {
                    c2 = '}';
                    break;
                }
                case 1: {
                    c2 = 'o';
                    break;
                }
                case 2: {
                    c2 = '5';
                    break;
                }
                case 3: {
                    c2 = '\'';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aaa(final MultipleContactPicker a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        if (!MultipleContactPicker.i(this.a).isEmpty() || MultipleContactPicker.b(this.a)) {
            final Intent intent = new Intent();
            final StringBuilder sb = new StringBuilder();
            for (final String s : MultipleContactPicker.i(this.a)) {
                if (sb.length() != 0) {
                    sb.append(",");
                }
                sb.append(s);
                if (i) {
                    break;
                }
            }
            intent.putExtra(aaa.z, sb.toString());
            this.a.setResult(-1, intent);
            this.a.finish();
            if (!i) {
                return;
            }
        }
        App.a(this.a.getBaseContext(), String.format(App.C.a(2131296285, 1), 1), 0);
    }
}
