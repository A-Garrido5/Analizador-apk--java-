// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;
import java.util.Iterator;
import java.util.List;

public abstract class dt extends di implements fm
{
    public static boolean b;
    private int c;
    
    public dt() {
        this.c = -1;
    }
    
    protected static int a(final fc fc) {
        return fc.getNumber();
    }
    
    protected static int a(final List list) {
        final boolean b = dt.b;
        final Iterator<fc> iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final int n2 = n * 31 + a(iterator.next());
            if (b) {
                return n2;
            }
            n = n2;
        }
        return n;
    }
    
    protected int a(int n, final Map map) {
        final boolean b = dt.b;
        for (final Map.Entry<hg, V> entry : map.entrySet()) {
            final hg hg = entry.getKey();
            final V value = entry.getValue();
            int n2 = n * 37 + hg.c();
            Label_0151: {
                if (hg.d() != bq.ENUM) {
                    n2 = n2 * 53 + value.hashCode();
                    if (!b) {
                        n = n2;
                        break Label_0151;
                    }
                }
                int n3 = n2;
                if (hg.b()) {
                    n3 = n3 * 53 + a((List)value);
                    if (!b) {
                        n = n3;
                        break Label_0151;
                    }
                }
                n = n3 * 53 + a((fc)value);
            }
            if (b) {
                break;
            }
        }
        return n;
    }
    
    @Override
    F a() {
        return fx.a(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (!(o instanceof fm)) {
                return false;
            }
            final fm fm = (fm)o;
            if (this.getDescriptorForType() != fm.getDescriptorForType()) {
                return false;
            }
            if (!this.a().equals(fm.a()) || !this.getUnknownFields().equals(fm.getUnknownFields())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int getSerializedSize() {
        final boolean b = dt.b;
        final int c = this.c;
        if (c != -1) {
            return c;
        }
        final boolean a = this.getDescriptorForType().e().a();
        final Iterator<Map.Entry<hg, V>> iterator = this.a().entrySet().iterator();
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                final Map.Entry<hg, V> entry = iterator.next();
                final hg hg = entry.getKey();
                final V value = entry.getValue();
                int n2 = 0;
                Label_0154: {
                    if (a && hg.e() && hg.d() == bq.MESSAGE && !hg.b()) {
                        n += ep.a(hg.c(), (ci)value);
                        if (!b) {
                            n2 = n;
                            break Label_0154;
                        }
                    }
                    n2 = n + bB.b(hg, value);
                }
                if (b) {
                    final ce unknownFields = this.getUnknownFields();
                    if (a) {
                        n2 += unknownFields.a();
                        if (!b) {
                            return this.c = n2;
                        }
                    }
                    n2 += unknownFields.getSerializedSize();
                    return this.c = n2;
                }
                n = n2;
            }
            int n2 = n;
            continue;
        }
    }
    
    @Override
    public int hashCode() {
        return 29 * this.a(779 + this.getDescriptorForType().hashCode(), this.a()) + this.getUnknownFields().hashCode();
    }
    
    @Override
    public boolean isInitialized() {
        final boolean b = dt.b;
        for (final hg hg : this.getDescriptorForType().f()) {
            if (hg.o() && !this.b(hg)) {
                return false;
            }
            if (b) {
                break;
            }
        }
        for (final Map.Entry<hg, V> entry : this.a().entrySet()) {
            final hg hg2 = entry.getKey();
            Label_0201: {
                if (hg2.n() == hD.MESSAGE) {
                    if (hg2.b()) {
                        final Iterator iterator3 = ((List)entry.getValue()).iterator();
                        while (iterator3.hasNext()) {
                            if (!iterator3.next().isInitialized()) {
                                return false;
                            }
                            if (b) {
                                break;
                            }
                        }
                        if (!b) {
                            break Label_0201;
                        }
                    }
                    if (!((fm)entry.getValue()).isInitialized()) {
                        return false;
                    }
                }
            }
            if (b) {
                break;
            }
        }
        return true;
    }
    
    @Override
    public final String toString() {
        return com.google.a.a(this);
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean b = dt.b;
        final boolean a = this.getDescriptorForType().e().a();
        for (final Map.Entry<hg, V> entry : this.a().entrySet()) {
            final hg hg = entry.getKey();
            final V value = entry.getValue();
            Label_0131: {
                if (a && hg.e() && hg.d() == bq.MESSAGE && !hg.b()) {
                    ep.d(hg.c(), (ci)value);
                    if (!b) {
                        break Label_0131;
                    }
                }
                bB.a(hg, value, ep);
            }
            if (b) {
                break;
            }
        }
        final ce unknownFields = this.getUnknownFields();
        if (a) {
            unknownFields.a(ep);
            if (!b) {
                return;
            }
        }
        unknownFields.writeTo(ep);
    }
}
