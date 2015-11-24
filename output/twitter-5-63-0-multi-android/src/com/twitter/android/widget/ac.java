// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.api.geo.TwitterPlace$PlaceType;

class ac
{
    public String a;
    public TwitterPlace$PlaceType b;
    public String c;
    public String d;
    public int e;
    public int f;
    
    public ac(final String a, final TwitterPlace$PlaceType b, final String c, final String d, final int e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == null || !(o instanceof ac)) {
            b = false;
        }
        else if (o != this) {
            final ac ac = (ac)o;
            if (!this.a.equals(ac.a)) {
                return false;
            }
            if (this.b != ac.b) {
                return false;
            }
            if ((this.c != null && !this.c.equals(ac.c)) || ac.c != null) {
                return false;
            }
            if ((this.d != null && !this.d.equals(ac.d)) || ac.d != null) {
                return false;
            }
            if (this.e != ac.e) {
                return false;
            }
            if (this.f != ac.f) {
                return false;
            }
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * this.a.hashCode() + this.b.hashCode());
        int hashCode;
        if (this.c != null) {
            hashCode = this.c.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        final String d = this.d;
        int hashCode2 = 0;
        if (d != null) {
            hashCode2 = this.d.hashCode();
        }
        return 31 * (31 * (n2 + hashCode2) + this.e) + this.f;
    }
}
