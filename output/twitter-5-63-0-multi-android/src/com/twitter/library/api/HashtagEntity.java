// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.util.l;
import com.twitter.util.k;

public class HashtagEntity extends Entity
{
    private static final long serialVersionUID = -5319257899984690364L;
    public int displayEnd;
    public int displayStart;
    public String text;
    
    public HashtagEntity() {
        this(new aa());
    }
    
    HashtagEntity(final aa aa) {
        super(aa);
        this.text = k.a(aa.c);
        this.displayStart = aa.d;
        this.displayEnd = aa.e;
    }
    
    @Override
    public void a(final int n) {
        super.a(n);
        this.displayStart += n;
        this.displayEnd += n;
    }
    
    public boolean a(final HashtagEntity hashtagEntity) {
        return this == hashtagEntity || (super.a(hashtagEntity) && l.a(this.text, hashtagEntity.text));
    }
    
    public aa b() {
        return new aa(this);
    }
    
    public void b(final int n) {
        this.displayStart += n;
        this.displayEnd += n;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof HashtagEntity && this.a((HashtagEntity)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + l.a(this.text);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.text = k.a((String)objectInput.readObject());
        this.displayStart = objectInput.readInt();
        this.displayEnd = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.text);
        objectOutput.writeInt(this.displayStart);
        objectOutput.writeInt(this.displayEnd);
    }
}
