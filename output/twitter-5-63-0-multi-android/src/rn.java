import com.twitter.library.api.ad;
import java.io.Serializable;
import com.twitter.library.commerce.model.OrderHistoryItem;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class rn extends c
{
    private String a;
    
    public rn(final Context context, final Session session, final String a) {
        super(context, rn.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        final f b = this.M().b(new Object[] { "commerce", "purchases" }).b(new Object[] { this.a });
        rl.a(b, this.p);
        return b.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final rm rm) {
        if (httpOperation.j()) {
            aa.c.putSerializable("order_history_item", (Serializable)rm.a());
        }
        else {
            rl.a(aa, rm);
        }
        aa.a(httpOperation);
    }
    
    protected rm b() {
        return new rm();
    }
}
