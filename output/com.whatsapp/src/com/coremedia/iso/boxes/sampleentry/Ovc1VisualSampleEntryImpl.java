// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.IsoTypeReader;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import java.io.IOException;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class Ovc1VisualSampleEntryImpl extends AbstractSampleEntry
{
    public static final String TYPE = "ovc1";
    private byte[] vc1Content;
    
    public Ovc1VisualSampleEntryImpl() {
        super("ovc1");
        this.vc1Content = new byte[0];
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        writableByteChannel.write(ByteBuffer.wrap(this.vc1Content));
    }
    
    @Override
    public long getSize() {
        int n;
        if (this.largeBox || 16 + this.vc1Content.length >= 4294967296L) {
            n = 16;
        }
        else {
            n = 8;
        }
        return 8L + (n + this.vc1Content.length);
    }
    
    public byte[] getVc1Content() {
        return this.vc1Content;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(CastUtils.l2i(n));
        fileChannel.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        allocate.get(this.vc1Content = new byte[allocate.remaining()]);
    }
    
    public void setVc1Content(final byte[] vc1Content) {
        this.vc1Content = vc1Content;
    }
}
