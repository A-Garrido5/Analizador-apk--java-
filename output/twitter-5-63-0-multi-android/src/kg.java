import org.json.JSONObject;

// 
// Decompiled by Procyon v0.5.30
// 

public class kg extends kc
{
    static final /* synthetic */ boolean d;
    public String a;
    public String b;
    public String c;
    
    static {
        d = !kg.class.desiredAssertionStatus();
    }
    
    @Override
    protected JSONObject a() {
        final JSONObject jsonObject = new JSONObject();
        if (!kg.d && this.a == null) {
            throw new AssertionError((Object)"name was not set");
        }
        jsonObject.put("name", (Object)this.a);
        if (!kg.d && this.b == null) {
            throw new AssertionError((Object)"value was not set");
        }
        jsonObject.put("value", (Object)this.b);
        jsonObject.put("comment", (Object)this.c);
        return jsonObject;
    }
}
