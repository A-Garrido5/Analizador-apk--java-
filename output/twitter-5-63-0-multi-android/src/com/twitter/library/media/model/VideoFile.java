// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.library.media.service.tasks.VideoTranscodeTask;
import com.twitter.library.media.util.am;
import android.annotation.TargetApi;
import com.twitter.library.media.util.transcode.TranscoderException;
import com.twitter.errorreporter.ErrorReporter;
import android.util.Log;
import android.os.SystemClock;
import com.twitter.library.media.service.tasks.VideoTrimTask;
import com.twitter.util.g;
import com.twitter.library.media.service.tasks.VideoMuxTask;
import com.twitter.library.util.af;
import android.os.Build$VERSION;
import com.twitter.util.d;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import java.io.File;
import android.os.Parcel;
import com.twitter.internal.android.util.Size;
import android.os.Parcelable$Creator;

public class VideoFile extends MediaFile
{
    public static final Parcelable$Creator CREATOR;
    public static final Size b;
    public final int duration;
    
    static {
        b = Size.a(1280, 1024);
        CREATOR = (Parcelable$Creator)new r();
    }
    
    VideoFile(final Parcel parcel) {
        super(parcel);
        this.duration = parcel.readInt();
    }
    
    VideoFile(final File file, final int duration, final Size size) {
        super(file, size, MediaType.d);
        this.duration = duration;
    }
    
    private static int a(final MediaMetadataRetriever mediaMetadataRetriever, final int n) {
        final String metadata = mediaMetadataRetriever.extractMetadata(n);
        if (metadata == null) {
            return 0;
        }
        return Integer.parseInt(metadata);
    }
    
    public static VideoFile a(final Context context, final EditableVideo editableVideo) {
        d.c();
        if (Build$VERSION.SDK_INT >= 18 && com.twitter.library.featureswitch.d.f("video_compose_import_method_java_enabled")) {
            return b(context, editableVideo);
        }
        if (Build$VERSION.SDK_INT >= 16 && com.twitter.library.featureswitch.d.f("video_compose_import_method_twittermedia_enabled")) {
            return c(context, editableVideo);
        }
        return null;
    }
    
    public static VideoFile a(final File file) {
        while (true) {
            d.c();
            final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            while (true) {
                Size size;
                try {
                    mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                    final int a = a(mediaMetadataRetriever, 9);
                    if (a == 0) {
                        return null;
                    }
                    final int a2 = a(mediaMetadataRetriever, 18);
                    final int a3 = a(mediaMetadataRetriever, 19);
                    if (Build$VERSION.SDK_INT < 17) {
                        final Size a4 = Size.a(a2, a3);
                        return new VideoFile(file, a, a4);
                    }
                    if (a(mediaMetadataRetriever, 24) % 180 == 0) {
                        size = Size.a(a2, a3);
                    }
                    else {
                        size = Size.a(a3, a2);
                    }
                }
                finally {
                    mediaMetadataRetriever.release();
                }
                final Size a4 = size;
                continue;
            }
        }
    }
    
    private static File a(final Context context, final File file, final File file2, final int n, final Size size) {
        d.c();
        final File a = af.a(context, MediaType.d.extension);
        if (a != null && new VideoMuxTask(file, file2, a, n, size).d(context)) {
            return a;
        }
        return null;
    }
    
    private static int[] a(final Context context, final EditableVideo editableVideo, final File file) {
        d.c();
        if (!editableVideo.h()) {
            return new int[] { 0, -1 };
        }
        final int duration = ((VideoFile)editableVideo.mediaFile).duration;
        final int a = g.a(editableVideo.clipStart, 0, duration);
        final VideoTrimTask videoTrimTask = new VideoTrimTask(editableVideo.c(), file, a, Math.min(g.a(editableVideo.clipEnd, a, duration) - a, 30000));
        if (videoTrimTask.a(context, 300000)) {
            return new int[] { videoTrimTask.c(), videoTrimTask.d() };
        }
        return null;
    }
    
    @TargetApi(18)
    private static VideoFile b(final Context context, final EditableVideo editableVideo) {
        Object a = null;
        SystemClock.elapsedRealtime();
        int n = 3;
        int n2 = 3500000;
        float n3 = 0.9f;
        int n4 = 3;
        while (n > 0 && n4 > 0) {
            final File a2 = af.a(context, MediaType.d.extension);
            if (a2 == null) {
                --n;
            }
            else {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final com.twitter.library.media.util.transcode.d a3 = new com.twitter.library.media.util.transcode.d(((VideoFile)editableVideo.mediaFile).file.getAbsolutePath(), a2.getAbsolutePath()).b(38).a(VideoFile.b).a(1000 * editableVideo.clipStart, 1000 * (editableVideo.clipEnd - editableVideo.clipStart)).a(n2);
                try {
                    a3.b();
                    a = a3.a();
                    if (a2.length() > 13631488L) {
                        n2 = 200000 * ((int)(n3 * (13631488 * n2 / a2.length())) / 200000);
                        --n4;
                        final float n5 = n3 - 0.1f;
                        af.b(a2);
                        n3 = n5;
                        continue;
                    }
                }
                catch (TranscoderException ex) {
                    Log.e("VideoFile", "Error transcoding file", (Throwable)ex);
                    ErrorReporter.a(ex);
                    if (!ex.a()) {
                        goto Label_0319;
                    }
                }
                catch (InterruptedException ex2) {
                    goto Label_0249;
                }
                if (a2.length() != 0L) {
                    Log.i("VideoFile", "Video " + ((VideoFile)editableVideo.mediaFile).file + " transcoded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms " + a);
                    goto Label_0249;
                }
                --n;
            }
        }
        goto Label_0249;
    }
    
