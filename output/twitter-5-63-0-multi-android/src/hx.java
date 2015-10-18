import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.library.media.widget.v;

// 
// Decompiled by Procyon v0.5.30
// 

class hx implements v
{
    final /* synthetic */ hz a;
    final /* synthetic */ hw b;
    
    hx(final hw b, final hz a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public Tweet a() {
        return this.a.a;
    }
    
    @Override
    public TwitterScribeAssociation b() {
        return this.a.b;
    }
}
