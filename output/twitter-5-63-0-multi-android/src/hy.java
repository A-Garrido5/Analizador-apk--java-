import android.os.Bundle;
import com.twitter.library.widget.tweet.content.d;
import android.graphics.Rect;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.app.Activity;
import com.twitter.library.media.widget.s;
import com.twitter.library.widget.tweet.content.a;

// 
// Decompiled by Procyon v0.5.30
// 

public class hy extends a
{
    final s a;
    
    public hy(final Activity activity, final Tweet tweet, final s a, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        super(activity, tweet, twitterScribeAssociation, twitterScribeAssociation2);
        this.a = a;
    }
    
    @Override
    public Rect a(final Context context, final int n, final int n2, final int n3, final int n4) {
        return new Rect(n, n2, n3, n2 + n4);
    }
    
    protected hw a(final Activity activity) {
        return new hw(activity);
    }
    
    @Override
    protected Object b() {
        return new hz(this.f, this.g, this.a);
    }
    
    @Override
    protected void b(final Bundle bundle) {
    }
    
    @Override
    protected Bundle c() {
        return null;
    }
}
