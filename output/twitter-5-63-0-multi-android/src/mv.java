import com.twitter.library.provider.bg;
import java.util.Iterator;
import com.twitter.library.provider.b;
import java.util.ArrayList;
import java.util.List;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import java.util.Set;
import com.twitter.library.service.f;
import java.util.Collection;
import com.twitter.library.service.e;
import com.twitter.util.g;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import android.util.Log;
import com.twitter.library.client.App;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class mv extends c
{
    private static final boolean a;
    private final int e;
    
    static {
        a = (App.l() && Log.isLoggable("StoriesRequest", 3));
    }
    
    public mv(final Context context, final Session session, final int n) {
        this(context, new ab(session), n);
    }
    
    public mv(final Context context, final ab ab, final int n) {
        super(context, mv.class.getName(), ab);
        if (n != 0) {
            this.e = com.twitter.util.g.a(n, 5, 30);
            return;
        }
        this.e = 14;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "storystream", "stories" }).a("schemaVersion", "v2").a("count", this.e);
        final Set g = this.V().g();
        if (g.size() > 0) {
            a.a("seenStoryIds", g);
        }
        else {
            a.a("includeHistory", true);
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final my my) {
        if (httpOperation.k()) {
            final List list = (List)my.a();
            if (list != null) {
                if (mv.a) {
                    Log.d("StoriesRequest", "Read " + list.size() + " stories from endpoint");
                }
                final ArrayList<mw> list2 = (ArrayList<mw>)new ArrayList<Object>(2);
                final Iterator<mw> iterator = list.iterator();
                while (iterator.hasNext() && list2.size() < 2) {
                    final mw mw = iterator.next();
                    if (mw.b == 2) {
                        iterator.remove();
                        list2.add(0, mw);
                    }
                }
                final Iterator<Object> iterator2 = list2.iterator();
                while (iterator2.hasNext()) {
                    list.add(0, iterator2.next());
                }
                final bg v = this.V();
                final ab p3 = this.P();
                int a;
                if (p3 != null) {
                    a = v.a(p3.c, list, this.e, null);
                }
                else {
                    a = 0;
                }
                aa.c.putInt("key_stories_changed", a);
                if (mv.a) {
                    Log.d("StoriesRequest", "Inserted " + a + " stories");
                }
            }
            else if (mv.a) {
                Log.w("StoriesRequest", "Stories could not be parsed!");
            }
        }
        else if (mv.a) {
            Log.w("StoriesRequest", "Story request unsuccessful");
        }
    }
    
    protected my b() {
        return new my();
    }
}
