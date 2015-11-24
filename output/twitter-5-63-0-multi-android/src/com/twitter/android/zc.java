// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class zc implements DialogInterface$OnClickListener
{
    final /* synthetic */ VideoEditorActivity a;
    
    zc(final VideoEditorActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.setResult(0);
        this.a.finish();
    }
}
