import org.json.JSONArray;
import org.json.JSONObject;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;

// 
// Decompiled by Procyon v0.5.30
// 

public final class ki extends kb
{
    public final HttpOperation$RequestMethod f;
    public final String g;
    
    public ki(final HttpOperation httpOperation) {
        this.f = httpOperation.h();
        this.g = httpOperation.i().toString();
        this.d = httpOperation.p();
        this.b = httpOperation.f();
        this.a(httpOperation.m());
    }
    
    @Override
    protected JSONObject a() {
        final JSONObject a = super.a();
        a.put("postData", (Object)null);
        a.put("method", (Object)this.f.name());
        a.put("url", (Object)this.g);
        a.put("queryString", (Object)new JSONArray());
        return a;
    }
}
