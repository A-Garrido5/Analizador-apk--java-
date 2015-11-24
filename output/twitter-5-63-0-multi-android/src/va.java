import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import android.net.Uri;
import com.twitter.library.featureswitch.d;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class va extends c
{
    private final String a;
    private CardInstanceData e;
    private boolean f;
    
    public va(final Context context, final Session session, final String a) {
        super(context, va.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        final Uri parse = Uri.parse(com.twitter.library.featureswitch.d.a("card_compose_preview_url", "https://caps-staging.twitter.com/v2/cards/preview.json"));
        return this.M().a(HttpOperation$RequestMethod.b).a((String)null).b(parse.getAuthority()).b(new Object[] { parse.getPath() }).b().a("include_cards", true).a("status", this.a).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.e = (CardInstanceData)bg.a();
        }
    }
    
    public void b() {
        this.f = true;
    }
    
    @Override
    protected boolean c(final aa aa) {
        if (this.f) {
            aa.a(0, "Canceled");
            return false;
        }
        return true;
    }
    
    public boolean e() {
        return this.f;
    }
    
    protected bg f() {
        return bg.a(102);
    }
    
    public CardInstanceData g() {
        return this.e;
    }
}
