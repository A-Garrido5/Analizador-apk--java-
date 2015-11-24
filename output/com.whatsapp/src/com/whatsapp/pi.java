// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.gdrive.cs;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import com.whatsapp.gdrive.bw;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

class pi implements ServiceConnection
{
    private static final String[] z;
    final ConversationsFragment a;
    
    static {
        final String[] z2 = new String[2];
        String s = "N\u0014<\u0011\b_\b3\u0013\u0004B\u0015!H\nI\t;\u0011\b\u0000\b7\u0015\u001bD\u00187J\u000eB\u0015<\u0002\u000eY\u001e6";
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
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = '-';
                        break;
                    }
                    case 1: {
                        c2 = '{';
                        break;
                    }
                    case 2: {
                        c2 = 'R';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
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
                    s = "N\u0014<\u0011\b_\b3\u0013\u0004B\u0015!H\nI\t;\u0011\b\u0000\b7\u0015\u001bD\u00187J\tD\b1\b\u0003C\u001e1\u0013\bI";
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
    
    pi(final ConversationsFragment a) {
        this.a = a;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        ConversationsFragment.a(this.a, ((bw)binder).a());
        ConversationsFragment.a(this.a, new ig(this.a, null));
        bm.a(new as3(this));
        Log.i(pi.z[0]);
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        ConversationsFragment.p(this.a).b(ConversationsFragment.c(this.a));
        ConversationsFragment.a(this.a, (GoogleDriveService)null);
        Log.i(pi.z[1]);
    }
}
