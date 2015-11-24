// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.content.Context;
import android.view.OrientationEventListener;

class aa extends OrientationEventListener
{
    final /* synthetic */ z a;
    
    aa(final z a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public void onOrientationChanged(final int n) {
        this.a.a(n);
    }
}
