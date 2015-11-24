// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model.factory;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo$CodecProfileLevel;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.twitter.library.av.model.parser.VideoVmapPlaylistParser;
import com.twitter.library.av.model.parser.c;
import android.os.Build$VERSION;
import com.twitter.library.av.model.parser.e;
import com.twitter.library.av.model.VideoPlaylist;
import android.net.Uri$Builder;
import android.text.TextUtils;
import android.preference.PreferenceManager;
import com.twitter.library.client.App;
import android.content.Context;
import com.twitter.library.telephony.d;
import com.twitter.library.telephony.TelephonyUtil$DownloadQuality;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.provider.Tweet;
import com.twitter.library.av.model.b;
import java.util.Map;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.j;
import com.twitter.library.av.playback.au;
import java.util.ArrayList;
import com.twitter.library.av.model.Video;

public class VideoPlaylistFactory extends a
{
    private boolean a;
    
    static Video[] a(final Video[] array) {
        final ArrayList<Video> list = new ArrayList<Video>();
        if (array != null) {
            for (final Video video : array) {
                if (!"ad".equals(video.b())) {
                    list.add(video);
                }
            }
        }
        return list.toArray(new Video[list.size()]);
    }
    
    protected VideoPlaylistFactory$VideoPlaylistFormat a(final String s, final Tweet tweet) {
        VideoPlaylistFactory$VideoPlaylistFormat videoPlaylistFactory$VideoPlaylistFormat = VideoPlaylistFactory$VideoPlaylistFormat.c;
        if (s != null) {
            TwitterStatusCard l;
            if (tweet != null) {
                l = tweet.l;
            }
            else {
                l = null;
            }
            if (l != null) {
                final CardInstanceData cardInstanceData = l.cardInstanceData;
                if (cardInstanceData != null) {
                    final String a = cardInstanceData.a("amplify_url_vmap");
                    if (a != null && s.equals(a)) {
                        videoPlaylistFactory$VideoPlaylistFormat = VideoPlaylistFactory$VideoPlaylistFormat.b;
                    }
                    else {
                        final String a2 = cardInstanceData.a("amplify_url");
                        if (a2 != null && s.equals(a2)) {
                            return VideoPlaylistFactory$VideoPlaylistFormat.a;
                        }
                    }
                }
            }
        }
        return videoPlaylistFactory$VideoPlaylistFormat;
    }
    
    protected String a(final TelephonyUtil$DownloadQuality telephonyUtil$DownloadQuality) {
        final ArrayList c = this.c();
        if (c != null && c.size() >= TelephonyUtil$DownloadQuality.a()) {
            return c.get(telephonyUtil$DownloadQuality.b()).toString();
        }
        return this.b();
    }
    
    protected String a(final d d) {
        return this.a(d.a);
    }
    
    @Override
    protected void a(final Context context, final Map map, final d d) {
        final f e = this.e();
        while (true) {
            if (!App.f()) {
                break Label_0043;
            }
            final String string = PreferenceManager.getDefaultSharedPreferences(context).getString("video_multi_bitrate_network_type", (String)null);
            if (TextUtils.isEmpty((CharSequence)string)) {
                break Label_0043;
            }
            try {
                d.a = TelephonyUtil$DownloadQuality.valueOf(string);
                map.put("Detected-Bandwidth", this.a(d));
                map.put("Network-Quality-Bucket", d.a.name());
                map.put("Carrier-Name", d.c);
                map.put("Android-Profile-Main", Boolean.toString(e.a));
                map.put("Android-Profile-High", Boolean.toString(e.b));
            }
            catch (IllegalArgumentException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    protected void a(final Uri$Builder uri$Builder, final Map map, final mc mc) {
        uri$Builder.appendQueryParameter("Detected-Bandwidth", (String)map.get("Detected-Bandwidth"));
        uri$Builder.appendQueryParameter("Android-Profile-Main", (String)map.get("Android-Profile-Main"));
        uri$Builder.appendQueryParameter("Android-Profile-High", (String)map.get("Android-Profile-High"));
        if (mc != null && mc.a != null) {
            uri$Builder.appendQueryParameter("adId", mc.a);
        }
    }
    
    public void a(final boolean a) {
        this.a = a;
    }
    
    protected VideoPlaylist b(final au au, final j j, final HttpOperation httpOperation, final Map map, final mc mc) {
        final e e = (e)j;
        final boolean i = httpOperation.j();
        String a = null;
        if (!i) {
            if (e.b == 0) {
                e.b = lg.av_playlist_download_failed;
            }
            a = com.twitter.library.av.model.factory.a.a(httpOperation);
        }
        Video[] array;
        if (this.a) {
            array = a(e.a);
        }
        else {
            array = e.a;
        }
        return new VideoPlaylist(array, e.b, map, a, mc);
    }
    
    protected String b() {
        String d = this.d();
        if ("".equals(d) || d == null) {
            d = "600";
        }
        return d;
    }
    
    protected e c(final Context context, final au au) {
        VideoPlaylistFactory$VideoPlaylistFormat videoPlaylistFactory$VideoPlaylistFormat;
        if ("VMAP".equalsIgnoreCase(au.f())) {
            videoPlaylistFactory$VideoPlaylistFormat = VideoPlaylistFactory$VideoPlaylistFormat.b;
        }
        else {
            videoPlaylistFactory$VideoPlaylistFormat = this.a(au.c(), au.b());
        }
        if (videoPlaylistFactory$VideoPlaylistFormat == VideoPlaylistFactory$VideoPlaylistFormat.a) {
            return new c(context, Build$VERSION.SDK_INT);
        }
        return new VideoVmapPlaylistParser(context, Build$VERSION.SDK_INT);
    }
    
    protected ArrayList c() {
        return com.twitter.library.featureswitch.d.h("amplify_video_bitrate_buckets");
    }
    
    protected String d() {
        return com.twitter.library.featureswitch.d.g("amplify_video_bitrate_default");
    }
    
    @TargetApi(16)
    protected f e() {
        final f f = new f();
        if (Build$VERSION.SDK_INT < 16) {
            return f;
        }
        final int codecCount = MediaCodecList.getCodecCount();
        int n = 0;
        Label_0047: {
            while (true) {
                MediaCodecInfo codecInfo;
                while (true) {
                    if (n >= codecCount) {
                        return f;
                    }
                    codecInfo = MediaCodecList.getCodecInfoAt(n);
                    if (!codecInfo.isEncoder()) {
                        break Label_0047;
                    }
                    ++n;
                    continue;
                }
                try {
                    for (final MediaCodecInfo$CodecProfileLevel mediaCodecInfo$CodecProfileLevel : codecInfo.getCapabilitiesForType("video/avc").profileLevels) {
                        if (mediaCodecInfo$CodecProfileLevel.profile == 2) {
                            f.a = true;
                        }
                        if (mediaCodecInfo$CodecProfileLevel.profile == 8) {
                            f.b = true;
                        }
                    }
                    continue;
                }
                catch (IllegalArgumentException ex) {
                    continue;
                }
                break;
            }
        }
    }
}
