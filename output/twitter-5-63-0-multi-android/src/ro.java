import android.os.Bundle;
import com.twitter.library.commerce.model.OrderHistoryList;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class ro extends ad
{
    private Long c(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        Long value = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (rp.a[a2.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final long o = jsonParser.o();
                    if ("last_item_id".equals(e)) {
                        value = o;
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return value;
    }
    
    private OrderHistoryList d(final JsonParser jsonParser) {
        final OrderHistoryList list = new OrderHistoryList();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (rp.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    list.a(rr.a(jsonParser));
                    break;
                }
            }
        }
        return list;
    }
    
    protected Bundle b(final JsonParser jsonParser, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("commerce_bundle_errors", rd.a(n, jsonParser));
        return bundle;
    }
    
    protected OrderHistoryList b(final JsonParser jsonParser) {
        OrderHistoryList d = null;
        JsonToken jsonToken = jsonParser.a();
        Long c = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (rp.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("purchase_records".equals(jsonParser.e())) {
                        d = this.d(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("context".equals(jsonParser.e())) {
                        c = this.c(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (d != null) {
            d.a(c);
        }
        return d;
    }
}
