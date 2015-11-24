import com.fasterxml.jackson.core.JsonToken;
import android.os.Bundle;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class se extends ad
{
    protected Bundle b(final JsonParser jsonParser) {
        final Bundle bundle = new Bundle();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (sf.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("id".equals(e)) {
                        bundle.putString("cart_bundle_id", jsonParser.r());
                        break;
                    }
                    if ("purchase_record_id".equals(e)) {
                        bundle.putString("auth_cart_id", jsonParser.r());
                        break;
                    }
                    if ("status".equals(e)) {
                        bundle.putString("cart_bundle_status", jsonParser.r());
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
