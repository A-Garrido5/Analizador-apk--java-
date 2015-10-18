// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model.factory;

import android.net.Uri$Builder;
import java.util.Locale;
import com.twitter.library.av.z;
import com.twitter.library.av.model.AudioPlaylist;
import com.twitter.library.client.az;
import com.twitter.library.featureswitch.d;
import android.content.Context;
import java.util.Map;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.j;
import com.twitter.library.av.playback.au;

public class b extends a
{
    @Override
    protected String a(final Context context, final String s, final Map map) {
        if (d.f("audio_configurations_client_user_id_playlist_request_enabled")) {
            return com.twitter.library.av.d.a().a(az.a(context).b(), s, null, AudioPlaylist.a(map), new z(context));
        }
        return super.a(context, s, map);
    }
    
    @Override
    protected void a(final Context context, final Map map, final com.twitter.library.telephony.d d) {
        final Locale default1 = Locale.getDefault();
        if (default1 != null) {
            map.put("locale", default1.toString());
        }
    }
    
    @Override
    protected void a(final Uri$Builder uri$Builder, final Map map, final mc mc) {
    }
    
    @Override
    protected j b(final Context context, final au au) {
        return new com.twitter.library.av.model.parser.a(context);
    }
    
    protected AudioPlaylist b(final au au, final j j, final HttpOperation httpOperation, final Map map, final mc mc) {
        AudioPlaylist a;
        if (j != null) {
            a = ((com.twitter.library.av.model.parser.a)j).a;
        }
        else {
            a = null;
        }
        if (!httpOperation.j() || a == null) {
            a = new AudioPlaylist(lg.av_playlist_download_failed, com.twitter.library.av.model.factory.a.a(httpOperation));
        }
        a.a(au, map);
        return a;
    }
}
