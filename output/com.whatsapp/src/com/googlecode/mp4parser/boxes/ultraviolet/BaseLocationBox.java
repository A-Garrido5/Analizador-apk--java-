// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.ultraviolet;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class BaseLocationBox extends AbstractFullBox
{
    public static final String TYPE = "bloc";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    String baseLocation;
    String purchaseLocation;
    
    static {
        ajc$preClinit();
    }
    
    public BaseLocationBox() {
        super("bloc");
        this.baseLocation = "";
        this.purchaseLocation = "";
    }
    
    public BaseLocationBox(final String baseLocation, final String purchaseLocation) {
        super("bloc");
        this.baseLocation = "";
        this.purchaseLocation = "";
        this.baseLocation = baseLocation;
        this.purchaseLocation = purchaseLocation;
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("BaseLocationBox.java", BaseLocationBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBaseLocation", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBaseLocation", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "java.lang.String", "baseLocation", "", "void"), 48);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPurchaseLocation", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPurchaseLocation", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "java.lang.String", "purchaseLocation", "", "void"), 56);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "java.lang.Object", "o", "", "boolean"), 86);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "", "", "", "int"), 100);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "", "", "", "java.lang.String"), 107);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.baseLocation = IsoTypeReader.readString(byteBuffer);
        byteBuffer.get(new byte[-1 + (256 - Utf8.utf8StringLengthInBytes(this.baseLocation))]);
        this.purchaseLocation = IsoTypeReader.readString(byteBuffer);
        byteBuffer.get(new byte[-1 + (256 - Utf8.utf8StringLengthInBytes(this.purchaseLocation))]);
        byteBuffer.get(new byte[512]);
    }
    
    @Override
    public boolean equals(final Object o) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseLocationBox.ajc$tjp_4, this, this, o));
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final BaseLocationBox baseLocationBox = (BaseLocationBox)o;
            Label_0076: {
                if (this.baseLocation != null) {
                    if (this.baseLocation.equals(baseLocationBox.baseLocation)) {
                        break Label_0076;
                    }
                }
                else if (baseLocationBox.baseLocation == null) {
                    break Label_0076;
                }
                return false;
            }
            if (this.purchaseLocation != null) {
                if (this.purchaseLocation.equals(baseLocationBox.purchaseLocation)) {
                    return true;
                }
            }
            else if (baseLocationBox.purchaseLocation == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public String getBaseLocation() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseLocationBox.ajc$tjp_0, this, this));
        return this.baseLocation;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(Utf8.convert(this.baseLocation));
        byteBuffer.put(new byte[256 - Utf8.utf8StringLengthInBytes(this.baseLocation)]);
        byteBuffer.put(Utf8.convert(this.purchaseLocation));
        byteBuffer.put(new byte[256 - Utf8.utf8StringLengthInBytes(this.purchaseLocation)]);
        byteBuffer.put(new byte[512]);
    }
    
    @Override
    protected long getContentSize() {
        return 1028L;
    }
    
    public String getPurchaseLocation() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseLocationBox.ajc$tjp_2, this, this));
        return this.purchaseLocation;
    }
    
    @Override
    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseLocationBox.ajc$tjp_5, this, this));
        int hashCode;
        if (this.baseLocation != null) {
            hashCode = this.baseLocation.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        final String purchaseLocation = this.purchaseLocation;
        int hashCode2 = 0;
        if (purchaseLocation != null) {
            hashCode2 = this.purchaseLocation.hashCode();
        }
        return n + hashCode2;
    }
    
    public void setBaseLocation(final String baseLocation) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseLocationBox.ajc$tjp_1, this, this, baseLocation));
        this.baseLocation = baseLocation;
    }
    
    public void setPurchaseLocation(final String purchaseLocation) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseLocationBox.ajc$tjp_3, this, this, purchaseLocation));
        this.purchaseLocation = purchaseLocation;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseLocationBox.ajc$tjp_6, this, this));
        return "BaseLocationBox{baseLocation='" + this.baseLocation + '\'' + ", purchaseLocation='" + this.purchaseLocation + '\'' + '}';
    }
}
