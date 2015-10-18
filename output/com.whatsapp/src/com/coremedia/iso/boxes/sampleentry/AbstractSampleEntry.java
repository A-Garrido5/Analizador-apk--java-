// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import com.googlecode.mp4parser.AbstractContainerBox;

public abstract class AbstractSampleEntry extends AbstractContainerBox implements SampleEntry
{
    protected int dataReferenceIndex;
    
    protected AbstractSampleEntry(final String s) {
        super(s);
        this.dataReferenceIndex = 1;
    }
    
    @Override
    public abstract void getBox(final WritableByteChannel p0) throws IOException;
    
    @Override
    public int getDataReferenceIndex() {
        return this.dataReferenceIndex;
    }
    
    @Override
    public abstract void parse(final FileChannel p0, final ByteBuffer p1, final long p2, final BoxParser p3) throws IOException;
    
    @Override
    public void setDataReferenceIndex(final int dataReferenceIndex) {
        this.dataReferenceIndex = dataReferenceIndex;
    }
}
