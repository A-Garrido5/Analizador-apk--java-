// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.videoapp;

import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;
import com.twitter.android.av.i;

public class e extends i
{
    private VideoCardData b;
    
    public e(final VideoCardData b) {
        this.b = b;
    }
    
    @Override
    public Intent a(final Context context) {
        final Intent a = super.a(context);
        a.putExtra("video_canvas_data", (Parcelable)this.b);
        return a;
    }
    
    @Override
    protected Class a() {
        return VideoCardCanvasActivity.class;
    }
}
