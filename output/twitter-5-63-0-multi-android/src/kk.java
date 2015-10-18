import org.json.JSONObject;
import com.twitter.internal.network.l;
import com.twitter.util.k;
import com.twitter.internal.network.HttpOperation;

// 
// Decompiled by Procyon v0.5.30
// 

public class kk extends kc
{
    public String a;
    public final String b;
    public final long c;
    public final String d;
    
    public kk(final HttpOperation httpOperation) {
        this.a = null;
        final l l = httpOperation.l();
        this.b = k.a(l.l);
        this.c = l.k;
        this.d = l.s;
    }
    
    @Override
    protected JSONObject a() {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("mimeType", (Object)this.b);
        jsonObject.put("size", this.c);
        jsonObject.put("text", (Object)this.d);
        jsonObject.put("comment", (Object)this.a);
        return jsonObject;
    }
}
