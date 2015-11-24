import com.twitter.library.api.search.TwitterTypeAheadGroup;
import android.net.Uri$Builder;
import com.twitter.android.provider.SuggestionsProvider;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class cz extends dn
{
    public cz(final Context context, final int n, final dj dj) {
        super(context, 2, n, true, dj);
    }
    
    protected ln a(final String s, final boolean b) {
        final Uri$Builder buildUpon = SuggestionsProvider.d.buildUpon();
        String s2;
        if (b) {
            s2 = "true";
        }
        else {
            s2 = "false";
        }
        return new lm(this.a.getContentResolver().query(buildUpon.appendQueryParameter("add_query_to_empty_result", s2).build(), (String[])null, s, (String[])null, (String)null));
    }
    
    protected void a(final String s, final TwitterTypeAheadGroup twitterTypeAheadGroup) {
        SuggestionsProvider.b(s, twitterTypeAheadGroup.c);
    }
    
    protected boolean a(final String s) {
        return SuggestionsProvider.c(s) == null;
    }
}
