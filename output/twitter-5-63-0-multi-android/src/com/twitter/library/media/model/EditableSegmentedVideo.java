// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class EditableSegmentedVideo extends EditableMedia
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new e();
    }
    
    EditableSegmentedVideo(final Parcel parcel) {
        super(parcel);
    }
    
    public EditableSegmentedVideo(final SegmentedVideoFile segmentedVideoFile, final String s) {
        super(segmentedVideoFile, s);
    }
    
    private Object writeReplace() {
        return new EditableSegmentedVideo$SerializationProxy(this);
    }
    
    @Override
    public float a() {
        if (this.b()) {
            return 1.0f;
        }
        return ((SegmentedVideoFile)this.mediaFile).size.e();
    }
    
    public VideoFile a(final Context context) {
        return SegmentedVideoFile.a(context, this);
    }
    
    @Override
    public k b(final Context context) {
        return j.a(((SegmentedVideoFile)this.mediaFile).videoFiles.get(((SegmentedVideoFile)this.mediaFile).playList.get(0)));
    }
    
    public boolean b() {
        return ((SegmentedVideoFile)this.mediaFile).screenOrientation != 0 && ((SegmentedVideoFile)this.mediaFile).screenOrientation != 8;
    }
}
