import java.util.Iterator;
import com.twitter.library.client.Session;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.network.g;
import com.twitter.library.av.z;
import android.text.TextUtils;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.av.d;
import java.util.List;
import com.twitter.library.av.model.b;
import com.twitter.library.util.e;

// 
// Decompiled by Procyon v0.5.30
// 

final class dx extends e
{
    private final b a;
    private final List b;
    private final String c;
    private final d d;
    
    dx(final b a, final List b, final String c, final d d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    protected Void a(final Context... array) {
        final Context context = array[0];
        final Session b = az.a(context).b();
        for (final String s : this.b) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                new g(context, this.d.a(b, s, this.c, this.a, new z(context))).a(HttpOperation$RequestMethod.a).a().c();
            }
        }
        return null;
    }
}
