import org.json.JSONObject;
import com.twitter.internal.network.l;
import com.twitter.internal.android.service.d;
import com.twitter.internal.network.HttpOperation;

// 
// Decompiled by Procyon v0.5.30
// 

public final class kl extends kc
{
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public String h;
    
    public kl(final HttpOperation httpOperation, final d d) {
        this.a = -1L;
        this.b = -1L;
        this.c = -1L;
        this.d = -1L;
        this.e = -1L;
        this.f = 1L;
        this.g = -1L;
        this.h = null;
        final l l = httpOperation.l();
        long a;
        if (d != null) {
            a = d.a();
        }
        else {
            a = -1L;
        }
        this.a = a;
        this.c = l.t[1];
        this.b = -1L;
        this.f = l.t[4];
        this.d = l.t[2];
        this.g = -1L;
        this.e = l.t[3];
        this.h = "";
    }
    
    @Override
    protected JSONObject a() {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("blocked", this.a);
        jsonObject.put("dns", this.b);
        jsonObject.put("connect", this.c);
        jsonObject.put("send", this.d);
        jsonObject.put("wait", this.e);
        jsonObject.put("receive", this.f);
        jsonObject.put("ssl", this.g);
        jsonObject.put("comment", (Object)this.h);
        return jsonObject;
    }
}
