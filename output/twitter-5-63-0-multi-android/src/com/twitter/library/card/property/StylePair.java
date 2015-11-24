// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class StylePair implements Externalizable
{
    private static final long serialVersionUID = 18957830780726384L;
    public int elementId;
    public int styleId;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof StylePair)) {
                return false;
            }
            final StylePair stylePair = (StylePair)o;
            if (this.elementId != stylePair.elementId) {
                return false;
            }
            if (this.styleId != stylePair.styleId) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * this.elementId + this.styleId;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.elementId = objectInput.readInt();
        this.styleId = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.elementId);
        objectOutput.writeInt(this.styleId);
    }
}
