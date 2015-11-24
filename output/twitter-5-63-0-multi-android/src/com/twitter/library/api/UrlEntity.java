// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.util.l;
import com.twitter.util.k;

public class UrlEntity extends Entity
{
    private static final long serialVersionUID = 7946903601032197538L;
    public int displayEnd;
    public int displayStart;
    public String displayUrl;
    public String expandedUrl;
    public String url;
    
    public UrlEntity() {
        this(new cb());
    }
    
    UrlEntity(final ca ca) {
        super(ca);
        this.url = k.a(ca.l);
        this.expandedUrl = k.a(ca.m);
        this.displayUrl = k.a(ca.n);
        this.displayStart = ca.o;
        this.displayEnd = ca.p;
    }
    
    @Override
    public void a(final int n) {
        super.a(n);
        this.displayStart += n;
        this.displayEnd += n;
    }
    
    public boolean a(final UrlEntity urlEntity) {
        return this == urlEntity || (super.a(urlEntity) && l.a(this.url, urlEntity.url));
    }
    
    public ca d() {
        return new cb(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof UrlEntity && this.a((UrlEntity)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + l.a(this.url);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.url = k.a((String)objectInput.readObject());
        objectInput.readObject();
        this.expandedUrl = (String)k.a(objectInput.readObject(), this.url);
        this.displayUrl = (String)k.a(objectInput.readObject(), this.expandedUrl);
        this.displayStart = objectInput.readInt();
        this.displayEnd = objectInput.readInt();
    }
    
    @Override
    public String toString() {
        return this.displayUrl;
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.url);
        objectOutput.writeObject(null);
        objectOutput.writeObject(this.expandedUrl);
        objectOutput.writeObject(this.displayUrl);
        objectOutput.writeInt(this.displayStart);
        objectOutput.writeInt(this.displayEnd);
    }
}
