// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.InputStream;

public class a2p extends InputStream
{
    private static final String[] z;
    final int a;
    final InputStream b;
    
    static {
        final String[] z2 = new String[2];
        String s = "\b 07\u001cZ&\">\u0004\u001f!c;\u0006Z\b&!\u001b\u001b\"&\u001b\u0006\n07\u0001\u001c\b \"?";
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
                        c2 = 'h';
                        break;
                    }
                    case 0: {
                        c2 = 'z';
                        break;
                    }
                    case 1: {
                        c2 = 'E';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = 'R';
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
                    s = "\u0017$19H\u0019$/>\r\u001ee*<H7 0!\t\u001d \n<\u0018\u000f1\u0010&\u001a\u001f$.";
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
    
    public a2p(final InputStream b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void mark(final int n) {
        Log.w(a2p.z[1]);
    }
    
    @Override
    public boolean markSupported() {
        return false;
    }
    
    @Override
    public int read() {
        final int read = this.b.read();
        if (read != -1) {
            atd.b(1L, this.a);
        }
        return read;
    }
    
    @Override
    public int read(final byte[] array) {
        final int read = this.b.read(array);
        if (read > 0) {
            atd.b(read, this.a);
        }
        return read;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        final int read = this.b.read(array, n, n2);
        if (read > 0) {
            atd.b(read, this.a);
        }
        return read;
    }
    
    @Override
    public void reset() {
        synchronized (this) {
            Log.w(a2p.z[0]);
        }
    }
    
    @Override
    public long skip(final long n) {
        final long skip = this.b.skip(n);
        atd.b(skip, this.a);
        return skip;
    }
}
