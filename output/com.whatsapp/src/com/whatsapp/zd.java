// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Context;
import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.contact.f;

class zd implements Runnable
{
    private static final String[] z;
    final a_9 a;
    final wc b;
    
    static {
        final String[] z2 = new String[3];
        String s = "5M,Wx5V\u001dNx8C%FkyW2Gx\"G\u001dKv:F-Vm\tA-Mm7A6|m>P'B}yQ;Mz\tC.Q|7F;||8F'G";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0019';
                        break;
                    }
                    case 0: {
                        c2 = 'V';
                        break;
                    }
                    case 1: {
                        c2 = '\"';
                        break;
                    }
                    case 2: {
                        c2 = 'B';
                        break;
                    }
                    case 3: {
                        c2 = '#';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "5M,Wx5V\u001dNx8C%FkyW2Gx\"G\u001dKv:F-Vm\tA-Mm7A6|m>P'B}yQ;Mz\tC.Q|7F;||8F'G";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "5M,Wx5V\u001dNx8C%FkyW2Gx\"G\u001dKv:F-Vm\tA-Mm7A6|m>P'B}yQ;Mz\tC.Q|7F;||8F'G";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    zd(final wc b, final a_9 a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        try {
            f.a(this.a);
            PerformSyncManager.a((Context)App.aq, this.a);
            App.av.sendEmptyMessage(1);
            if (!f.d()) {
                Log.w(zd.z[0]);
            }
        }
        catch (Exception ex) {
            Log.b(ex);
            if (!f.d()) {
                Log.w(zd.z[2]);
            }
        }
        finally {
            try {
                if (!f.d()) {
                    Log.w(zd.z[1]);
                }
            }
            catch (Exception ex2) {
                throw ex2;
            }
        }
    }
}
