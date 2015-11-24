// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.model.m;
import java.util.concurrent.Callable;

class cl implements Callable
{
    final /* synthetic */ m a;
    final /* synthetic */ GalleryGridFragment b;
    
    cl(final GalleryGridFragment b, final m a) {
        this.b = b;
        this.a = a;
    }
    
    public EditableImage a() {
        return (EditableImage)this.a.a("gallery");
    }
}
