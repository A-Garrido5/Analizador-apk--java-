// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import java.io.File;
import com.twitter.library.media.model.VideoFile;
import com.twitter.internal.network.l;
import com.twitter.library.util.ak;
import android.content.Context;

public class ao extends t
{
    ao(final String s, final Context context, final ak ak, final a a) {
        super(s, context, ak, a, null);
    }
    
    protected ResourceResponse a(final ap ap, final VideoFile videoFile, final ResourceResponse$ResourceSource resourceResponse$ResourceSource, final l l) {
        return new ResourceResponse(ap, videoFile, resourceResponse$ResourceSource, l);
    }
    
    protected VideoFile a(final ap ap, final File file) {
        return VideoFile.a(file);
    }
    
    protected boolean a(final VideoFile videoFile) {
        return true;
    }
}
