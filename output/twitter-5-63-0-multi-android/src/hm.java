import com.twitter.library.api.TwitterTopic$TrendsPlus;
import com.twitter.util.f;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.provider.cn;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.5.30
// 

public class hm extends lv
{
    private final int a;
    
    public hm(final int a) {
        this.a = a;
    }
    
    public boolean a(final Cursor cursor) {
        return cursor.getInt(cn.f) == 7 && this.a == 28;
    }
    
    public hn b(final Cursor cursor) {
        if (this.a(cursor)) {
            return new ho(cursor.getLong(cn.d), cursor.getLong(21)).a(cursor.getString(cn.s)).b(cursor.getString(cn.v)).c(cursor.getString(cn.w)).a((PromotedContent)f.a(cursor.getBlob(cn.C))).a((TwitterTopic$TrendsPlus)f.a(cursor.getBlob(cn.D))).a(cursor.getInt(cn.k) > 0).a();
        }
        throw new IllegalArgumentException();
    }
}
