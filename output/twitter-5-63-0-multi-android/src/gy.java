import com.twitter.util.f;
import com.twitter.library.api.Conversation$Metadata;
import com.twitter.library.provider.bb;
import com.twitter.library.provider.cn;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.5.30
// 

public class gy extends lv
{
    public boolean a(final Cursor cursor) {
        return cursor.getInt(cn.f) == 2 && bb.b(cursor.getInt(cn.h));
    }
    
    public gx b(final Cursor cursor) {
        return new gx(cursor.getLong(cn.d), cursor.getLong(21), (Conversation$Metadata)f.a(cursor.getBlob(cn.g)));
    }
}
