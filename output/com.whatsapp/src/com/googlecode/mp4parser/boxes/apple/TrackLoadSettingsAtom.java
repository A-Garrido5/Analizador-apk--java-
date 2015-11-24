// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.apple;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class TrackLoadSettingsAtom extends AbstractBox
{
    public static final String TYPE = "load";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    int defaultHints;
    int preloadDuration;
    int preloadFlags;
    int preloadStartTime;
    
    static {
        ajc$preClinit();
    }
    
    public TrackLoadSettingsAtom() {
        super("load");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TrackLoadSettingsAtom.java", TrackLoadSettingsAtom.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPreloadStartTime", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 49);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPreloadStartTime", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadStartTime", "", "void"), 53);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPreloadDuration", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 57);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPreloadDuration", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadDuration", "", "void"), 61);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPreloadFlags", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 65);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPreloadFlags", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadFlags", "", "void"), 69);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultHints", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 73);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultHints", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "defaultHints", "", "void"), 77);
    }
    
    @Override
    protected void _parseDetails(final ByteBuffer byteBuffer) {
        this.preloadStartTime = byteBuffer.getInt();
        this.preloadDuration = byteBuffer.getInt();
        this.preloadFlags = byteBuffer.getInt();
        this.defaultHints = byteBuffer.getInt();
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.preloadStartTime);
        byteBuffer.putInt(this.preloadDuration);
        byteBuffer.putInt(this.preloadFlags);
        byteBuffer.putInt(this.defaultHints);
    }
    
    @Override
    protected long getContentSize() {
        return 16L;
    }
    
    public int getDefaultHints() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_6, this, this));
        return this.defaultHints;
    }
    
    public int getPreloadDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_2, this, this));
        return this.preloadDuration;
    }
    
    public int getPreloadFlags() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_4, this, this));
        return this.preloadFlags;
    }
    
    public int getPreloadStartTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_0, this, this));
        return this.preloadStartTime;
    }
    
    public void setDefaultHints(final int defaultHints) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_7, this, this, Conversions.intObject(defaultHints)));
        this.defaultHints = defaultHints;
    }
    
    public void setPreloadDuration(final int preloadDuration) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_3, this, this, Conversions.intObject(preloadDuration)));
        this.preloadDuration = preloadDuration;
    }
    
    public void setPreloadFlags(final int preloadFlags) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_5, this, this, Conversions.intObject(preloadFlags)));
        this.preloadFlags = preloadFlags;
    }
    
    public void setPreloadStartTime(final int preloadStartTime) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_1, this, this, Conversions.intObject(preloadStartTime)));
        this.preloadStartTime = preloadStartTime;
    }
}
