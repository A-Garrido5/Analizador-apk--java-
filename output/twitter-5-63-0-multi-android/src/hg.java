import java.util.Iterator;
import android.database.Cursor;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

public class hg extends ls
{
    private final List b;
    
    public hg(final boolean b, final int n) {
        this.b = Collections.unmodifiableList((List<?>)Arrays.asList(new ha(n), new hm(n), new gy(), new hp(), new hd(), new hr(), new hb(), new hl(b)));
    }
    
    public hh a(final Cursor cursor) {
        while (true) {
            for (final lv lv : this.b) {
                if (lv.a(cursor)) {
                    if (lv != null) {
                        return (hh)lv.b(cursor);
                    }
                    throw new IllegalArgumentException("no hydrator can hydrate this timeline item!");
                }
            }
            lv lv = null;
            continue;
        }
    }
}
