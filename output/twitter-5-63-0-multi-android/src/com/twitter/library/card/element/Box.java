// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.graphics.RectF;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Canvas;
import android.graphics.drawable.shapes.RoundRectShape;
import com.twitter.library.card.property.Border;
import com.twitter.library.card.property.Fill;
import java.io.Externalizable;

public class Box extends Element implements Externalizable
{
    private static final long serialVersionUID = -5013166409855979036L;
    public Fill background;
    public Border border;
    public float cornerRadius;
    private RoundRectShape mBackgroundShape;
    private RoundRectShape mBorderShape;
    
    @Override
    public void a(final Canvas canvas) {
        final Border border = this.mComputedStyle.border;
        if (this.mBorderShape != null) {
            border.background.a(canvas, this.mLayoutRect, (Shape)this.mBorderShape);
        }
        super.a(canvas);
    }
    
    @Override
    public void b(final Canvas canvas) {
        super.b(canvas);
        if (this.mBackgroundShape != null) {
            this.mComputedStyle.background.a(canvas, this.mLayoutRect, (Shape)this.mBackgroundShape);
        }
    }
    
    @Override
    public void e() {
        final Fill background = this.mComputedStyle.background;
        final Border border = this.mComputedStyle.border;
        final float width = border.width;
        final float floatValue = this.mComputedStyle.cornerRadius;
        final float max = Math.max(0.0f, floatValue - width);
        int n;
        if (width > 0.0f && !border.background.b()) {
            n = 1;
        }
        else {
            n = 0;
        }
        final float[] array = { floatValue, floatValue, floatValue, floatValue, floatValue, floatValue, floatValue, floatValue };
        if (background.b()) {
            this.mBackgroundShape = null;
        }
        else {
            final RoundRectShape mBackgroundShape = new RoundRectShape(array, (RectF)null, (float[])null);
            mBackgroundShape.resize(this.mLayoutSize.x, this.mLayoutSize.y);
            this.mBackgroundShape = mBackgroundShape;
        }
        if (n != 0) {
            final RoundRectShape mBorderShape = new RoundRectShape(array, new RectF(width, width, width, width), new float[] { max, max, max, max, max, max, max, max });
            mBorderShape.resize(this.mLayoutSize.x, this.mLayoutSize.y);
            this.mBorderShape = mBorderShape;
            return;
        }
        this.mBorderShape = null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Box)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final Box box = (Box)o;
            if (Float.compare(box.cornerRadius, this.cornerRadius) != 0) {
                return false;
            }
            Label_0077: {
                if (this.background != null) {
                    if (this.background.equals(box.background)) {
                        break Label_0077;
                    }
                }
                else if (box.background == null) {
                    break Label_0077;
                }
                return false;
            }
            if (this.border != null) {
                if (this.border.equals(box.border)) {
                    return true;
                }
            }
            else if (box.border == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * super.hashCode();
        int hashCode;
        if (this.background != null) {
            hashCode = this.background.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.border != null) {
            hashCode2 = this.border.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        final float n4 = fcmpl(this.cornerRadius, 0.0f);
        int floatToIntBits = 0;
        if (n4 != 0) {
            floatToIntBits = Float.floatToIntBits(this.cornerRadius);
        }
        return n3 + floatToIntBits;
    }
    
    @Override
    protected void q() {
        super.q();
        this.mComputedStyle.background = this.background;
        this.mComputedStyle.border = this.border;
        this.mComputedStyle.cornerRadius = this.cornerRadius;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.background = (Fill)objectInput.readObject();
        this.border = (Border)objectInput.readObject();
        this.cornerRadius = objectInput.readFloat();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.background);
        objectOutput.writeObject(this.border);
        objectOutput.writeFloat(this.cornerRadius);
    }
}
