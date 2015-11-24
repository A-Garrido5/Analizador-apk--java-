import com.twitter.internal.android.service.y;
import com.twitter.library.service.r;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import java.util.Collection;
import com.twitter.library.api.ar;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class ou extends ar
{
    public static final Collection a;
    public static final Collection e;
    public static final Collection f;
    private final String g;
    
    static {
        a = Collections.singleton(HttpOperation$RequestMethod.a);
        e = Collections.singleton(HttpOperation$RequestMethod.b);
        f = Arrays.asList(500, 503);
    }
    
    protected ou(final Context context, final String s, final Session session, final boolean b, final String g) {
        Collection collection;
        if (b) {
            collection = ou.e;
        }
        else {
            collection = ou.a;
        }
        super(context, s, session, new r(3, collection, ou.f));
        this.g = g;
    }
    
    @Override
    public String b() {
        return "app:twitter_service:app_graph:" + this.g;
    }
}
