// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;
import java.io.InputStream;

public abstract class hT implements du
{
    private static final fu a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "k?Qf\u0015W=\u0010d\u000eV7\u0010c\\[#Dg\\X(Bc\u0005\u0019.Xp\u0019NzQl\\p\u0015uz\u001f\\*Dk\u0013Wz\u0018q\u0014V/\\f\\W?Fg\u000e\u00192Qr\f\\4\u0019,".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '|';
                    break;
                }
                case 0: {
                    c2 = '9';
                    break;
                }
                case 1: {
                    c2 = 'Z';
                    break;
                }
                case 2: {
                    c2 = '0';
                    break;
                }
                case 3: {
                    c2 = '\u0002';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "k?Qf\u0015W=\u0010d\u000eV7\u0010c\\{#Dg/M(Yl\u001b\u0019.Xp\u0019NzQl\\p\u0015uz\u001f\\*Dk\u0013Wz\u0018q\u0014V/\\f\\W?Fg\u000e\u00192Qr\f\\4\u0019,".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '|';
                    break;
                }
                case 0: {
                    c4 = '9';
                    break;
                }
                case 1: {
                    c4 = 'Z';
                    break;
                }
                case 2: {
                    c4 = '0';
                    break;
                }
                case 3: {
                    c4 = '\u0002';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
        a = fu.b();
    }
    
    private ci a(final ci ci) {
        if (ci != null) {
            try {
                if (!ci.isInitialized()) {
                    throw this.b(ci).b().a(ci);
                }
            }
            catch (F f) {
                throw f;
            }
        }
        return ci;
    }
    
    private F b(final ci ci) {
        try {
            if (ci instanceof di) {
                return ((di)ci).a();
            }
        }
        catch (F f) {
            throw f;
        }
        return new F(ci);
    }
    
    @Override
    public ci a(final cL cl) {
        return this.a(cl, hT.a);
    }
    
    @Override
    public ci a(final cL cl, final fu fu) {
        return this.a((ci)this.parsePartialFrom(cl, fu));
    }
    
    @Override
    public ci a(final hv hv) {
        return this.a(hv, hT.a);
    }
    
    @Override
    public ci a(final hv hv, final fu fu) {
        return this.a(this.b(hv, fu));
    }
    
    @Override
    public ci a(final InputStream inputStream) {
        return this.b(inputStream, hT.a);
    }
    
    @Override
    public ci a(final InputStream inputStream, final fu fu) {
        final cL a = cL.a(inputStream);
        final ci ci = (ci)this.parsePartialFrom(a, fu);
        try {
            a.g(0);
            return ci;
        }
        catch (bg bg) {
            throw bg.a(ci);
        }
    }
    
    @Override
    public ci a(final byte[] array) {
        return this.a(array, hT.a);
    }
    
    public ci a(final byte[] array, final int n, final int n2, final fu fu) {
        return this.a(this.b(array, n, n2, fu));
    }
    
    @Override
    public ci a(final byte[] array, final fu fu) {
        return this.a(array, 0, array.length, fu);
    }
    
    @Override
    public Object a(final cL cl) {
        return this.a(cl);
    }
    
    @Override
    public Object a(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
    
    @Override
    public Object a(final hv hv) {
        return this.a(hv);
    }
    
    @Override
    public Object a(final hv hv, final fu fu) {
        return this.a(hv, fu);
    }
    
    @Override
    public Object a(final InputStream inputStream) {
        return this.a(inputStream);
    }
    
    @Override
    public Object a(final InputStream inputStream, final fu fu) {
        return this.c(inputStream, fu);
    }
    
    @Override
    public Object a(final byte[] array) {
        return this.a(array);
    }
    
    @Override
    public Object a(final byte[] array, final fu fu) {
        return this.a(array, fu);
    }
    
    @Override
    public ci b(final hv hv, final fu fu) {
        try {
            final cL g = hv.g();
            final ci ci = (ci)this.parsePartialFrom(g, fu);
            try {
                g.g(0);
                return ci;
            }
            catch (bg bg) {
                throw bg.a(ci);
            }
        }
        catch (bg bg2) {
            throw bg2;
        }
        catch (IOException ex) {
            throw new RuntimeException(hT.z[1], ex);
        }
    }
    
    @Override
    public ci b(final InputStream inputStream) {
        return this.c(inputStream, hT.a);
    }
    
    @Override
    public ci b(final InputStream inputStream, final fu fu) {
        return this.a(this.a(inputStream, fu));
    }
    
    public ci b(final byte[] array, final int n, final int n2, final fu fu) {
        try {
            final cL a = cL.a(array, n, n2);
            final ci ci = (ci)this.parsePartialFrom(a, fu);
            try {
                a.g(0);
                return ci;
            }
            catch (bg bg) {
                throw bg.a(ci);
            }
        }
        catch (bg bg2) {
            throw bg2;
        }
        catch (IOException ex) {
            throw new RuntimeException(hT.z[0], ex);
        }
    }
    
    @Override
    public Object b(final hv hv, final fu fu) {
        return this.b(hv, fu);
    }
    
    @Override
    public Object b(final InputStream inputStream) {
        return this.b(inputStream);
    }
    
    @Override
    public Object b(final InputStream inputStream, final fu fu) {
        return this.b(inputStream, fu);
    }
    
    public ci c(final InputStream inputStream, final fu fu) {
        return this.a(this.d(inputStream, fu));
    }
    
    public ci d(final InputStream inputStream, final fu fu) {
        try {
            final int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return this.a((InputStream)new eT(inputStream, cL.a(read, inputStream)), fu);
        }
        catch (IOException ex) {
            throw new bg(ex.getMessage());
        }
    }
}
