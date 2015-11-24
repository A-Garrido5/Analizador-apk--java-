import com.twitter.util.collection.i;
import com.twitter.util.d;
import com.twitter.util.q;
import com.twitter.library.widget.tweet.content.DisplayMode;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.30
// 

public class vh
{
    private static vh a;
    private HashMap b;
    private vg c;
    
    vh(final vg c) {
        this.b = new HashMap();
        this.c = c;
    }
    
    public static vh a() {
        if (vh.a == null) {
            vh.a = new vh(new vg());
        }
        return vh.a;
    }
    
    public void a(final String s, final DisplayMode displayMode, final String s2, final String... array) {
        if (q.a(s)) {
            if (d.e()) {
                throw new IllegalArgumentException("Missing card name");
            }
        }
        else {
            final i a = i.a(s, displayMode);
            if (this.b.get(a) != null) {
                if (d.e()) {
                    throw new IllegalArgumentException("Duplicate experiment registration for " + s);
                }
            }
            else {
                this.b.put(a, new vi(s2, array));
            }
        }
    }
    
    public boolean a(final String s, final DisplayMode displayMode) {
        final vi vi = this.b.get(i.a(s, displayMode));
        return vi != null && this.c.a(vi.a, vi.b);
    }
}
