import com.twitter.android.provider.SuggestionsProvider;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class cx extends dp
{
    public cx(final Context context, final int n, final dj dj) {
        super(context, n, dj);
    }
    
    protected ln a(final String s, final boolean b) {
        return new lm(this.a.getContentResolver().query(SuggestionsProvider.c, (String[])null, s, (String[])null, (String)null));
    }
}
