import com.twitter.util.f;
import com.twitter.library.api.Recap$Metadata;
import com.twitter.library.api.timeline.w;
import com.twitter.library.provider.bb;
import com.twitter.library.provider.cn;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.5.30
// 

public class hd extends lv
{
    public boolean a(final Cursor cursor) {
        final int int1 = cursor.getInt(cn.f);
        final int int2 = cursor.getInt(cn.h);
        return int1 == 2 && bb.l(int2) && w.e();
    }
    
    public he b(final Cursor cursor) {
        return new he(cursor.getLong(cn.d), cursor.getLong(21), (Recap$Metadata)f.a(cursor.getBlob(cn.g)));
    }
}
