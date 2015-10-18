// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;

public final class f1 extends fx
{
    private static final String[] z;
    private bB a;
    private final bl b;
    private ce c;
    
    static {
        final String[] z2 = new String[3];
        final char[] charArray = "\rRD\u0013@\u000f^R\u001cV\"KU\u0010Vk_N\u001aWkUN\u000b\u0004&ZU\u001cLkVD\fW*\\D_P2KDQ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '$';
                    break;
                }
                case 0: {
                    c2 = 'K';
                    break;
                }
                case 1: {
                    c2 = ';';
                    break;
                }
                case 2: {
                    c2 = '!';
                    break;
                }
                case 3: {
                    c2 = '\u007f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "%^V=Q\"WE\u001aV\rTS9M.WE_M8\u001bN\u0011H2\u001bW\u001eH\"_\u0001\u0019K9\u001bG\u0016A'_R_S\"OI_I.HR\u001eC.\u001bU\u0006T.\u0015".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '$';
                    break;
                }
                case 0: {
                    c4 = 'K';
                    break;
                }
                case 1: {
                    c4 = ';';
                    break;
                }
                case 2: {
                    c4 = '!';
                    break;
                }
                case 3: {
                    c4 = '\u007f';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "&^S\u0018A\rIN\u0012\f\u0006^R\fE,^\b_G*U\u0001\u0010J'B\u0001\u0012A9\\D_I.HR\u001eC.H\u0001\u0010BkOI\u001a\u00048ZL\u001a\u0004?BQ\u001a\n".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '$';
                    break;
                }
                case 0: {
                    c6 = 'K';
                    break;
                }
                case 1: {
                    c6 = ';';
                    break;
                }
                case 2: {
                    c6 = '!';
                    break;
                }
                case 3: {
                    c6 = '\u007f';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        z = z2;
    }
    
    private f1(final bl b) {
        this.b = b;
        this.a = bB.j();
        this.c = ce.d();
    }
    
    f1(final bl bl, final hs hs) {
        this(bl);
    }
    
    private void a(final hg hg) {
        try {
            if (hg.m() != this.b) {
                throw new IllegalArgumentException(f1.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private void e() {
        try {
            if (this.a.i()) {
                this.a = this.a.h();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public a8 a(final ce ce) {
        return this.b(ce);
    }
    
    @Override
    public a8 a(final hg hg) {
        return this.b(hg);
    }
    
    @Override
    public a8 a(final hg hg, final Object o) {
        return this.a(hg, o);
    }
    
    public d4 a() {
        return d4.b(this.b);
    }
    
    @Override
    public f1 a(final ce ce) {
        this.c = ce.b(this.c).a(ce).g();
        return this;
    }
    
    public f1 a(final fm fm) {
        if (fm instanceof d4) {
            final d4 d4 = (d4)fm;
            try {
                if (com.google.d4.c(d4) != this.b) {
                    throw new IllegalArgumentException(f1.z[2]);
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            this.e();
            this.a.a(com.google.d4.a(d4));
            this.a(com.google.d4.b(d4));
            return this;
        }
        return (f1)super.mergeFrom(fm);
    }
    
    @Override
    public f1 a(final hg hg, final Object o) {
        this.a(hg);
        this.e();
        this.a.a(hg, o);
        return this;
    }
    
    @Override
    public fx a(final ce ce) {
        return this.a(ce);
    }
    
    @Override
    public Object a(final hg hg) {
        this.a(hg);
        Object o = this.a.c(hg);
        if (o != null) {
            return o;
        }
        try {
            if (hg.n() == hD.MESSAGE) {
                o = d4.b(hg.f());
                if (!dt.b) {
                    return o;
                }
            }
            o = hg.l();
            return o;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public Map a() {
        return this.a.a();
    }
    
    @Override
    public a8 b(final hg hg, final Object o) {
        return this.b(hg, o);
    }
    
    public d4 b() {
        try {
            if (!this.isInitialized()) {
                throw fx.a(new d4(this.b, this.a, this.c, null));
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.c();
    }
    
    public f1 b(final ce c) {
        this.c = c;
        return this;
    }
    
    public f1 b(final hg hg) {
        try {
            this.a(hg);
            if (hg.n() != hD.MESSAGE) {
                throw new IllegalArgumentException(f1.z[1]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return new f1(hg.f());
    }
    
    @Override
    public f1 b(final hg hg, final Object o) {
        this.a(hg);
        this.e();
        this.a.c(hg, o);
        return this;
    }
    
    @Override
    public boolean b(final hg hg) {
        this.a(hg);
        return this.a.a(hg);
    }
    
    @Override
    public ci build() {
        return this.b();
    }
    
    @Override
    public fm build() {
        return this.b();
    }
    
    @Override
    public ci buildPartial() {
        return this.c();
    }
    
    @Override
    public fm buildPartial() {
        return this.c();
    }
    
    public d4 c() {
        this.a.b();
        return new d4(this.b, this.a, this.c, null);
    }
    
    @Override
    public fE clone() {
        return this.d();
    }
    
    @Override
    public fx clone() {
        return this.d();
    }
    
    @Override
    public Object clone() {
        return this.d();
    }
    
    public f1 d() {
        final f1 f1 = new f1(this.b);
        f1.a.a(this.a);
        f1.a(this.c);
        return f1;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.a();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.a();
    }
    
    @Override
    public bl getDescriptorForType() {
        return this.b;
    }
    
    @Override
    public ce getUnknownFields() {
        return this.c;
    }
    
    @Override
    public boolean isInitialized() {
        return d4.a(this.b, this.a);
    }
    
    @Override
    public a8 mergeFrom(final fm fm) {
        return this.a(fm);
    }
    
    @Override
    public fx mergeFrom(final fm fm) {
        return this.a(fm);
    }
}
