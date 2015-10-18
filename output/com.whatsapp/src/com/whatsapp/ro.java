// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.protocol.cr;

class ro implements Runnable
{
    private static final String[] z;
    final cr a;
    final _o b;
    
    static {
        final String[] z2 = new String[2];
        String s = "-p\u000f\u0016\u000f8d@\u001b\u0010<m\u000e\u001e\t\"o@\u001b\u0004(a\u0014\u0013\u000f\"i\fZ\u0010>m\u000b\u001f\u0019?";
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
                        c2 = '`';
                        break;
                    }
                    case 0: {
                        c2 = 'L';
                        break;
                    }
                    case 1: {
                        c2 = '\b';
                        break;
                    }
                    case 2: {
                        c2 = '`';
                        break;
                    }
                    case 3: {
                        c2 = 'z';
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
                    s = "-p\u000f\u0016\u000f8d@\u0012\u0001((\u000e\u0015@9f\u0013\u001f\u000e8(\u0010\b\u0005'm\u0019\t[lo\u0005\u0014\u0005>i\u0014\u0013\u000e+(\u0013\u0015\r)(\u000e\u001f\u0017lg\u000e\u001f\u0013";
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
    
    ro(final _o b, final cr a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.i(ro.z[0]);
        if (!_o.b(this.b).a2.i()) {
            Log.i(ro.z[1]);
            _o.b(this.b).a2.c();
        }
        _o.b(this.b).a5().post((Runnable)new aa9(this, _o.b(this.b).a2.b(), _o.b(this.b).a2.a(), _o.b(this.b).a2.e(), _o.b(this.b).a2.g().b()));
    }
}
