import com.twitter.library.api.DiscoverStoryMetadata;
import com.twitter.library.api.TwitterSocialProof;
import com.twitter.library.api.TwitterSearchHighlight;
import java.util.List;
import com.twitter.model.common.a;

// 
// Decompiled by Procyon v0.5.30
// 

public class xc extends a
{
    List a;
    boolean b;
    boolean c;
    TwitterSearchHighlight d;
    String e;
    TwitterSocialProof f;
    xa g;
    DiscoverStoryMetadata h;
    String i;
    String j;
    
    public xc a(final DiscoverStoryMetadata h) {
        this.h = h;
        return this;
    }
    
    public xc a(final TwitterSearchHighlight d) {
        this.d = d;
        return this;
    }
    
    public xc a(final TwitterSocialProof f) {
        this.f = f;
        return this;
    }
    
    public xc a(final String e) {
        this.e = e;
        return this;
    }
    
    public xc a(final List a) {
        this.a = a;
        return this;
    }
    
    public xc a(final xa g) {
        this.g = g;
        return this;
    }
    
    public xc a(final boolean b) {
        this.b = b;
        return this;
    }
    
    public xc b(final String i) {
        this.i = i;
        return this;
    }
    
    public xc b(final boolean c) {
        this.c = c;
        return this;
    }
    
    protected xb c() {
        return new xb(this);
    }
    
    public xc c(final String j) {
        this.j = j;
        return this;
    }
}
