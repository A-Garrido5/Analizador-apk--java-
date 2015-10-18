// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.security.NoSuchAlgorithmException;
import android.backport.util.Base64;
import java.security.SecureRandom;
import com.whatsapp.util.Log;
import java.io.File;
import android.content.Context;
import com.whatsapp.util.br;
import com.whatsapp.protocol.bi;
import com.whatsapp.util.ay;

public class ad extends a9
{
    private static final String[] z;
    private boolean s;
    private int t;
    private ay u;
    
    static {
        final String[] z2 = new String[2];
        String s = "i\u0011H+#q\u0011U-ir\u001bE!'j\u000eM''{QN&4z\u001dN:\"v\u0010F;2p\u000eQ-\"?";
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
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = '\u001f';
                        break;
                    }
                    case 1: {
                        c2 = '~';
                        break;
                    }
                    case 2: {
                        c2 = '!';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
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
                    s = "L6`y\u0016M0f";
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
    
    public ad(final bi bi, final int n) {
        super(bi);
        this.t = 2048;
        if (n > 0) {
            this.t = n / 8;
        }
    }
    
    static ay a(final ad ad, final ay u) {
        return ad.u = u;
    }
    
    static boolean a(final ad ad) {
        return ad.s;
    }
    
    static ay b(final ad ad) {
        return ad.u;
    }
    
    @Override
    public void a(final t8 t8) {
        if (t8 == t8.SUCCESS) {
            final File a = br.a((Context)App.aq, this.b().file, (byte)2, 1, true);
            final MediaData b = this.b();
            b.file.renameTo(a);
            b.file = a;
        }
        super.a(t8);
    }
    
    public void b(final boolean b) {
        Log.i(ad.z[0] + b);
        this.s = true;
        Label_0070: {
            if (!b) {
                break Label_0070;
            }
            final MediaData b2 = this.b();
            try {
                this.e().L = b2.file.length();
                App.ak.c(this.e(), 1);
                if (App.I) {
                    this.i();
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    protected int d() {
        return this.t;
    }
    
    @Override
    protected long f() {
        return 65536L;
    }
    
    @Override
    protected String h() {
        try {
            final byte[] array = new byte[32];
            SecureRandom.getInstance(ad.z[1]).nextBytes(array);
            return Base64.encodeToString(array, 2);
        }
        catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    @Override
    protected _b k() {
        return new aar(this);
    }
    
    @Override
    public void onPostExecute(final Object o) {
        this.a((t8)o);
    }
}
