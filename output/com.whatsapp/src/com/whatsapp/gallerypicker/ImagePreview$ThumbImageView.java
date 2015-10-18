// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Canvas;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.widget.ImageView$ScaleType;
import android.content.Context;
import android.net.Uri;
import android.graphics.Matrix;
import com.whatsapp.MediaGalleryImageView;

class ImagePreview$ThumbImageView extends MediaGalleryImageView
{
    final ImagePreview A;
    private Matrix B;
    private Uri z;
    
    public ImagePreview$ThumbImageView(final ImagePreview a, final Context context, final Uri uri) {
        this.A = a;
        super(context);
        this.B = new Matrix();
        this.setScaleType(ImageView$ScaleType.CENTER_CROP);
        this.a(uri);
        this.setOnClickListener((View$OnClickListener)new b3(this, a));
        this.setOnTouchListener((View$OnTouchListener)new au(this, a));
    }
    
    static Uri a(final ImagePreview$ThumbImageView imagePreview$ThumbImageView) {
        return imagePreview$ThumbImageView.z;
    }
    
    private void a(final Uri z) {
        this.z = z;
        final int n = (int)(72.0f * this.getResources().getDisplayMetrics().density);
        Uri uri;
        if (ImagePreview.k(this.A).containsKey(z)) {
            uri = ImagePreview.k(this.A).get(z);
        }
        else {
            uri = z;
        }
        this.setBackgroundColor(this.getResources().getColor(2131623999));
        new b6(this, uri, n).execute((Object[])new Void[0]);
    }
    
    static void a(final ImagePreview$ThumbImageView imagePreview$ThumbImageView, final Uri uri) {
        imagePreview$ThumbImageView.a(uri);
    }
    
    @Override
    public void onDraw(final Canvas canvas) {
        canvas.save();
        if (ImagePreview.s(this.A) == this) {
            canvas.drawColor(-15658735);
            return;
        }
        this.w = false;
        if (ImagePreview.u(this.A).containsKey(this.z)) {
            this.B.setRotate((float)ImagePreview.u(this.A).get(this.z), (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
            canvas.concat(this.B);
        }
        super.onDraw(canvas);
        canvas.restore();
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        final int defaultSize = getDefaultSize(this.getSuggestedMinimumHeight(), n2);
        this.setMeasuredDimension(defaultSize, defaultSize);
    }
}
