// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.File;
import com.whatsapp.util.Log;
import android.os.PowerManager$WakeLock;

class a01 implements Runnable
{
    private static final String[] z;
    final PowerManager$WakeLock a;
    final AlarmService b;
    
    static {
        final String[] z2 = new String[2];
        String s = "Cu1";
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
                        c2 = '%';
                        break;
                    }
                    case 0: {
                        c2 = 'c';
                        break;
                    }
                    case 1: {
                        c2 = 'X';
                        break;
                    }
                    case 2: {
                        c2 = '\u0011';
                        break;
                    }
                    case 3: {
                        c2 = 'C';
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
                    s = "\u00004t\"K\u0016(N0M\u0002*t'\n";
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
    
    a01(final AlarmService b, final PowerManager$WakeLock a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        int i = 0;
        final boolean j = App.I;
        try {
            AlarmService.a(this.b);
            final File[] listFiles = qf.b().listFiles();
            if (listFiles != null) {
                while (i < listFiles.length) {
                    final File file = listFiles[i];
                    Log.i(a01.z[1] + file.getName() + ":" + System.currentTimeMillis() + a01.z[0] + file.lastModified());
                    if (System.currentTimeMillis() - file.lastModified() > 86400000L) {
                        file.delete();
                    }
                    ++i;
                    if (j) {
                        break;
                    }
                }
            }
        }
        finally {
            this.a.release();
        }
    }
}
