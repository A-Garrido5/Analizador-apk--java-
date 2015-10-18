// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class xx implements View$OnClickListener
{
    private static final String z;
    final GroupChatInfo a;
    
    static {
        final char[] charArray = "\r\u000e_".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'e';
                    break;
                }
                case 0: {
                    c2 = 'g';
                    break;
                }
                case 1: {
                    c2 = 'g';
                    break;
                }
                case 2: {
                    c2 = ';';
                    break;
                }
                case 3: {
                    c2 = '<';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    xx(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent((Context)this.a, (Class)GroupChatRecentLocationsActivity.class);
        intent.putExtra(xx.z, GroupChatInfo.l(this.a));
        this.a.startActivity(intent);
    }
}
