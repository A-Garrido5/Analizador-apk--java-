import com.twitter.library.provider.Tweet;
import com.twitter.util.f;
import com.twitter.library.api.TimelineScribeContent;
import com.twitter.library.provider.cn;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.5.30
// 

public class hl extends ls
{
    private final boolean b;
    private final hq c;
    
    public hl(final boolean b) {
        this.b = b;
        this.c = new hq();
    }
    
    private boolean e(final Cursor cursor) {
        if (this.b) {
            if (cursor.getInt(cn.f) != 5) {
                return false;
            }
        }
        else if (cursor.getInt(18) != 2) {
            return false;
        }
        return true;
    }
    
    private boolean f(final Cursor cursor) {
        return cursor.getLong(41) != 0L;
    }
    
    public hh a(final Cursor cursor) {
        int d;
        if (this.b) {
            d = cn.d;
        }
        else {
            d = 1;
        }
        final long long1 = cursor.getLong(d);
        final long long2 = cursor.getLong(21);
        if (this.e(cursor)) {
            return new hi(long1, long2);
        }
        final Tweet a = this.c.a(cursor);
        TimelineScribeContent timelineScribeContent;
        if (this.b) {
            timelineScribeContent = (TimelineScribeContent)f.a(cursor.getBlob(cn.l));
        }
        else {
            timelineScribeContent = null;
        }
        if (this.f(cursor)) {
            return new hj(long1, long2, a, timelineScribeContent);
        }
        return new hk(long1, long2, a, timelineScribeContent);
    }
}
