import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import android.text.TextUtils;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.ar;

// 
// Decompiled by Procyon v0.5.30
// 

public class oh extends ar
{
    public final String a;
    private final long e;
    
    public oh(final Context context, final Session session, final long e, final String a) {
        super(context, oh.class.getName(), session);
        this.e = e;
        this.a = a;
    }
    
    @Override
    protected e a() {
        if (!TextUtils.isEmpty((CharSequence)this.a)) {
            return this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "statuses", "report_spam" }).a("tweet_id", this.e).a("report_as", this.a).a();
        }
        return null;
    }
    
    @Override
    public String b() {
        return null;
    }
    
    protected bg e() {
        return null;
    }
}
