// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes;

import org.aspectj.runtime.internal.Conversions;
import java.util.UUID;
import java.nio.ByteOrder;
import com.coremedia.iso.IsoTypeWriter;
import java.util.Arrays;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public abstract class AbstractTrackEncryptionBox extends AbstractFullBox
{
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    int defaultAlgorithmId;
    int defaultIvSize;
    byte[] default_KID;
    
    static {
        ajc$preClinit();
    }
    
    protected AbstractTrackEncryptionBox(final String s) {
        super(s);
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AbstractTrackEncryptionBox.java", AbstractTrackEncryptionBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 24);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "int", "defaultAlgorithmId", "", "void"), 28);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 32);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "int", "defaultIvSize", "", "void"), 36);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "[B", "default_KID", "", "void"), 46);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "java.lang.Object", "o", "", "boolean"), 73);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 87);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.defaultAlgorithmId = IsoTypeReader.readUInt24(byteBuffer);
        this.defaultIvSize = IsoTypeReader.readUInt8(byteBuffer);
        byteBuffer.get(this.default_KID = new byte[16]);
    }
    
    @Override
    public boolean equals(final Object o) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_6, this, this, o));
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final AbstractTrackEncryptionBox abstractTrackEncryptionBox = (AbstractTrackEncryptionBox)o;
            if (this.defaultAlgorithmId != abstractTrackEncryptionBox.defaultAlgorithmId) {
                return false;
            }
            if (this.defaultIvSize != abstractTrackEncryptionBox.defaultIvSize) {
                return false;
            }
            if (!Arrays.equals(this.default_KID, abstractTrackEncryptionBox.default_KID)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt24(byteBuffer, this.defaultAlgorithmId);
        IsoTypeWriter.writeUInt8(byteBuffer, this.defaultIvSize);
        byteBuffer.put(this.default_KID);
    }
    
    @Override
    protected long getContentSize() {
        return 24L;
    }
    
    public int getDefaultAlgorithmId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_0, this, this));
        return this.defaultAlgorithmId;
    }
    
    public int getDefaultIvSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_2, this, this));
        return this.defaultIvSize;
    }
    
    public String getDefault_KID() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_4, this, this));
        final ByteBuffer wrap = ByteBuffer.wrap(this.default_KID);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return new UUID(wrap.getLong(), wrap.getLong()).toString();
    }
    
    @Override
    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_7, this, this));
        final int n = 31 * (31 * this.defaultAlgorithmId + this.defaultIvSize);
        int hashCode;
        if (this.default_KID != null) {
            hashCode = Arrays.hashCode(this.default_KID);
        }
        else {
            hashCode = 0;
        }
        return n + hashCode;
    }
    
    public void setDefaultAlgorithmId(final int defaultAlgorithmId) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_1, this, this, Conversions.intObject(defaultAlgorithmId)));
        this.defaultAlgorithmId = defaultAlgorithmId;
    }
    
    public void setDefaultIvSize(final int defaultIvSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_3, this, this, Conversions.intObject(defaultIvSize)));
        this.defaultIvSize = defaultIvSize;
    }
    
    public void setDefault_KID(final byte[] default_KID) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_5, this, this, default_KID));
        this.default_KID = default_KID;
    }
}
