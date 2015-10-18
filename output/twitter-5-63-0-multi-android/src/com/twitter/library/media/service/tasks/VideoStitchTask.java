// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.os.Parcelable;
import java.util.Iterator;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.media.MediaUtils;
import java.util.ArrayList;
import android.content.Context;
import android.os.Parcel;
import java.io.File;
import com.twitter.library.media.model.VideoFile;
import java.util.List;
import android.os.Parcelable$Creator;
import com.twitter.library.media.service.core.MediaServiceTask;

public class VideoStitchTask extends MediaServiceTask
{
    public static final Parcelable$Creator CREATOR;
    private List a;
    private VideoFile b;
    private File c;
    
    static {
        CREATOR = (Parcelable$Creator)new f();
    }
    
    private VideoStitchTask(final Parcel parcel) {
        this.a(parcel);
    }
    
    public VideoStitchTask(final List a, final File c) {
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void a(final Parcel parcel) {
        super.a(parcel);
        final ClassLoader classLoader = VideoFile.class.getClassLoader();
        this.a = parcel.readArrayList(classLoader);
        this.b = (VideoFile)parcel.readParcelable(classLoader);
        this.c = new File(parcel.readString());
    }
    
    @Override
    protected boolean b(final Context context) {
        if (this.c.exists()) {
            this.c.delete();
        }
        while (true) {
            ArrayList<File> list = null;
            Label_0176: {
                try {
                    if (this.a.size() != 1) {
                        list = new ArrayList<File>(this.a.size());
                        final Iterator<VideoFile> iterator = this.a.iterator();
                        while (iterator.hasNext()) {
                            list.add(iterator.next().file);
                        }
                        break Label_0176;
                    }
                    final VideoFile videoFile = this.a.get(0);
                    if (videoFile.duration <= 30000) {
                        return yh.b(this.a.get(0).file, this.c);
                    }
                    MediaUtils.a(videoFile.file, this.c, 0L, 30000L);
                    return true;
                }
                catch (Throwable t) {
                    ErrorReporter.a(t);
                }
                this.c.delete();
                return false;
            }
            if (MediaUtils.a(list, this.c, 0L, 30000L) != 0) {
                continue;
            }
            final VideoFile b = (VideoFile)MediaFile.a(this.c, MediaType.d);
            if (b != null) {
                this.b = b;
                return true;
            }
            continue;
        }
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeList(this.a);
        parcel.writeParcelable((Parcelable)this.b, n);
        parcel.writeString(this.c.getAbsolutePath());
    }
}
