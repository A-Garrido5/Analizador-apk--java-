import com.twitter.library.media.widget.s;
import com.twitter.library.widget.tweet.content.f;
import com.twitter.library.util.d;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.p;

// 
// Decompiled by Procyon v0.5.30
// 

public class ht extends p
{
    @Override
    protected f a(final Activity activity, final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final d d) {
        if (tweet.L() || tweet.V()) {
            return null;
        }
        return new hy(activity, tweet, (s)d.get(4), twitterScribeAssociation, twitterScribeAssociation2);
    }
}
