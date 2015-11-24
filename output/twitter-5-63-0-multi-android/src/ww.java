import java.io.IOException;
import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class ww extends ad
{
    protected Integer b(final JsonParser jsonParser) {
        try {
            if (jsonParser.d() != JsonToken.b) {
                return null;
            }
            while (!jsonParser.a(new SerializedString("data"))) {
                if (jsonParser.d() == JsonToken.c) {
                    return null;
                }
            }
            while (!jsonParser.a(new SerializedString("nextAfter"))) {
                if (jsonParser.d() == JsonToken.c) {
                    return null;
                }
            }
            if (jsonParser.a() == JsonToken.i) {
                return jsonParser.h();
            }
        }
        catch (IOException ex) {}
        return null;
    }
    
    protected String b(final JsonParser jsonParser, final int n) {
        try {
            if (jsonParser.a() != JsonToken.b) {
                return null;
            }
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                if (e.equals("error")) {
                    return jsonParser.r();
                }
            }
            return null;
        }
        catch (IOException ex) {}
        return null;
    }
    
    public Integer c() {
        return (Integer)this.a();
    }
}
