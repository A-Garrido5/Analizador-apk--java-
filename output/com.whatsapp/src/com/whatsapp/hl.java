// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class hl implements View$OnClickListener
{
    private static final String z;
    final ChatInfoActivity a;
    final String b;
    
    static {
        final char[] charArray = "aa\u0002".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'U';
                    break;
                }
                case 0: {
                    c2 = '\u000b';
                    break;
                }
                case 1: {
                    c2 = '\b';
                    break;
                }
                case 2: {
                    c2 = 'f';
                    break;
                }
                case 3: {
                    c2 = '7';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    hl(final ChatInfoActivity a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent((Context)this.a, (Class)MediaGallery.class);
        intent.putExtra(hl.z, this.b);
        this.a.startActivity(intent);
    }
}
