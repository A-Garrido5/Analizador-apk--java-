import com.twitter.android.client.bh;
import com.twitter.library.view.e;
import com.twitter.library.platform.TwitterDataSyncService;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.av.af;
import com.twitter.library.av.VideoPlayerView;
import com.twitter.android.av.az;
import com.twitter.library.widget.tweet.content.h;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.android.av.au;
import com.twitter.library.av.k;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.android.av.ba;
import com.twitter.android.client.t;
import com.twitter.android.card.w;
import com.twitter.android.client.at;
import com.twitter.android.util.ap;
import com.twitter.library.media.manager.q;
import com.twitter.android.client.v;
import com.twitter.android.widget.bg;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class gk extends ts
{
    protected void a(final Context context, final Void void1) {
        bg.a(context);
        v.a(context);
        q.a(context);
        ap.a(context);
        at.a();
        w.a(context);
        t.a(context);
        AVPlayer.a(new ba());
        AVPlayer.a(au.a);
        g.a(new hv());
        VideoPlayerView.setDefaultFullScreenStarterFactory(new az());
        TelephonyUtil.d(context);
        TwitterDataSyncService.a(context);
        e.a(context);
        bh.a(context);
    }
}
