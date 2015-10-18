// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.protocol.c6;

class wx implements Runnable
{
    private static final String[] z;
    final long a;
    final ie b;
    final int c;
    final int d;
    final c6 e;
    
    static {
        final String[] z2 = new String[5];
        String s = "\fiU.GDaPzWIvB?V\fvQ=M_pF;PEkZzMH$";
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
                        c2 = '$';
                        break;
                    }
                    case 0: {
                        c2 = ',';
                        break;
                    }
                    case 1: {
                        c2 = '\u0004';
                        break;
                    }
                    case 2: {
                        c2 = '4';
                        break;
                    }
                    case 3: {
                        c2 = 'Z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\fmZzVInQ9PI`\u0014(AXvM";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "M|[6KXh\u00147E^oQ>\u0004_kY?\u0004\\vQ1AUw\u0014*VIr]5Q_hMzWIj@zE_$A4WIj@`\u0004";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "M|[6KXh\u00146KOeXzVIc])P^e@3KB$]>\u0004";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "M|[6KXh\u0014<KYjPzJC$D(AGaM)\u0004MrU3HMfX?\u0004Xk\u0014)AB`\u0014.K\fp\\?\u0004_aF,A^";
                    n2 = 4;
                    array = z2;
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
    
    wx(final ie b, final int c, final c6 e, final long a, final int d) {
        this.b = b;
        this.c = c;
        this.e = e;
        this.a = a;
        this.d = d;
    }
    
    @Override
    public void run() {
        final int b = ie.a(this.b).a2.b();
        if (b == this.d) {
            Log.i(wx.z[3] + b + wx.z[0] + this.d + wx.z[1]);
            ie.a(this.b).a5().post((Runnable)new at7(this, ie.a(this.b).a2.a(), b, ie.a(this.b).a2.e(), ie.a(this.b).a2.g().b(), false));
            return;
        }
        Log.i(wx.z[2] + ie.a(this.b).a2.f());
        if (!ie.a(this.b).a2.i()) {
            Log.i(wx.z[4]);
            ie.a(this.b).a2.c();
        }
        ie.a(this.b).a5().post((Runnable)new at7(this, ie.a(this.b).a2.a(), b, ie.a(this.b).a2.e(), ie.a(this.b).a2.g().b(), true));
    }
}
