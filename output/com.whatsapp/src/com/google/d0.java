// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;
import java.io.Externalizable;

public class d0 implements Externalizable
{
    private static final long serialVersionUID = 1L;
    private List a;
    
    public d0() {
        this.a = new ArrayList();
    }
    
    public static d2 c() {
        return new d2();
    }
    
    public d0 a() {
        this.a.clear();
        return this;
    }
    
    public d0 a(final c0 c0) {
        if (c0 == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.a.add(c0);
        return this;
    }
    
    public int b() {
        return this.a.size();
    }
    
    public List d() {
        return this.a;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        final int a = e6.a;
        final int int1 = objectInput.readInt();
        int i = 0;
        while (i < int1) {
            final c0 c0 = new c0();
            c0.readExternal(objectInput);
            this.a.add(c0);
            ++i;
            if (a != 0) {
                break;
            }
        }
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        final int a = e6.a;
        final int b = this.b();
        objectOutput.writeInt(b);
        int n;
        for (int i = 0; i < b; i = n) {
            ((c0)this.a.get(i)).writeExternal(objectOutput);
            n = i + 1;
            if (a != 0) {
                break;
            }
        }
    }
}
