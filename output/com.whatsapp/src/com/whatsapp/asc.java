// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class asc implements View$OnClickListener
{
    private static final String z;
    final ListChatInfo a;
    
    static {
        final char[] charArray = "\u0010\u001d\u0013".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '$';
                    break;
                }
                case 0: {
                    c2 = 'z';
                    break;
                }
                case 1: {
                    c2 = 't';
                    break;
                }
                case 2: {
                    c2 = 'w';
                    break;
                }
                case 3: {
                    c2 = 'B';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    asc(final ListChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent((Context)this.a, (Class)MediaGallery.class);
        intent.putExtra(asc.z, ListChatInfo.e(this.a).u);
        this.a.startActivity(intent);
    }
}
