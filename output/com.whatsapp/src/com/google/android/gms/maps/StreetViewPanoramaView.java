// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.util.AttributeSet;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.FrameLayout;

public class StreetViewPanoramaView extends FrameLayout
{
    private final StreetViewPanoramaView$zzb zzaCC;
    
    public StreetViewPanoramaView(final Context context) {
        super(context);
        this.zzaCC = new StreetViewPanoramaView$zzb((ViewGroup)this, context, null);
    }
    
    public StreetViewPanoramaView(final Context context, final AttributeSet set) {
        super(context, set);
        this.zzaCC = new StreetViewPanoramaView$zzb((ViewGroup)this, context, null);
    }
    
    public StreetViewPanoramaView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.zzaCC = new StreetViewPanoramaView$zzb((ViewGroup)this, context, null);
    }
    
    public StreetViewPanoramaView(final Context context, final StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.zzaCC = new StreetViewPanoramaView$zzb((ViewGroup)this, context, streetViewPanoramaOptions);
    }
}
