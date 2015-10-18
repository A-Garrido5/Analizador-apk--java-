// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.instance;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class BindingValue implements Externalizable
{
    private static final long serialVersionUID = -59563771014216052L;
    public String scribeKey;
    public Object value;
    
    public static Object a(final BindingValue bindingValue) {
        if (bindingValue != null) {
            return bindingValue.value;
        }
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof BindingValue)) {
                return false;
            }
            final BindingValue bindingValue = (BindingValue)o;
            Label_0051: {
                if (this.scribeKey != null) {
                    if (this.scribeKey.equals(bindingValue.scribeKey)) {
                        break Label_0051;
                    }
                }
                else if (bindingValue.scribeKey == null) {
                    break Label_0051;
                }
                return false;
            }
            if (this.value != null) {
                if (this.value.equals(bindingValue.value)) {
                    return true;
                }
            }
            else if (bindingValue.value == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.value != null) {
            hashCode = this.value.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        final String scribeKey = this.scribeKey;
        int hashCode2 = 0;
        if (scribeKey != null) {
            hashCode2 = this.scribeKey.hashCode();
        }
        return n + hashCode2;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.value = objectInput.readObject();
        this.scribeKey = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.value);
        objectOutput.writeObject(this.scribeKey);
    }
}
