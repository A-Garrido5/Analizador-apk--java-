// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.io.FilterInputStream;

final class x extends FilterInputStream
{
    private static final String[] z;
    private boolean a;
    private int b;
    
    static {
        final String[] z2 = new String[12];
        String s = "1:\fo\u001d\u00017\u001d7\u0019\u00165\u0007d\u000b\u0001&Ir\u0003\u0007;\r~\u0003\u0003t\fy\u000e\u000b!\u0007c\b\u00161\r-M";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = 'd';
                        break;
                    }
                    case 1: {
                        c2 = 'T';
                        break;
                    }
                    case 2: {
                        c2 = 'i';
                        break;
                    }
                    case 3: {
                        c2 = '\u0017';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0017 \u001br\f\tt\fy\t\u00010Ir\f\u00168\u00107\t\u0011&\u0000y\nD$\be\u001e\u0001t\u000f~\u0003\u00058It\u0005\u0011:\u0002";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0017 \u001br\f\tt\fy\t\u00010Ir\f\u00168\u00107\t\u0011&\u0000y\nD$\be\u001e\u0001t\u000f~\u0003\u00058It\u0005\u0011:\u0002";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0007;\u001be\u0018\u0014 Ig\u001e\u0001!\rxM\f \u001dgM\r:\u0019b\u0019D\u000f\u0004v\u0015D<\u001dc\u001dD<\fv\t\u0001&I{\b\n3\u001d\u007fM\u0001,\nr\b\u00001\rJ";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0007<\u001cy\u0006D8\fy\n\u0010<I";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "0&\by\u001e\u00021\u001b:(\n7\u0006s\u0004\n3";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "D2\b~\u0001\u00010Ic\u0002D$\be\u001e\u0001";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "1\u0000/:U";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "1\u0000/:U";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0007<\u001cy\u0006\u00010";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0007;\u001be\u0018\u0014 Ig\u001e\u0001!\rxM\f \u001dgM\r:\u0019b\u0019D\u000f\u0004v\u0015D7\u0001b\u0003\u000ft\u0001r\f\u00001\u001b7\u0001\u0001:\u000ec\u0005D1\u0011t\b\u00010\fs0";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\r:Iz\f\u001dt\u0007x\u0019D6\f7\u0003\u00118\u0005";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public x(final InputStream inputStream) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException(x.z[11]);
        }
    }
    
    @Override
    public int available() {
        return 0;
    }
    
    @Override
    public void mark(final int n) {
        synchronized (this) {
            throw new UnsupportedOperationException();
        }
    }
    
    @Override
    public boolean markSupported() {
        return false;
    }
    
