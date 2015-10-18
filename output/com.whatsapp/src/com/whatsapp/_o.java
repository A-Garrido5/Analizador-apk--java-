// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.b2;
import com.whatsapp.util.Log;
import org.whispersystems.m;
import com.whatsapp.protocol.cr;
import com.whatsapp.messaging.b6;

final class _o implements b6
{
    private static final String[] z;
    private final App a;
    
    static {
        final String[] z2 = new String[16];
        String s = "fQ\u000b4isED(tb\t\u000f=\u007f'Z\u0011;ebZ\u0017>skE\u001dxub]";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0432:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = '\u0007';
                        break;
                    }
                    case 1: {
                        c2 = ')';
                        break;
                    }
                    case 2: {
                        c2 = 'd';
                        break;
                    }
                    case 3: {
                        c2 = 'X';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "fQ\u000b4isED(tb\t\u000f=\u007f'M\r?ct]D+cu_\u0001*&b[\u00167t";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "'O\u00051jbMD/osAD=tuF\u0016xehM\u0001x";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "fQ\u000b4isED(tb\t\u000f=\u007f'[\u0001)sbZ\u0010x`h[D";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = ".\u0012D/okED,t~\t\u0005?gnGD7h'G\u0001 r'Q\t(v'J\u000b6hbJ\u0010";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = ".\u0012D*c`L\n=tf]\r6a'B\u0001!u";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "fQ\u000b4isED>gnE\u0001<&sFD+cs\t\u0014*c'B\u0001!&/L\u0016*iuj\u000b<c:";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    s = "GZJ/nf]\u00179vw\u0007\n=r";
                    n2 = 7;
                    array = z2;
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    array = z2;
                    s = "fQ\u000b4isED,tnL\u0000xrh\t\u0017=r'\\\n9edL\u0014,geE\u0001xvuLD3c~ZDpcu[\u000b*EhM\u0001e";
                    n = 7;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "fQ\u000b4isED(tb\t\u000f=\u007f'[\u0001)sbZ\u0010x`h[D";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "'^\u0005+&iF\n=";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "fQ\u000b4isED(tb\t\u000f=\u007f'M\r?ct]D6iiL";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "fQ\u000b4isED(tb\t\u000f=\u007f'M\r?ct]";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "fQ\u000b4isED(tb\t\u000f=\u007f'[\u0001)sbZ\u0010x`h[D";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "'^\u0005+&t\\\u0007;ctZ\u0002-j<\t\r6os@\u0005,oiND9~hE\u000b,j'Z\u0001+unF\n";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "fQ\u000b4isED(tb\t\u000f=\u007f'J\u000b-hs\t\u0016-hi@\n?&kF\u0013b&";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    break Label_0432;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public _o(final App a) {
        this.a = a;
    }
    
    static void a(final _o o) {
        o.d();
    }
    
    private void a(final cr cr) {
        ha.a.execute(new ro(this, cr));
    }
    
    static int[] a(final _o o, final byte[][] array) {
        return o.a(array);
    }
    
    private int[] a(final byte[][] array) {
        final boolean i = App.I;
        final int[] array2 = new int[array.length];
        int j = 0;
        while (j < array.length) {
            array2[j] = m.a(array[j], 0);
            ++j;
            if (i) {
                break;
            }
        }
        return array2;
    }
    
    static App b(final _o o) {
        return o.a;
    }
    
    private void d() {
        this.a.a2.f();
        this.a.al();
    }
    
    @Override
    public void a() {
        Log.i(_o.z[0]);
        ha.a.execute(new fm(this));
    }
    
    @Override
    public void a(final int n) {
        if (n == 406) {
            Log.e(_o.z[8] + n + _o.z[5]);
            ha.a.execute(new p8(this));
            if (!App.I) {
                return;
            }
        }
        Log.e(_o.z[6] + n + _o.z[4]);
        this.a.ap.remove(App.au() + _o.z[7]);
    }
    
    @Override
    public void a(final cr cr, final int n) {
        Log.i(_o.z[15] + n);
        this.a(cr);
    }
    
    @Override
    public void a(final String s) {
        Log.i(_o.z[9] + s + _o.z[10]);
        ha.a.execute(new uc(this, s));
    }
    
    @Override
    public void a(final String s, final int n) {
        Log.i(_o.z[3] + s + _o.z[2] + n);
        this.a.ap.remove(s);
    }
    
    @Override
    public void a(final String s, final byte[] array, final byte[] array2, final byte b, final b2 b2, final b2 b3) {
        Log.i(_o.z[13] + s + _o.z[14]);
        ha.a.execute(new a0q(this, s, array, b, b2, b3, array2));
    }
    
    @Override
    public void a(final byte[] array, final byte b, final byte[] array2, final byte[][] array3, final byte[] array4) {
        Log.i(_o.z[12]);
        ha.a.execute(new ta(this, b, array, array2, array3, array4));
    }
    
    @Override
    public void b() {
        Log.i(_o.z[1]);
    }
    
    @Override
    public void c() {
        Log.i(_o.z[11]);
        ha.a.execute(new a8f(this));
    }
}
