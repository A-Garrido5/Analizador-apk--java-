// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.media.model.EditableImage;
import java.util.concurrent.Callable;

class ck implements Callable
{
    final /* synthetic */ EditableImage a;
    final /* synthetic */ GalleryGridFragment b;
    
    ck(final GalleryGridFragment b, final EditableImage a) {
        this.b = b;
        this.a = a;
    }
    
    public EditableImage a() {
        return this.a;
    }
}
