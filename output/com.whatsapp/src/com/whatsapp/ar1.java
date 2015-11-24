// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class ar1 implements View$OnClickListener
{
    final VideoPreviewActivity a;
    
    ar1(final VideoPreviewActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (VideoPreviewActivity.e(this.a).isShowing()) {
            VideoPreviewActivity.e(this.a).dismiss();
            if (!App.I) {
                return;
            }
        }
        VideoPreviewActivity.e(this.a).a((View)VideoPreviewActivity.i(this.a), VideoPreviewActivity.i(this.a), VideoPreviewActivity.i(this.a), (View)VideoPreviewActivity.f(this.a));
        VideoPreviewActivity.i(this.a).setImageResource(2130838880);
    }
}
