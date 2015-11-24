import android.content.Context;
import com.twitter.library.api.search.TwitterTypeAheadGroup;

// 
// Decompiled by Procyon v0.5.30
// 

class do implements dm
{
    final /* synthetic */ Object a;
    final /* synthetic */ dc b;
    final /* synthetic */ dn c;
    
    do(final dn c, final Object a, final dc b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final TwitterTypeAheadGroup twitterTypeAheadGroup) {
        this.c.a(this.a, twitterTypeAheadGroup);
        this.c.a(this.a, this.b, false);
    }
}
