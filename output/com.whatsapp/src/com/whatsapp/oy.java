// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.Serializable;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class oy implements View$OnClickListener
{
    private static final String z;
    final GroupChatInfo a;
    
    static {
        final char[] charArray = "u7R".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'o';
                    break;
                }
                case 0: {
                    c2 = '\u001f';
                    break;
                }
                case 1: {
                    c2 = '^';
                    break;
                }
                case 2: {
                    c2 = '6';
                    break;
                }
                case 3: {
                    c2 = '\u0001';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    oy(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Serializable s;
        if (App.ax()) {
            s = GroupChatLiveLocationsActivity2.class;
        }
        else if (App.aM()) {
            s = GroupChatLiveLocationsActivity.class;
        }
        else {
            final boolean q = App.q();
            s = null;
            if (q) {
                s = GroupChatLiveLocationsActivity.class;
            }
        }
        if (s != null) {
            final Intent intent = new Intent((Context)this.a, (Class)s);
            intent.putExtra(oy.z, GroupChatInfo.l(this.a));
            this.a.startActivity(intent);
        }
    }
}
