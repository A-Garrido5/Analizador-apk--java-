// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.content.Intent;
import android.provider.Settings$SettingNotFoundException;
import android.provider.Settings$Secure;
import android.net.Uri;
import com.whatsapp.App;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class n implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final WallpaperPicker a;
    
    static {
        final String[] z2 = new String[5];
        String s = "3?gp>;5-k?&4mv\u007f32wk><\u007fUK\u0014\u0005";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Q';
                        break;
                    }
                    case 0: {
                        c2 = 'R';
                        break;
                    }
                    case 1: {
                        c2 = 'Q';
                        break;
                    }
                    case 2: {
                        c2 = '\u0003';
                        break;
                    }
                    case 3: {
                        c2 = '\u0002';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ";?pv0>=\\l><\u000enc#94w]0\"!p";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "3<ylk}~br!!~bl5 >jfn\"l`m<|&kc%!0sr\u007f%0on!3!fp";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ":%wr\"h~,u&%\u007ftj0&\"br!|2lo~3?gp>;5,U93%pC!\"\u0006bn=\"0sg#|0si";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "?0qi4&k,-57%bk=!njfl1>n,&:0wq0\"!-u0>=sc!7#";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    n(final WallpaperPicker a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Uri uri = null;
        if (App.aS == 2) {
            uri = Uri.parse(n.z[2]);
        }
        else if (App.aS == 0) {
            uri = Uri.parse(n.z[4]);
        }
        else {
            try {
                final int int1 = Settings$Secure.getInt(App.i, n.z[1]);
                uri = Uri.parse(n.z[3]);
                if (int1 != 1) {
                    this.a.removeDialog(1);
                    this.a.showDialog(2);
                    return;
                }
            }
            catch (Settings$SettingNotFoundException ex) {}
        }
        this.a.startActivity(new Intent(n.z[0], uri));
        this.a.removeDialog(1);
        this.a.finish();
    }
}
