// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class gM extends gj
{
    private final gj[] b;
    
    public gM(final Map map) {
        Collection collection;
        if (map == null) {
            collection = null;
        }
        else {
            collection = map.get(bj.POSSIBLE_FORMATS);
        }
        final boolean b = map != null && map.get(bj.ASSUME_CODE_39_CHECK_DIGIT) != null;
        final ArrayList<gH> list = new ArrayList<gH>();
        if (collection != null) {
            if (collection.contains(d3.EAN_13) || collection.contains(d3.UPC_A) || collection.contains(d3.EAN_8) || collection.contains(d3.UPC_E)) {
                list.add(new gH(map));
            }
            if (collection.contains(d3.CODE_39)) {
                list.add((gH)new gV(b));
            }
            if (collection.contains(d3.CODE_93)) {
                list.add((gH)new gg());
            }
            if (collection.contains(d3.CODE_128)) {
                list.add((gH)new gU());
            }
            if (collection.contains(d3.ITF)) {
                list.add((gH)new g8());
            }
            if (collection.contains(d3.CODABAR)) {
                list.add((gH)new gu());
            }
            if (collection.contains(d3.RSS_14)) {
                list.add((gH)new g5());
            }
            if (collection.contains(d3.RSS_EXPANDED)) {
                list.add((gH)new gY());
            }
        }
        if (list.isEmpty()) {
            list.add(new gH(map));
            list.add((gH)new gV());
            list.add((gH)new gu());
            list.add((gH)new gg());
            list.add((gH)new gU());
            list.add((gH)new g8());
            list.add((gH)new g5());
            list.add((gH)new gY());
        }
        this.b = list.toArray(new gj[list.size()]);
    }
    
    @Override
    public aU a(final int n, final hN hn, final Map map) {
        final gj[] b = this.b;
        final int length = b.length;
        int i = 0;
        while (i < length) {
            final gj gj = b[i];
            try {
                return gj.a(n, hn, map);
            }
            catch (fN fn) {
                ++i;
                if (!com.google.gj.a) {
                    continue;
                }
            }
            break;
        }
        throw fv.a();
    }
    
    @Override
    public void a() {
        final boolean a = gj.a;
        final gj[] b = this.b;
        final int length = b.length;
        int i = 0;
        while (i < length) {
            b[i].a();
            ++i;
            if (a) {
                break;
            }
        }
    }
}
