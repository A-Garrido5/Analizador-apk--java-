// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;
import android.graphics.Point;

public class Vector2 extends Point implements Externalizable
{
    private static final long serialVersionUID = 3739255316710861395L;
    
    public Vector2() {
    }
    
    public Vector2(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    
    public int a(final int n) {
        if (n == 0) {
            return this.x;
        }
        return this.y;
    }
    
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Vector2)) {
                return false;
            }
            final Vector2 vector2 = (Vector2)o;
            if (this.x != vector2.x) {
                return false;
            }
            if (this.y != vector2.y) {
                return false;
            }
        }
        return true;
    }
    
    public int hashCode() {
        return 31 * this.x + this.y;
    }
    
    public void readExternal(final ObjectInput objectInput) {
        this.x = objectInput.readInt();
        this.y = objectInput.readInt();
    }
    
    public void set(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.x);
        objectOutput.writeInt(this.y);
    }
}
