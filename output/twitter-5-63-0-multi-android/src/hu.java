import com.twitter.android.card.ag;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.widget.TweetView;
import com.twitter.library.widget.tweet.content.f;
import com.twitter.library.util.d;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.provider.Tweet;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.b;

// 
// Decompiled by Procyon v0.5.30
// 

public class hu extends b
{
    @Override
    public f a(final Activity activity, final Tweet tweet, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final d d) {
        if (displayMode == DisplayMode.a && tweet.U()) {
            final TweetView tweetView = (TweetView)d.get(2);
            if (activity instanceof TwitterFragmentActivity && tweetView != null) {
                final ag ag = new ag((TwitterFragmentActivity)activity, twitterScribeAssociation);
                ag.a(tweet);
                ag.a(tweetView);
                ag.a(tweet.W());
                return ag;
            }
        }
        return null;
    }
}
