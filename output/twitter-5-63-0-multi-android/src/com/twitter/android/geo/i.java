// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo;

import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import com.twitter.util.q;
import java.util.Iterator;
import com.twitter.library.api.geo.TwitterPlace;
import java.util.List;

public class i
{
    private final PlacePickerModel a;
    private final PlacePickerModel$PlaceListSource b;
    private final String c;
    
    public i(final PlacePickerModel placePickerModel, final PlacePickerModel$PlaceListSource placePickerModel$PlaceListSource) {
        this(placePickerModel, placePickerModel$PlaceListSource, null);
    }
    
    public i(final PlacePickerModel a, final PlacePickerModel$PlaceListSource b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static i a(final i i, final String s) {
        return new i(i.a, i.b, s);
    }
    
    private List a(final List list) {
        if (this.a.b().c()) {
            final int index = list.indexOf(this.a.b().e());
            if (index >= 0) {
                list.add(0, list.remove(index));
            }
        }
        return list;
    }
    
    private List a(List subList, final int n) {
        if (subList.size() > n) {
            subList = subList.subList(0, n);
        }
        return subList;
    }
    
    private List a(final List list, final String s) {
        final Iterator<TwitterPlace> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!a(s, iterator.next().fullName)) {
                iterator.remove();
            }
        }
        return list;
    }
    
    private static boolean a(final String s, final String s2) {
        return s2 != null && q.c(s2).toLowerCase().contains(q.c(s).toLowerCase());
    }
    
    private List b(final List list) {
        if (this.a.b().c()) {
            final TwitterPlace e = this.a.b().e();
            if (!list.contains(e)) {
                list.add(0, e);
            }
        }
        return list;
    }
    
    public List a() {
        final f a = this.a.a(this.b);
        if (a == null) {
            return Collections.emptyList();
        }
        List list = new ArrayList(a.c());
        int n = 0;
        switch (j.a[this.b.ordinal()]) {
            default: {
                throw new IllegalStateException("Illegal source: " + this.b);
            }
            case 1: {
                n = 25;
                list = this.b(list);
                break;
            }
            case 2: {
                n = 30;
                break;
            }
        }
        final String c = this.c;
        if (!TextUtils.isEmpty((CharSequence)c)) {
            list = this.a(list, c);
        }
        return this.a(this.a(list), n);
    }
    
    public PlacePickerModel$PlaceListSource b() {
        return this.b;
    }
}
