// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.data;

@Deprecated
class f
{
    String a;
    int b;
    WidgetDataUpdateService$RequestType c;
    
    f(final String a, final WidgetDataUpdateService$RequestType c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof f) {
            final f f = (f)o;
            if (this.a != null && f.a != null) {
                if (!f.a.equals(this.a) || f.c != this.c) {
                    return false;
                }
            }
            else if (f.c != this.c) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode * 31 + this.c.hashCode();
    }
}
