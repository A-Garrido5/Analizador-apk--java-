import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.LinkedList;
import java.util.List;
import com.twitter.internal.network.HttpOperation$Protocol;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class kb extends kc
{
    static final /* synthetic */ boolean e;
    public long a;
    public long b;
    public String c;
    public HttpOperation$Protocol d;
    private final List f;
    
    static {
        e = !kb.class.desiredAssertionStatus();
    }
    
    public kb() {
        this.a = -1L;
        this.b = -1L;
        this.c = null;
        this.d = HttpOperation$Protocol.b;
        this.f = new LinkedList();
    }
    
    @Override
    protected JSONObject a() {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("cookies", (Object)new JSONArray());
        jsonObject.put("headers", (Object)this.a(this.f));
        jsonObject.put("headersSize", this.a);
        jsonObject.put("bodySize", this.b);
        jsonObject.put("comment", (Object)this.c);
        if (!kb.e && this.d == null) {
            throw new AssertionError((Object)"httpVersion was not set");
        }
        jsonObject.put("httpVersion", (Object)this.d.toString());
        return jsonObject;
    }
    
    protected void a(final Map map) {
        long a;
        if (map != null) {
            final Iterator<Map.Entry<String, V>> iterator = map.entrySet().iterator();
            a = 0L;
            while (iterator.hasNext()) {
                final Map.Entry<String, V> entry = iterator.next();
                String a2 = entry.getKey();
                if (a2 == null) {
                    a2 = "";
                }
                final long n = 3 + a2.length();
                final List list = (List)entry.getValue();
                long n3;
                if (list != null) {
                    long n2 = a + (n + 1L) * list.size();
                    for (String b : list) {
                        if (b == null) {
                            b = "";
                        }
                        final kg kg = new kg();
                        kg.a = a2;
                        kg.b = b;
                        this.f.add(kg);
                        n2 += b.length();
                    }
                    n3 = n2;
                }
                else {
                    n3 = a + n;
                }
                a = n3;
            }
        }
        else {
            a = 0L;
        }
        this.a = a;
    }
}
