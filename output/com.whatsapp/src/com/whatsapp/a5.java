// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.graphics.Palette$Swatch;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import com.whatsapp.util.b8;
import android.os.Build$VERSION;
import android.support.v7.graphics.Palette;
import android.support.v7.graphics.Palette$PaletteAsyncListener;

class a5 implements Palette$PaletteAsyncListener
{
    final ChatInfoActivity a;
    final ChatInfoLayout b;
    
    a5(final ChatInfoActivity a, final ChatInfoLayout b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void onGenerated(final Palette palette) {
        final Palette$Swatch mutedSwatch = palette.getMutedSwatch();
        int rgb = 0;
        Label_0126: {
            if (mutedSwatch != null) {
                rgb = mutedSwatch.getRgb();
                this.b.setColor(rgb);
                if (Build$VERSION.SDK_INT < 21) {
                    break Label_0126;
                }
                final float[] hsl = mutedSwatch.getHsl();
                hsl[2] = 8.0f * hsl[2] / 10.0f;
                this.a.getWindow().setStatusBarColor(b8.a(hsl));
                if (!App.I) {
                    break Label_0126;
                }
            }
            this.b.setColor(this.a.getResources().getColor(2131624025));
            if (Build$VERSION.SDK_INT >= 21) {
                this.a.getWindow().setStatusBarColor(this.a.getResources().getColor(2131624026));
            }
            rgb = 0;
        }
        this.a.findViewById(2131755368).setBackgroundDrawable((Drawable)new GradientDrawable(GradientDrawable$Orientation.BOTTOM_TOP, new int[] { 1711276032, rgb & 0xFFFFFF }));
        this.a.findViewById(2131755369).setBackgroundDrawable((Drawable)new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, new int[] { 855638016, rgb & 0xFFFFFF }));
    }
}
