// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.bm;
import java.io.File;
import android.os.Message;
import android.os.Handler;

class z6 extends Handler
{
    private static final String[] z;
    final oa a;
    
    static {
        final String[] z2 = new String[2];
        String s = "`k\u0007Q";
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
                        c2 = 'O';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = '\n';
                        break;
                    }
                    case 2: {
                        c2 = 'f';
                        break;
                    }
                    case 3: {
                        c2 = '2';
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
                    s = "`;";
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
    
    private z6(final oa a) {
        this.a = a;
    }
    
    z6(final oa oa, final yi yi) {
        this(oa);
    }
    
    public void handleMessage(final Message message) {
        if (oa.a(this.a) != null) {
            final File file = new File(oa.c(this.a) + z6.z[1] + z6.z[0]);
            if (file.length() > 0L) {
                bm.a(new jw(this, file));
                if (od.b == 0) {
                    return;
                }
            }
            this.sendEmptyMessageDelayed(0, 50L);
        }
    }
}
