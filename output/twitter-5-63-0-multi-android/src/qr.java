import com.twitter.library.commerce.model.TaxType;
import com.twitter.library.commerce.model.ShippingType;
import java.io.IOException;
import java.util.ArrayList;
import android.os.Bundle;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.commerce.model.ProductVariant;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class qr extends ad
{
    void a(final JsonParser jsonParser, final ProductVariant productVariant) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (qs.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("currency".equals(e)) {
                        productVariant.b(jsonParser.r());
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("amount".equals(e)) {
                        productVariant.a(new BigDecimal(jsonParser.o()));
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    protected Bundle b(final JsonParser jsonParser) {
        qu qu = null;
        final Bundle bundle = new Bundle();
        JsonToken a = jsonParser.a();
        qt qt = null;
        ArrayList<ProductVariant> list = null;
        while (a != null && a != JsonToken.c) {
            qu f = null;
            qt qt2 = null;
            ArrayList<ProductVariant> list2 = null;
            Label_0088: {
                switch (qs.a[a.ordinal()]) {
                    default: {
                        jsonParser.c();
                        break;
                    }
                    case 1: {
                        if ("id".equals(jsonParser.e())) {
                            bundle.putString("cart_bundle_id", jsonParser.r());
                            f = qu;
                            qt2 = qt;
                            list2 = list;
                            break Label_0088;
                        }
                        if ("status".equals(jsonParser.e())) {
                            bundle.putString("cart_bundle_status", jsonParser.r());
                            f = qu;
                            qt2 = qt;
                            list2 = list;
                            break Label_0088;
                        }
                        break;
                    }
                    case 2: {
                        if ("variants".equals(jsonParser.e())) {
                            final ArrayList c = this.c(jsonParser);
                            final qu qu2 = qu;
                            qt2 = qt;
                            list2 = (ArrayList<ProductVariant>)c;
                            f = qu2;
                            break Label_0088;
                        }
                        jsonParser.c();
                        f = qu;
                        qt2 = qt;
                        list2 = list;
                        break Label_0088;
                    }
                    case 3: {
                        final String e = jsonParser.e();
                        if ("shipping".equals(e)) {
                            final qt e2 = this.e(jsonParser);
                            list2 = list;
                            f = qu;
                            qt2 = e2;
                            break Label_0088;
                        }
                        if ("tax".equals(e)) {
                            f = this.f(jsonParser);
                            qt2 = qt;
                            list2 = list;
                            break Label_0088;
                        }
                        jsonParser.c();
                        f = qu;
                        qt2 = qt;
                        list2 = list;
                        break Label_0088;
                    }
                }
                f = qu;
                qt2 = qt;
                list2 = list;
            }
            final JsonToken a2 = jsonParser.a();
            list = list2;
            qt = qt2;
            qu = f;
            a = a2;
        }
        if (list != null && list.size() > 0 && qu != null && qt != null) {
            final ProductVariant productVariant = list.get(0);
            productVariant.c(qt.a);
            productVariant.a(qt.b);
            productVariant.b(qt.c);
            productVariant.d(qu.a);
            productVariant.a(qu.b);
            productVariant.c(qu.c);
        }
        bundle.putParcelableArrayList("getproductinfo_bundle_variants", (ArrayList)list);
        return bundle;
    }
    
    protected Bundle b(final JsonParser jsonParser, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("commerce_bundle_errors", rd.a(n, jsonParser));
        return bundle;
    }
    
    ArrayList c(final JsonParser jsonParser) {
        final ArrayList<ProductVariant> list = new ArrayList<ProductVariant>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (qs.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    list.add(this.d(jsonParser));
                    break;
                }
            }
        }
        if (list.size() != 1) {
            throw new IOException("Only one variant is expected in the cart.");
        }
        return list;
    }
    
    ProductVariant d(final JsonParser jsonParser) {
        final ProductVariant productVariant = new ProductVariant();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (qs.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("id".equals(e)) {
                        productVariant.a(jsonParser.r());
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("inventory_count".equals(e)) {
                        productVariant.a(jsonParser.n());
                        break;
                    }
                    break;
                }
                case 3: {
                    if ("price".equals(e)) {
                        this.a(jsonParser, productVariant);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return productVariant;
    }
    
    qt e(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final qt qt = new qt(null);
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (qs.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("currency".equals(e)) {
                        qt.a = jsonParser.r();
                        break;
                    }
                    if ("type".equals(e)) {
                        qt.b = ShippingType.a(jsonParser.r());
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("amount".equals(e)) {
                        qt.c = new BigDecimal(jsonParser.o());
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return qt;
    }
    
    qu f(final JsonParser jsonParser) {
        final qu qu = new qu(null);
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (qs.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("currency".equals(e)) {
                        qu.a = jsonParser.r();
                        break;
                    }
                    if ("type".equals(e)) {
                        qu.b = TaxType.a(jsonParser.r());
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("amount".equals(e)) {
                        qu.c = new BigDecimal(jsonParser.o());
                        break;
                    }
                    break;
                }
            }
        }
        return qu;
    }
}
