// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;

class a2 extends a0
{
    private static final String[] z;
    final GoogleDriveActivity a;
    private int b;
    
    static {
        final String[] z2 = new String[4];
        String s = "5tx\u007fB5r}iK";
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
                        c2 = '\'';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = '\u0001';
                        break;
                    }
                    case 2: {
                        c2 = '\u001b';
                        break;
                    }
                    case 3: {
                        c2 = '\u001c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "!eiuQ#,z\u007fS/wrh^knyoB4w~n\b+r|oS)s~1C)vupH'e6zN(hhtB\".";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = " `rpB\"";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "!eiuQ#,z\u007fS/wrh^knyoB4w~n\b+r|oS)s~1C)vupH'e6yU4ni3";
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
    
    a2(final GoogleDriveActivity a) {
        this.a = a;
        this.b = -1;
    }
    
    @Override
    public void a(@ct final int n) {
        Log.i(a2.z[3] + n);
        if (n == 10) {}
    }
    
    @Override
    public void b(final boolean b) {
        final StringBuilder append = new StringBuilder().append(a2.z[1]);
        String s;
        if (b) {
            s = a2.z[0];
        }
        else {
            s = a2.z[2];
        }
        Log.i(append.append(s).toString());
        this.a.runOnUiThread((Runnable)new ab(this, b));
    }
    
    @Override
    public void c() {
        this.a.runOnUiThread((Runnable)new bk(this));
    }
    
    @Override
    public void l(final long n, final long n2) {
        final int b = (int)(100L * n / n2);
        if (b - this.b > 0) {
            this.b = b;
            this.a.runOnUiThread((Runnable)new f(this, b, n, n2));
        }
    }
}
