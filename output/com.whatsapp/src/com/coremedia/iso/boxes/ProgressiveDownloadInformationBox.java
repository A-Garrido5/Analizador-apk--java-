// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.util.LinkedList;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class ProgressiveDownloadInformationBox extends AbstractFullBox
{
    public static final String TYPE = "pdin";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public ProgressiveDownloadInformationBox() {
        super("pdin");
        this.entries = Collections.emptyList();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("ProgressiveDownloadInformationBox.java", ProgressiveDownloadInformationBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.util.List"), 38);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "java.util.List", "entries", "", "void"), 42);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.lang.String"), 112);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.entries = new LinkedList<Entry>();
        while (byteBuffer.remaining() >= 8) {
            this.entries.add(new Entry(IsoTypeReader.readUInt32(byteBuffer), IsoTypeReader.readUInt32(byteBuffer)));
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        for (final Entry entry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getRate());
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getInitialDelay());
        }
    }
    
    @Override
    protected long getContentSize() {
        return 4 + 8 * this.entries.size();
    }
    
    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ProgressiveDownloadInformationBox.ajc$tjp_0, this, this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ProgressiveDownloadInformationBox.ajc$tjp_1, this, this, entries));
        this.entries = entries;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ProgressiveDownloadInformationBox.ajc$tjp_2, this, this));
        return "ProgressiveDownloadInfoBox{entries=" + this.entries + '}';
    }
    
    public static class Entry
    {
        long initialDelay;
        long rate;
        
        public Entry(final long rate, final long initialDelay) {
            this.rate = rate;
            this.initialDelay = initialDelay;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final Entry entry = (Entry)o;
                if (this.initialDelay != entry.initialDelay) {
                    return false;
                }
                if (this.rate != entry.rate) {
                    return false;
                }
            }
            return true;
        }
        
        public long getInitialDelay() {
            return this.initialDelay;
        }
        
        public long getRate() {
            return this.rate;
        }
        
        @Override
        public int hashCode() {
            return 31 * (int)(this.rate ^ this.rate >>> 32) + (int)(this.initialDelay ^ this.initialDelay >>> 32);
        }
        
        public void setInitialDelay(final long initialDelay) {
            this.initialDelay = initialDelay;
        }
        
        public void setRate(final long rate) {
            this.rate = rate;
        }
        
        @Override
        public String toString() {
            return "Entry{rate=" + this.rate + ", initialDelay=" + this.initialDelay + '}';
        }
    }
}
