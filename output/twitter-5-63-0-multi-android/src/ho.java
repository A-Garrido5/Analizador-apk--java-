import com.twitter.library.api.TwitterTopic$TrendsPlus;
import com.twitter.library.api.PromotedContent;

// 
// Decompiled by Procyon v0.5.30
// 

public class ho
{
    private final long a;
    private final long b;
    private String c;
    private String d;
    private String e;
    private PromotedContent f;
    private TwitterTopic$TrendsPlus g;
    private boolean h;
    
    public ho(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public hn a() {
        return new hn(this);
    }
    
    public ho a(final PromotedContent f) {
        this.f = f;
        return this;
    }
    
    public ho a(final TwitterTopic$TrendsPlus g) {
        this.g = g;
        return this;
    }
    
    public ho a(final String c) {
        this.c = c;
        return this;
    }
    
    public ho a(final boolean h) {
        this.h = h;
        return this;
    }
    
    public ho b(final String d) {
        this.d = d;
        return this;
    }
    
    public ho c(final String e) {
        this.e = e;
        return this;
    }
}
