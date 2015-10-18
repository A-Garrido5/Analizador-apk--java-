// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class Border implements Externalizable
{
    private static final long serialVersionUID = -2153081832801518373L;
    public Fill background;
    public float width;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Border)) {
                return false;
            }
            final Border border = (Border)o;
            if (Float.compare(border.width, this.width) != 0) {
                return false;
            }
            if (this.background != null) {
                if (this.background.equals(border.background)) {
                    return true;
                }
            }
            else if (border.background == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int floatToIntBits;
        if (this.width != 0.0f) {
            floatToIntBits = Float.floatToIntBits(this.width);
        }
        else {
            floatToIntBits = 0;
        }
        final int n = floatToIntBits * 31;
        final Fill background = this.background;
        int hashCode = 0;
        if (background != null) {
            hashCode = this.background.hashCode();
        }
        return n + hashCode;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.width = objectInput.readFloat();
        this.background = (Fill)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeFloat(this.width);
        objectOutput.writeObject(this.background);
    }
}