    @TargetApi(16)
    private static VideoFile c(final Context context, final EditableVideo editableVideo) {
        File file;
        int[] array;
        if (editableVideo.h()) {
            file = af.a(context, MediaType.d.extension);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            array = a(context, editableVideo, file);
            if (array == null) {
                Log.w("VideoFile", "Can't trim video " + ((VideoFile)editableVideo.mediaFile).file);
                return null;
            }
            Log.i("VideoFile", "Video " + ((VideoFile)editableVideo.mediaFile).file + " trimmed " + editableVideo.clipStart + ':' + editableVideo.clipEnd + " [" + (editableVideo.clipEnd - editableVideo.clipStart) + "] in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
        else {
            file = ((VideoFile)editableVideo.mediaFile).file;
            array = am.a;
        }
        if (file.length() <= 13631488L && VideoFile.b.b(((VideoFile)editableVideo.mediaFile).size)) {
            return (VideoFile)MediaFile.a(file, MediaType.d);
        }
        File file2 = null;
        int n = 3;
        int n2 = 3;
        int n3 = 3500000;
        float n4 = 0.9f;
        int n5 = 1;
        Size size = null;
        while (true) {
            while (n > 0 && n2 > 0) {
                final File a = af.a(context, MediaType.d.extension);
                final long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Size d;
                int n6;
                File file3;
                if (a != null) {
                    final VideoTranscodeTask videoTranscodeTask = new VideoTranscodeTask(file, a, n3, array, 38, VideoFile.b);
                    if (videoTranscodeTask.a(context, 600000)) {
                        final int c = videoTranscodeTask.c();
                        d = videoTranscodeTask.d();
                        n6 = c;
                        file3 = a;
                    }
                    else {
                        d = size;
                        n6 = n5;
                        file3 = null;
                    }
                }
                else {
                    d = size;
                    n6 = n5;
                    file3 = a;
                }
                int n8;
                float n9;
                int n10;
                if (file3 != null) {
                    if (file3.length() <= 13631488L) {
                        Log.i("VideoFile", "Video " + ((VideoFile)editableVideo.mediaFile).file + " transcoded in " + (SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms " + d);
                        final Size size2 = d;
                        final int n7 = n6;
                        final File file4 = file3;
                        if (file4 == null || !file4.exists() || file4.length() == 0L || size2 == null) {
                            Log.w("VideoFile", "Can't transcode video " + ((VideoFile)editableVideo.mediaFile).file);
                            af.b(file);
                            af.b(file4);
                            return null;
                        }
                        final long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        final File a2 = a(context, file, file4, n7, size2);
                        af.b(file);
                        af.b(file4);
                        if (a2 == null || a2.length() == 0L) {
                            Log.w("VideoFile", "Can't mux video " + ((VideoFile)editableVideo.mediaFile).file);
                            af.b(a2);
                            return null;
                        }
                        Log.i("VideoFile", "Video " + ((VideoFile)editableVideo.mediaFile).file + " muxed in " + (SystemClock.elapsedRealtime() - elapsedRealtime3) + "ms");
                        return (VideoFile)MediaFile.a(a2, MediaType.d);
                    }
                    else {
                        n3 = 200000 * ((int)(n4 * (13631488 * n3 / file3.length())) / 200000);
                        n8 = n2 - 1;
                        n9 = n4 - 0.1f;
                        file3.delete();
                        n10 = n;
                    }
                }
                else {
                    final int n11 = n - 1;
                    n8 = n2;
                    n10 = n11;
                    n9 = n4;
                }
                n4 = n9;
                n2 = n8;
                n = n10;
                file2 = file3;
                n5 = n6;
                size = d;
            }
            final int n7 = n5;
            final File file4 = file2;
            final Size size2 = size;
            continue;
        }
    }
    
    private Object writeReplace() {
        return new VideoFile$SerializationProxy(this);
    }
    
    public boolean a(final VideoFile videoFile) {
        return this == videoFile || (videoFile != null && this.a(videoFile) && videoFile.duration == this.duration);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof VideoFile && this.a((VideoFile)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.duration;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.duration);
    }
}
