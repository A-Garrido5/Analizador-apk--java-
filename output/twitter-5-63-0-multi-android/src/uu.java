import com.twitter.library.card.instance.c;
import com.fasterxml.jackson.core.JsonToken;
import android.text.TextUtils;
import com.twitter.errorreporter.a;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.card.instance.CardInstanceData;

// 
// Decompiled by Procyon v0.5.30
// 

public class uu
{
    public CardInstanceData a;
    public String b;
    public String c;
    
    public static vc a(final JsonParser jsonParser, final a a) {
        final uu uu = new uu();
        final boolean c = uu.c(jsonParser, a);
        vc u = null;
        if (c) {
            final CardInstanceData a2 = uu.a;
            u = null;
            if (a2 != null) {
                u = a2.u();
            }
        }
        return u;
    }
    
    private boolean a() {
        return this.a != null || (!TextUtils.isEmpty((CharSequence)this.c) && !TextUtils.isEmpty((CharSequence)this.b));
    }
    
    public static CardInstanceData b(final JsonParser jsonParser, final a a) {
        final uu uu = new uu();
        if (uu.c(jsonParser, a)) {
            return uu.a;
        }
        return null;
    }
    
    public boolean c(final JsonParser jsonParser, final a a) {
        JsonToken jsonToken = jsonParser.a();
        Object e = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (uv.a[jsonToken.ordinal()]) {
                case 1: {
                    e = jsonParser.e();
                    break;
                }
                case 2: {
                    if (!"card".equals(e)) {
                        jsonParser.c();
                        break;
                    }
                    final c c = new c();
                    if (c.a(jsonParser, a)) {
                        this.a = c.a();
                        break;
                    }
                    this.a = null;
                    break;
                }
                case 3: {
                    jsonParser.c();
                    break;
                }
                case 4: {
                    if ("req_id".equals(e)) {
                        this.c = jsonParser.g();
                        break;
                    }
                    if ("caps_error".equals(e)) {
                        this.b = jsonParser.g();
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return this.a();
    }
}
