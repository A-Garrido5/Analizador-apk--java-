import com.twitter.library.commerce.model.Email;
import com.twitter.library.commerce.model.Address;
import com.twitter.library.commerce.model.CreditCard$Type;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.commerce.model.ServerCreditCard;
import com.twitter.library.commerce.model.CreditCard;
import com.fasterxml.jackson.core.JsonParser;

// 
// Decompiled by Procyon v0.5.30
// 

public class ru
{
    public static CreditCard a(final JsonParser jsonParser) {
        String r = null;
        final ServerCreditCard serverCreditCard = new ServerCreditCard();
        JsonToken jsonToken = jsonParser.a();
        String r2 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (rv.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("id".equals(e)) {
                        serverCreditCard.d(jsonParser.r());
                        break;
                    }
                    if ("card_type".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    if ("last_four_digits".equals(e)) {
                        r2 = jsonParser.r();
                        break;
                    }
                    if ("shipping_address_id".equals(e)) {
                        serverCreditCard.e(jsonParser.r());
                        break;
                    }
                    break;
                }
                case 2: {
                    if ("expiry_month".equals(e)) {
                        serverCreditCard.a(Integer.valueOf(jsonParser.n()));
                        break;
                    }
                    if ("expiry_year".equals(e)) {
                        serverCreditCard.b(Integer.valueOf(jsonParser.n()));
                        break;
                    }
                    break;
                }
                case 3: {
                    if ("is_default".equals(e)) {
                        serverCreditCard.a(true);
                        break;
                    }
                    if ("is_available_buynow".equals(e)) {
                        serverCreditCard.b(true);
                        break;
                    }
                    if ("is_available_offers".equals(e)) {
                        serverCreditCard.c(true);
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (r != null && r2 != null) {
            serverCreditCard.a(CreditCard$Type.f(r), r2);
        }
        return serverCreditCard;
    }
    
    public static Address b(final JsonParser jsonParser) {
        final Address address = new Address();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (rv.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("id".equals(e)) {
                        address.g(jsonParser.r());
                        break;
                    }
                    if ("display_name".equals(e)) {
                        address.h(jsonParser.r());
                        break;
                    }
                    if ("full_name".equals(e)) {
                        address.i(jsonParser.r());
                        break;
                    }
                    if ("street1".equals(e)) {
                        address.a(jsonParser.r());
                        break;
                    }
                    if ("street2".equals(e)) {
                        address.b(jsonParser.r());
                        break;
                    }
                    if ("city".equals(e)) {
                        address.d(jsonParser.r());
                        break;
                    }
                    if ("subdivision".equals(e)) {
                        address.e(jsonParser.r());
                        break;
                    }
                    if ("postal_code".equals(e)) {
                        address.f(jsonParser.r());
                        break;
                    }
                    if ("country".equals(e)) {
                        address.c(jsonParser.r());
                        break;
                    }
                    break;
                }
                case 3: {
                    if ("is_default".equals(e)) {
                        address.a(true);
                        break;
                    }
                    break;
                }
            }
        }
        return address;
    }
    
    public static Email c(final JsonParser jsonParser) {
        final Email email = new Email();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (rv.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("id".equals(e)) {
                        email.b(jsonParser.r());
                        break;
                    }
                    if ("email_address".equals(e)) {
                        email.a(jsonParser.r());
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    if ("is_default".equals(e)) {
                        email.a(true);
                        break;
                    }
                    if ("is_login_email".equals(e)) {
                        email.b(true);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return email;
    }
}