    @Override
    public int read() {
        final boolean a = e.a;
        final ByteBuffer allocate = ByteBuffer.allocate(1024);
        final byte[] array = allocate.array();
        while (true) {
            final int read = super.read();
            if (read == -1) {
                break;
            }
            Label_0270: {
                try {
                    if (this.a) {
                        break Label_0270;
                    }
                    if (allocate.remaining() == 0) {
                        try {
                            throw new IOException(x.z[3]);
                        }
                        catch (NumberFormatException ex) {
                            throw ex;
                        }
                    }
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
                allocate.put((byte)read);
                if (allocate.position() < 2 || array[-1 + allocate.position()] != 10 || array[-2 + allocate.position()] != 13) {
                    continue;
                }
                Label_0261: {
                    String trim;
                    String trim2;
                    try {
                        if (allocate.position() == 2) {
                            this.a = true;
                            if (!a) {
                                break Label_0261;
                            }
                        }
                        final String[] split = new String(array, 0, -2 + allocate.position(), x.z[8]).split(":", 2);
                        if (split.length != 2) {
                            break Label_0261;
                        }
                        trim = split[0].trim();
                        trim2 = split[1].trim();
                        final String s = trim;
                        final String[] array2 = x.z;
                        final int n = 5;
                        final String s2 = array2[n];
                        final boolean b = s.equalsIgnoreCase(s2);
                        if (!b) {
                            break Label_0261;
                        }
                        final String s3 = trim2;
                        final String[] array3 = x.z;
                        final int n2 = 9;
                        final String s4 = array3[n2];
                        final boolean equalsIgnoreCase = s3.equalsIgnoreCase(s4);
                        final boolean equalsIgnoreCase2 = equalsIgnoreCase;
                        if (equalsIgnoreCase2) {
                            break Label_0261;
                        }
                        try {
                            final StringBuilder sb = new StringBuilder();
                            final String[] array4 = x.z;
                            final int n3 = 0;
                            final String s5 = array4[n3];
                            final StringBuilder sb2 = sb.append(s5);
                            final String s6 = trim2;
                            final StringBuilder sb3 = sb2.append(s6);
                            final String s7 = sb3.toString();
                            throw new IOException(s7);
                        }
                        catch (NumberFormatException ex4) {
                            throw ex4;
                        }
                    }
                    catch (NumberFormatException ex5) {
                        throw ex5;
                    }
                    try {
                        final String s = trim;
                        final String[] array2 = x.z;
                        final int n = 5;
                        final String s2 = array2[n];
                        final boolean b = s.equalsIgnoreCase(s2);
                        if (b) {
                            final String s3 = trim2;
                            final String[] array3 = x.z;
                            final int n2 = 9;
                            final String s4 = array3[n2];
                            final boolean equalsIgnoreCase2;
                            final boolean equalsIgnoreCase = equalsIgnoreCase2 = s3.equalsIgnoreCase(s4);
                            if (!equalsIgnoreCase2) {
                                final StringBuilder sb = new StringBuilder();
                                final String[] array4 = x.z;
                                final int n3 = 0;
                                final String s5 = array4[n3];
                                final StringBuilder sb2 = sb.append(s5);
                                final String s6 = trim2;
                                final StringBuilder sb3 = sb2.append(s6);
                                final String s7 = sb3.toString();
                                throw new IOException(s7);
                            }
                        }
                    }
                    catch (NumberFormatException ex6) {
                        throw ex6;
                    }
                }
                allocate.clear();
                if (!a) {
                    continue;
                }
                try {
                    if (this.b > 0) {
                        --this.b;
                        return read;
                    }
                }
                catch (NumberFormatException ex7) {
                    throw ex7;
                }
            }
            try {
                if (allocate.remaining() == 0) {
                    throw new IOException(x.z[10]);
                }
            }
            catch (NumberFormatException ex8) {
                throw ex8;
            }
            allocate.put((byte)read);
            if (allocate.position() < 2 || array[-1 + allocate.position()] != 10 || array[-2 + allocate.position()] != 13) {
                continue;
            }
            Label_0510: {
                if (allocate.position() > 2) {
                    final String s8 = new String(array, 0, -2 + allocate.position(), x.z[7]);
                    try {
                        this.b = Integer.parseInt(s8, 16);
                        if (this.b != 0) {
                            break Label_0510;
                        }
                        if (super.read() == -1) {
                            try {
                                throw new IOException(x.z[1]);
                            }
                            catch (NumberFormatException ex9) {
                                throw ex9;
                            }
                        }
                    }
                    catch (NumberFormatException ex11) {
                        throw new IOException(x.z[4] + s8 + x.z[6]);
                    }
                    if (super.read() == -1) {
                        try {
                            throw new IOException(x.z[2]);
                        }
                        catch (NumberFormatException ex10) {
                            throw ex10;
                        }
                    }
                    return -1;
                }
            }
            allocate.clear();
            if (a) {
                break;
            }
        }
        return -1;
    }
    
    @Override
    public int read(final byte[] array, final int n, int n2) {
        final boolean a = e.a;
        int i = 0;
        while (i < n2) {
            final int read = this.read();
            if (read == -1) {
                n2 = i;
                break;
            }
            array[n + i] = (byte)read;
            ++i;
            if (a) {
                return n2;
            }
        }
        return n2;
    }
    
    @Override
    public void reset() {
        synchronized (this) {
            throw new UnsupportedOperationException();
        }
    }
    
    @Override
    public long skip(long n) {
        final boolean a = e.a;
        long n2 = 0L;
        while (n2 < n) {
            if (this.read() == -1) {
                n = n2;
                break;
            }
            ++n2;
            if (a) {
                return n;
            }
        }
        return n;
    }
}
