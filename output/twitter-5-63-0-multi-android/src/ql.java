import com.fasterxml.jackson.core.JsonToken;
import android.os.Bundle;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class ql extends ad
{
    protected Bundle b(final JsonParser jsonParser, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("commerce_bundle_errors", rd.a(n, jsonParser));
        return bundle;
    }
    
    protected String b(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String r = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (qm.a[a2.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("id".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return r;
    }
}
