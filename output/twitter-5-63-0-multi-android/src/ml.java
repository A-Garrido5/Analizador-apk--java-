import com.twitter.library.service.d;
import android.os.Bundle;
import com.twitter.library.provider.b;
import java.util.ArrayList;
import java.util.Collection;
import com.twitter.library.api.bc;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class ml extends c
{
    private int a;
    
    public ml(final Context context, final Session session) {
        super(context, ml.class.getName(), session);
        this.a = 100;
    }
    
    @Override
    protected e a() {
        return this.M().a(new Object[] { "contacts", "uploaded_by" }).a("count", this.a).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final bc bc = (bc)bg.a();
            if (bc != null) {
                final ArrayList b = bc.b();
                final b w = this.W();
                final int a = this.V().a(b, this.P().c, 7, -1L, null, null, true, w);
                w.a();
                final Bundle o = this.o;
                o.putInt("count", a);
                o.putInt("num_users", b.size());
            }
        }
    }
    
    protected bg b() {
        return bg.a(21);
    }
}
