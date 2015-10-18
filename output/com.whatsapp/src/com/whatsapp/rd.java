// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.os.Message;
import android.os.Handler;

class rd extends Handler
{
    private static final String[] z;
    final DeleteAccount a;
    
    static {
        final String[] z2 = new String[4];
        String s = "rF*t's\u000e'r0yV(e|uK#r8;M3|1sQi|2b@.";
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
                        c2 = 'S';
                        break;
                    }
                    case 0: {
                        c2 = '\u0016';
                        break;
                    }
                    case 1: {
                        c2 = '#';
                        break;
                    }
                    case 2: {
                        c2 = 'F';
                        break;
                    }
                    case 3: {
                        c2 = '\u0011';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "rF*t's\u000e'r0yV(e|uK#r8;M3|1sQi|:eN'e0~";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "rF*t's\u000e'r0yV(e|bJ+t<cW";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "rF*t's\u000e'r0yV(e|sQ4~!";
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
    
    rd(final DeleteAccount a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final boolean i = App.I;
        Label_0168: {
            switch (message.what) {
                case 1: {
                    Log.w(rd.z[0]);
                    DeleteAccount.a(this.a).removeMessages(4);
                    this.a.removeDialog(1);
                    this.a.startActivity(new Intent((Context)this.a, (Class)DeleteAccountConfirmation.class));
                    this.a.finish();
                    if (i) {
                        break Label_0168;
                    }
                    break;
                }
                case 2: {
                    Log.w(rd.z[1]);
                    DeleteAccount.a(this.a).removeMessages(4);
                    this.a.removeDialog(1);
                    this.a.a(2131231002);
                    if (i) {
                        break Label_0168;
                    }
                    break;
                }
                case 3: {
                    Log.e(rd.z[3]);
                    this.a.removeDialog(1);
                    this.a.showDialog(109);
                    if (i) {
                        break Label_0168;
                    }
                    break;
                }
                case 4: {
                    Log.e(rd.z[2]);
                    DeleteAccount.a(this.a).removeMessages(4);
                    this.a.removeDialog(1);
                    this.a.showDialog(109);
                }
            }
        }
    }
}
