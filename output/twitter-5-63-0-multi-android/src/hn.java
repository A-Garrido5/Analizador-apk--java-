import com.twitter.library.api.TwitterTopic$TrendsPlus;
import com.twitter.library.api.PromotedContent;

// 
// Decompiled by Procyon v0.5.30
// 

public class hn extends hh
{
    public String a;
    public String b;
    public PromotedContent c;
    public String d;
    public TwitterTopic$TrendsPlus e;
    public boolean f;
    
    hn(final ho ho) {
        super(ho.a, ho.b);
        if (ho.c == null || ho.d == null) {
            throw new IllegalArgumentException();
        }
        this.a = ho.c;
        this.b = ho.d;
        this.d = ho.e;
        this.c = ho.f;
        this.e = ho.g;
        this.f = ho.h;
    }
}
