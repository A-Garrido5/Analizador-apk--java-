// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class TextToken implements Externalizable
{
    private static final long serialVersionUID = -8059482837312465614L;
    public int id;
    public int longPressActionId;
    public int pressDownActionId;
    public int pressUpActionId;
    public int styleId;
    public int tapActionId;
    public String text;
    
    public boolean a() {
        return this.pressDownActionId != 0 || this.pressUpActionId != 0 || this.tapActionId != 0 || this.longPressActionId != 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof TextToken)) {
                return false;
            }
            final TextToken textToken = (TextToken)o;
            if (this.id != textToken.id) {
                return false;
            }
            if (this.longPressActionId != textToken.longPressActionId) {
                return false;
            }
            if (this.pressDownActionId != textToken.pressDownActionId) {
                return false;
            }
            if (this.pressUpActionId != textToken.pressUpActionId) {
                return false;
            }
            if (this.styleId != textToken.styleId) {
                return false;
            }
            if (this.tapActionId != textToken.tapActionId) {
                return false;
            }
            if (this.text != null) {
                if (this.text.equals(textToken.text)) {
                    return true;
                }
            }
            else if (textToken.text == null) {
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
        if (this.text != null) {
            hashCode = this.text.hashCode();
        }
        else {
            hashCode = 0;
        }
        return 31 * (31 * (31 * (31 * (31 * (hashCode + n) + this.styleId) + this.pressDownActionId) + this.pressUpActionId) + this.tapActionId) + this.longPressActionId;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.id = objectInput.readInt();
        this.text = (String)objectInput.readObject();
        this.styleId = objectInput.readInt();
        this.pressDownActionId = objectInput.readInt();
        this.pressUpActionId = objectInput.readInt();
        this.tapActionId = objectInput.readInt();
        this.longPressActionId = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.id);
        objectOutput.writeObject(this.text);
        objectOutput.writeInt(this.styleId);
        objectOutput.writeInt(this.pressDownActionId);
        objectOutput.writeInt(this.pressUpActionId);
        objectOutput.writeInt(this.tapActionId);
        objectOutput.writeInt(this.longPressActionId);
    }
}
