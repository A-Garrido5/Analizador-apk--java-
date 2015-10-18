// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.os.Message;
import java.io.IOException;
import com.whatsapp.util.Log;
import android.content.Context;
import android.os.Handler$Callback;

final class ad implements Handler$Callback
{
    private static final String z;
    
    static {
        final char[] charArray = "3\\\u0002`$`G\u0016`w&D\u0016g?`M\u0011f82".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'W';
                    break;
                }
                case 0: {
                    c2 = '@';
                    break;
                }
                case 1: {
                    c2 = '(';
                    break;
                }
                case 2: {
                    c2 = 'c';
                    break;
                }
                case 3: {
                    c2 = '\u0014';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private void a(final Context context) {
        if (a5.a() == null) {
            return;
        }
        while (true) {
            try {
                a5.a().flush();
                a5.e(context);
            }
            catch (IOException ex) {
                Log.b(ad.z, ex);
                continue;
            }
            break;
        }
    }
    
    public boolean handleMessage(final Message message) {
        switch (message.what) {
            default: {
                return false;
            }
            case 0: {
                this.a((Context)message.obj);
                a5.n((Context)message.obj);
                return true;
            }
            case 1: {
                this.a((Context)message.obj);
                return true;
            }
        }
    }
}
