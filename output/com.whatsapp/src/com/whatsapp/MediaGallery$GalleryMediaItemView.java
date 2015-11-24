// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.format.DateUtils;
import com.whatsapp.gallerypicker.bd;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.whatsapp.gallerypicker.MediaGalleryBase$MediaItemView;

class MediaGallery$GalleryMediaItemView extends MediaGalleryBase$MediaItemView
{
    protected Drawable c;
    protected Drawable d;
    protected Paint e;
    
    public MediaGallery$GalleryMediaItemView(final Context context) {
        super(context);
    }
    
    public MediaGallery$GalleryMediaItemView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public MediaGallery$GalleryMediaItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public MediaGallery$GalleryMediaItemView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    @Override
    public void a(final Canvas canvas) {
        super.a(canvas);
        if (this.a != null) {
            final boolean b = bd.b(this.a);
            int n = 0;
            if (b) {
                if (this.c == null) {
                    this.c = this.getContext().getResources().getDrawable(2130838695);
                }
                if (this.d == null) {
                    this.d = this.getContext().getResources().getDrawable(2130838902);
                }
                this.c.setBounds(0, this.getHeight() - 2 * this.d.getIntrinsicHeight(), this.getWidth(), this.getHeight());
                this.c.draw(canvas);
                final int n2 = this.d.getIntrinsicHeight() / 4;
                this.d.setBounds(n2, this.getHeight() - this.d.getIntrinsicHeight() - n2, n2 + this.d.getIntrinsicWidth(), this.getHeight() - n2);
                this.d.draw(canvas);
                n = n2 + this.d.getIntrinsicWidth();
            }
            final long d = this.a.d();
            if (d != 0L) {
                if (this.e == null) {
                    (this.e = new Paint(1)).setColor(-1);
                    this.e.setTextSize((float)this.getContext().getResources().getDimensionPixelSize(2131361932));
                }
                canvas.drawText(DateUtils.formatElapsedTime(d), n + this.e.getTextSize() / 3.0f, this.getHeight() - this.e.getTextSize() / 3.0f, this.e);
            }
        }
    }
}
