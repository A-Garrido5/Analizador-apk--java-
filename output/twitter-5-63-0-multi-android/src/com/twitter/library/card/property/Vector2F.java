// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;
import android.graphics.PointF;

public class Vector2F extends PointF implements Externalizable
{
    public static final Vector2F a;
    private static final long serialVersionUID = -4896184271780717298L;
    
    static {
        a = a();
    }
    
    public Vector2F() {
    }
    
    public Vector2F(final float x, final float y) {
        this.x = x;
        this.y = y;
    }
    
    public Vector2F(final Vector2F vector2F) {
        this.x = vector2F.x;
        this.y = vector2F.y;
    }
    
    public static Vector2F a() {
        return new Vector2F(0.0f, 0.0f);
    }
    
    public static Vector2F b() {
        return new Vector2F(Float.NaN, Float.NaN);
    }
    
    public float a(final int n) {
        if (n == 0) {
            return this.x;
        }
        return this.y;
    }
    
    public void a(final float n) {
        this.x += n;
        this.y += n;
    }
    
    public void a(final int n, final float n2) {
        if (n == 0) {
            this.x = n2;
            return;
        }
        this.y = n2;
    }
    
    public void a(final Vector2F vector2F) {
        this.x -= vector2F.x;
        this.y -= vector2F.y;
    }
    
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Vector2F)) {
                return false;
            }
            final Vector2F vector2F = (Vector2F)o;
            if (Float.compare(vector2F.x, this.x) != 0) {
                return false;
            }
            if (Float.compare(vector2F.y, this.y) != 0) {
                return false;
            }
        }
        return true;
    }
    
    public int hashCode() {
        int floatToIntBits;
        if (this.x != 0.0f) {
            floatToIntBits = Float.floatToIntBits(this.x);
        }
        else {
            floatToIntBits = 0;
        }
        final int n = floatToIntBits * 31;
        final float n2 = fcmpl(this.y, 0.0f);
        int floatToIntBits2 = 0;
        if (n2 != 0) {
            floatToIntBits2 = Float.floatToIntBits(this.y);
        }
        return n + floatToIntBits2;
    }
    
    public void readExternal(final ObjectInput objectInput) {
        this.x = objectInput.readFloat();
        this.y = objectInput.readFloat();
    }
    
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeFloat(this.x);
        objectOutput.writeFloat(this.y);
    }
}
