// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.os.Parcelable;
import java.io.Serializable;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;

class a implements i
{
    final /* synthetic */ CameraActivity a;
    
    a(final CameraActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.setResult(0);
        this.a.finish();
    }
    
    @Override
    public void a(final MediaType mediaType, final MediaFile mediaFile) {
        this.a.setResult(-1, this.a.getIntent().putExtra("media_type", (Serializable)mediaType).putExtra("media_file", (Parcelable)mediaFile));
        this.a.finish();
    }
}
