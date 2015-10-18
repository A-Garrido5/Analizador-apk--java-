import org.json.JSONObject;

// 
// Decompiled by Procyon v0.5.30
// 

public class kd extends kc
{
    static final /* synthetic */ boolean c;
    public String a;
    public String b;
    
    static {
        c = !kd.class.desiredAssertionStatus();
    }
    
    public kd() {
        this.a = null;
        this.b = "Twitter for Android";
    }
    
    @Override
    protected JSONObject a() {
        final JSONObject jsonObject = new JSONObject();
        if (!kd.c && this.b == null) {
            throw new AssertionError((Object)"name was not set");
        }
        jsonObject.put("name", (Object)this.b);
        jsonObject.put("version", (Object)"");
        jsonObject.put("comment", (Object)this.a);
        return jsonObject;
    }
}
