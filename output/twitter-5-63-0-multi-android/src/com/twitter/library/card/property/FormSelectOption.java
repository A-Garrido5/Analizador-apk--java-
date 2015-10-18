// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class FormSelectOption implements Externalizable
{
    private static final long serialVersionUID = 6078842174347936019L;
    public boolean selected;
    public int tokenizedTextId;
    public String value;
    
    public FormSelectOption() {
        this.tokenizedTextId = -1;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof FormSelectOption)) {
                return false;
            }
            final FormSelectOption formSelectOption = (FormSelectOption)o;
            if (this.selected != formSelectOption.selected) {
                return false;
            }
            if (this.tokenizedTextId != formSelectOption.tokenizedTextId) {
                return false;
            }
            if (this.value != null) {
                if (this.value.equals(formSelectOption.value)) {
                    return true;
                }
            }
            else if (formSelectOption.value == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * this.tokenizedTextId;
        int hashCode;
        if (this.value != null) {
            hashCode = this.value.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        final boolean selected = this.selected;
        int n3 = 0;
        if (selected) {
            n3 = 1;
        }
        return n2 + n3;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.tokenizedTextId = objectInput.readInt();
        this.value = (String)objectInput.readObject();
        this.selected = objectInput.readBoolean();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.tokenizedTextId);
        objectOutput.writeObject(this.value);
        objectOutput.writeBoolean(this.selected);
    }
}
