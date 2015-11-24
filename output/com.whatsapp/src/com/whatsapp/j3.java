// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class j3 implements View$OnClickListener
{
    private static final String z;
    final ahh a;
    
    static {
        final char[] charArray = "\r!_\u0015\u0000\u000b!J\u0012\u0012\u0012!\u0017\u000f\n\u0011'\u0017\u0018\u001c\u0011!\u0017\u001f\u001f\u0016'S\u0019\u0017".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 's';
                    break;
                }
                case 0: {
                    c2 = '\u007f';
                    break;
                }
                case 1: {
                    c2 = 'D';
                    break;
                }
                case 2: {
                    c2 = '8';
                    break;
                }
                case 3: {
                    c2 = '|';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    j3(final ahh a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Log.i(j3.z);
        this.a.c.startActivity(new Intent((Context)this.a.c, (Class)Main.class));
        this.a.c.finish();
        RegisterName.a((x1)null);
        this.a.c.removeDialog(0);
        App.aq.aQ.a((Context)App.aq);
    }
}
