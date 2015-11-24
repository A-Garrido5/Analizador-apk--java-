// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Gallery;

public class CustomVelocityGallery extends Gallery
{
    private aqx a;
    
    public CustomVelocityGallery(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, float a, final float n) {
        if (this.a != null) {
            a = this.a.a(a);
        }
        return super.onFling(motionEvent, motionEvent2, a, n);
    }
    
    public void setVelocityTransformer(final aqx a) {
        this.a = a;
    }
}
