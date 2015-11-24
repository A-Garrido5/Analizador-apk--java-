import com.twitter.library.commerce.model.OrderHistoryItem;
import android.os.Bundle;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class rm extends ad
{
    protected Bundle b(final JsonParser jsonParser, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("commerce_bundle_errors", rd.a(n, jsonParser));
        return bundle;
    }
    
    protected OrderHistoryItem b(final JsonParser jsonParser) {
        return rr.a(jsonParser);
    }
}
