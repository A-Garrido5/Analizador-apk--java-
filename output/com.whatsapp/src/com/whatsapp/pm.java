// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.graphics.Rect;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class pm implements ViewTreeObserver$OnGlobalLayoutListener
{
    final VideoPreviewActivity a;
    
    pm(final VideoPreviewActivity a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        if (VideoPreviewActivity.o(this.a) != null) {
            final Rect rect = new Rect();
            VideoPreviewActivity.o(this.a).getWindowVisibleDisplayFrame(rect);
            boolean b;
            if (VideoPreviewActivity.o(this.a).getRootView().getHeight() - (rect.bottom - rect.top) > 128.0f * vc.b().b) {
                b = true;
            }
            else {
                b = false;
            }
            final View viewById = this.a.findViewById(2131755647);
            int visibility = 0;
            if (!b) {
                visibility = 8;
            }
            viewById.setVisibility(visibility);
            if (!b) {
                VideoPreviewActivity.e(this.a).dismiss();
            }
        }
    }
}
