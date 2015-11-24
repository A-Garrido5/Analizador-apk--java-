// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class Spacing implements Externalizable
{
    private static final long serialVersionUID = 2007390922062031306L;
    public Vector2F end;
    public Vector2F start;
    
    public Spacing() {
    }
    
    public Spacing(final float n, final float n2, final float n3, final float n4) {
        this.start = new Vector2F(n, n2);
        this.end = new Vector2F(n3, n4);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Spacing)) {
                return false;
            }
            final Spacing spacing = (Spacing)o;
            Label_0051: {
                if (this.end != null) {
                    if (this.end.equals(spacing.end)) {
                        break Label_0051;
                    }
                }
                else if (spacing.end == null) {
                    break Label_0051;
                }
                return false;
            }
            if (this.start != null) {
                if (this.start.equals(spacing.start)) {
                    return true;
                }
            }
            else if (spacing.start == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.start != null) {
            hashCode = this.start.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        final Vector2F end = this.end;
        int hashCode2 = 0;
        if (end != null) {
            hashCode2 = this.end.hashCode();
        }
        return n + hashCode2;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.start = (Vector2F)objectInput.readObject();
        this.end = (Vector2F)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.start);
        objectOutput.writeObject(this.end);
    }
}
