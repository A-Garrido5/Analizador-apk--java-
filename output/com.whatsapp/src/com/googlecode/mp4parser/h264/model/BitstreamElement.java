// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264.model;

import java.io.IOException;
import java.io.OutputStream;

public abstract class BitstreamElement
{
    public abstract void write(final OutputStream p0) throws IOException;
}
