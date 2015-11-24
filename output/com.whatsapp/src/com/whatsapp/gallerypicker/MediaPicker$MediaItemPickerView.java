// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;

public class MediaPicker$MediaItemPickerView extends MediaGalleryBase$MediaItemView
{
    protected Paint c;
    
    public MediaPicker$MediaItemPickerView(final Context context) {
        super(context);
    }
    
    public MediaPicker$MediaItemPickerView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public MediaPicker$MediaItemPickerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public MediaPicker$MediaItemPickerView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    @Override
    public void a(final Canvas canvas) {
        final int v = MediaGalleryBase.v;
        super.a(canvas);
        if (this.a != null && bd.b(this.a)) {
            if (this.c == null) {
                (this.c = new Paint()).setAntiAlias(true);
                this.c.setColor(-1442840576);
            }
            final int height = this.getHeight();
            final int n = height / 7;
            int n2;
            for (int i = 0; i < height; i = n2) {
                canvas.drawRect((float)(n / 4), (float)(i + n / 4), (float)(n * 3 / 4), (float)(i + n * 3 / 4), this.c);
                n2 = i + n;
                if (v != 0) {
                    break;
                }
            }
        }
    }
}
