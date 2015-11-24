// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.widget.EditableMediaView;
import java.util.concurrent.Callable;

class ad implements Callable
{
    final /* synthetic */ EditableMediaView a;
    final /* synthetic */ MediaAttachmentsView b;
    
    ad(final MediaAttachmentsView b, final EditableMediaView a) {
        this.b = b;
        this.a = a;
    }
    
    public EditableImage a() {
        return (EditableImage)this.a.getEditableMedia();
    }
}
