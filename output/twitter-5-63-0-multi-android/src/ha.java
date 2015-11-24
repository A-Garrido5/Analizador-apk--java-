import com.twitter.android.events.c;
import com.twitter.library.api.PromotedContent;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.library.api.TwitterTopic$Metadata;
import com.twitter.library.api.TimelineScribeContent;
import com.twitter.android.events.sports.g;
import com.twitter.android.events.sports.f;
import com.twitter.library.provider.bb;
import com.twitter.library.provider.cn;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.5.30
// 

public class ha extends lv
{
    private final int a;
    
    public ha(final int a) {
        this.a = a;
    }
    
    private int a(final Cursor cursor, final int n) {
        final int position = cursor.getPosition();
        cursor.moveToPosition(n);
        final int int1 = cursor.getInt(cn.h);
        final int int2 = cursor.getInt(cn.f);
        cursor.moveToPosition(position);
        if (int2 == 3 && bb.k(int1)) {
            return 2;
        }
        if (int2 == 7 && 16 == this.a) {
            return 1;
        }
        return 0;
    }
    
    private f a(final Cursor cursor, final boolean b) {
        final g a = new g(cursor.getLong(cn.d), cursor.getLong(21)).a(cursor.getString(cn.s)).a(cursor.getInt(cn.t)).b(cursor.getString(cn.z)).c(cursor.getString(cn.E)).d(cursor.getString(cn.v)).e(cursor.getString(cn.w)).a(cursor.getBlob(cn.D)).f(cursor.getString(cn.u)).g(cursor.getString(cn.y)).a((TimelineScribeContent)com.twitter.util.f.a(cursor.getBlob(cn.l)));
        if (b) {
            a.h(cursor.getString(cn.A)).b(cursor.getInt(cn.B));
        }
        return a.a();
    }
    
    private gz c(final Cursor cursor) {
        final String string = cursor.getString(cn.s);
        final String string2 = cursor.getString(cn.v);
        final TwitterTopic$Metadata twitterTopic$Metadata = (TwitterTopic$Metadata)com.twitter.util.f.a(cursor.getBlob(cn.g));
        final int int1 = cursor.getInt(cn.t);
        TopicView$TopicData topicView$TopicData;
        if (int1 == 2) {
            topicView$TopicData = new TopicView$TopicData(string, int1, string2, cursor.getString(cn.w), cursor.getString(cn.z), cursor.getString(cn.A), cursor.getString(cn.u), cursor.getString(cn.x), cursor.getString(cn.E), cursor.getInt(cn.B), cursor.getLong(cn.F), cursor.getBlob(cn.D), cursor.getString(cn.y));
        }
        else {
            topicView$TopicData = null;
        }
        return new c(cursor.getLong(cn.d), cursor.getLong(21), string, string2, twitterTopic$Metadata, int1, topicView$TopicData, (PromotedContent)com.twitter.util.f.a(cursor.getBlob(cn.C)), cursor.getInt(cn.B));
    }
    
    public boolean a(final Cursor cursor) {
        return this.a(cursor, cursor.getPosition()) != 0;
    }
    
    public gz b(final Cursor cursor) {
        boolean b = true;
        final int position = cursor.getPosition();
        final int a = this.a(cursor, position);
        if (a == 2) {
            int a2;
            if (position > 0) {
                a2 = this.a(cursor, position - 1);
            }
            else {
                a2 = -1;
            }
            if (a2 == (b ? 1 : 0)) {
                b = false;
            }
            return this.a(cursor, b);
        }
        if (a == (b ? 1 : 0)) {
            return this.c(cursor);
        }
        throw new IllegalArgumentException();
    }
}
