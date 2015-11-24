// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;

public class ESDescriptorBox extends AbstractDescriptorBox
{
    public static final String TYPE = "esds";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    
    static {
        ajc$preClinit();
    }
    
    public ESDescriptorBox() {
        super("esds");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("ESDescriptorBox.java", ESDescriptorBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"), 33);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "", "boolean"), 38);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "int"), 49);
    }
    
    @Override
    public boolean equals(final Object o) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ESDescriptorBox.ajc$tjp_1, this, this, o));
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final ESDescriptorBox esDescriptorBox = (ESDescriptorBox)o;
            if (this.data != null) {
                if (this.data.equals(esDescriptorBox.data)) {
                    return true;
                }
            }
            else if (esDescriptorBox.data == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public ESDescriptor getEsDescriptor() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ESDescriptorBox.ajc$tjp_0, this, this));
        return (ESDescriptor)super.getDescriptor();
    }
    
    @Override
    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ESDescriptorBox.ajc$tjp_2, this, this));
        if (this.data != null) {
            return this.data.hashCode();
        }
        return 0;
    }
}
