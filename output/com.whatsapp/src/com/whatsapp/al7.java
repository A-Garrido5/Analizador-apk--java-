// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class al7 implements View$OnClickListener
{
    private static final String z;
    final ahh a;
    
    static {
        final char[] charArray = "GLk".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '3';
                    break;
                }
                case 0: {
                    c2 = '%';
                    break;
                }
                case 1: {
                    c2 = '9';
                    break;
                }
                case 2: {
                    c2 = '\u0012';
                    break;
                }
                case 3: {
                    c2 = 'V';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    al7(final ahh a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent((Context)this.a.c, (Class)AccountInfoActivity.class);
        intent.putExtra(al7.z, true);
        this.a.c.startActivity(intent);
        this.a.c.finish();
        RegisterName.a((x1)null);
        this.a.c.removeDialog(0);
    }
}
