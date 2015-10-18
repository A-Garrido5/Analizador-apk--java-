// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class AlbumArtistBox extends AbstractFullBox
{
    public static final String TYPE = "albr";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private String albumArtist;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public AlbumArtistBox() {
        super("albr");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AlbumArtistBox.java", AlbumArtistBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAlbumArtist", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "java.lang.String", "language", "", "void"), 50);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAlbumArtist", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "java.lang.String", "albumArtist", "", "void"), 54);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 76);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.albumArtist = IsoTypeReader.readString(byteBuffer);
    }
    
    public String getAlbumArtist() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumArtistBox.ajc$tjp_1, this, this));
        return this.albumArtist;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.albumArtist));
        byteBuffer.put((byte)0);
    }
    
    @Override
    protected long getContentSize() {
        return 1 + (6 + Utf8.utf8StringLengthInBytes(this.albumArtist));
    }
    
    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumArtistBox.ajc$tjp_0, this, this));
        return this.language;
    }
    
    public void setAlbumArtist(final String albumArtist) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumArtistBox.ajc$tjp_3, this, this, albumArtist));
        this.albumArtist = albumArtist;
    }
    
    public void setLanguage(final String language) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumArtistBox.ajc$tjp_2, this, this, language));
        this.language = language;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AlbumArtistBox.ajc$tjp_4, this, this));
        return "AlbumArtistBox[language=" + this.getLanguage() + ";albumArtist=" + this.getAlbumArtist() + "]";
    }
}
