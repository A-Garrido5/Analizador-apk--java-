// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.instance;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class UserValue implements Externalizable
{
    private static final long serialVersionUID = -2219008309244579846L;
    public String id;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof UserValue)) {
                return false;
            }
            final UserValue userValue = (UserValue)o;
            if (this.id != null) {
                if (this.id.equals(userValue.id)) {
                    return true;
                }
            }
            else if (userValue.id == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.id != null) {
            return this.id.hashCode();
        }
        return 0;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.id = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.id);
    }
}
