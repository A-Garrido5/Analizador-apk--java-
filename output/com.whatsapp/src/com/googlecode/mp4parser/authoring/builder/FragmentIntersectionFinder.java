// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;

public interface FragmentIntersectionFinder
{
    long[] sampleNumbers(final Track p0, final Movie p1);
}
