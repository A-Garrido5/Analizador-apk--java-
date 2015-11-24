// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.whatsapp.util.co;

class a0a extends co
{
    private static final String[] z;
    final String b;
    final ConversationRowLocation c;
    
    static {
        final String[] z2 = new String[2];
        String s = "*k\u0013$sm0";
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
                        c2 = 'I';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = '\u001f';
                        break;
                    }
                    case 2: {
                        c2 = 'g';
                        break;
                    }
                    case 3: {
                        c2 = 'T';
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
                    s = "#q\u0003&&+{I='6z\t g#|\u0013=&,11\u001d\f\u0015";
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
    
    a0a(final ConversationRowLocation c, final String b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        Uri uri = Uri.parse(this.b);
        if (uri.getScheme() == null) {
            uri = Uri.parse(a0a.z[0] + this.b);
        }
        final Intent intent = new Intent(a0a.z[1], uri);
        try {
            this.c.getContext().startActivity(intent);
        }
        catch (ActivityNotFoundException ex) {
            App.a(App.aq.getApplicationContext(), 2131230786, 0);
        }
    }
}
