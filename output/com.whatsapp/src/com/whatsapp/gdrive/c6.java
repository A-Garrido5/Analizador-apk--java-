// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

class c6 implements ServiceConnection
{
    private static final String[] z;
    final SettingsGoogleDrive a;
    
    static {
        final String[] z2 = new String[2];
        String s = "A>=3C\\<:jMV) 1O\u001d(,5\\[8,jN[(*(D\\>*3OV";
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
                        c2 = '*';
                        break;
                    }
                    case 0: {
                        c2 = '2';
                        break;
                    }
                    case 1: {
                        c2 = '[';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
                        break;
                    }
                    case 3: {
                        c2 = 'G';
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
                    s = "A>=3C\\<:jMV) 1O\u001d(,5\\[8,jI]5'\"IF>-";
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
    
    c6(final SettingsGoogleDrive a) {
        this.a = a;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        SettingsGoogleDrive.a(this.a, ((bw)binder).a());
        if (!GoogleDriveService.P() && !GoogleDriveService.ac()) {
            SettingsGoogleDrive.u(this.a).N().g();
        }
        bm.a(new c9(this));
        Log.i(c6.z[1]);
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        SettingsGoogleDrive.a(this.a, (GoogleDriveService)null);
        Log.i(c6.z[0]);
    }
}
