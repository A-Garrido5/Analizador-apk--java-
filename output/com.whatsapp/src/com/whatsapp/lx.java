// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;

class lx extends l1
{
    final VideoPreviewActivity k;
    
    lx(final VideoPreviewActivity k, final Activity activity) {
        this.k = k;
        super(activity);
    }
    
    @Override
    public void dismiss() {
        super.dismiss();
        VideoPreviewActivity.i(this.k).setImageResource(2130838878);
    }
}
