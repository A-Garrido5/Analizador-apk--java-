import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.EntityList;
import com.twitter.library.provider.Tweet;

// 
// Decompiled by Procyon v0.5.30
// 

public class fo
{
    private final fp a;
    private boolean b;
    private Tweet c;
    private int d;
    
    public fo(final fp a) {
        this.a = a;
    }
    
    private void a(int n) {
        EntityList list;
        if (this.c != null) {
            list = this.c.G.urls;
        }
        else {
            list = EntityList.a();
        }
        if (!this.b) {
            n &= 0xFFFFFFFE;
        }
        if (list.b() != 1) {
            n &= 0xFFFFFFF9;
        }
        if ((n & 0x4) != 0x0 && !this.b) {
            this.a.a(((UrlEntity)list.a(0)).displayUrl);
        }
        this.a.b(n);
    }
    
    private void a(final boolean b) {
        this.b = b;
        this.a.b(this.b);
    }
    
    public void a(final Tweet c) {
        this.c = c;
        this.a(this.d);
    }
    
    public void a(final fm fm) {
        this.d = fm.b;
        this.a(fm.a);
        this.a(this.d);
    }
}
