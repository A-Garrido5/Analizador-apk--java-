// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;

public class cd extends ByteArrayOutputStream
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "P~\u001a\".W";
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
                        c2 = 'K';
                        break;
                    }
                    case 0: {
                        c2 = '3';
                        break;
                    }
                    case 1: {
                        c2 = '\u0012';
                        break;
                    }
                    case 2: {
                        c2 = 'u';
                        break;
                    }
                    case 3: {
                        c2 = 'Q';
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
                    s = "P~\u001a\".W";
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
    
    public int a(final InputStream inputStream, final int n) {
        if (this.buf.length - this.count < n) {
            System.arraycopy(this.buf, 0, this.buf = new byte[n + this.count], 0, this.count);
        }
        final int read = inputStream.read(this.buf, this.count, n);
        this.count += Math.max(read, 0);
        return read;
    }
    
    public byte[] a() {
        final byte[] buf = this.buf;
        if (buf == null) {
            throw new IOException(cd.z[0]);
        }
        return buf;
    }
    
    public int b() {
        final int count = this.count;
        if (count < 0 || this.buf == null) {
            throw new IOException(cd.z[1]);
        }
        return count;
    }
}
