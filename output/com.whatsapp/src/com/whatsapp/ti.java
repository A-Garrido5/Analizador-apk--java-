// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class ti implements View$OnClickListener
{
    private static final String z;
    final Conversation a;
    
    static {
        final char[] charArray = "BU\u000b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '^';
                    break;
                }
                case 0: {
                    c2 = '(';
                    break;
                }
                case 1: {
                    c2 = '<';
                    break;
                }
                case 2: {
                    c2 = 'o';
                    break;
                }
                case 3: {
                    c2 = 'P';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ti(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final String peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            final Intent intent = new Intent((Context)this.a, (Class)VoipActivity.class);
            intent.putExtra(ti.z, peerJid);
            this.a.startActivity(intent);
        }
    }
}
