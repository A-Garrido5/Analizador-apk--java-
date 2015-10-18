// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class co implements View$OnClickListener
{
    private static final String z;
    final VoipNotAllowedActivity a;
    final String b;
    
    static {
        final char[] charArray = "\n\u001d\u000f\r\u001e\u0002\u0017E\u0016\u001f\u001f\u0016\u0005\u000b_\n\u0010\u001f\u0016\u001e\u0005]=64<".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'q';
                    break;
                }
                case 0: {
                    c2 = 'k';
                    break;
                }
                case 1: {
                    c2 = 's';
                    break;
                }
                case 2: {
                    c2 = 'k';
                    break;
                }
                case 3: {
                    c2 = '\u007f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    co(final VoipNotAllowedActivity a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        this.a.finish();
        this.a.startActivity(new Intent(co.z, Uri.parse(this.b)));
    }
}
