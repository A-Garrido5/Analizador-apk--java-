// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class AlbumBox extends AbstractFullBox
{
    public static final String TYPE = "albm";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private String albumTitle;
    private String language;
    private int trackNumber;
    
    static {
        ajc$preClinit();
    }
    
    public AlbumBox() {
        super("albm");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AlbumBox.java", AlbumBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 51);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 55);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "int"), 59);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "language", "", "void"), 63);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "albumTitle", "", "void"), 67);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "int", "trackNumber", "", "void"), 71);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 103);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.albumTitle = IsoTypeReader.readString(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            this.trackNumber = IsoTypeReader.readUInt8(byteBuffer);
            return;
        }
        this.trackNumber = -1;
    }
    
    public String getAlbumTitle() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumBox.ajc$tjp_1, this, this));
        return this.albumTitle;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.albumTitle));
        byteBuffer.put((byte)0);
        if (this.trackNumber != -1) {
            IsoTypeWriter.writeUInt8(byteBuffer, this.trackNumber);
        }
    }
    
    @Override
    protected long getContentSize() {
        final int n = 1 + (6 + Utf8.utf8StringLengthInBytes(this.albumTitle));
        int n2;
        if (this.trackNumber == -1) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        return n2 + n;
    }
    
    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumBox.ajc$tjp_0, this, this));
        return this.language;
    }
    
    public int getTrackNumber() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumBox.ajc$tjp_2, this, this));
        return this.trackNumber;
    }
    
    public void setAlbumTitle(final String albumTitle) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumBox.ajc$tjp_4, this, this, albumTitle));
        this.albumTitle = albumTitle;
    }
    
    public void setLanguage(final String language) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumBox.ajc$tjp_3, this, this, language));
        this.language = language;
    }
    
    public void setTrackNumber(final int trackNumber) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumBox.ajc$tjp_5, this, this, Conversions.intObject(trackNumber)));
        this.trackNumber = trackNumber;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumBox.ajc$tjp_6, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("AlbumBox[language=").append(this.getLanguage()).append(";");
        sb.append("albumTitle=").append(this.getAlbumTitle());
        if (this.trackNumber >= 0) {
            sb.append(";trackNumber=").append(this.getTrackNumber());
        }
        sb.append("]");
        return sb.toString();
    }
}
