// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class q implements DialogInterface$OnClickListener
{
    final WallpaperPicker a;
    final String b;
    
    q(final WallpaperPicker a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.startActivity(new Intent(this.b));
    }
}
