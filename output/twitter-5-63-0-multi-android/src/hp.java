import com.twitter.util.f;
import com.twitter.library.api.TimelineScribeContent;
import com.twitter.library.api.h;
import com.twitter.library.provider.bb;
import com.twitter.library.provider.cn;
import android.os.Bundle;
import com.twitter.library.provider.r;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.5.30
// 

public class hp extends lv
{
    private final hq a;
    
    public hp() {
        this.a = new hq();
    }
    
    private ln c(final Cursor cursor) {
        final Bundle extras = cursor.getExtras();
        return lp.a(r.a(cursor), this.a, extras.getInt("data_type_source_start"), extras.getInt("data_type_source_end") + 1);
    }
    
    public boolean a(final Cursor cursor) {
        final int int1 = cursor.getInt(cn.f);
        final int int2 = cursor.getInt(cn.h);
        return int1 == 1 && bb.f(int2) && h.d();
    }
    
    public hf b(final Cursor cursor) {
        return new hf(cursor.getLong(cn.d), cursor.getLong(21), (TimelineScribeContent)f.a(cursor.getBlob(cn.l)), this.c(cursor));
    }
}
