// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.View;
import android.view.View$OnClickListener;

class a8 implements View$OnClickListener
{
    final ImagePreview a;
    
    a8(final ImagePreview a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.setResult(2);
        this.a.finish();
    }
}
