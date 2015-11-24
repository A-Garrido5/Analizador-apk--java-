// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import com.twitter.util.f;
import java.io.ObjectInput;
import java.util.Arrays;
import java.io.Externalizable;

public class TokenizedText implements Externalizable
{
    private static final long serialVersionUID = -7122571860637262161L;
    public TextTokenGroup[] textTokenGroups;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof TokenizedText)) {
                return false;
            }
            if (!Arrays.equals(this.textTokenGroups, ((TokenizedText)o).textTokenGroups)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.textTokenGroups != null) {
            return Arrays.hashCode(this.textTokenGroups);
        }
        return 0;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.textTokenGroups = (TextTokenGroup[])f.a(TextTokenGroup[].class, objectInput);
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        f.a(this.textTokenGroups, objectOutput);
    }
}
