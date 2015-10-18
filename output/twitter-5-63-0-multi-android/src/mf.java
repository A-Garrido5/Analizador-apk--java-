import java.util.HashMap;
import com.fasterxml.jackson.core.JsonToken;
import java.util.Map;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class mf extends ad
{
    private void a(final JsonParser jsonParser, final Map map) {
        for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (mg.a[jsonToken.ordinal()]) {
                case 2: {
                    this.b(jsonParser, map);
                    break;
                }
            }
        }
    }
    
    private void b(final JsonParser jsonParser, final Map map) {
        String s = null;
        JsonToken d = jsonParser.d();
        int n = -1;
        String s2 = null;
        Long n2 = null;
        while (d != null && d != JsonToken.c) {
            String s4 = null;
            Long n3 = null;
            String g2 = null;
            Label_0075: {
                switch (mg.a[d.ordinal()]) {
                    case 3: {
                        final String g = jsonParser.g();
                        if ("tweet_id".equals(s)) {
                            try {
                                final Long value = Long.parseLong(g);
                                final String s3 = s;
                                s4 = s2;
                                n3 = value;
                                g2 = s3;
                            }
                            catch (NumberFormatException ex) {
                                g2 = s;
                                s4 = s2;
                                n3 = n2;
                            }
                            break Label_0075;
                        }
                        if ("preroll_id".equals(s)) {
                            n3 = n2;
                            g2 = s;
                            s4 = g;
                            break Label_0075;
                        }
                        break;
                    }
                    case 4: {
                        final int h = jsonParser.h();
                        if ("dynamic_preroll_type".equals(s)) {
                            n = h;
                            g2 = s;
                            s4 = s2;
                            n3 = n2;
                            break Label_0075;
                        }
                        break;
                    }
                    case 5: {
                        g2 = jsonParser.g();
                        s4 = s2;
                        n3 = n2;
                        break Label_0075;
                    }
                }
                g2 = s;
                s4 = s2;
                n3 = n2;
            }
            final JsonToken a = jsonParser.a();
            final String s5 = g2;
            d = a;
            n2 = n3;
            s2 = s4;
            s = s5;
        }
        if (n2 != null && s2 != null) {
            map.put(n2, new mc(s2, n));
        }
    }
    
    protected String b(final JsonParser jsonParser, final int n) {
        return null;
    }
    
    protected Map b(final JsonParser jsonParser) {
        final HashMap hashMap = new HashMap();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (mg.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("prerolls".equals(jsonParser.e())) {
                        this.a(jsonParser, hashMap);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return hashMap;
    }
    
    protected Map c() {
        return (Map)this.a();
    }
}
