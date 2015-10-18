// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.AttributeSet;
import android.content.Context;

public class n
{
    public int a;
    public int b;
    public int c;
    
    n(final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, li.CardView, kv.cardViewStyle, 0);
        final int indexCount = obtainStyledAttributes.getIndexCount();
        final SparseArray sparseArray = new SparseArray(indexCount);
        for (int i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            sparseArray.append(index, (Object)obtainStyledAttributes.getResourceId(index, 0));
        }
        obtainStyledAttributes.recycle();
        final Resources resources = context.getResources();
        final Integer n = (Integer)sparseArray.get(li.CardView_playerOverlay);
        if (n != null) {
            this.a = n;
        }
        final Integer n2 = (Integer)sparseArray.get(li.CardView_elementPressedColor);
        if (n2 != null && n2 > 0) {
            this.b = resources.getColor((int)n2);
        }
        final Integer n3 = (Integer)sparseArray.get(li.CardView_imagePlaceholderColor);
        if (n3 != null && n3 > 0) {
            this.c = resources.getColor((int)n3);
        }
    }
}
