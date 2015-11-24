// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.Arrays;
import android.graphics.Color;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.io.Externalizable;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable$ShaderFactory;

class b extends ShapeDrawable$ShaderFactory
{
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ Fill e;
    
    b(final Fill e, final float a, final float b, final float c, final float d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public Shader resize(final int n, final int n2) {
        final float[] array = new float[this.e.mCount];
        final int[] array2 = new int[this.e.mCount];
        for (int i = 0; i < this.e.mCount; ++i) {
            array[i] = this.e.mStops[i];
            array2[i] = this.e.mColors[i];
        }
        return (Shader)new LinearGradient(this.a, this.b, this.c, this.d, array2, array, Shader$TileMode.CLAMP);
    }
}
