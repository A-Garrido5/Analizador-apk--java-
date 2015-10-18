// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class r_ implements View$OnClickListener
{
    private static final String z;
    final GroupChatInfo a;
    
    static {
        final char[] charArray = "'f\n".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '7';
                    break;
                }
                case 0: {
                    c2 = 'M';
                    break;
                }
                case 1: {
                    c2 = '\u000f';
                    break;
                }
                case 2: {
                    c2 = 'n';
                    break;
                }
                case 3: {
                    c2 = 'j';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    r_(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent((Context)this.a, (Class)GroupChatRecentLocationsActivity.class);
        intent.putExtra(r_.z, GroupChatInfo.l(this.a));
        this.a.startActivity(intent);
    }
}
