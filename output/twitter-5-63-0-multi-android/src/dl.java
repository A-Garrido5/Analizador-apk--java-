import com.twitter.internal.android.service.a;
import java.util.List;
import com.twitter.library.api.search.TwitterTypeAheadGroup;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

// 
// Decompiled by Procyon v0.5.30
// 

class dl extends z
{
    final /* synthetic */ dk a;
    
    dl(final dk a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (((aa)y.l().b()).a()) {
            this.a.d.a(((com.twitter.library.api.search.z)y).g());
            return;
        }
        this.a.d.a(new TwitterTypeAheadGroup(null, null, null, null));
    }
}
