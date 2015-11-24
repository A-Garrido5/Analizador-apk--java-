import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.commerce.model.OrderHistoryItem;
import com.fasterxml.jackson.core.JsonParser;

// 
// Decompiled by Procyon v0.5.30
// 

public class rr
{
    public static OrderHistoryItem a(final JsonParser jsonParser) {
        final OrderHistoryItem orderHistoryItem = new OrderHistoryItem();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (rs.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("payment_method".equals(e)) {
                        orderHistoryItem.a(ru.a(jsonParser));
                        break;
                    }
                    if ("purchase_record".equals(e)) {
                        a(jsonParser, orderHistoryItem);
                        break;
                    }
                    if ("shipping_address".equals(e)) {
                        orderHistoryItem.a(ru.b(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return orderHistoryItem;
    }
    
    private static void a(final JsonParser jsonParser, final OrderHistoryItem orderHistoryItem) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (rs.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    int n = 0;
                    Label_0099: {
                        switch (e.hashCode()) {
                            case 405645655: {
                                if (e.equals("attributes")) {
                                    n = 0;
                                    break Label_0099;
                                }
                                break;
                            }
                        }
                        n = -1;
                    }
                    switch (n) {
                        default: {
                            jsonParser.c();
                            continue;
                        }
                        case 0: {
                            orderHistoryItem.a(b(jsonParser));
                            continue;
                        }
                    }
                    break;
                }
                case 1: {
                    int n2 = 0;
                    Label_0203: {
                        switch (e.hashCode()) {
                            case 106934601: {
                                if (e.equals("price")) {
                                    n2 = 0;
                                    break Label_0203;
                                }
                                break;
                            }
                            case -516235858: {
                                if (e.equals("shipping")) {
                                    n2 = 1;
                                    break Label_0203;
                                }
                                break;
                            }
                            case 114603: {
                                if (e.equals("tax")) {
                                    n2 = 2;
                                    break Label_0203;
                                }
                                break;
                            }
                            case 110549828: {
                                if (e.equals("total")) {
                                    n2 = 3;
                                    break Label_0203;
                                }
                                break;
                            }
                        }
                        n2 = -1;
                    }
                    switch (n2) {
                        default: {
                            jsonParser.c();
                            continue;
                        }
                        case 0: {
                            b(jsonParser, orderHistoryItem);
                            continue;
                        }
                        case 1: {
                            c(jsonParser, orderHistoryItem);
                            continue;
                        }
                        case 2: {
                            d(jsonParser, orderHistoryItem);
                            continue;
                        }
                        case 3: {
                            e(jsonParser, orderHistoryItem);
                            continue;
                        }
                    }
                    break;
                }
                case 2: {
                    final String r = jsonParser.r();
                    int n3 = 0;
                    Label_0463: {
                        switch (e.hashCode()) {
                            case 2072725154: {
                                if (e.equals("merchant_name")) {
                                    n3 = 0;
                                    break Label_0463;
                                }
                                break;
                            }
                            case -177995163: {
                                if (e.equals("merchant_email")) {
                                    n3 = 1;
                                    break Label_0463;
                                }
                                break;
                            }
                            case -1724546052: {
                                if (e.equals("description")) {
                                    n3 = 2;
                                    break Label_0463;
                                }
                                break;
                            }
                            case -877823861: {
                                if (e.equals("image_url")) {
                                    n3 = 3;
                                    break Label_0463;
                                }
                                break;
                            }
                            case -546810497: {
                                if (e.equals("sales_order_id")) {
                                    n3 = 4;
                                    break Label_0463;
                                }
                                break;
                            }
                            case 106934601: {
                                if (e.equals("price")) {
                                    n3 = 5;
                                    break Label_0463;
                                }
                                break;
                            }
                            case -1491291617: {
                                if (e.equals("product_url")) {
                                    n3 = 6;
                                    break Label_0463;
                                }
                                break;
                            }
                            case 3355: {
                                if (e.equals("id")) {
                                    n3 = 7;
                                    break Label_0463;
                                }
                                break;
                            }
                            case 110371416: {
                                if (e.equals("title")) {
                                    n3 = 8;
                                    break Label_0463;
                                }
                                break;
                            }
                            case 1041371651: {
                                if (e.equals("order_status")) {
                                    n3 = 9;
                                    break Label_0463;
                                }
                                break;
                            }
                            case -1332092512: {
                                if (e.equals("external_order_id")) {
                                    n3 = 10;
                                    break Label_0463;
                                }
                                break;
                            }
                            case -1150111480: {
                                if (e.equals("merchant_support_url")) {
                                    n3 = 11;
                                    break Label_0463;
                                }
                                break;
                            }
                            case -361625519: {
                                if (e.equals("merchant_phone_number")) {
                                    n3 = 12;
                                    break Label_0463;
                                }
                                break;
                            }
                        }
                        n3 = -1;
                    }
                    switch (n3) {
                        default: {
                            jsonParser.c();
                            continue;
                        }
                        case 0: {
                            orderHistoryItem.a(r);
                            continue;
                        }
                        case 1: {
                            orderHistoryItem.e(r);
                            continue;
                        }
                        case 2: {
                            jsonParser.c();
                            continue;
                        }
                        case 3: {
                            orderHistoryItem.c(r);
                            continue;
                        }
                        case 4: {
                            orderHistoryItem.a(Long.valueOf(r));
                            continue;
                        }
                        case 5: {
                            orderHistoryItem.b(new BigDecimal(r));
                            continue;
                        }
                        case 6: {
                            orderHistoryItem.f(r);
                            continue;
                        }
                        case 7: {
                            orderHistoryItem.b(Long.valueOf(r));
                            continue;
                        }
                        case 8: {
                            orderHistoryItem.b(r);
                            continue;
                        }
                        case 9: {
                            orderHistoryItem.d(r);
                            continue;
                        }
                        case 10: {
                            orderHistoryItem.h(r);
                            continue;
                        }
                        case 11: {
                            orderHistoryItem.i(r);
                            continue;
                        }
                        case 12: {
                            orderHistoryItem.j(r);
                            continue;
                        }
                    }
                    break;
                }
                case 4: {
                    final long o = jsonParser.o();
                    int n4 = 0;
                    Label_0919: {
                        switch (e.hashCode()) {
                            case 761464133: {
                                if (e.equals("ordered_at")) {
                                    n4 = 0;
                                    break Label_0919;
                                }
                                break;
                            }
                            case -1285004149: {
                                if (e.equals("quantity")) {
                                    n4 = 1;
                                    break Label_0919;
                                }
                                break;
                            }
                            case 1529661865: {
                                if (e.equals("tweet_id")) {
                                    n4 = 2;
                                    break Label_0919;
                                }
                                break;
                            }
                        }
                        n4 = -1;
                    }
                    switch (n4) {
                        default: {
                            jsonParser.c();
                            continue;
                        }
                        case 0: {
                            final Calendar instance = Calendar.getInstance();
                            instance.setTimeInMillis(o);
                            orderHistoryItem.a(instance);
                            continue;
                        }
                        case 1: {
                            orderHistoryItem.a((int)o);
                            continue;
                        }
                        case 2: {
                            orderHistoryItem.c(Long.valueOf(o));
                            continue;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    private static void a(final JsonParser jsonParser, final Map map) {
        String r = null;
        JsonToken jsonToken = jsonParser.a();
        String r2 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (rs.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("name".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    if ("value".equals(e)) {
                        r2 = jsonParser.r();
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (r != null && r2 != null) {
            map.put(r, r2);
        }
    }
    
    private static Map b(final JsonParser jsonParser) {
        final HashMap hashMap = new HashMap();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (rs.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    a(jsonParser, hashMap);
                    break;
                }
            }
        }
        return hashMap;
    }
    
    private static void b(final JsonParser jsonParser, final OrderHistoryItem orderHistoryItem) {
        final rt c = c(jsonParser);
        orderHistoryItem.b(c.a);
        orderHistoryItem.m(c.b);
    }
    
    private static rt c(final JsonParser jsonParser) {
        final rt rt = new rt(null);
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (rs.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2:
                case 4: {
                    if ("amount".equals(e)) {
                        rt.a = new BigDecimal(jsonParser.o());
                        break;
                    }
                    if ("currency".equals(e)) {
                        rt.b = jsonParser.r();
                        break;
                    }
                    if ("type".equals(e)) {
                        rt.c = jsonParser.r();
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return rt;
    }
    
    private static void c(final JsonParser jsonParser, final OrderHistoryItem orderHistoryItem) {
        final rt c = c(jsonParser);
        orderHistoryItem.d(c.a);
        orderHistoryItem.k(c.c);
        orderHistoryItem.o(c.b);
    }
    
    private static void d(final JsonParser jsonParser, final OrderHistoryItem orderHistoryItem) {
        final rt c = c(jsonParser);
        orderHistoryItem.c(c.a);
        orderHistoryItem.l(c.c);
        orderHistoryItem.n(c.b);
    }
    
    private static void e(final JsonParser jsonParser, final OrderHistoryItem orderHistoryItem) {
        final rt c = c(jsonParser);
        orderHistoryItem.a(c.a);
        orderHistoryItem.g(c.b);
    }
}
