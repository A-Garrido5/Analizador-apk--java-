// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class FormField implements Externalizable
{
    private static final long serialVersionUID = 3816795730955041903L;
    public String name;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof FormField)) {
                return false;
            }
            final FormField formField = (FormField)o;
            if (this.name != null) {
                if (this.name.equals(formField.name)) {
                    return true;
                }
            }
            else if (formField.name == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.name != null) {
            return this.name.hashCode();
        }
        return 0;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.name = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.name);
    }
}
