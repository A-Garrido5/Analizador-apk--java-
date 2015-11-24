// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.View;
import com.whatsapp.ConversationTextEntry;
import android.widget.ImageButton;
import android.view.View$OnClickListener;

class a0 implements View$OnClickListener
{
    final ImageButton a;
    final a5 b;
    final ConversationTextEntry c;
    
    a0(final a5 b, final ImageButton a, final ConversationTextEntry c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public void onClick(final View view) {
        final int v = MediaGalleryBase.v;
        if (ImagePreview.v(this.b.a).isShowing()) {
            ImagePreview.v(this.b.a).dismiss();
            if (v == 0) {
                return;
            }
        }
        ImagePreview.v(this.b.a).a((View)this.a, this.a, this.a, (View)this.c);
        int n;
        for (int childCount = ImagePreview.b(this.b.a).getChildCount(), i = 0; i < childCount; i = n) {
            final ImageButton imageButton = (ImageButton)ImagePreview.b(this.b.a).getChildAt(i).findViewById(2131755446);
            if (imageButton != null) {
                imageButton.setImageResource(2130838880);
            }
            n = i + 1;
            if (v != 0) {
                break;
            }
        }
    }
}
