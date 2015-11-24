// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import java.util.Locale;
import android.view.View;
import android.view.View$OnClickListener;

class jd implements View$OnClickListener
{
    private static final String[] z;
    final int a;
    final SpamWarningActivity b;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0019k\u000eW[Dm\u0007\u0016";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '>';
                        break;
                    }
                    case 0: {
                        c2 = '6';
                        break;
                    }
                    case 1: {
                        c2 = '\f';
                        break;
                    }
                    case 2: {
                        c2 = 'k';
                        break;
                    }
                    case 3: {
                        c2 = '9';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Wb\u000fKQ_hEPPBi\u0005M\u0010Wo\u001fPQX\"=p{a";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "^x\u001fIM\f#DNIA\"\u001cQ_B\u007f\nIN\u0018o\u0004T\u0011Pm\u001a\u0016";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    jd(final SpamWarningActivity b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        final Locale default1 = Locale.getDefault();
        final String language = default1.getLanguage();
        final String country = default1.getCountry();
        String string = null;
        Label_0079: {
            if (language.equals("")) {
                string = "";
                if (!i) {
                    break Label_0079;
                }
            }
            if (!country.equals("") || i) {
                string = language + "_" + country;
            }
            else {
                string = language;
            }
        }
        this.b.startActivity(new Intent(jd.z[1], Uri.parse(jd.z[2] + string + jd.z[0] + this.a)));
    }
}
