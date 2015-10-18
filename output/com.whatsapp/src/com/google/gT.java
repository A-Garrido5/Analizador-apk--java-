// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gT extends fp implements bA
{
    private b8 e;
    private List f;
    private int g;
    
    private gT() {
        this.f = Collections.emptyList();
        this.a();
    }
    
    private gT(final dg dg) {
        super(dg);
        this.f = Collections.emptyList();
        this.a();
    }
    
    gT(final dg dg, final fM fm) {
        this(dg);
    }
    
    private void a() {
        if (dS.d) {
            this.i();
        }
    }
    
    private void f() {
        if ((0x1 & this.g) != 0x1) {
            this.f = new ArrayList(this.f);
            this.g |= 0x1;
        }
    }
    
    static gT g() {
        return k();
    }
    
    private b8 i() {
        boolean b = true;
        if (this.e == null) {
            final List f = this.f;
            if ((0x1 & this.g) != (b ? 1 : 0)) {
                b = false;
            }
            this.e = new b8(f, b, this.a(), this.f());
            this.f = null;
        }
        return this.e;
    }
    
    private static gT k() {
        return new gT();
    }
    
    public dO a(final int n) {
        if (this.e == null) {
            return this.f.get(n);
        }
        return (dO)this.e.a(n);
    }
    
    public gT a(final cL cl, final fu fu) {
        while (true) {
            try {
                dl dl3;
                Throwable t;
                try {
                    final dl dl = (dl)com.google.dl.h.parsePartialFrom(cl, fu);
                    if (dl == null) {
                        return this;
                    }
                    try {
                        this.a(dl);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final dl dl2 = (dl)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        dl3 = dl2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (dl3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(dl3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final dl dl3 = null;
                continue;
            }
            break;
        }
    }
    
    public gT a(final dl dl) {
        final boolean b = dt.b;
        if (dl == dl.b()) {
            return this;
        }
        Label_0187: {
            if (this.e == null) {
                if (dl.b(dl).isEmpty()) {
                    break Label_0187;
                }
                Label_0085: {
                    if (this.f.isEmpty()) {
                        this.f = dl.b(dl);
                        this.g &= 0xFFFFFFFE;
                        if (!b) {
                            break Label_0085;
                        }
                    }
                    this.f();
                    this.f.addAll(dl.b(dl));
                }
                this.c();
                if (!b) {
                    break Label_0187;
                }
            }
            if (!dl.b(dl).isEmpty()) {
                if (this.e.d()) {
                    this.e.f();
                    this.e = null;
                    this.f = dl.b(dl);
                    this.g &= 0xFFFFFFFE;
                    final boolean d = dS.d;
                    b8 i = null;
                    if (d) {
                        i = this.i();
                    }
                    this.e = i;
                    if (!b) {
                        break Label_0187;
                    }
                }
                this.e.a(dl.b(dl));
            }
        }
        this.b(dl.getUnknownFields());
        return this;
    }
    
    public gT a(final fm fm) {
        if (fm instanceof dl) {
            return this.a((dl)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public int b() {
        if (this.e == null) {
            return this.f.size();
        }
        return this.e.a();
    }
    
    @Override
    public ci build() {
        return this.d();
    }
    
    @Override
    public fm build() {
        return this.d();
    }
    
    @Override
    public ci buildPartial() {
        return this.j();
    }
    
    @Override
    public fm buildPartial() {
        return this.j();
    }
    
    public dl c() {
        return dl.b();
    }
    
    @Override
    public fp clear() {
        return this.l();
    }
    
    @Override
    public fE clone() {
        return this.h();
    }
    
    @Override
    public fp clone() {
        return this.h();
    }
    
    @Override
    public fx clone() {
        return this.h();
    }
    
    @Override
    public Object clone() {
        return this.h();
    }
    
    public dl d() {
        final dl j = this.j();
        if (!j.isInitialized()) {
            throw fx.a(j);
        }
        return j;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.c();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.c();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.w();
    }
    
    public gT h() {
        return k().a(this.j());
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.l().a(dl.class, gT.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.b()) {
            if (!this.a(i).isInitialized()) {
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        return true;
    }
    
    public dl j() {
        final dl dl = new dl(this, null);
        final int g = this.g;
        Label_0081: {
            if (this.e == null) {
                if ((0x1 & this.g) == 0x1) {
                    this.f = Collections.unmodifiableList((List<?>)this.f);
                    this.g &= 0xFFFFFFFE;
                }
                com.google.dl.a(dl, this.f);
                if (!dt.b) {
                    break Label_0081;
                }
            }
            com.google.dl.a(dl, this.e.b());
        }
        this.b();
        return dl;
    }
    
    public gT l() {
        super.clear();
        if (this.e == null) {
            this.f = Collections.emptyList();
            this.g &= 0xFFFFFFFE;
            if (!dt.b) {
                return this;
            }
        }
        this.e.c();
        return this;
    }
    
    @Override
    public a8 mergeFrom(final fm fm) {
        return this.a(fm);
    }
    
    @Override
    public aJ mergeFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
    
    @Override
    public fE mergeFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
    
    @Override
    public fx mergeFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
    
    @Override
    public fx mergeFrom(final fm fm) {
        return this.a(fm);
    }
}
