// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.util.Log;
import android.content.ServiceConnection;
import android.os.ConditionVariable;

class mk implements Runnable
{
    private static final String[] z;
    final ConditionVariable a;
    final a6o b;
    final ServiceConnection c;
    
    static {
        final String[] z2 = new String[6];
        String s = "Bq\u0015l-Dw\u0001o(Dk[q?Bz\u0011q9\u000e~\u0010p#W|Yq>@k\u0000/)Ix\u001ae/\fw\u0001o(Dk";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'J';
                        break;
                    }
                    case 0: {
                        c2 = '!';
                        break;
                    }
                    case 1: {
                        c2 = '\u0019';
                        break;
                    }
                    case 2: {
                        c2 = 't';
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
                    s = "O|\u0003]:Iv\u001ag\u0015Ol\u0019`/S";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Bq\u0015l-Dw\u0001o(Dk[q?Bz\u0011q9\u000ez\u0015l)DuYr/O}\u001dl-\f~\u0010p#W|Y`+Br\u0001rg@w\u0010/8Dj\u0000m8D4\u001ddg@w\r";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Nu\u0010]:Iv\u001ag\u0015Ol\u0019`/S";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "Bq\u0015l-Dw\u0001o(Dk[q?Bz\u0011q9\u000en\u0015k>Hw\u0013/,NkYe.Sp\u0002ggR|\u0006t#B|Ym(K|\u0017v";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "@z\u0000k%OF\u0017j+O~\u0011]$Tt\u0016g8";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    mk(final a6o b, final ConditionVariable a, final ServiceConnection c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        Log.i(mk.z[4]);
        this.a.block();
        Log.i(mk.z[2]);
        ChangeNumber.j().ad();
        Log.i(mk.z[0]);
        final Intent intent = new Intent((Context)App.aq, (Class)GoogleDriveService.class);
        intent.setAction(mk.z[5]);
        intent.putExtra(mk.z[3], ChangeNumber.c());
        intent.putExtra(mk.z[1], App.aX.jabber_id);
        App.aq.startService(intent);
        App.aq.unbindService(this.c);
    }
}
