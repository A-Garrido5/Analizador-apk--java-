import com.twitter.library.commerce.model.TaxType;
import java.util.ArrayList;
import com.twitter.library.commerce.model.ShippingType;
import android.os.Bundle;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.commerce.model.ProductVariant;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class ri extends ad
{
    void a(final JsonParser jsonParser, final ProductVariant productVariant) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (rj.a[jsonToken.ordinal()]) {
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
        final Bundle bundle = new Bundle();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (rj.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("id".equals(jsonParser.e())) {
                        bundle.putString("cart_bundle_id", jsonParser.r());
                        break;
                    }
                    break;
                }
                case 2: {
                    if ("variants".equals(jsonParser.e())) {
                        bundle.putParcelableArrayList("getproductinfo_bundle_variants", this.c(jsonParser));
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
    
    void b(final JsonParser jsonParser, final ProductVariant productVariant) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (rj.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("currency".equals(e)) {
                        productVariant.c(jsonParser.r());
                        break;
                    }
                    if ("type".equals(e)) {
                        productVariant.a(ShippingType.a(jsonParser.r()));
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("amount".equals(e)) {
                        productVariant.b(new BigDecimal(jsonParser.o()));
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    ArrayList c(final JsonParser jsonParser) {
        final ArrayList<ProductVariant> list = new ArrayList<ProductVariant>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (rj.a[jsonToken.ordinal()]) {
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
        return list;
    }
    
    void c(final JsonParser jsonParser, final ProductVariant productVariant) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (rj.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("currency".equals(e)) {
                        productVariant.d(jsonParser.r());
                        break;
                    }
                    if ("type".equals(e)) {
                        productVariant.a(TaxType.a(jsonParser.r()));
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("amount".equals(e)) {
                        productVariant.c(new BigDecimal(jsonParser.o()));
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    ProductVariant d(final JsonParser jsonParser) {
        final ProductVariant productVariant = new ProductVariant();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (rj.a[jsonToken.ordinal()]) {
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
                    if ("shipping".equals(e)) {
                        this.b(jsonParser, productVariant);
                        break;
                    }
                    if ("tax".equals(e)) {
                        this.c(jsonParser, productVariant);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return productVariant;
    }
}
