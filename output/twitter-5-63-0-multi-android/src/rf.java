import java.io.Serializable;
import com.twitter.library.commerce.model.OfferDetails$OfferStatus;
import android.os.Bundle;
import java.util.List;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.commerce.model.CreditCard$Type;
import java.util.ArrayList;
import com.twitter.library.commerce.model.OfferDetails;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class rf extends ad
{
    private void a(final JsonParser jsonParser, final OfferDetails offerDetails) {
        final ArrayList<CreditCard$Type> list = new ArrayList<CreditCard$Type>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (rg.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    final CreditCard$Type f = CreditCard$Type.f(jsonParser.r());
                    if (f != CreditCard$Type.a) {
                        list.add(f);
                        break;
                    }
                    break;
                }
            }
        }
        offerDetails.a(list);
    }
    
    protected Bundle b(final JsonParser jsonParser) {
        final Bundle bundle = new Bundle();
        final OfferDetails offerDetails = new OfferDetails();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (rg.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("offer_id".equals(jsonParser.e())) {
                        offerDetails.a(jsonParser.r());
                        break;
                    }
                    if (!"status".equals(jsonParser.e())) {
                        break;
                    }
                    final String r = jsonParser.r();
                    switch (r) {
                        default: {
                            offerDetails.a(OfferDetails$OfferStatus.a);
                            continue;
                        }
                        case "AVAILABLE": {
                            offerDetails.a(OfferDetails$OfferStatus.b);
                            continue;
                        }
                        case "SAVED": {
                            offerDetails.a(OfferDetails$OfferStatus.c);
                            continue;
                        }
                        case "REDEEMED": {
                            offerDetails.a(OfferDetails$OfferStatus.d);
                            continue;
                        }
                        case "EXPIRED": {
                            offerDetails.a(OfferDetails$OfferStatus.e);
                            continue;
                        }
                        case "INACTIVE": {
                            offerDetails.a(OfferDetails$OfferStatus.f);
                            continue;
                        }
                    }
                    break;
                }
                case 2:
                case 3: {
                    if ("is_enabled".equals(jsonParser.e())) {
                        offerDetails.a(jsonParser.q());
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("end_date".equals(jsonParser.e())) {
                        offerDetails.a(jsonParser.o());
                        break;
                    }
                    if ("start_date".equals(jsonParser.e())) {
                        offerDetails.b(jsonParser.o());
                        break;
                    }
                    break;
                }
                case 5: {
                    if ("supported_card_brands".equals(jsonParser.e())) {
                        this.a(jsonParser, offerDetails);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        bundle.putSerializable("offer_details", (Serializable)offerDetails);
        return bundle;
    }
    
    protected Bundle b(final JsonParser jsonParser, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("commerce_bundle_errors", rd.a(n, jsonParser));
        return bundle;
    }
}
