import com.twitter.library.provider.cn;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.5.30
// 

public class hb extends lv
{
    public boolean a(final Cursor cursor) {
        return cursor.getInt(cn.f) == 6;
    }
    
    public hc b(final Cursor cursor) {
        return new hc(cursor.getLong(cn.d), cursor.getLong(21), cursor);
    }
}
