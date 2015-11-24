// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Date;
import org.whispersystems.o;

public final class alk
{
    private final o a;
    private final Date b;
    
    public alk(final o a, final Date b) {
        this.a = a;
        this.b = b;
    }
    
    public Date a() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final alk alk = (alk)o;
            Label_0059: {
                if (this.b != null) {
                    if (this.b.equals(alk.b)) {
                        break Label_0059;
                    }
                }
                else if (alk.b == null) {
                    break Label_0059;
                }
                return false;
            }
            if (this.a != null) {
                if (this.a.equals(alk.a)) {
                    return true;
                }
            }
            else if (alk.a == null) {
                return true;
            }
            return false;
        }
        return true;
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
        final int n = hashCode * 31;
        final Date b = this.b;
        int hashCode2 = 0;
        if (b != null) {
            hashCode2 = this.b.hashCode();
        }
        return n + hashCode2;
    }
}
