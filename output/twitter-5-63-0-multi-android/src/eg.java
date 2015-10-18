import com.twitter.library.client.az;
import com.twitter.android.client.bh;
import com.twitter.android.a;
import com.twitter.library.scribe.ScribeAssociation;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.av.t;
import android.app.Activity;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import com.twitter.library.scribe.TwitterScribeAssociation;

// 
// Decompiled by Procyon v0.5.30
// 

public class eg
{
    private static final eg a;
    
    static {
        a = new eg();
    }
    
    public static eg a() {
        return eg.a;
    }
    
    public void a(final TwitterScribeAssociation twitterScribeAssociation, final c c, final Session session, final String s, final Tweet tweet, final Activity activity) {
        final String b = Tweet.b(tweet);
        if (!t.a()) {
            c.a(((TwitterScribeLog)new TwitterScribeLog(session.g()).a((Context)activity, tweet, twitterScribeAssociation, null).b(new String[] { TwitterScribeLog.a(twitterScribeAssociation, b, "platform_amplify_card", "click") })).a(twitterScribeAssociation));
        }
        new a().a(twitterScribeAssociation).a(s).a(tweet).a(5).d(bh.a((Context)activity).i()).a((Context)activity);
    }
    
    public void a(final TwitterScribeAssociation twitterScribeAssociation, final String s, final Tweet tweet, final Activity activity) {
        this.a(twitterScribeAssociation, c.a((Context)activity), az.a((Context)activity).b(), s, tweet, activity);
    }
}
