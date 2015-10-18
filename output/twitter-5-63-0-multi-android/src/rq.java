import com.twitter.library.provider.b;
import com.twitter.library.api.ad;
import java.io.Serializable;
import com.twitter.library.provider.at;
import android.net.Uri;
import com.twitter.library.commerce.model.OrderHistoryList;
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

public class rq extends c
{
    private Long a;
    
    public rq(final Context context, final Session session, final Long a) {
        super(context, rq.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        final f a = this.M().b(new Object[] { "commerce", "purchases" }).a("page_size", 100L);
        if (this.a != null) {
            a.a("last_item_id", this.a);
        }
        rl.a(a, this.p);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final ro ro) {
        if (httpOperation.j()) {
            final OrderHistoryList list = (OrderHistoryList)ro.a();
            final b w = this.W();
            this.V().a(list, w);
            w.a(at.a);
            w.a();
            aa.c.putSerializable("order_history_list", (Serializable)ro.a());
        }
        else {
            rl.a(aa, ro);
        }
        aa.a(httpOperation);
    }
    
    protected ro b() {
        return new ro();
    }
}
