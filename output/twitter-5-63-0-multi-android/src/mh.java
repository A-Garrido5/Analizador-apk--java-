import java.util.List;
import com.twitter.library.api.bh;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.api.TwitterUser;
import java.util.ArrayList;
import com.twitter.errorreporter.a;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class mh extends ad
{
    private static mk a(final JsonParser jsonParser, final a a) {
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        final ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 == JsonToken.f; jsonToken2 = jsonParser.a()) {
                    JsonToken jsonToken3 = jsonParser.a();
                    switch (mi.a[jsonToken3.ordinal()]) {
                        case 2: {
                            if (!"user".equals(jsonParser.e())) {
                                jsonParser.c();
                                break;
                            }
                            final TwitterUser a2 = bh.a(jsonParser, true, a);
                            if (a2 != null) {
                                list.add(a2);
                                break;
                            }
                            break;
                        }
                        case 1: {
                            if ("items".equals(jsonParser.e())) {
                                while (jsonToken3 != null && jsonToken3 != JsonToken.e) {
                                    jsonToken3 = jsonParser.a();
                                    if (jsonToken3 == JsonToken.i) {
                                        list2.add(jsonParser.h());
                                    }
                                }
                                break;
                            }
                            jsonParser.c();
                            break;
                        }
                    }
                }
            }
        }
        return new mk(list, list2);
    }
    
    protected List b(final JsonParser jsonParser, final int n) {
        return bh.G(jsonParser);
    }
    
    protected mk b(final JsonParser jsonParser) {
        final mk mk = new mk();
        final JsonToken a = jsonParser.a();
        mk a2 = mk;
        for (JsonToken a3 = a; a3 != null && a3 != JsonToken.c; a3 = jsonParser.a()) {
            switch (mi.a[a3.ordinal()]) {
                case 1: {
                    if ("matches".equals(jsonParser.e())) {
                        a2 = a(jsonParser, this.d());
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return a2;
    }
}
