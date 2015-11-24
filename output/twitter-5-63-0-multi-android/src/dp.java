import com.twitter.android.provider.SuggestionsProvider;
import com.twitter.library.api.search.TwitterTypeAheadGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class dp extends dn
{
    public dp(final Context context, final int n, final dj dj) {
        super(context, 1, n, false, dj);
    }
    
    protected void a(final String s, final TwitterTypeAheadGroup twitterTypeAheadGroup) {
        SuggestionsProvider.a(s, twitterTypeAheadGroup.a);
    }
    
    protected boolean a(final String s) {
        return SuggestionsProvider.b(s) == null;
    }
}
