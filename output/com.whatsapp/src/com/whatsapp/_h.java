// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class _h implements View$OnClickListener
{
    final VideoPreviewActivity a;
    
    _h(final VideoPreviewActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.setResult(2);
        this.a.finish();
    }
}
