// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class h2 implements Externalizable
{
    private static final long serialVersionUID = 1L;
    private String a;
    private boolean b;
    private boolean c;
    private String d;
    private boolean e;
    private String f;
    
    public h2() {
        this.d = "";
        this.f = "";
        this.a = "";
    }
    
    public static h7 a() {
        return new h7();
    }
    
    public h2 a(final h2 h2) {
        if (h2.c()) {
            this.a(h2.d());
        }
        if (h2.b()) {
            this.b(h2.e());
        }
        if (h2.f()) {
            this.c(h2.g());
        }
        return this;
    }
    
    public h2 a(final String d) {
        this.c = true;
        this.d = d;
        return this;
    }
    
    public h2 b(final String f) {
        this.b = true;
        this.f = f;
        return this;
    }
    
    public boolean b() {
        return this.b;
    }
    
    public boolean b(final h2 h2) {
        return this.d.equals(h2.d) && this.f.equals(h2.f) && this.a.equals(h2.a);
    }
    
    public h2 c(final String a) {
        this.e = true;
        this.a = a;
        return this;
    }
    
    public boolean c() {
        return this.c;
    }
    
    public String d() {
        return this.d;
    }
    
    public String e() {
        return this.f;
    }
    
    public boolean f() {
        return this.e;
    }
    
    public String g() {
        return this.a;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            this.a(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            this.b(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            this.c(objectInput.readUTF());
        }
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            objectOutput.writeUTF(this.d);
        }
        objectOutput.writeBoolean(this.b);
        if (this.b) {
            objectOutput.writeUTF(this.f);
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.a);
        }
    }
}
