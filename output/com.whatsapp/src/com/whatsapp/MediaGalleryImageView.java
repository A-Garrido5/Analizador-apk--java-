// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Paint;

public class MediaGalleryImageView extends ThumbnailTextButton
{
    private static Paint u;
    private static Paint v;
    private static Paint y;
    protected boolean w;
    private final Rect x;
    
    public MediaGalleryImageView(final Context context) {
        super(context);
        this.x = new Rect();
        this.w = true;
        if (MediaGalleryImageView.u == null) {
            (MediaGalleryImageView.u = new Paint()).setColor(1711315404);
            MediaGalleryImageView.u.setStyle(Paint$Style.FILL);
            MediaGalleryImageView.u.setAntiAlias(true);
        }
        if (MediaGalleryImageView.y == null) {
            final vc b = vc.b();
            (MediaGalleryImageView.y = new Paint()).setColor(-16725026);
            MediaGalleryImageView.y.setStrokeWidth((float)(3 * b.l));
            MediaGalleryImageView.y.setStyle(Paint$Style.STROKE);
            MediaGalleryImageView.y.setAntiAlias(true);
        }
        if (MediaGalleryImageView.v == null) {
            final vc b2 = vc.b();
            (MediaGalleryImageView.v = new Paint()).setColor(2097152000);
            MediaGalleryImageView.v.setStrokeWidth((float)b2.l);
            MediaGalleryImageView.v.setStyle(Paint$Style.STROKE);
            MediaGalleryImageView.v.setAntiAlias(true);
        }
    }
    
    public void c(final Canvas canvas) {
        this.getDrawingRect(this.x);
        if (this.isPressed() || this.isSelected()) {
            if (this.w) {
                canvas.drawRect(this.x, MediaGalleryImageView.u);
            }
            canvas.drawRect(this.x, MediaGalleryImageView.y);
            if (!App.I) {
                return;
            }
        }
        canvas.drawRect(this.x, MediaGalleryImageView.v);
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        final int defaultSize = getDefaultSize(this.getSuggestedMinimumWidth(), n);
        this.setMeasuredDimension(defaultSize, defaultSize);
    }
}
