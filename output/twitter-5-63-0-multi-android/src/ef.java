import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;

// 
// Decompiled by Procyon v0.5.30
// 

public class ef implements vr
{
    @Override
    public vp a(final Activity activity, final DisplayMode displayMode, final vc vc, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        if (DisplayMode.a == displayMode) {
            return new ei(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2);
        }
        return new ed(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2);
    }
    
    @Override
    public boolean a(final DisplayMode displayMode, final vc vc) {
        return true;
    }
}
