// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public final class ea
{
    private am a;
    
    static ea a() {
        return c();
    }
    
    private static ea c() {
        final ea ea = new ea();
        ea.a = new am(null);
        return ea;
    }
    
    public ea a(final int n) {
        if (am.b(this.a) == null) {
            am.a(this.a, new ArrayList());
        }
        am.b(this.a).add(n);
        return this;
    }
    
    public ea a(final long n) {
        if (am.a(this.a) == null) {
            am.e(this.a, new ArrayList());
        }
        am.a(this.a).add(n);
        return this;
    }
    
    public ea a(final am am) {
        if (!am.d(am).isEmpty()) {
            if (am.d(this.a) == null) {
                am.b(this.a, new ArrayList());
            }
            am.d(this.a).addAll(am.d(am));
        }
        if (!am.b(am).isEmpty()) {
            if (am.b(this.a) == null) {
                am.a(this.a, new ArrayList());
            }
            am.b(this.a).addAll(am.b(am));
        }
        if (!am.a(am).isEmpty()) {
            if (am.a(this.a) == null) {
                am.e(this.a, new ArrayList());
            }
            am.a(this.a).addAll(am.a(am));
        }
        if (!am.e(am).isEmpty()) {
            if (am.e(this.a) == null) {
                am.d(this.a, new ArrayList());
            }
            am.e(this.a).addAll(am.e(am));
        }
        if (!am.c(am).isEmpty()) {
            if (am.c(this.a) == null) {
                am.c(this.a, new ArrayList());
            }
            am.c(this.a).addAll(am.c(am));
        }
        return this;
    }
    
    public ea a(final ce ce) {
        if (am.c(this.a) == null) {
            am.c(this.a, new ArrayList());
        }
        am.c(this.a).add(ce);
        return this;
    }
    
    public ea a(final hv hv) {
        if (am.e(this.a) == null) {
            am.d(this.a, new ArrayList());
        }
        am.e(this.a).add(hv);
        return this;
    }
    
    public am b() {
        if (am.d(this.a) == null) {
            am.b(this.a, Collections.emptyList());
        }
        else {
            am.b(this.a, Collections.unmodifiableList((List<?>)am.d(this.a)));
        }
        if (am.b(this.a) == null) {
            am.a(this.a, Collections.emptyList());
        }
        else {
            am.a(this.a, Collections.unmodifiableList((List<?>)am.b(this.a)));
        }
        if (am.a(this.a) == null) {
            am.e(this.a, Collections.emptyList());
        }
        else {
            am.e(this.a, Collections.unmodifiableList((List<?>)am.a(this.a)));
        }
        if (am.e(this.a) == null) {
            am.d(this.a, Collections.emptyList());
        }
        else {
            am.d(this.a, Collections.unmodifiableList((List<?>)am.e(this.a)));
        }
        if (am.c(this.a) == null) {
            am.c(this.a, Collections.emptyList());
        }
        else {
            am.c(this.a, Collections.unmodifiableList((List<?>)am.c(this.a)));
        }
        final am a = this.a;
        this.a = null;
        return a;
    }
    
    public ea b(final long n) {
        if (am.d(this.a) == null) {
            am.b(this.a, new ArrayList());
        }
        am.d(this.a).add(n);
        return this;
    }
}
