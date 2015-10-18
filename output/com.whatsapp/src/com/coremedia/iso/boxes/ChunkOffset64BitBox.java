// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;

public class ChunkOffset64BitBox extends ChunkOffsetBox
{
    public static final String TYPE = "co64";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private long[] chunkOffsets;
    
    static {
        ajc$preClinit();
    }
    
    public ChunkOffset64BitBox() {
        super("co64");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("ChunkOffset64BitBox.java", ChunkOffset64BitBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "", "", "", "[J"), 23);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int l2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.chunkOffsets = new long[l2i];
        for (int i = 0; i < l2i; ++i) {
            this.chunkOffsets[i] = IsoTypeReader.readUInt64(byteBuffer);
        }
    }
    
    @Override
    public long[] getChunkOffsets() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ChunkOffset64BitBox.ajc$tjp_0, this, this));
        return this.chunkOffsets;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.chunkOffsets.length);
        final long[] chunkOffsets = this.chunkOffsets;
        for (int length = chunkOffsets.length, i = 0; i < length; ++i) {
            IsoTypeWriter.writeUInt64(byteBuffer, chunkOffsets[i]);
        }
    }
    
    @Override
    protected long getContentSize() {
        return 8 + 8 * this.chunkOffsets.length;
    }
}
