// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.util.br;
import android.os.IBinder;
import android.content.Intent;
import android.os.Environment;
import android.content.Context;
import com.whatsapp.util.Log;
import android.app.Service;

public class ExternalMediaManager extends Service
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "kJv|\u000b`SnF\u0014kVkxV{\\co\u0018g^c{\u0015k\u0012";
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
                        c2 = 'y';
                        break;
                    }
                    case 0: {
                        c2 = '\u000e';
                        break;
                    }
                    case 1: {
                        c2 = '2';
                        break;
                    }
                    case 2: {
                        c2 = '\u0002';
                        break;
                    }
                    case 3: {
                        c2 = '\u0019';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "kJv|\u000b`SnF\u0014kVkxVoDcp\u0015oPn|";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "kJv|\u000b`SnF\u0014kVkxV|Wc}Ta\\n`";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "c]ww\rkV]k\u0016";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "c]ww\rkV";
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
    
    private void a() {
        synchronized (this) {
            if (App.G || App.o) {
                App.G = false;
                App.o = false;
                Log.i(ExternalMediaManager.z[1]);
                App.b((Context)this);
            }
        }
    }
    
    private void b() {
        synchronized (this) {
            if (App.G || !App.o) {
                App.G = false;
                App.o = true;
                Log.i(ExternalMediaManager.z[2]);
                App.b((Context)this);
            }
        }
    }
    
    private void c() {
        synchronized (this) {
            if (!App.G) {
                App.G = true;
                App.o = true;
                Log.i(ExternalMediaManager.z[0] + Environment.getExternalStorageState());
            }
        }
    }
    
    public IBinder onBind(final Intent intent) {
        return null;
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        final boolean i = App.I;
        final String externalStorageState = Environment.getExternalStorageState();
        Label_0064: {
            if (externalStorageState.equals(ExternalMediaManager.z[4])) {
                this.a();
                br.a();
                if (!i) {
                    break Label_0064;
                }
            }
            if (externalStorageState.equals(ExternalMediaManager.z[3])) {
                this.b();
                br.a();
                if (!i) {
                    break Label_0064;
                }
            }
            this.c();
        }
        GoogleDriveService.g(externalStorageState);
        return 2;
    }
}
