// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class oq implements View$OnClickListener
{
    private static final String z;
    final GroupChatInfo a;
    
    static {
        final char[] charArray = "2Po".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'z';
                    break;
                }
                case 0: {
                    c2 = 'X';
                    break;
                }
                case 1: {
                    c2 = '9';
                    break;
                }
                case 2: {
                    c2 = '\u000b';
                    break;
                }
                case 3: {
                    c2 = '$';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    oq(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (App.aM()) {
            final Intent intent = new Intent((Context)this.a, (Class)GroupChatRecentLocationsActivity.class);
            intent.putExtra(oq.z, GroupChatInfo.l(this.a));
            this.a.startActivity(intent);
            if (!App.I) {
                return;
            }
        }
        App.a((Context)this.a, 2131231148, 0);
    }
}
