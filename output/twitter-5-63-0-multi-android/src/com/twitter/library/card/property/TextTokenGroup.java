// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import com.twitter.util.f;
import java.io.ObjectInput;
import java.util.Arrays;
import java.io.Externalizable;

public class TextTokenGroup implements Externalizable
{
    private static final long serialVersionUID = -890770266369027217L;
    public int id;
    public TextToken[] textTokens;
    public boolean visible;
    
    public TextTokenGroup() {
        this.visible = true;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof TextTokenGroup)) {
                return false;
            }
            final TextTokenGroup textTokenGroup = (TextTokenGroup)o;
            if (this.id != textTokenGroup.id) {
                return false;
            }
            if (!Arrays.equals(this.textTokens, textTokenGroup.textTokens)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * this.id;
        int hashCode;
        if (this.textTokens != null) {
            hashCode = Arrays.hashCode(this.textTokens);
        }
        else {
            hashCode = 0;
        }
        return hashCode + n;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.id = objectInput.readInt();
        this.textTokens = (TextToken[])f.a(TextToken[].class, objectInput);
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.id);
        f.a(this.textTokens, objectOutput);
    }
}
