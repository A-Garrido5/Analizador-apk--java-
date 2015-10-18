import com.twitter.library.provider.Tweet;

// 
// Decompiled by Procyon v0.5.30
// 

public class wc extends vd
{
    private static wc c;
    
    public static wc a() {
        if (wc.c == null) {
            wc.c = new wc();
        }
        return wc.c;
    }
    
    protected void a(final wd wd, final long n, final Tweet tweet) {
        wd.a(n, tweet);
    }
}
