// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class TrackReferenceTypeBox extends AbstractBox
{
    public static final String TYPE1 = "hint";
    public static final String TYPE2 = "cdsc";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private long[] trackIds;
    
    static {
        ajc$preClinit();
    }
    
    public TrackReferenceTypeBox(final String s) {
        super(s);
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TrackReferenceTypeBox.java", TrackReferenceTypeBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTrackIds", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "[J"), 40);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "java.lang.String"), 65);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        final int n = byteBuffer.remaining() / 4;
        this.trackIds = new long[n];
        for (int i = 0; i < n; ++i) {
            this.trackIds[i] = IsoTypeReader.readUInt32(byteBuffer);
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        final long[] trackIds = this.trackIds;
        for (int length = trackIds.length, i = 0; i < length; ++i) {
            IsoTypeWriter.writeUInt32(byteBuffer, trackIds[i]);
        }
    }
    
    @Override
    protected long getContentSize() {
        return 4 * this.trackIds.length;
    }
    
    public long[] getTrackIds() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackReferenceTypeBox.ajc$tjp_0, this, this));
        return this.trackIds;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackReferenceTypeBox.ajc$tjp_1, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("TrackReferenceTypeBox[type=").append(this.getType());
        for (int i = 0; i < this.trackIds.length; ++i) {
            sb.append(";trackId");
            sb.append(i);
            sb.append("=");
            sb.append(this.trackIds[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
