// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class e implements DialogInterface$OnCancelListener
{
    final WallpaperPicker a;
    
    e(final WallpaperPicker a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.removeDialog(1);
        this.a.finish();
    }
}
