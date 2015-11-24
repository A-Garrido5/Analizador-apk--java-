// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.Serializable;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class dx implements View$OnClickListener
{
    private static final String z;
    final Conversation a;
    
    static {
        final char[] charArray = "%J#".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0002';
                    break;
                }
                case 0: {
                    c2 = 'O';
                    break;
                }
                case 1: {
                    c2 = '#';
                    break;
                }
                case 2: {
                    c2 = 'G';
                    break;
                }
                case 3: {
                    c2 = '*';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    dx(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Conversation.G(this.a).dismiss();
        Serializable s;
        if (App.ax()) {
            s = LocationPicker2.class;
        }
        else if (App.aM()) {
            s = LocationPicker.class;
        }
        else {
            final boolean q = App.q();
            s = null;
            if (q) {
                s = LocationPicker.class;
            }
        }
        if (s != null) {
            final Intent intent = new Intent((Context)this.a, (Class)s);
            intent.putExtra(dx.z, this.a.s.u);
            this.a.startActivity(intent);
            Conversation.a_ = false;
            if (!App.I) {
                return;
            }
        }
        App.a((Context)this.a, this.a.s.u);
    }
}
