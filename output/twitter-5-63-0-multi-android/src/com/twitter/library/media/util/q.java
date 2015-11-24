// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.util.collection.g;
import com.twitter.library.api.MediaVideoVariant;
import com.twitter.library.featureswitch.d;
import java.util.Collections;
import java.util.List;
import com.twitter.library.provider.Tweet;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.media.model.MediaType;
import java.util.Iterator;
import com.twitter.internal.android.util.Size;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.library.api.MediaEntity;
import java.util.HashSet;
import java.util.Set;

public class q
{
    public static final Set a;
    
    static {
        (a = new HashSet()).add("video/mp4");
        q.a.add("video/webm");
    }
    
    public static MediaEntity a(final Iterable iterable) {
        final MediaEntity b = b(iterable);
        if (b != null && b.type == MediaEntity$Type.d && a(b)) {
            return b;
        }
        return b(iterable, Size.a);
    }
    
    public static MediaEntity a(final Iterable iterable, final MediaEntity$Type mediaEntity$Type) {
        for (final MediaEntity mediaEntity : iterable) {
            if (mediaEntity.type == mediaEntity$Type) {
                return mediaEntity;
            }
        }
        return null;
    }
    
    public static EditableMedia a(final Iterable iterable, final MediaType... array) {
        for (final EditableMedia editableMedia : iterable) {
            final MediaType e = editableMedia.e();
            for (int length = array.length, i = 0; i < length; ++i) {
                if (e == array[i]) {
                    return editableMedia;
                }
            }
        }
        return null;
    }
    
    public static List a(final Tweet tweet, final long n, final Size size) {
        return d(tweet.a(n), size);
    }
    
    public static List a(final Tweet tweet, final Size size) {
        return d(tweet.G.media, size);
    }
    
    public static List a(final Iterable iterable, final Size size) {
        final MediaEntity b = b(iterable);
        if (b != null && b.type == MediaEntity$Type.d && a(b)) {
            return Collections.singletonList(b);
        }
        return d(iterable, size);
    }
    
    public static boolean a(final MediaEntity mediaEntity) {
        if (d.f("video_consumption_enabled") && mediaEntity.videoInfo != null && mediaEntity.type == MediaEntity$Type.d) {
            final Iterator<MediaVideoVariant> iterator = mediaEntity.videoInfo.variants.iterator();
            while (iterator.hasNext()) {
                if (q.a.contains(iterator.next().contentType)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean a(final MediaEntity mediaEntity, final Size size) {
        return mediaEntity.type == MediaEntity$Type.b && mediaEntity.size.b(size) && !com.twitter.util.q.a(mediaEntity.mediaUrl);
    }
    
    public static boolean a(final Tweet tweet) {
        return b(tweet, Size.a) || tweet.I();
    }
    
    public static MediaEntity b(final Iterable iterable) {
        MediaEntity mediaEntity = null;
        for (MediaEntity mediaEntity2 : iterable) {
            if (mediaEntity2.sourceTweetId == 0L) {
                return mediaEntity2;
            }
            if (mediaEntity != null) {
                mediaEntity2 = mediaEntity;
            }
            mediaEntity = mediaEntity2;
        }
        return mediaEntity;
    }
    
    public static MediaEntity b(final Iterable iterable, final Size size) {
        MediaEntity mediaEntity = null;
        for (MediaEntity mediaEntity2 : iterable) {
            if (a(mediaEntity2, size)) {
                if (mediaEntity2.sourceTweetId == 0L) {
                    return mediaEntity2;
                }
                if (mediaEntity != null) {
                    mediaEntity2 = mediaEntity;
                }
                mediaEntity = mediaEntity2;
            }
        }
        return mediaEntity;
    }
    
    public static boolean b(final Tweet tweet, final Size size) {
        return c(tweet.G.media, size);
    }
    
    public static MediaEntity c(final Iterable iterable) {
        MediaEntity mediaEntity = null;
        for (MediaEntity mediaEntity2 : iterable) {
            if (a(mediaEntity2)) {
                if (mediaEntity2.sourceTweetId == 0L) {
                    return mediaEntity2;
                }
                if (mediaEntity != null) {
                    mediaEntity2 = mediaEntity;
                }
                mediaEntity = mediaEntity2;
            }
        }
        return mediaEntity;
    }
    
    public static boolean c(final Iterable iterable, final Size size) {
        final Iterator<MediaEntity> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (a(iterator.next(), size)) {
                return true;
            }
        }
        return false;
    }
    
    public static List d(final Iterable iterable, final Size size) {
        final g a = g.a();
        final Iterator<MediaEntity> iterator = iterable.iterator();
        long n = 0L;
    Label_0064_Outer:
        while (iterator.hasNext()) {
            final MediaEntity mediaEntity = iterator.next();
            while (true) {
                Label_0167: {
                    if (!a(mediaEntity, size)) {
                        break Label_0167;
                    }
                    long sourceTweetId;
                    if (mediaEntity.sourceTweetId == 0L) {
                        a.a(mediaEntity);
                        sourceTweetId = n;
                    }
                    else {
                        if (n != 0L) {
                            break Label_0167;
                        }
                        sourceTweetId = mediaEntity.sourceTweetId;
                    }
                    n = sourceTweetId;
                    continue Label_0064_Outer;
                }
                long sourceTweetId = n;
                continue;
            }
        }
        if (a.b() && n != 0L) {
            for (final MediaEntity mediaEntity2 : iterable) {
                if (a(mediaEntity2, size) && mediaEntity2.sourceTweetId == n) {
                    a.a(mediaEntity2);
                }
            }
        }
        return a.d();
    }
    
    public static boolean d(final Iterable iterable) {
        final Iterator<MediaEntity> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (a(iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    public static List e(final Iterable iterable) {
        final g a = g.a();
        for (final MediaEntity mediaEntity : iterable) {
            if (mediaEntity.type == MediaEntity$Type.b) {
                a.a(mediaEntity);
            }
        }
        return a.d();
    }
    
    public static List f(final Iterable iterable) {
        final List e = e(iterable);
        final g a = g.a().a(e.size());
        final Iterator<MediaEntity> iterator = e.iterator();
        while (iterator.hasNext()) {
            a.a(iterator.next().id);
        }
        return a.d();
    }
}
