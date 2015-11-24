// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.twitter.internal.android.util.Size;
import android.hardware.Camera;
import android.hardware.Camera$CameraInfo;
import com.twitter.library.media.model.SegmentedVideoFile;
import com.twitter.library.media.model.EditableSegmentedVideo;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ScribeSectionSegmentedVideo extends ScribeSection
{
    public static final Parcelable$Creator CREATOR;
    private static final String[] a;
    
    static {
        CREATOR = (Parcelable$Creator)new j();
        a = new String[] { "event_namespace", "media_count", "media_position", "original_media_position", "orientation", "source", "torch_active", "duration_ms" };
    }
    
    public ScribeSectionSegmentedVideo() {
        super(null, ScribeSectionSegmentedVideo.a.length);
    }
    
    public ScribeSectionSegmentedVideo(final Parcel parcel) {
        super(parcel);
    }
    
    public ScribeSectionSegmentedVideo(final EditableSegmentedVideo editableSegmentedVideo) {
        int n = 1;
        this();
        final SegmentedVideoFile segmentedVideoFile = (SegmentedVideoFile)editableSegmentedVideo.mediaFile;
        final Size size = segmentedVideoFile.size;
        int n2;
        if (size.a() > size.b()) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        this.c(n2);
        final Camera$CameraInfo camera$CameraInfo = new Camera$CameraInfo();
        Camera.getCameraInfo(segmentedVideoFile.cameraId, camera$CameraInfo);
        if (camera$CameraInfo.facing != n) {
            n = 0;
        }
        this.d(n);
        this.a(segmentedVideoFile.videoFiles.size(), 0, segmentedVideoFile.d());
    }
    
    public ScribeSectionSegmentedVideo a(final int n, final int n2, final long n3) {
        this.a(1, n);
        this.a(2, n2);
        this.a(7, n3);
        return this;
    }
    
    public ScribeSectionSegmentedVideo a(final String s) {
        this.a(0, new ScribeSectionNamespace(s));
        return this;
    }
    
    public ScribeSectionSegmentedVideo a(final boolean b) {
        this.a(6, b);
        return this;
    }
    
    @Override
    protected String a(final int n) {
        return ScribeSectionSegmentedVideo.a[n];
    }
    
    public ScribeSectionSegmentedVideo b(final int n) {
        this.a(3, n);
        return this;
    }
    
    public ScribeSectionSegmentedVideo c(final int n) {
        this.a(4, n);
        return this;
    }
    
    public ScribeSectionSegmentedVideo d(final int n) {
        this.a(5, n);
        return this;
    }
}
