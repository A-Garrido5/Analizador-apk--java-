// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.io.IOException;
import java.util.logging.Level;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class AbstractDescriptorBox extends AbstractFullBox
{
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static Logger log;
    public ByteBuffer data;
    public BaseDescriptor descriptor;
    
    static {
        ajc$preClinit();
        AbstractDescriptorBox.log = Logger.getLogger(AbstractDescriptorBox.class.getName());
    }
    
    public AbstractDescriptorBox(final String s) {
        super(s);
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AbstractDescriptorBox.java", AbstractDescriptorBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"), 54);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.lang.String"), 58);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 62);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"), 66);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.data.rewind();
            this.descriptor = ObjectDescriptorFactory.createFrom(-1, this.data);
        }
        catch (IOException ex) {
            AbstractDescriptorBox.log.log(Level.WARNING, "Error parsing ObjectDescriptor", ex);
        }
        catch (IndexOutOfBoundsException ex2) {
            AbstractDescriptorBox.log.log(Level.WARNING, "Error parsing ObjectDescriptor", ex2);
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        this.data.rewind();
        byteBuffer.put(this.data);
    }
    
    @Override
    protected long getContentSize() {
        return 4 + this.data.limit();
    }
    
    public BaseDescriptor getDescriptor() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractDescriptorBox.ajc$tjp_0, this, this));
        return this.descriptor;
    }
    
    public String getDescriptorAsString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractDescriptorBox.ajc$tjp_1, this, this));
        return this.descriptor.toString();
    }
    
    public void setData(final ByteBuffer data) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractDescriptorBox.ajc$tjp_3, this, this, data));
        this.data = data;
    }
    
    public void setDescriptor(final BaseDescriptor descriptor) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractDescriptorBox.ajc$tjp_2, this, this, descriptor));
        this.descriptor = descriptor;
    }
}
