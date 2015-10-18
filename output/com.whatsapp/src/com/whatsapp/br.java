// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.ak;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class br implements View$OnClickListener
{
    private static final String z;
    final vb a;
    
    static {
        final char[] charArray = "[`[/0a~@4'J".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'I';
                    break;
                }
                case 0: {
                    c2 = '>';
                    break;
                }
                case 1: {
                    c2 = '\u000e';
                    break;
                }
                case 2: {
                    c2 = '/';
                    break;
                }
                case 3: {
                    c2 = ']';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    br(final vb a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent((Context)this.a.a, (Class)NewGroup.class);
        intent.putExtra(br.z, ak.CONTACTS.getCode());
        this.a.a.startActivity(intent);
    }
}
