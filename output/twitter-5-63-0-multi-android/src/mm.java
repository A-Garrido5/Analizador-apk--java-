import com.twitter.library.service.f;
import com.twitter.library.service.d;
import java.util.List;
import com.twitter.library.network.ae;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class mm extends c
{
    protected final String a;
    private int[] e;
    
    protected mm(final Context context, final String s, final Session session, final String a) {
        super(context, s, session);
        this.a = a;
        if (TextUtils.isEmpty((CharSequence)this.a)) {
            throw new IllegalArgumentException("Phone number is empty.");
        }
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (!httpOperation.k() && bg != null) {
            this.e = ae.a((List)bg.a());
            return;
        }
        this.e = null;
    }
    
    protected final void a(final f f) {
        f.a("phone_number", this.a);
    }
    
    public String b() {
        return this.a;
    }
    
    protected final void b(final f f) {
        f.a("raw_phone_number", this.a);
    }
    
    public int[] e() {
        return this.e;
    }
}
