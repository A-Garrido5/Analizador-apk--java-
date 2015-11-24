import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import java.util.List;
import java.util.ArrayList;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import android.text.TextUtils;
import com.twitter.library.network.ae;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.account.i;

// 
// Decompiled by Procyon v0.5.30
// 

public class oj extends i
{
    private String a;
    private boolean e;
    private int[] f;
    
    public oj(final Context context, final Session session, final String s) {
        this(context, new ab(session), s);
    }
    
    public oj(final Context context, final ab ab, final String a) {
        super(context, oj.class.getName(), ab, true);
        this.f = ae.a;
        this.a = a;
        if (TextUtils.isEmpty((CharSequence)this.a)) {
            throw new IllegalArgumentException();
        }
    }
    
    protected final void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.e = (boolean)bg.a();
            return;
        }
        this.f = ae.a((List)bg.a());
    }
    
    @Override
    protected f b() {
        return this.M().a("1.1").a(HttpOperation$RequestMethod.b).a(new Object[] { "signup", "sms_verify_begin" }).a("raw_phone_number", this.a);
    }
    
    public int[] e() {
        return this.f;
    }
    
    protected bg f() {
        return bg.a(86);
    }
}
