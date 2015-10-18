// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.Context;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.o;
import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class av implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final af a;
    
    static {
        final String[] z2 = new String[4];
        String s = ">\u001cKIntP";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001b';
                        break;
                    }
                    case 0: {
                        c2 = '\u0011';
                        break;
                    }
                    case 1: {
                        c2 = 'j';
                        break;
                    }
                    case 2: {
                        c2 = '*';
                        break;
                    }
                    case 3: {
                        c2 = '%';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "b\u000f^Qr\u007f\rY\b|u\u0018CS~>\tBDuv\u000f\u0007Cit\u001b\u0005Put\u0012Z@xe\u000fN\bxy\u0005CF~>";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "b\u000f^Qr\u007f\rY\b|u\u0018CS~>\tBDuv\u000f\u0007Cit\u001b\nCzx\u0006OA;e\u0005\nV~eJ^M~1\u0004OR;w\u0018OTnt\u0004I\\5";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "b\u000f^Qr\u007f\rY\b|u\u0018CS~>\tBDuv\u000f\u0007Cit\u001b\u0005Luu\u000fR\u001f";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    av(final af a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final String[] stringArray = this.a.a.getResources().getStringArray(2131689482);
        if (n > stringArray.length) {
            Log.e(av.z[1] + n);
            dialogInterface.dismiss();
            return;
        }
        Log.i(av.z[3] + n + av.z[0] + stringArray[n]);
        final int ae = GoogleDriveService.ae();
        final int int1 = Integer.parseInt(stringArray[n]);
        if (!GoogleDriveService.c(int1)) {
            Log.e(av.z[2]);
            return;
        }
        SettingsGoogleDrive.p(this.a.a).setText((CharSequence)SettingsGoogleDrive.f(this.a.a)[n]);
        Label_0281: {
            if (int1 == 0) {
                SettingsGoogleDrive.b(this.a.a).setEnabled(false);
                SettingsGoogleDrive.i(this.a.a).setEnabled(false);
                a5.a((Context)this.a.a, o.BACKUP_SCHEDULE, (Double)null);
                if (GoogleDriveService.F == 0) {
                    break Label_0281;
                }
            }
            SettingsGoogleDrive.b(this.a.a).setEnabled(true);
            SettingsGoogleDrive.i(this.a.a).setEnabled(true);
            a5.a((Context)this.a.a, o.BACKUP_SCHEDULE, Integer.valueOf(int1));
            if (ae == 0 && !GoogleDriveService.P() && !GoogleDriveService.ac()) {
                SettingsGoogleDrive.b(this.a.a).performClick();
            }
        }
        dialogInterface.dismiss();
    }
}
