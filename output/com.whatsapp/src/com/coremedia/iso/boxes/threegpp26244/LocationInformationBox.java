// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.threegpp26244;

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

public class LocationInformationBox extends AbstractFullBox
{
    public static final String TYPE = "loci";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_15;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private String additionalNotes;
    private double altitude;
    private String astronomicalBody;
    private String language;
    private double latitude;
    private double longitude;
    private String name;
    private int role;
    
    static {
        ajc$preClinit();
    }
    
    public LocationInformationBox() {
        super("loci");
        this.name = "";
        this.astronomicalBody = "";
        this.additionalNotes = "";
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("LocationInformationBox.java", LocationInformationBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 30);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "language", "", "void"), 34);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 70);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "altitude", "", "void"), 74);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", "void"), 82);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 86);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", "void"), 90);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "name", "", "void"), 42);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "int"), 46);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "int", "role", "", "void"), 50);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 54);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "longitude", "", "void"), 58);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 62);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "latitude", "", "void"), 66);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.name = IsoTypeReader.readString(byteBuffer);
        this.role = IsoTypeReader.readUInt8(byteBuffer);
        this.longitude = IsoTypeReader.readFixedPoint1616(byteBuffer);
        this.latitude = IsoTypeReader.readFixedPoint1616(byteBuffer);
        this.altitude = IsoTypeReader.readFixedPoint1616(byteBuffer);
        this.astronomicalBody = IsoTypeReader.readString(byteBuffer);
        this.additionalNotes = IsoTypeReader.readString(byteBuffer);
    }
    
    public String getAdditionalNotes() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_14, this, this));
        return this.additionalNotes;
    }
    
    public double getAltitude() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_10, this, this));
        return this.altitude;
    }
    
    public String getAstronomicalBody() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_12, this, this));
        return this.astronomicalBody;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.name));
        byteBuffer.put((byte)0);
        IsoTypeWriter.writeUInt8(byteBuffer, this.role);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.longitude);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.latitude);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.altitude);
        byteBuffer.put(Utf8.convert(this.astronomicalBody));
        byteBuffer.put((byte)0);
        byteBuffer.put(Utf8.convert(this.additionalNotes));
        byteBuffer.put((byte)0);
    }
    
    @Override
    protected long getContentSize() {
        return 22 + Utf8.convert(this.name).length + Utf8.convert(this.astronomicalBody).length + Utf8.convert(this.additionalNotes).length;
    }
    
    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_0, this, this));
        return this.language;
    }
    
    public double getLatitude() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_8, this, this));
        return this.latitude;
    }
    
    public double getLongitude() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_6, this, this));
        return this.longitude;
    }
    
    public String getName() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_2, this, this));
        return this.name;
    }
    
    public int getRole() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_4, this, this));
        return this.role;
    }
    
    public void setAdditionalNotes(final String additionalNotes) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_15, this, this, additionalNotes));
        this.additionalNotes = additionalNotes;
    }
    
    public void setAltitude(final double altitude) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_11, this, this, Conversions.doubleObject(altitude)));
        this.altitude = altitude;
    }
    
    public void setAstronomicalBody(final String astronomicalBody) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_13, this, this, astronomicalBody));
        this.astronomicalBody = astronomicalBody;
    }
    
    public void setLanguage(final String language) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_1, this, this, language));
        this.language = language;
    }
    
    public void setLatitude(final double latitude) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_9, this, this, Conversions.doubleObject(latitude)));
        this.latitude = latitude;
    }
    
    public void setLongitude(final double longitude) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_7, this, this, Conversions.doubleObject(longitude)));
        this.longitude = longitude;
    }
    
    public void setName(final String name) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_3, this, this, name));
        this.name = name;
    }
    
    public void setRole(final int role) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LocationInformationBox.ajc$tjp_5, this, this, Conversions.intObject(role)));
        this.role = role;
    }
}
