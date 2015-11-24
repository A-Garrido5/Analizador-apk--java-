// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.DateHelper;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import com.googlecode.mp4parser.util.Matrix;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class MovieHeaderBox extends AbstractFullBox
{
    public static final String TYPE = "mvhd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_15;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_16;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_17;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_18;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_19;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_20;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_21;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_22;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_23;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_24;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_25;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_26;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_27;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_28;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private Matrix matrix;
    private Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume;
    
    static {
        ajc$preClinit();
    }
    
    public MovieHeaderBox() {
        super("mvhd");
        this.rate = 1.0;
        this.volume = 1.0f;
        this.matrix = Matrix.ROTATE_0;
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("MovieHeaderBox.java", MovieHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 63);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 67);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "", "void"), 211);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "", "void"), 215);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"), 222);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"), 226);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 230);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "", "void"), 234);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 238);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"), 242);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 246);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 71);
        ajc$tjp_20 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"), 250);
        ajc$tjp_21 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 254);
        ajc$tjp_22 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"), 258);
        ajc$tjp_23 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 262);
        ajc$tjp_24 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"), 266);
        ajc$tjp_25 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 270);
        ajc$tjp_26 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"), 274);
        ajc$tjp_27 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 278);
        ajc$tjp_28 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"), 282);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 75);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "double"), 79);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 83);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 87);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 91);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), 139);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 195);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer));
            this.timescale = IsoTypeReader.readUInt32(byteBuffer);
            this.duration = IsoTypeReader.readUInt64(byteBuffer);
        }
        else {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer));
            this.timescale = IsoTypeReader.readUInt32(byteBuffer);
            this.duration = IsoTypeReader.readUInt32(byteBuffer);
        }
        this.rate = IsoTypeReader.readFixedPoint1616(byteBuffer);
        this.volume = IsoTypeReader.readFixedPoint88(byteBuffer);
        IsoTypeReader.readUInt16(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
        this.matrix = Matrix.fromByteBuffer(byteBuffer);
        this.previewTime = byteBuffer.getInt();
        this.previewDuration = byteBuffer.getInt();
        this.posterTime = byteBuffer.getInt();
        this.selectionTime = byteBuffer.getInt();
        this.selectionDuration = byteBuffer.getInt();
        this.currentTime = byteBuffer.getInt();
        this.nextTrackId = IsoTypeReader.readUInt32(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, this.timescale);
            IsoTypeWriter.writeUInt64(byteBuffer, this.duration);
        }
        else {
            IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, this.timescale);
            IsoTypeWriter.writeUInt32(byteBuffer, this.duration);
        }
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.rate);
        IsoTypeWriter.writeFixedPoint88(byteBuffer, this.volume);
        IsoTypeWriter.writeUInt16(byteBuffer, 0);
        IsoTypeWriter.writeUInt32(byteBuffer, 0L);
        IsoTypeWriter.writeUInt32(byteBuffer, 0L);
        this.matrix.getContent(byteBuffer);
        byteBuffer.putInt(this.previewTime);
        byteBuffer.putInt(this.previewDuration);
        byteBuffer.putInt(this.posterTime);
        byteBuffer.putInt(this.selectionTime);
        byteBuffer.putInt(this.selectionDuration);
        byteBuffer.putInt(this.currentTime);
        IsoTypeWriter.writeUInt32(byteBuffer, this.nextTrackId);
    }
    
    @Override
    protected long getContentSize() {
        long n;
        if (this.getVersion() == 1) {
            n = 4L + 28L;
        }
        else {
            n = 4L + 16L;
        }
        return n + 80L;
    }
    
    public Date getCreationTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_0, this, this));
        return this.creationTime;
    }
    
    public int getCurrentTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_27, this, this));
        return this.currentTime;
    }
    
    public long getDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_3, this, this));
        return this.duration;
    }
    
    public Matrix getMatrix() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_6, this, this));
        return this.matrix;
    }
    
    public Date getModificationTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_1, this, this));
        return this.modificationTime;
    }
    
    public long getNextTrackId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_7, this, this));
        return this.nextTrackId;
    }
    
    public int getPosterTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_21, this, this));
        return this.posterTime;
    }
    
    public int getPreviewDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_19, this, this));
        return this.previewDuration;
    }
    
    public int getPreviewTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_17, this, this));
        return this.previewTime;
    }
    
    public double getRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_4, this, this));
        return this.rate;
    }
    
    public int getSelectionDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_25, this, this));
        return this.selectionDuration;
    }
    
    public int getSelectionTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_23, this, this));
        return this.selectionTime;
    }
    
    public long getTimescale() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_2, this, this));
        return this.timescale;
    }
    
    public float getVolume() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_5, this, this));
        return this.volume;
    }
    
    public void setCreationTime(final Date creationTime) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_9, this, this, creationTime));
        this.creationTime = creationTime;
        if (DateHelper.convert(creationTime) >= 4294967296L) {
            this.setVersion(1);
        }
    }
    
    public void setCurrentTime(final int currentTime) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_28, this, this, Conversions.intObject(currentTime)));
        this.currentTime = currentTime;
    }
    
    public void setDuration(final long duration) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_12, this, this, Conversions.longObject(duration)));
        this.duration = duration;
        if (duration >= 4294967296L) {
            this.setVersion(1);
        }
    }
    
    public void setMatrix(final Matrix matrix) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_15, this, this, matrix));
        this.matrix = matrix;
    }
    
    public void setModificationTime(final Date modificationTime) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_10, this, this, modificationTime));
        this.modificationTime = modificationTime;
        if (DateHelper.convert(modificationTime) >= 4294967296L) {
            this.setVersion(1);
        }
    }
    
    public void setNextTrackId(final long nextTrackId) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_16, this, this, Conversions.longObject(nextTrackId)));
        this.nextTrackId = nextTrackId;
    }
    
    public void setPosterTime(final int posterTime) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_22, this, this, Conversions.intObject(posterTime)));
        this.posterTime = posterTime;
    }
    
    public void setPreviewDuration(final int previewDuration) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_20, this, this, Conversions.intObject(previewDuration)));
        this.previewDuration = previewDuration;
    }
    
    public void setPreviewTime(final int previewTime) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_18, this, this, Conversions.intObject(previewTime)));
        this.previewTime = previewTime;
    }
    
    public void setRate(final double rate) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_13, this, this, Conversions.doubleObject(rate)));
        this.rate = rate;
    }
    
    public void setSelectionDuration(final int selectionDuration) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_26, this, this, Conversions.intObject(selectionDuration)));
        this.selectionDuration = selectionDuration;
    }
    
    public void setSelectionTime(final int selectionTime) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_24, this, this, Conversions.intObject(selectionTime)));
        this.selectionTime = selectionTime;
    }
    
    public void setTimescale(final long timescale) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_11, this, this, Conversions.longObject(timescale)));
        this.timescale = timescale;
    }
    
    public void setVolume(final float volume) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_14, this, this, Conversions.floatObject(volume)));
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieHeaderBox.ajc$tjp_8, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("MovieHeaderBox[");
        sb.append("creationTime=").append(this.getCreationTime());
        sb.append(";");
        sb.append("modificationTime=").append(this.getModificationTime());
        sb.append(";");
        sb.append("timescale=").append(this.getTimescale());
        sb.append(";");
        sb.append("duration=").append(this.getDuration());
        sb.append(";");
        sb.append("rate=").append(this.getRate());
        sb.append(";");
        sb.append("volume=").append(this.getVolume());
        sb.append(";");
        sb.append("matrix=").append(this.matrix);
        sb.append(";");
        sb.append("nextTrackId=").append(this.getNextTrackId());
        sb.append("]");
        return sb.toString();
    }
}
