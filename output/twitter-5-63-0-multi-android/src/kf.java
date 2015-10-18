import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import com.twitter.util.collection.b;

// 
// Decompiled by Procyon v0.5.30
// 

public class kf extends kc
{
    static final /* synthetic */ boolean c;
    public String a;
    public kd b;
    private final b d;
    
    static {
        c = !kf.class.desiredAssertionStatus();
    }
    
    public kf() {
        this.a = null;
        this.b = new kd();
        this.d = new b(150);
    }
    
    @Override
    protected JSONObject a() {
        final JSONObject jsonObject = new JSONObject();
        final JSONObject jsonObject2 = new JSONObject();
        jsonObject.put("log", (Object)jsonObject2);
        jsonObject2.put("version", (Object)"1.2");
        if (!kf.c && this.b == null) {
            throw new AssertionError((Object)"creator was not set");
        }
        jsonObject2.put("creator", (Object)this.b.a());
        jsonObject2.put("comment", (Object)this.a);
        final JSONArray jsonArray = new JSONArray();
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            jsonArray.put((Object)iterator.next().a());
        }
        jsonObject2.put("entries", (Object)jsonArray);
        if (!this.d.isEmpty()) {
            final JSONArray jsonArray2 = new JSONArray();
            final kh kh = new kh();
            kh.b = ((ke)this.d.a()).f;
            jsonArray2.put((Object)kh.a());
            jsonObject2.put("pages", (Object)jsonArray2);
        }
        return jsonObject;
    }
    
    public void a(final ke ke) {
        if (!kf.c && ke == null) {
            throw new AssertionError((Object)"entry was null");
        }
        this.d.add(ke);
    }
}
