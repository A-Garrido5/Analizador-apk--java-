// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.view.View;
import android.widget.TextView;
import android.view.View$OnClickListener;

class aw implements View$OnClickListener
{
    private static final String z;
    final String a;
    final TextView b;
    final GoogleDriveNewUserSetupActivity c;
    
    static {
        final char[] charArray = "\f14+)\u000ex('(F 5'-F&#6*\u001bz%0:\n!#m*\u00050>2:\b!#&r\t4%)*\u001bx 0:\u001a #,<\u0012z".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '_';
                    break;
                }
                case 0: {
                    c2 = 'k';
                    break;
                }
                case 1: {
                    c2 = 'U';
                    break;
                }
                case 2: {
                    c2 = 'F';
                    break;
                }
                case 3: {
                    c2 = 'B';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aw(final GoogleDriveNewUserSetupActivity c, final String a, final TextView b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        final int f = GoogleDriveService.F;
        final int ae = GoogleDriveService.ae();
        final String a = this.a;
        int n = 0;
        Label_0131: {
            if (!this.c.getString(2131232103).equals(a) || f != 0) {
                if (this.c.getString(2131232107).equals(a)) {
                    n = 2;
                    if (f == 0) {
                        break Label_0131;
                    }
                }
                if (this.c.getString(2131232105).equals(a)) {
                    n = 3;
                    if (f == 0) {
                        break Label_0131;
                    }
                }
                if (!this.c.getString(2131232106).equals(a) || f != 0) {
                    Log.e(aw.z + a);
                    n = 0;
                }
                else {
                    n = 0;
                }
            }
            else {
                n = 1;
            }
        }
        Label_0162: {
            if (n == 0) {
                GoogleDriveNewUserSetupActivity.c(this.c).setEnabled(false);
                if (f == 0) {
                    break Label_0162;
                }
            }
            GoogleDriveNewUserSetupActivity.c(this.c).setEnabled(true);
        }
        if (ae == 0 && n != 0) {
            GoogleDriveNewUserSetupActivity.c(this.c).performClick();
        }
        GoogleDriveService.c(n);
        GoogleDriveNewUserSetupActivity.a(this.c);
        GoogleDriveNewUserSetupActivity.a(this.c, this.b);
        GoogleDriveNewUserSetupActivity.b(this.c).setEnabled(true);
    }
}
