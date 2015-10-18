// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox;

public class PiffTrackEncryptionBox extends AbstractTrackEncryptionBox
{
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    
    static {
        ajc$preClinit();
    }
    
    public PiffTrackEncryptionBox() {
        super("uuid");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("PiffTrackEncryptionBox.java", PiffTrackEncryptionBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFlags", "com.googlecode.mp4parser.boxes.piff.PiffTrackEncryptionBox", "", "", "", "int"), 29);
    }
    
    @Override
    public int getFlags() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(PiffTrackEncryptionBox.ajc$tjp_0, this, this));
        return 0;
    }
    
    @Override
    public byte[] getUserType() {
        return new byte[] { -119, 116, -37, -50, 123, -25, 76, 81, -124, -7, 113, 72, -7, -120, 37, 84 };
    }
}
