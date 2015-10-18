// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.ContentObserver;
import android.provider.ContactsContract$Contacts;
import com.whatsapp.util.Log;

class dp implements Runnable
{
    private static final String z;
    final m7 a;
    
    static {
        final char[] charArray = "$,y\fK=+xI[*-aIV%".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '9';
                    break;
                }
                case 0: {
                    c2 = 'K';
                    break;
                }
                case 1: {
                    c2 = 'N';
                    break;
                }
                case 2: {
                    c2 = '\n';
                    break;
                }
                case 3: {
                    c2 = 'i';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    dp(final m7 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.i(dp.z);
        App.aq.getContentResolver().registerContentObserver(ContactsContract$Contacts.CONTENT_URI, true, (ContentObserver)this.a);
    }
}
