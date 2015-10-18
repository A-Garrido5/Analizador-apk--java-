import android.os.Bundle;
import com.twitter.library.commerce.model.Email;
import com.twitter.library.commerce.model.CreditCard;
import com.twitter.library.commerce.model.Address;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.commerce.model.Profile;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class rx extends ad
{
    private void a(final JsonParser jsonParser, final Profile profile) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (ry.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    final Address b = ru.b(jsonParser);
                    profile.b(b);
                    if (b.j()) {
                        profile.a(b);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    private void a(final JsonParser jsonParser, final Profile profile, final boolean b) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (ry.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    final CreditCard a = ru.a(jsonParser);
                    if (b) {
                        profile.b(a);
                        break;
                    }
                    profile.a(a);
                    if (a.l()) {
                        profile.c(a);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    private void b(final JsonParser jsonParser, final Profile profile) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (ry.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    final Email c = ru.c(jsonParser);
                    profile.a(c);
                    if (c.b()) {
                        profile.b(c);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    protected Bundle b(final JsonParser jsonParser, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("commerce_bundle_errors", rd.a(n, jsonParser));
        return bundle;
    }
    
    protected Profile b(final JsonParser jsonParser) {
        final Profile profile = new Profile();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (ry.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("payment_methods".equals(jsonParser.e())) {
                        this.a(jsonParser, profile, false);
                        break;
                    }
                    if ("partial_payment_methods".equals(jsonParser.e())) {
                        this.a(jsonParser, profile, true);
                        break;
                    }
                    if ("addresses".equals(jsonParser.e())) {
                        this.a(jsonParser, profile);
                        break;
                    }
                    if ("contact_emails".equals(jsonParser.e())) {
                        this.b(jsonParser, profile);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return profile;
    }
}
