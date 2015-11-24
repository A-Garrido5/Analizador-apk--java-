// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class c5 implements hV
{
    private hV[] a;
    private Map b;
    
    private aU b(final c1 c1) {
        if (this.a != null) {
            final hV[] a = this.a;
            final int length = a.length;
            int i = 0;
            while (i < length) {
                final hV hv = a[i];
                try {
                    return hv.a(c1, this.b);
                }
                catch (fN fn) {
                    ++i;
                    if (cs.c == 0) {
                        continue;
                    }
                }
                break;
            }
        }
        throw fv.a();
    }
    
    public aU a(final c1 c1) {
        if (this.a == null) {
            this.a((Map)null);
        }
        return this.b(c1);
    }
    
    @Override
    public aU a(final c1 c1, final Map map) {
        this.a(map);
        return this.b(c1);
    }
    
    @Override
    public void a() {
        final int c = cs.c;
        if (this.a != null) {
            final hV[] a = this.a;
            final int length = a.length;
            int i = 0;
            while (i < length) {
                a[i].a();
                ++i;
                if (c != 0) {
                    break;
                }
            }
        }
    }
    
    public void a(final Map b) {
        final int c = cs.c;
        this.b = b;
        boolean b2;
        if (b != null && b.containsKey(bj.TRY_HARDER)) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        Collection collection;
        if (b == null) {
            collection = null;
        }
        else {
            collection = b.get(bj.POSSIBLE_FORMATS);
        }
        final ArrayList<gM> list = new ArrayList<gM>();
        if (collection != null) {
            boolean b3 = false;
            Label_0201: {
                if (!collection.contains(d3.UPC_A) && !collection.contains(d3.UPC_E) && !collection.contains(d3.EAN_13) && !collection.contains(d3.EAN_8) && !collection.contains(d3.CODABAR) && !collection.contains(d3.CODE_39) && !collection.contains(d3.CODE_93) && !collection.contains(d3.CODE_128) && !collection.contains(d3.ITF) && !collection.contains(d3.RSS_14)) {
                    final boolean contains = collection.contains(d3.RSS_EXPANDED);
                    b3 = false;
                    if (!contains) {
                        break Label_0201;
                    }
                }
                b3 = true;
            }
            if (b3 && !b2) {
                list.add(new gM(b));
            }
            if (collection.contains(d3.QR_CODE)) {
                list.add((gM)new x());
            }
            if (collection.contains(d3.DATA_MATRIX)) {
                list.add((gM)new cx());
            }
            if (collection.contains(d3.AZTEC)) {
                list.add((gM)new bv());
            }
            if (collection.contains(d3.PDF_417)) {
                list.add((gM)new ga());
            }
            if (collection.contains(d3.MAXICODE)) {
                list.add((gM)new eO());
            }
            if (b3 && b2) {
                list.add(new gM(b));
            }
        }
        if (list.isEmpty()) {
            if (!b2) {
                list.add(new gM(b));
            }
            list.add((gM)new x());
            list.add((gM)new cx());
            list.add((gM)new bv());
            list.add((gM)new ga());
            list.add((gM)new eO());
            if (b2) {
                list.add(new gM(b));
            }
        }
        this.a = list.toArray(new hV[list.size()]);
        if (fN.a != 0) {
            cs.c = c + 1;
        }
    }
}
