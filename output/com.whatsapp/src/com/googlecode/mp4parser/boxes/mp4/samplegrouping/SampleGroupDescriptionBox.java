// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import org.aspectj.runtime.internal.Conversions;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class SampleGroupDescriptionBox extends AbstractFullBox
{
    public static final String TYPE = "sgpd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private int defaultLength;
    private int descriptionLength;
    private List<GroupEntry> groupEntries;
    private String groupingType;
    
    static {
        ajc$preClinit();
    }
    
    public SampleGroupDescriptionBox() {
        super("sgpd");
        this.groupEntries = new LinkedList<GroupEntry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("SampleGroupDescriptionBox.java", SampleGroupDescriptionBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 135);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.String", "groupingType", "", "void"), 139);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 143);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "int", "defaultLength", "", "void"), 147);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"), 155);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", "boolean"), 160);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 184);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 192);
    }
    
    private GroupEntry parseGroupEntry(final ByteBuffer byteBuffer, final String s) {
        GroupEntry groupEntry;
        if ("roll".equals(s)) {
            groupEntry = new RollRecoveryEntry();
        }
        else if ("rash".equals(s)) {
            groupEntry = new RateShareEntry();
        }
        else if ("seig".equals(s)) {
            groupEntry = new CencSampleEncryptionInformationGroupEntry();
        }
        else if ("rap ".equals(s)) {
            groupEntry = new VisualRandomAccessEntry();
        }
        else if ("tele".equals(s)) {
            groupEntry = new TemporalLevelEntry();
        }
        else {
            groupEntry = new UnknownEntry();
        }
        groupEntry.parse(byteBuffer);
        return groupEntry;
    }
    
    @Override
    protected void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        if (this.getVersion() != 1) {
            throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
        }
        this.groupingType = IsoTypeReader.read4cc(byteBuffer);
        if (this.getVersion() == 1) {
            this.defaultLength = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        }
        long uInt32 = IsoTypeReader.readUInt32(byteBuffer);
        while (true) {
            final long n = uInt32 - 1L;
            if (uInt32 <= 0L) {
                return;
            }
            int n2 = this.defaultLength;
            if (this.getVersion() != 1) {
                throw new RuntimeException("This should be implemented");
            }
            if (this.defaultLength == 0) {
                this.descriptionLength = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
                n2 = this.descriptionLength;
            }
            final int n3 = n2 + byteBuffer.position();
            final ByteBuffer slice = byteBuffer.slice();
            slice.limit(n2);
            this.groupEntries.add(this.parseGroupEntry(slice, this.groupingType));
            byteBuffer.position(n3);
            uInt32 = n;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_6, this, this, o));
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final SampleGroupDescriptionBox sampleGroupDescriptionBox = (SampleGroupDescriptionBox)o;
            if (this.defaultLength != sampleGroupDescriptionBox.defaultLength) {
                return false;
            }
            Label_0091: {
                if (this.groupEntries != null) {
                    if (this.groupEntries.equals(sampleGroupDescriptionBox.groupEntries)) {
                        break Label_0091;
                    }
                }
                else if (sampleGroupDescriptionBox.groupEntries == null) {
                    break Label_0091;
                }
                return false;
            }
            if (this.groupingType != null) {
                if (this.groupingType.equals(sampleGroupDescriptionBox.groupingType)) {
                    return true;
                }
            }
            else if (sampleGroupDescriptionBox.groupingType == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.groupingType.getBytes());
        if (this.getVersion() == 1) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.defaultLength);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.groupEntries.size());
        for (final GroupEntry groupEntry : this.groupEntries) {
            if (this.getVersion() == 1 && this.defaultLength == 0) {
                IsoTypeWriter.writeUInt32(byteBuffer, groupEntry.get().limit());
            }
            byteBuffer.put(groupEntry.get());
        }
    }
    
    @Override
    protected long getContentSize() {
        long n = 8L;
        if (this.getVersion() == 1) {
            n += 4L;
        }
        long n2 = n + 4L;
        for (final GroupEntry groupEntry : this.groupEntries) {
            if (this.getVersion() == 1 && this.defaultLength == 0) {
                n2 += 4L;
            }
            n2 += groupEntry.size();
        }
        return n2;
    }
    
    public int getDefaultLength() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_2, this, this));
        return this.defaultLength;
    }
    
    public List<GroupEntry> getGroupEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_4, this, this));
        return this.groupEntries;
    }
    
    public String getGroupingType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_0, this, this));
        return this.groupingType;
    }
    
    @Override
    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_7, this, this));
        int hashCode;
        if (this.groupingType != null) {
            hashCode = this.groupingType.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = 31 * (hashCode * 31 + this.defaultLength);
        final List<GroupEntry> groupEntries = this.groupEntries;
        int hashCode2 = 0;
        if (groupEntries != null) {
            hashCode2 = this.groupEntries.hashCode();
        }
        return n + hashCode2;
    }
    
    public void setDefaultLength(final int defaultLength) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_3, this, this, Conversions.intObject(defaultLength)));
        this.defaultLength = defaultLength;
    }
    
    public void setGroupEntries(final List<GroupEntry> groupEntries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_5, this, this, groupEntries));
        this.groupEntries = groupEntries;
    }
    
    public void setGroupingType(final String groupingType) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_1, this, this, groupingType));
        this.groupingType = groupingType;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_8, this, this));
        return "SampleGroupDescriptionBox{groupingType='" + this.groupingType + '\'' + ", defaultLength=" + this.defaultLength + ", groupEntries=" + this.groupEntries + '}';
    }
}
