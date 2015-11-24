import android.os.Bundle;
import com.twitter.library.commerce.model.ServerErrorType;
import java.io.IOException;
import java.util.Collection;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.commerce.model.ServerError;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class sb extends ad
{
    public static ArrayList c(final JsonParser jsonParser) {
        final ArrayList<ServerError> list = new ArrayList<ServerError>();
        while (true) {
            if (jsonParser != null) {
                try {
                    if (jsonParser.d() == JsonToken.b) {
                        list.add(d(jsonParser));
                        return list;
                    }
                    if (jsonParser != null && jsonParser.d() == JsonToken.d) {
                        list.addAll(f(jsonParser));
                        return list;
                    }
                }
                catch (IOException ex) {}
                return list;
            }
            continue;
        }
    }
    
    public static ServerError d(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String r = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (sc.a[a2.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 5: {
                    if ("errorCode".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    break;
                }
            }
        }
        return new ServerError("", "", ServerErrorType.a(r));
    }
    
    private String e(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String s = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (sc.a[a2.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 5: {
                    if ("profileId".equals(e)) {
                        s = jsonParser.r();
                        break;
                    }
                    break;
                }
                case 6: {
                    if ("profileId".equals(e)) {
                        s = "" + jsonParser.o();
                        break;
                    }
                    break;
                }
            }
        }
        return s;
    }
    
    private static ArrayList f(final JsonParser jsonParser) {
        final ArrayList<ServerError> list = new ArrayList<ServerError>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (sc.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    list.add(d(jsonParser));
                    break;
                }
            }
        }
        return list;
    }
    
    protected Bundle b(final JsonParser jsonParser) {
        final Bundle bundle = new Bundle();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (sc.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1:
                case 2: {
                    if ("success".equals(jsonParser.e())) {
                        bundle.putBoolean("storeprofile_bundle_success", jsonToken == JsonToken.k);
                        break;
                    }
                    break;
                }
                case 3: {
                    if (!"params".equals(jsonParser.e())) {
                        jsonParser.c();
                        break;
                    }
                    final String e = this.e(jsonParser);
                    if (e != null) {
                        bundle.putString("storeprofile_bundle_profileid", e);
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("errors".equals(jsonParser.e())) {
                        bundle.putParcelableArrayList("commerce_bundle_errors", c(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return bundle;
    }
    
    protected Bundle b(final JsonParser jsonParser, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("commerce_bundle_errors", rd.a(n, jsonParser));
        return bundle;
    }
}
