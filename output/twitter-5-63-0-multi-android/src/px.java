import java.util.List;
import java.util.ArrayList;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.network.ae;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class px extends c
{
    private int[] a;
    private final String e;
    
    public px(final Context context, final Session session, final String e) {
        super(context, px.class.getName(), session);
        this.a = ae.a;
        this.e = e;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "device", "unregister" }).a("password", this.e).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            return;
        }
        this.a = ae.a((List)bg.a());
    }
    
    public int[] b() {
        return this.a;
    }
    
    protected bg e() {
        return bg.a(90);
    }
}
