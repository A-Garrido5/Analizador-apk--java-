// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

public class ResetPhoto extends Activity
{
    private static final String z;
    
    static {
        final char[] charArray = "[\u00059J\u000bA\u0013\u0012".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'n';
                    break;
                }
                case 0: {
                    c2 = '2';
                    break;
                }
                case 1: {
                    c2 = 'v';
                    break;
                }
                case 2: {
                    c2 = 'f';
                    break;
                }
                case 3: {
                    c2 = '8';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = new Intent();
        intent.putExtra(ResetPhoto.z, true);
        this.setResult(-1, intent);
        this.finish();
    }
}
