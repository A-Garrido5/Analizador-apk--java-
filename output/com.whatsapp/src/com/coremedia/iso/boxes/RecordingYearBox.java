// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class RecordingYearBox extends AbstractFullBox
{
    public static final String TYPE = "yrrc";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    int recordingYear;
    
    static {
        ajc$preClinit();
    }
    
    public RecordingYearBox() {
        super("yrrc");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("RecordingYearBox.java", RecordingYearBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "", "", "", "int"), 42);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "int", "recordingYear", "", "void"), 46);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.recordingYear = IsoTypeReader.readUInt16(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt16(byteBuffer, this.recordingYear);
    }
    
    @Override
    protected long getContentSize() {
        return 6L;
    }
    
    public int getRecordingYear() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(RecordingYearBox.ajc$tjp_0, this, this));
        return this.recordingYear;
    }
    
    public void setRecordingYear(final int recordingYear) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(RecordingYearBox.ajc$tjp_1, this, this, Conversions.intObject(recordingYear)));
        this.recordingYear = recordingYear;
    }
}
