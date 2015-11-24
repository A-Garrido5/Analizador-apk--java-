// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class cy
{
    private cw a;
    private Object b;
    private List c;
    
    cy() {
        this.c = new ArrayList();
    }
    
    private byte[] b() {
        final byte[] array = new byte[this.a()];
        this.a(qp.a(array));
        return array;
    }
    
    int a() {
        int a;
        if (this.b != null) {
            a = this.a.a(this.b);
        }
        else {
            final Iterator<dc> iterator = this.c.iterator();
            a = 0;
            while (iterator.hasNext()) {
                a += iterator.next().a();
            }
        }
        return a;
    }
    
    void a(final qp qp) {
        if (this.b != null) {
            this.a.a(this.b, qp);
        }
        else {
            final Iterator<dc> iterator = this.c.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(qp);
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b;
        if (o == this) {
            b = true;
        }
        else {
            final boolean b2 = o instanceof cy;
            b = false;
            if (b2) {
                final cy cy = (cy)o;
                if (this.b != null && cy.b != null) {
                    final cw a = this.a;
                    final cw a2 = cy.a;
                    b = false;
                    if (a == a2) {
                        if (!this.a.b.isArray()) {
                            return this.b.equals(cy.b);
                        }
                        if (this.b instanceof byte[]) {
                            return Arrays.equals((byte[])this.b, (byte[])cy.b);
                        }
                        if (this.b instanceof int[]) {
                            return Arrays.equals((int[])this.b, (int[])cy.b);
                        }
                        if (this.b instanceof long[]) {
                            return Arrays.equals((long[])this.b, (long[])cy.b);
                        }
                        if (this.b instanceof float[]) {
                            return Arrays.equals((float[])this.b, (float[])cy.b);
                        }
                        if (this.b instanceof double[]) {
                            return Arrays.equals((double[])this.b, (double[])cy.b);
                        }
                        if (this.b instanceof boolean[]) {
                            return Arrays.equals((boolean[])this.b, (boolean[])cy.b);
                        }
                        return Arrays.deepEquals((Object[])this.b, (Object[])cy.b);
                    }
                }
                else {
                    if (this.c != null && cy.c != null) {
                        return this.c.equals(cy.c);
                    }
                    try {
                        return Arrays.equals(this.b(), cy.b());
                    }
                    catch (IOException ex) {
                        throw new IllegalStateException(ex);
                    }
                }
            }
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        try {
            return Arrays.hashCode(this.b()) + 527;
        }
        catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
