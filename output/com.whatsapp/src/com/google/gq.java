// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.util.Map;

public abstract class gq extends fp implements hJ
{
    private static final String[] z;
    private bB e;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "1\u0003p\u0002\u001c\f\u00189\u0002I\u0015\u001bv\u0002Y\u0001Km\u001e\u001c\u0007\u000e9\u001eJ\u0000\u0019k\u0018X\u0001\u000ewQ^\u001cKj\u0004^\u0006\u0007x\u0002O\u0000\u00187".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '<';
                    break;
                }
                case 0: {
                    c2 = 'e';
                    break;
                }
                case 1: {
                    c2 = 'k';
                    break;
                }
                case 2: {
                    c2 = '\u0019';
                    break;
                }
                case 3: {
                    c2 = 'q';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "#\u0002|\u001dX!\u000ej\u0012N\f\u001bm\u001eNE\u000fv\u0014OE\u0005v\u0005\u001c\b\nm\u0012TE\u0006|\u0002O\u0004\f|QH\u001c\u001b|_".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '<';
                    break;
                }
                case 0: {
                    c4 = 'e';
                    break;
                }
                case 1: {
                    c4 = 'k';
                    break;
                }
                case 2: {
                    c4 = '\u0019';
                    break;
                }
                case 3: {
                    c4 = 'q';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    protected gq() {
        this.e = bB.d();
    }
    
    protected gq(final dg dg) {
        super(dg);
        this.e = bB.d();
    }
    
    static bB a(final gq gq) {
        return gq.d();
    }
    
    private void a() {
        try {
            if (this.e.i()) {
                this.e = this.e.h();
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
    }
    
    private void a(final hg hg) {
        try {
            if (hg.m() != this.getDescriptorForType()) {
                throw new IllegalArgumentException(gq.z[1]);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
    }
    
    private bB d() {
        this.e.b();
        return this.e;
    }
    
    @Override
    public a8 a(final hg hg, final Object o) {
        return this.b(hg, o);
    }
    
    @Override
    public fp a(final hg hg, final Object o) {
        return this.a(hg, o);
    }
    
    @Override
    public gq a(final hg hg, final Object o) {
        try {
            if (hg.e()) {
                this.a(hg);
                this.a();
                this.e.c(hg, o);
                this.c();
                return this;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return (gq)super.a(hg, o);
    }
    
    @Override
    public Object a(final hg hg) {
        if (!hg.e()) {
            return super.a(hg);
        }
        this.a(hg);
        Object o = this.e.c(hg);
        if (o == null) {
            try {
                if (hg.n() == hD.MESSAGE) {
                    o = d4.b(hg.f());
                    return o;
                }
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
            return hg.l();
        }
        return o;
    }
    
    @Override
    public Map a() {
        final Map a = fp.a(this);
        a.putAll(this.e.a());
        return Collections.unmodifiableMap((Map<?, ?>)a);
    }
    
    protected final void a(final df df) {
        this.a();
        this.e.a(df.a(df));
        this.c();
    }
    
    @Override
    public a8 b(final hg hg, final Object o) {
        return this.a(hg, o);
    }
    
    @Override
    public fp b(final hg hg, final Object o) {
        return this.b(hg, o);
    }
    
    public gq b() {
        this.e = bB.d();
        return (gq)super.clear();
    }
    
    @Override
    public gq b(final hg hg, final Object o) {
        try {
            if (hg.e()) {
                this.a(hg);
                this.a();
                this.e.a(hg, o);
                this.c();
                return this;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return (gq)super.b(hg, o);
    }
    
    @Override
    public boolean b(final hg hg) {
        try {
            if (hg.e()) {
                this.a(hg);
                return this.e.a(hg);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return super.b(hg);
    }
    
    public gq c() {
        throw new UnsupportedOperationException(gq.z[0]);
    }
    
    @Override
    public fp clear() {
        return this.b();
    }
    
    @Override
    public fE clone() {
        return this.c();
    }
    
    @Override
    public fp clone() {
        return this.c();
    }
    
    @Override
    public fx clone() {
        return this.c();
    }
    
    @Override
    public Object clone() {
        return this.c();
    }
    
    protected boolean e() {
        return this.e.e();
    }
    
    @Override
    public boolean isInitialized() {
        try {
            if (!super.isInitialized()) {
                return false;
            }
            final gq gq = this;
            final boolean b = gq.e();
            if (b) {
                return true;
            }
            return false;
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        try {
            final gq gq = this;
            final boolean b = gq.e();
            if (b) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex2) {
            throw ex2;
        }
        return false;
    }
}
