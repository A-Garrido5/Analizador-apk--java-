import com.twitter.android.trends.j;
import android.database.Cursor;
import com.twitter.library.api.TwitterLocation;
import java.util.ArrayList;
import java.util.Collections;
import com.twitter.android.provider.SuggestionsProvider;
import java.util.List;
import com.twitter.library.client.Session;
import android.content.Context;
import android.os.Handler;

// 
// Decompiled by Procyon v0.5.30
// 

public class dd
{
    private final Handler a;
    private final Context b;
    private final Session c;
    private Runnable d;
    private final long e;
    
    public dd(final Context context, final Session c, final long e, final Handler a) {
        this.b = context.getApplicationContext();
        this.c = c;
        this.e = e;
        this.a = a;
    }
    
    public List a(final String s) {
        final Cursor query = this.b.getContentResolver().query(SuggestionsProvider.g, (String[])null, s, (String[])null, (String)null);
        if (query == null) {
            return Collections.emptyList();
        }
        final ArrayList list = new ArrayList<TwitterLocation>(query.getCount());
        try {
            if (query.moveToFirst()) {
                do {
                    list.add(new TwitterLocation(query.getString(2), query.getLong(1)));
                } while (query.moveToNext());
            }
            return list;
        }
        finally {
            query.close();
        }
    }
    
    public void a(final dg dg) {
        synchronized (this) {
            final Context b = this.b;
            final Session c = this.c;
            this.b();
            this.d = new de(this, b, c, dg);
            this.a.postDelayed(this.d, this.e);
        }
    }
    
    public boolean a() {
        return j.a(this.b, this.c, this.b.getResources().getConfiguration().locale);
    }
    
    public void b() {
        synchronized (this) {
            if (this.d != null) {
                this.a.removeCallbacks(this.d);
                this.d = null;
            }
        }
    }
}
