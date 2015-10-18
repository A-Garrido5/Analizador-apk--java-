import com.twitter.android.YouTubeActivity;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bn;
import com.twitter.android.client.am;
import com.twitter.library.api.UrlEntity;
import com.twitter.android.client.bh;
import com.twitter.android.xa;
import com.twitter.android.a;
import android.os.Parcelable;
import com.twitter.library.provider.ae;
import android.content.Intent;
import com.twitter.android.TweetActivity;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.client.u;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.TwitterScribeLog;
import android.app.Activity;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import android.content.Context;
import java.lang.ref.WeakReference;
import com.twitter.library.view.b;

// 
// Decompiled by Procyon v0.5.30
// 

public class gq extends b
{
    private final WeakReference a;
    private final Context b;
    private final c c;
    private final Session d;
    private final String e;
    private final String f;
    private final TwitterScribeAssociation g;
    
    public gq(final Activity activity, final c c, final Session d, final String e, final String f, final TwitterScribeAssociation g) {
        this.a = new WeakReference((T)activity);
        this.b = activity.getApplicationContext();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    private void a(final TwitterScribeLog twitterScribeLog) {
        final String a = bj.a();
        final com.twitter.library.api.b a2 = u.a.a();
        final TwitterScribeItem twitterScribeItem = (TwitterScribeItem)twitterScribeLog.c();
        twitterScribeLog.f("app_download_client_event");
        if (!TextUtils.isEmpty((CharSequence)a)) {
            twitterScribeLog.a("3", bq.a(twitterScribeItem.n, a));
            twitterScribeLog.a("4", a);
        }
        if (a2 != null) {
            twitterScribeLog.a("6", a2.a());
            twitterScribeLog.a(a2.b());
        }
        this.c.b(twitterScribeLog);
    }
    
    public void a(final Activity activity, final Tweet tweet, final boolean b, final TwitterScribeAssociation twitterScribeAssociation) {
        String s;
        if (tweet.I()) {
            s = "video_player";
        }
        else {
            s = "platform_amplify_card";
        }
        this.c.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.d.g()).a(this.b, tweet, twitterScribeAssociation, null).b(twitterScribeAssociation.a(), null, null, s, "click")).a(twitterScribeAssociation)).e(this.f));
        if (!b) {
            activity.startActivityForResult(new Intent((Context)activity, (Class)TweetActivity.class).setData(ae.b(tweet.Q, this.d.g())).putExtra("association", (Parcelable)twitterScribeAssociation), 3);
            return;
        }
        new a().a(twitterScribeAssociation).a(xa.a(tweet)).a(tweet).a(5).d(bh.a((Context)activity).i()).a((Context)activity);
    }
    
    @Override
    public void a(final Tweet tweet, final UrlEntity urlEntity) {
        this.a(tweet, urlEntity, this.e, this.g);
    }
    
    public void a(final Tweet tweet, final UrlEntity urlEntity, final String s, final TwitterScribeAssociation twitterScribeAssociation) {
        final Activity activity = (Activity)this.a.get();
        if (activity != null) {
            if (tweet == null) {
                am.a((Context)activity, null, urlEntity, this.d.g(), s, null, twitterScribeAssociation, this.f);
                return;
            }
            if (tweet.a(urlEntity.url)) {
                this.a(activity, tweet, false, twitterScribeAssociation);
            }
            else {
                if (tweet.T() && !TextUtils.isEmpty((CharSequence)TwitterScribeItem.a(this.b, tweet, twitterScribeAssociation, null).n)) {
                    final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(this.d.g());
                    twitterScribeLog.b(new String[] { s });
                    twitterScribeLog.a(this.b, tweet, twitterScribeAssociation, null);
                    twitterScribeLog.a(twitterScribeAssociation);
                    twitterScribeLog.e(this.f);
                    this.a(twitterScribeLog);
                }
                final String c = bn.c(urlEntity.expandedUrl);
                final long g = this.d.g();
                final String a = com.twitter.library.featureswitch.d.a("in_app_youtube_player_android_2413");
                if (c != null && !"control".equals(a) && !"unassigned".equals(a)) {
                    this.c.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).a((Context)activity, tweet, twitterScribeAssociation, null).b(new String[] { s })).a(twitterScribeAssociation)).b(urlEntity.expandedUrl, urlEntity.url)).e(this.f));
                    activity.startActivity(new Intent((Context)activity, (Class)YouTubeActivity.class).putExtra("video_id", c));
                    return;
                }
                am.a((Context)activity, tweet, urlEntity, g, s, null, twitterScribeAssociation, this.f);
            }
        }
    }
}
