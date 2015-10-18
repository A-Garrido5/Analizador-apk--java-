// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import android.content.Context;
import com.twitter.util.g;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class EditableVideo extends EditableMedia
{
    public static final Parcelable$Creator CREATOR;
    public int clipEnd;
    public int clipStart;
    
    static {
        CREATOR = (Parcelable$Creator)new f();
    }
    
    EditableVideo(final Parcel parcel) {
        super(parcel);
        this.clipStart = parcel.readInt();
        this.clipEnd = parcel.readInt();
    }
    
    public EditableVideo(final VideoFile videoFile, final String s) {
        super(videoFile, s);
        final int min = Math.min(videoFile.duration, 20000);
        this.clipStart = g.a(0, videoFile.duration - min, videoFile.duration);
        this.clipEnd = Math.min(min + this.clipStart, videoFile.duration);
    }
    
    private Object writeReplace() {
        return new EditableVideo$SerializationProxy(this);
    }
    
    @Override
    public float a() {
        return ((VideoFile)this.mediaFile).size.e();
    }
    
    public VideoFile a(final Context context) {
        return VideoFile.a(context, this);
    }
    
    public boolean a(final EditableVideo editableVideo) {
        return this == editableVideo || (editableVideo != null && this.b(editableVideo) && editableVideo.clipStart == this.clipStart && editableVideo.clipEnd == this.clipEnd);
    }
    
    public int b() {
        return this.clipEnd - this.clipStart;
    }
    
    @Override
    public k b(final Context context) {
        return j.a(this.mediaFile);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof EditableVideo && this.a((EditableVideo)o));
    }
    
    public boolean h() {
        return this.clipStart > 0 || this.clipEnd < ((VideoFile)this.mediaFile).duration || this.clipEnd - this.clipStart > 30000;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * super.hashCode() + this.clipStart) + this.clipEnd;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.clipStart);
        parcel.writeInt(this.clipEnd);
    }
}
