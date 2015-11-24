// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.FrameLayout;

public class StreetViewPanoramaView extends FrameLayout
{
    private final y a;
    private v b;
    
    public StreetViewPanoramaView(final Context context) {
        super(context);
        this.a = new y((ViewGroup)this, context, null);
    }
    
    public StreetViewPanoramaView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new y((ViewGroup)this, context, null);
    }
    
    public StreetViewPanoramaView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new y((ViewGroup)this, context, null);
    }
    
    @Deprecated
    public final v getStreetViewPanorama() {
        if (this.b != null) {
            return this.b;
        }
        this.a.g();
        if (this.a.a() == null) {
            return null;
        }
        try {
            return this.b = new v(((w)this.a.a()).f().a());
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
