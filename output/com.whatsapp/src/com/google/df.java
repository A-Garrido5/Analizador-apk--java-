// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.util.Map;

public abstract class df extends dS implements hJ
{
    private static final String[] z;
    private final bB e;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = "m'a6Mo+w9[B>p5[\u000b*k?Z\u000b k.\tF/p9A\u000b#a)ZJ)az]R>at".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ')';
                    break;
                }
                case 0: {
                    c2 = '+';
                    break;
                }
                case 1: {
                    c2 = 'N';
                    break;
                }
                case 2: {
                    c2 = '\u0004';
                    break;
                }
                case 3: {
                    c2 = 'Z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "n6p?GX'k4\tB=$<FYnp#YNn&".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = ')';
                    break;
                }
                case 0: {
                    c4 = '+';
                    break;
                }
                case 1: {
                    c4 = 'N';
                    break;
                }
                case 2: {
                    c4 = '\u0004';
                    break;
                }
                case 3: {
                    c4 = 'Z';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\t`".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = ')';
                    break;
                }
                case 0: {
                    c6 = '+';
                    break;
                }
                case 1: {
                    c6 = 'N';
                    break;
                }
                case 2: {
                    c6 = '\u0004';
                    break;
                }
                case 3: {
                    c6 = 'Z';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\tns2@H&$>FN=$4F_ni;]H&$7LX=e=L\u000b:}*L\u000bl".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = ')';
                    break;
                }
                case 0: {
                    c8 = '+';
                    break;
                }
                case 1: {
                    c8 = 'N';
                    break;
                }
                case 2: {
                    c8 = '\u0004';
                    break;
                }
                case 3: {
                    c8 = 'Z';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        z = z2;
    }
    
    protected df() {
        this.e = bB.j();
    }
    
    protected df(final gq gq) {
        super(gq);
        this.e = gq.a(gq);
    }
    
    static bB a(final df df) {
        return df.e;
    }
    
    private void a(final hg hg) {
        try {
            if (hg.m() != this.getDescriptorForType()) {
                throw new IllegalArgumentException(df.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private void c(final o o) {
        try {
            if (o.a().m() != this.getDescriptorForType()) {
                throw new IllegalArgumentException(df.z[1] + o.a().m().a() + df.z[3] + this.getDescriptorForType().a() + df.z[2]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    protected int a() {
        return this.e.c();
    }
    
    @Override
    public int a(final hg hg) {
        try {
            if (hg.e()) {
                this.a(hg);
                return this.e.b(hg);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return super.a(hg);
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
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            return hg.l();
        }
        return o;
    }
    
    @Override
    public Object a(final hg hg, final int n) {
        try {
            if (hg.e()) {
                this.a(hg);
                return this.e.a(hg, n);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return super.a(hg, n);
    }
    
    public final Object a(final o o, final int n) {
        this.c(o);
        return o.a(o, this.e.a(o.a(), n));
    }
    
    @Override
    public Map a() {
        final Map a = dS.a(this);
        a.putAll(this.f());
        return Collections.unmodifiableMap((Map<?, ?>)a);
    }
    
    @Override
    protected boolean a(final cL cl, final aY ay, final fu fu, final int n) {
        return fx.a(cl, ay, fu, this.getDescriptorForType(), null, this.e, n);
    }
    
    public final boolean a(final o o) {
        this.c(o);
        return this.e.a(o.a());
    }
    
    protected ar b() {
        return new ar(this, false, null);
    }
    
    public final Object b(final o o) {
        this.c(o);
        final hg a = o.a();
        final Object c = this.e.c(a);
        if (c == null) {
            try {
                if (a.b()) {
                    return Collections.emptyList();
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                if (a.n() == hD.MESSAGE) {
                    return o.b();
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
            return o.b(o, a.l());
        }
        return o.b(o, c);
    }
    
    @Override
    public boolean b(final hg hg) {
        try {
            if (hg.e()) {
                this.a(hg);
                return this.e.a(hg);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return super.b(hg);
    }
    
    @Override
    protected int c() {
        return this.e.f();
    }
    
    @Override
    protected void c() {
        this.e.b();
    }
    
    public final int d(final o o) {
        this.c(o);
        return this.e.b(o.a());
    }
    
    protected ar d() {
        return new ar(this, true, null);
    }
    
    protected boolean e() {
        return this.e.e();
    }
    
    protected Map f() {
        return this.e.a();
    }
    
    @Override
    public boolean isInitialized() {
        try {
            if (!super.isInitialized()) {
                return false;
            }
            final df df = this;
            final boolean b = df.e();
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final df df = this;
            final boolean b = df.e();
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
}
