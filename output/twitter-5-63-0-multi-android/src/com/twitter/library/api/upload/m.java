// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.library.api.upload.internal.e;
import java.util.List;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.service.ab;
import android.content.Context;

public class m
{
    private final Context a;
    private final ab b;
    
    public m(final Context a, final ab b) {
        this.a = a;
        this.b = b;
    }
    
    public void a(final EditableMedia editableMedia, final n n, final com.twitter.util.n n2, final MediaProcessorFactory$MediaUsage mediaProcessorFactory$MediaUsage, final List list) {
        new e(this.a, this.b, editableMedia, n, n2, mediaProcessorFactory$MediaUsage, list).a();
    }
}
