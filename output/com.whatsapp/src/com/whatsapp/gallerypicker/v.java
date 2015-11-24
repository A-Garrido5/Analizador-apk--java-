// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.widget.ImageButton;
import android.app.Activity;
import com.whatsapp.l1;

class v extends l1
{
    final ImagePreview k;
    
    v(final ImagePreview k, final Activity activity) {
        this.k = k;
        super(activity);
    }
    
    @Override
    public void dismiss() {
        final int v = MediaGalleryBase.v;
        super.dismiss();
        int n;
        for (int childCount = ImagePreview.b(this.k).getChildCount(), i = 0; i < childCount; i = n) {
            final ImageButton imageButton = (ImageButton)ImagePreview.b(this.k).getChildAt(i).findViewById(2131755446);
            if (imageButton != null) {
                imageButton.setImageResource(2130838878);
            }
            n = i + 1;
            if (v != 0) {
                break;
            }
        }
    }
}
