// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.adaptivestreaming;

import java.io.IOException;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;

public interface ManifestWriter
{
    long[] calculateFragmentDurations(final Track p0, final Movie p1);
    
    long getBitrate(final Track p0);
    
    String getManifest(final Movie p0) throws IOException;
}
