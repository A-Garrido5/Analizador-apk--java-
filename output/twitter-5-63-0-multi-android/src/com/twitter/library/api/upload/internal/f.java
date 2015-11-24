// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.service.aa;
import com.twitter.library.api.upload.p;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.client.as;
import com.twitter.library.media.util.MediaException;
import com.twitter.library.api.upload.MediaProcessorFactory;
import com.twitter.library.service.ab;
import android.content.Context;
import java.util.List;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.api.upload.i;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.api.upload.MediaProcessorFactory$MediaUsage;
import com.twitter.library.api.upload.n;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.ac;

class f extends ac
{
    final /* synthetic */ com.twitter.library.api.upload.internal.c a;
    final /* synthetic */ e b;
    
    f(final e b, final com.twitter.library.api.upload.internal.c a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a_(final a a) {
        this.b.a(this.a);
    }
}
