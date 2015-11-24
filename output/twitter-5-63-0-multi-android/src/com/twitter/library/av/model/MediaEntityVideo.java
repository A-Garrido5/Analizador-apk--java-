// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import java.util.Iterator;
import com.twitter.library.telephony.TelephonyUtil$DownloadQuality;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import com.twitter.library.api.MediaVideoVariant;
import java.util.Map;
import com.twitter.library.telephony.d;
import com.twitter.library.api.MediaEntity;
import java.util.ArrayList;

public class MediaEntityVideo extends Video
{
    static final ArrayList a;
    
    static {
        (a = new ArrayList()).add("video/mp4");
        MediaEntityVideo.a.add("video/webm");
    }
    
    public MediaEntityVideo(final MediaEntity mediaEntity, final d d) {
        super(String.valueOf(mediaEntity.id), "video", 0L, a(mediaEntity, d), true, null, null);
    }
    
    private static String a(final MediaEntity mediaEntity, final d d) {
        if (mediaEntity.videoInfo != null) {
            for (final String s : MediaEntityVideo.a) {
                final ArrayList<MediaVideoVariant> list = (ArrayList<MediaVideoVariant>)new ArrayList<Object>();
                for (final MediaVideoVariant mediaVideoVariant : mediaEntity.videoInfo.variants) {
                    if (mediaVideoVariant.contentType.startsWith(s)) {
                        list.add(mediaVideoVariant);
                    }
                }
                if (list.size() > 0) {
                    Collections.sort((List<Object>)list, new g());
                    TelephonyUtil$DownloadQuality telephonyUtil$DownloadQuality;
                    if (d.a != TelephonyUtil$DownloadQuality.a) {
                        telephonyUtil$DownloadQuality = d.a;
                    }
                    else {
                        telephonyUtil$DownloadQuality = TelephonyUtil$DownloadQuality.e;
                    }
                    final float n = 4.0f * (1024.0f * telephonyUtil$DownloadQuality.c());
                    for (final MediaVideoVariant mediaVideoVariant2 : list) {
                        if (mediaVideoVariant2.bitrate <= n) {
                            return mediaVideoVariant2.url;
                        }
                    }
                    return list.get(-1 + list.size()).url;
                }
            }
        }
        return "";
    }
}
