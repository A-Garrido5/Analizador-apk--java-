// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class ApiRequestParameter implements Externalizable
{
    private static final long serialVersionUID = -6177357836686909558L;
    public int id;
    public String key;
    public String value;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ApiRequestParameter)) {
                return false;
            }
            final ApiRequestParameter apiRequestParameter = (ApiRequestParameter)o;
            if (this.id != apiRequestParameter.id) {
                return false;
            }
            Label_0064: {
                if (this.key != null) {
                    if (this.key.equals(apiRequestParameter.key)) {
                        break Label_0064;
                    }
                }
                else if (apiRequestParameter.key == null) {
                    break Label_0064;
                }
                return false;
            }
            if (this.value != null) {
                if (this.value.equals(apiRequestParameter.value)) {
                    return true;
                }
            }
            else if (apiRequestParameter.value == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * this.id;
        int hashCode;
        if (this.key != null) {
            hashCode = this.key.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        final String value = this.value;
        int hashCode2 = 0;
        if (value != null) {
            hashCode2 = this.value.hashCode();
        }
        return n2 + hashCode2;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.id = objectInput.readInt();
        this.key = (String)objectInput.readObject();
        this.value = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.id);
        objectOutput.writeObject(this.key);
        objectOutput.writeObject(this.value);
    }
}
