// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.content.ActivityNotFoundException;
import com.whatsapp.App;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class aj implements View$OnClickListener
{
    private static final String[] z;
    final String a;
    final PopupNotification b;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u001bSMNz\\\b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = 's';
                        break;
                    }
                    case 1: {
                        c2 = '\'';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u0012I]L/\u001aC\u0017W.\u0007BWJn\u0012DMW/\u001d\tow\u0005$";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    aj(final PopupNotification b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        Uri uri = Uri.parse(this.a);
        if (uri.getScheme() == null) {
            uri = Uri.parse(aj.z[0] + this.a);
        }
        final Intent intent = new Intent(aj.z[1], uri);
        try {
            this.b.startActivity(intent);
        }
        catch (ActivityNotFoundException ex) {
            App.a(App.aq.getApplicationContext(), 2131230786, 0);
        }
    }
}
