import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import android.text.TextUtils;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.ai;
import com.twitter.library.api.account.i;

// 
// Decompiled by Procyon v0.5.30
// 

public class pt extends i
{
    private String a;
    private String e;
    private String f;
    private String h;
    private ai i;
    
    public pt(final Context context, final Session session, final String s, final String s2, final String s3) {
        this(context, new ab(session), s, s2, s3);
    }
    
    public pt(final Context context, final ab ab, final String h, final String a, final String f) {
        super(context, pt.class.getName(), ab);
        this.h = h;
        this.a = a;
        this.f = f;
        if (TextUtils.isEmpty((CharSequence)this.h)) {
            throw new IllegalArgumentException("Please provide password.");
        }
    }
    
    public pt a(final String e) {
        this.e = e;
        return this;
    }
    
    protected final void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.i = (ai)bg.a();
        }
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "account", "password_strength" }).a("password", this.h);
        final String a2 = this.a;
        final String f = this.f;
        final String e = this.e;
        if (!TextUtils.isEmpty((CharSequence)a2)) {
            a.a("name", a2);
        }
        if (!TextUtils.isEmpty((CharSequence)f)) {
            a.a("screen_name", f);
        }
        if (!TextUtils.isEmpty((CharSequence)e)) {
            a.a("email", e);
        }
        return a;
    }
    
    public ai e() {
        return this.i;
    }
    
    protected bg f() {
        return bg.a(97);
    }
}
