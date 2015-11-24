// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class p implements DialogInterface$OnClickListener
{
    final WallpaperPicker a;
    
    p(final WallpaperPicker a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.finish();
    }
}
