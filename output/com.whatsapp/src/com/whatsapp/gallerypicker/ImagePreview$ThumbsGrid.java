// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.View;
import com.whatsapp.App;
import android.animation.LayoutTransition;
import android.os.Build$VERSION;
import android.content.Context;
import android.view.ViewGroup;

class ImagePreview$ThumbsGrid extends ViewGroup
{
    final ImagePreview a;
    int b;
    
    public ImagePreview$ThumbsGrid(final ImagePreview a, final Context context) {
        this.a = a;
        super(context);
        if (Build$VERSION.SDK_INT >= 11) {
            this.setLayoutTransition(new LayoutTransition());
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int v = MediaGalleryBase.v;
        final int childCount = this.getChildCount();
        if (this.b != 0) {
            final int n5 = (int)(2.0f * this.getResources().getDisplayMetrics().density);
            final int n6 = (n3 - n) / this.b;
            int n10;
            for (int i = 0; i < childCount; i = n10) {
                final View child = this.getChildAt(i);
                final int n7 = i / this.b;
                int n8 = n6 * (i % this.b);
                final int n9 = n7 * n6;
                if (!App.ak()) {
                    n8 = n3 - n8 - n6;
                }
                child.layout(n5 + (n + n8), n5 + (n2 + n9), n6 + (n8 + n) - n5, n6 + (n9 + n2) - n5);
                n10 = i + 1;
                if (v != 0) {
                    break;
                }
            }
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        int n3 = 2;
        super.onMeasure(n, n2);
        final int n4 = (int)(72.0f * this.getResources().getDisplayMetrics().density);
        final int childCount = this.getChildCount();
        final int measuredWidth = this.getMeasuredWidth();
        if (childCount > 0 && measuredWidth > 0) {
            this.b = measuredWidth / n4;
            int n5 = (-1 + (childCount + this.b)) / this.b;
            if (childCount % this.b == 1) {
                ++this.b;
                n5 = (-1 + (childCount + this.b)) / this.b;
            }
            if (n5 > n3) {
                this.b = (-1 + (childCount + n3)) / n3;
            }
            else {
                n3 = n5;
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), n3 * (measuredWidth / this.b));
        }
    }
}
