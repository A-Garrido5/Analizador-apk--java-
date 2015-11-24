// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class DataEntryUrnBox extends AbstractFullBox
{
    public static final String TYPE = "urn ";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private String location;
    private String name;
    
    static {
        ajc$preClinit();
    }
    
    public DataEntryUrnBox() {
        super("urn ");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("DataEntryUrnBox.java", DataEntryUrnBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getName", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLocation", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 67);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.name = IsoTypeReader.readString(byteBuffer);
        this.location = IsoTypeReader.readString(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(Utf8.convert(this.name));
        byteBuffer.put((byte)0);
        byteBuffer.put(Utf8.convert(this.location));
        byteBuffer.put((byte)0);
    }
    
    @Override
    protected long getContentSize() {
        return 1 + (1 + Utf8.utf8StringLengthInBytes(this.name) + Utf8.utf8StringLengthInBytes(this.location));
    }
    
    public String getLocation() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DataEntryUrnBox.ajc$tjp_1, this, this));
        return this.location;
    }
    
    public String getName() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DataEntryUrnBox.ajc$tjp_0, this, this));
        return this.name;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DataEntryUrnBox.ajc$tjp_2, this, this));
        return "DataEntryUrlBox[name=" + this.getName() + ";location=" + this.getLocation() + "]";
    }
}
