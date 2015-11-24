// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import com.twitter.util.f;
import java.io.ObjectInput;
import java.util.Arrays;
import java.io.Externalizable;

public class Form implements Externalizable
{
    private static final long serialVersionUID = -3124748295675613128L;
    public int apiRequestAction;
    public int[] elementIds;
    public int id;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Form)) {
                return false;
            }
            final Form form = (Form)o;
            if (this.apiRequestAction != form.apiRequestAction) {
                return false;
            }
            if (this.id != form.id) {
                return false;
            }
            if (!Arrays.equals(this.elementIds, form.elementIds)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * this.id + this.apiRequestAction);
        int hashCode;
        if (this.elementIds != null) {
            hashCode = Arrays.hashCode(this.elementIds);
        }
        else {
            hashCode = 0;
        }
        return hashCode + n;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.id = objectInput.readInt();
        this.apiRequestAction = objectInput.readInt();
        this.elementIds = f.a(objectInput);
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.id);
        objectOutput.writeInt(this.apiRequestAction);
        f.a(this.elementIds, objectOutput);
    }
}
