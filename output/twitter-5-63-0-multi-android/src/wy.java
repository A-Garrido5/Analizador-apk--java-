import com.twitter.util.collection.h;
import java.util.Map;
import java.util.Iterator;
import com.twitter.util.collection.g;
import java.util.List;
import com.twitter.util.k;
import com.twitter.model.common.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class wy
{
    public static Object a(final c c) {
        if (c == null) {
            return null;
        }
        return c.b();
    }
    
    public static Object a(final c c, final Object o) {
        return k.a(a(c), o);
    }
    
    public static List a(final List list) {
        final g a = g.a();
        final Iterator<c> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Object b = iterator.next().b();
            if (b != null) {
                a.a(b);
            }
        }
        return a.d();
    }
    
    public static Map a(final Map map) {
        final h a = h.a();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            try {
                a.a(Long.parseLong(entry.getKey()), entry.getValue());
            }
            catch (NumberFormatException ex) {}
        }
        return a.c();
    }
}
