// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

public final class j
{
    public final int a;
    public final int b;
    
    public j(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (!(o instanceof j)) {
            b = false;
        }
        else if (this != o) {
            final j j = (j)o;
            if (j.a != this.a || j.b != this.b) {
                return false;
            }
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return al.a(this.a, this.b);
    }
}
