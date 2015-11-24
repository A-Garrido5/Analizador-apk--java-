import java.util.Date;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.5.30
// 

public class kh extends kc
{
    public String a;
    public long b;
    
    public kh() {
        this.a = "";
    }
    
    @Override
    protected JSONObject a() {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("comment", (Object)this.a);
        jsonObject.put("id", (Object)"twitter_android");
        jsonObject.put("pageTimings", (Object)new JSONObject());
        jsonObject.put("startedDateTime", (Object)this.a(new Date(this.b)));
        jsonObject.put("title", (Object)"Android Request Group");
        return jsonObject;
    }
}
