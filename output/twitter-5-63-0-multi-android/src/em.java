import com.twitter.android.client.x;
import com.twitter.library.provider.f;
import com.twitter.library.provider.DraftTweet;
import com.twitter.library.client.Session;
import android.content.Context;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.5.30
// 

class em extends AsyncTask
{
    private final Context a;
    private final Session b;
    private final long c;
    private final long d;
    
    public em(final Context a, final Session b, final long d) {
        this.a = a;
        this.b = b;
        this.c = b.g();
        this.d = d;
    }
    
    protected DraftTweet a(final Void... array) {
        return f.a(this.a, this.c).a(this.d);
    }
    
    protected void a(final DraftTweet draftTweet) {
        if (draftTweet != null) {
            x.a(this.a).a(this.b, this.b.g(), draftTweet.draftId, draftTweet.statusText, 2131297465, false);
        }
    }
}
