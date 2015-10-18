import com.twitter.library.api.TwitterUser;

// 
// Decompiled by Procyon v0.5.30
// 

public class wh extends vd
{
    private static wh c;
    
    public static wh a() {
        if (wh.c == null) {
            wh.c = new wh();
        }
        return wh.c;
    }
    
    protected void a(final wi wi, final long n, final TwitterUser twitterUser) {
        wi.a(n, twitterUser);
    }
}
