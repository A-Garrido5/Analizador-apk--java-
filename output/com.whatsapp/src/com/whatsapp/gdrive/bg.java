// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

class bg implements Runnable
{
    private static final String[] z;
    final b8 a;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0019~m\u0017";
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
                        c2 = '\u0011';
                        break;
                    }
                    case 0: {
                        c2 = 'm';
                        break;
                    }
                    case 1: {
                        c2 = '\u0007';
                        break;
                    }
                    case 2: {
                        c2 = '\u001d';
                        break;
                    }
                    case 3: {
                        c2 = 'r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0018tx\u0000N\u0004it\u0006x\fsx\u0016";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001ebi\u0006x\u0003`n_v\tut\u0004tBwx\u0000w\u0002up_s\fdv\u0007aMrn\u0017cMcx\u0011x\tbyRe\u0002'm\u0017c\u000bho\u001f1*hr\u0015}\b'Y\u0000x\u001bb=\u0010p\u000elh\u00021\u0002qx\u00001\u000ebq\u001ed\u0001foR9\u001aox\u001c1\u0019oxRb\bsi\u001b\u007f\nt=\u0001p\u0014'J\u001b<+n=\u001d\u007f\u0001~4";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\fdi\u001b~\u0003X\u007f\u0013r\u0006rm";
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
    
    bg(final b8 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.i(bg.z[2]);
        final Intent intent = new Intent((Context)this.a.a, (Class)GoogleDriveService.class);
        intent.setAction(bg.z[3]);
        intent.putExtra(bg.z[0], bg.z[1]);
        this.a.a.startService(intent);
        this.a.a.bindService(new Intent((Context)this.a.a, (Class)GoogleDriveService.class), SettingsGoogleDrive.h(this.a.a), 0);
    }
}
