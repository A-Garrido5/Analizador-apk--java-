// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class Binding implements Externalizable
{
    private static final long serialVersionUID = -2182387023492608415L;
    public int controllerType;
    public int destId;
    public int destType;
    public boolean negateController;
    public String sourceKey;
    public int sourceType;
    
    public int a() {
        final int sourceType = this.sourceType;
        if (sourceType < 4) {
            return 1;
        }
        if (sourceType < 18) {
            return 2;
        }
        return 3;
    }
    
    public boolean a(final boolean b) {
        return b ^ this.negateController;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Binding)) {
                return false;
            }
            final Binding binding = (Binding)o;
            if (this.controllerType != binding.controllerType) {
                return false;
            }
            if (this.destId != binding.destId) {
                return false;
            }
            if (this.destType != binding.destType) {
                return false;
            }
            if (this.negateController != binding.negateController) {
                return false;
            }
            if (this.sourceType != binding.sourceType) {
                return false;
            }
            if (this.sourceKey != null) {
                if (this.sourceKey.equals(binding.sourceKey)) {
                    return true;
                }
            }
            else if (binding.sourceKey == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * this.sourceType;
        int hashCode;
        if (this.sourceKey != null) {
            hashCode = this.sourceKey.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (31 * (hashCode + n) + this.controllerType);
        final boolean negateController = this.negateController;
        int n3 = 0;
        if (negateController) {
            n3 = 1;
        }
        return 31 * (31 * (n2 + n3) + this.destType) + this.destId;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.sourceType = objectInput.readInt();
        this.sourceKey = (String)objectInput.readObject();
        this.controllerType = objectInput.readInt();
        this.negateController = objectInput.readBoolean();
        this.destType = objectInput.readInt();
        this.destId = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.sourceType);
        objectOutput.writeObject(this.sourceKey);
        objectOutput.writeInt(this.controllerType);
        objectOutput.writeBoolean(this.negateController);
        objectOutput.writeInt(this.destType);
        objectOutput.writeInt(this.destId);
    }
}
