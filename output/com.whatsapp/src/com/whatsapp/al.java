// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class al implements View$OnClickListener
{
    private static final String z;
    final HomeActivity a;
    
    static {
        final char[] charArray = "zmI".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '}';
                    break;
                }
                case 0: {
                    c2 = '\u0010';
                    break;
                }
                case 1: {
                    c2 = '\u0004';
                    break;
                }
                case 2: {
                    c2 = '-';
                    break;
                }
                case 3: {
                    c2 = 'G';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    al(final HomeActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final String peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            final Intent intent = new Intent((Context)this.a, (Class)VoipActivity.class);
            intent.putExtra(al.z, peerJid);
            this.a.startActivity(intent);
        }
    }
}
