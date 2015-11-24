// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.EOFException;
import java.io.OptionalDataException;
import java.io.ObjectInput;
import com.twitter.util.k;

public class MentionEntity extends Entity
{
    private static final long serialVersionUID = 5301750857975883474L;
    public String name;
    public String screenName;
    public long userId;
    
    public MentionEntity() {
        this(new ah());
    }
    
    MentionEntity(final ah ah) {
        super(ah);
        this.userId = ah.c;
        this.screenName = k.a(ah.d);
        this.name = ah.e;
    }
    
    public boolean a(final MentionEntity mentionEntity) {
        return this == mentionEntity || (super.a(mentionEntity) && this.userId == mentionEntity.userId);
    }
    
    public ah b() {
        return new ah(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof MentionEntity && this.a((MentionEntity)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + (int)(this.userId ^ this.userId >>> 32);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.screenName = k.a((String)objectInput.readObject());
        this.userId = objectInput.readLong();
        try {
            this.name = (String)objectInput.readObject();
        }
        catch (OptionalDataException ex) {}
        catch (EOFException ex2) {}
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.screenName);
        objectOutput.writeLong(this.userId);
        objectOutput.writeObject(this.name);
    }
}
