// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.Arrays;
import android.graphics.drawable.ShapeDrawable$ShaderFactory;
import android.graphics.Color;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.io.Externalizable;

public class Fill implements Externalizable
{
    private static final long serialVersionUID = -1304347398269167206L;
    public float angle;
    private int[] mColors;
    private int mCount;
    private float[] mStops;
    public int solid;
    public int type;
    
    public int a() {
        return this.mCount;
    }
    
    public void a(final float n, final int n2) {
        if (this.mCount == 0) {
            this.mStops = new float[8];
            this.mColors = new int[8];
        }
        else if (this.mCount == 8) {
            return;
        }
        this.mStops[this.mCount] = n;
        this.mColors[this.mCount] = n2;
        ++this.mCount;
    }
    
    public void a(final int solid) {
        this.type = 2;
        this.solid = solid;
    }
    
    public void a(final Canvas canvas, final RectF rectF, final Shape shape) {
        if (!this.b()) {
            if (this.type == 2) {
                this.b(canvas, rectF, shape);
                return;
            }
            if (this.type == 3) {
                this.c(canvas, rectF, shape);
            }
        }
    }
    
    protected void b(final Canvas canvas, final RectF rectF, final Shape shape) {
        final PaintDrawable paintDrawable = new PaintDrawable(this.solid);
        paintDrawable.setShape(shape);
        paintDrawable.setBounds((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
        paintDrawable.draw(canvas);
    }
    
    public boolean b() {
        if (this.type != 1) {
            if (this.type == 2) {
                if (Color.alpha(this.solid) != 0) {
                    return false;
                }
            }
            else {
                for (int i = 0; i < this.mCount; ++i) {
                    if (Color.alpha(this.mColors[i]) != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    protected void c(final Canvas canvas, final RectF rectF, final Shape shape) {
        final float n = (float)Math.sin(this.angle);
        final float n2 = (float)Math.cos(this.angle);
        final float n3 = 0.5f * rectF.width();
        final float n4 = 0.5f * rectF.height();
        final b shaderFactory = new b(this, n3 - n3 * n, n4 - n4 * n2, n3 + n * n3, n4 + n4 * n2);
        final PaintDrawable paintDrawable = new PaintDrawable(-16711936);
        paintDrawable.setShape(shape);
        paintDrawable.setShaderFactory((ShapeDrawable$ShaderFactory)shaderFactory);
        paintDrawable.setBounds((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
        paintDrawable.draw(canvas);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Fill)) {
                return false;
            }
            final Fill fill = (Fill)o;
            if (Float.compare(fill.angle, this.angle) != 0) {
                return false;
            }
            if (this.mCount != fill.mCount) {
                return false;
            }
            if (this.solid != fill.solid) {
                return false;
            }
            if (this.type != fill.type) {
                return false;
            }
            if (!Arrays.equals(this.mColors, fill.mColors)) {
                return false;
            }
            if (!Arrays.equals(this.mStops, fill.mStops)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int floatToIntBits;
        if (this.angle != 0.0f) {
            floatToIntBits = Float.floatToIntBits(this.angle);
        }
        else {
            floatToIntBits = 0;
        }
        final int n = 31 * (31 * (floatToIntBits * 31 + this.type) + this.solid);
        int hashCode;
        if (this.mStops != null) {
            hashCode = Arrays.hashCode(this.mStops);
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        final int[] mColors = this.mColors;
        int hashCode2 = 0;
        if (mColors != null) {
            hashCode2 = Arrays.hashCode(this.mColors);
        }
        return 31 * (n2 + hashCode2) + this.mCount;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.angle = objectInput.readFloat();
        this.type = objectInput.readInt();
        this.solid = objectInput.readInt();
        this.mCount = objectInput.readInt();
        if (this.mCount > 0) {
            this.mStops = new float[8];
            this.mColors = new int[8];
            for (int i = 0; i < this.mCount; ++i) {
                this.mStops[i] = objectInput.readFloat();
                this.mColors[i] = objectInput.readInt();
            }
        }
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeFloat(this.angle);
        objectOutput.writeInt(this.type);
        objectOutput.writeInt(this.solid);
        objectOutput.writeInt(this.mCount);
        for (int i = 0; i < this.mCount; ++i) {
            objectOutput.writeFloat(this.mStops[i]);
            objectOutput.writeInt(this.mColors[i]);
        }
    }
}
