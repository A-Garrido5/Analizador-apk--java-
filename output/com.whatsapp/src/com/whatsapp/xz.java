// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class xz implements View$OnClickListener
{
    private static final String z;
    final ContactInfo a;
    
    static {
        final char[] charArray = "f+\u000f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ']';
                    break;
                }
                case 0: {
                    c2 = '\f';
                    break;
                }
                case 1: {
                    c2 = 'B';
                    break;
                }
                case 2: {
                    c2 = 'k';
                    break;
                }
                case 3: {
                    c2 = 'v';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    xz(final ContactInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent((Context)this.a, (Class)MediaGallery.class);
        intent.putExtra(xz.z, ContactInfo.c(this.a).u);
        this.a.startActivity(intent);
    }
}
