import java.io.Serializable;
import com.fasterxml.jackson.core.JsonToken;
import android.os.Bundle;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class qo extends ad
{
    protected Bundle b(final JsonParser jsonParser) {
        final Bundle bundle = new Bundle();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (qp.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("address".equals(jsonParser.e())) {
                        bundle.putSerializable("createaddr_bundle_address", (Serializable)ru.b(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("signature".equals(jsonParser.e())) {
                        final String r = jsonParser.r();
                        if (r != null) {
                            bundle.putString("createaddr_bundle_signature", r);
                            break;
                        }
                        break;
                    }
                    else {
                        if (!"timestamp".equals(jsonParser.e())) {
                            break;
                        }
                        final String r2 = jsonParser.r();
                        if (r2 != null) {
                            bundle.putString("createaddr_bundle_timestamp", r2);
                            break;
                        }
                        break;
                    }
                    break;
                }
                case 3: {
                    if ("timestamp".equals(jsonParser.e())) {
                        bundle.putString("createaddr_bundle_timestamp", "" + jsonParser.i());
                        break;
                    }
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
