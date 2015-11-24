import java.util.List;
import android.text.TextUtils;
import com.twitter.android.provider.SuggestionsProvider;
import com.twitter.android.client.bz;
import android.content.Context;
import android.net.Uri;

// 
// Decompiled by Procyon v0.5.30
// 

public class da extends dp
{
    private final Uri c;
    private final Uri d;
    private String e;
    
    public da(final Context context, final boolean b, final dj dj) {
        super(context, bz.g(), dj);
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.c = SuggestionsProvider.h.buildUpon().appendQueryParameter("friendship", String.valueOf(n | 0x400)).build();
        this.d = this.c.buildUpon().appendQueryParameter("add_real_time_suggestions", "true").build();
    }
    
    protected ln a(final String s, final boolean b) {
        final String trim = s.trim();
        Uri d;
        if (TextUtils.isEmpty((CharSequence)trim)) {
            Uri uri;
            if (this.e == null) {
                uri = this.c;
            }
            else {
                uri = this.c.buildUpon().appendQueryParameter("additional_user_ids", this.e).build();
            }
            d = uri;
        }
        else {
            d = this.d;
        }
        return new lm(this.a.getContentResolver().query(d, (String[])null, trim, (String[])null, (String)null));
    }
    
    public void a(final List list) {
        String join;
        if (list != null) {
            join = TextUtils.join((CharSequence)",", (Iterable)list);
        }
        else {
            join = null;
        }
        this.e = join;
    }
}
