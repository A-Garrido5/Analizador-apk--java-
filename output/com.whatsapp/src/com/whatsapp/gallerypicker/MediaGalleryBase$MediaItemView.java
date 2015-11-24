// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.App;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class MediaGalleryBase$MediaItemView extends ImageView
{
    protected bj a;
    protected Drawable b;
    
    public MediaGalleryBase$MediaItemView(final Context context) {
        super(context);
    }
    
    public MediaGalleryBase$MediaItemView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public MediaGalleryBase$MediaItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public MediaGalleryBase$MediaItemView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    public void a(final Canvas canvas) {
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.a(canvas);
        if (this.isSelected()) {
            if (this.b == null) {
                this.b = this.getResources().getDrawable(2130838975);
            }
            canvas.drawColor(1073741824);
            final int n = (this.getWidth() - this.b.getIntrinsicWidth()) / 2;
            final int n2 = (this.getHeight() - this.b.getIntrinsicHeight()) / 2;
            this.b.setBounds(n, n2, n + this.b.getIntrinsicWidth(), n2 + this.b.getIntrinsicHeight());
            this.b.draw(canvas);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int defaultSize = getDefaultSize(this.getSuggestedMinimumWidth(), n);
        int dimensionPixelSize;
        if (MediaGalleryBase.c() && !App.ak()) {
            dimensionPixelSize = this.getResources().getDimensionPixelSize(2131361914);
        }
        else {
            dimensionPixelSize = 0;
        }
        this.setMeasuredDimension(defaultSize - dimensionPixelSize, defaultSize);
    }
    
    public void setMediaItem(final bj a) {
        this.a = a;
    }
}
