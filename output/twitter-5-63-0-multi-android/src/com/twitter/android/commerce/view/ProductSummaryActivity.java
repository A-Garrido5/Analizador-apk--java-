// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import java.util.Collection;
import java.util.HashSet;
import android.widget.AdapterView;
import android.app.ProgressDialog;
import android.app.Dialog;
import java.util.UUID;
import com.twitter.android.commerce.util.i;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.bn;
import android.app.PendingIntent;
import android.support.v4.app.NotificationCompat$Builder;
import android.app.NotificationManager;
import com.twitter.android.commerce.network.c;
import android.net.Uri;
import com.twitter.library.commerce.model.b;
import com.twitter.library.util.InvalidDataException;
import android.view.ViewGroup;
import android.os.Handler;
import com.twitter.library.card.Card;
import com.twitter.library.client.Session;
import com.twitter.library.client.az;
import com.twitter.library.commerce.model.ProductVariant;
import com.twitter.android.commerce.widget.form.DescriptionHeader;
import android.text.TextUtils;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.manager.j;
import android.os.Parcelable;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.android.commerce.util.ImageHelper;
import com.twitter.android.commerce.util.a;
import android.app.Activity;
import com.twitter.library.commerce.model.Email;
import com.twitter.library.commerce.model.Address;
import com.twitter.library.service.y;
import com.twitter.library.service.z;
import com.twitter.library.client.as;
import android.widget.SpinnerAdapter;
import com.twitter.library.commerce.model.CardVariantList$CardVariantListException;
import com.twitter.library.api.PromotedEvent;
import com.twitter.android.commerce.util.e;
import java.util.Iterator;
import java.util.ArrayList;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.commerce.model.ServerErrorType;
import com.twitter.library.commerce.model.ServerError;
import android.os.Bundle;
import java.math.BigDecimal;
import com.twitter.library.commerce.model.TaxType;
import com.twitter.library.commerce.model.ShippingType;
import android.content.res.Resources;
import com.twitter.library.commerce.model.CardVariant;
import com.twitter.library.commerce.model.CreditCard;
import com.twitter.library.commerce.model.Profile;
import com.twitter.android.commerce.util.f;
import android.widget.ImageView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import com.twitter.ui.widget.TwitterButton;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import java.util.List;
import com.twitter.library.provider.Tweet;
import java.util.HashMap;
import com.twitter.library.commerce.model.CardVariantList;
import com.twitter.android.commerce.network.g;
import android.widget.AdapterView$OnItemSelectedListener;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class ProductSummaryActivity extends TwitterFragmentActivity implements View$OnClickListener, AdapterView$OnItemSelectedListener, g
{
    private static int a;
    private CardVariantList A;
    private HashMap B;
    private Tweet F;
    private String G;
    private String H;
    private long I;
    private long J;
    private boolean K;
    private boolean L;
    private String M;
    private String N;
    private long O;
    private String P;
    private long Q;
    private Boolean R;
    private boolean S;
    private boolean T;
    private String U;
    private List V;
    private boolean W;
    private String X;
    private ProductSummaryActivity$MatchProductOrCartCallback Y;
    private ai Z;
    private aj aa;
    private MediaImageView b;
    private TextView c;
    private TextView d;
    private TwitterButton e;
    private TwitterButton f;
    private TextView g;
    private Spinner[] h;
    private ErrorTextView[] i;
    private TextView j;
    private TextView k;
    private ProgressBar l;
    private LinearLayout m;
    private LinearLayout n;
    private LinearLayout o;
    private View p;
    private LinearLayout q;
    private ImageView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private f v;
    private String w;
    private Profile x;
    private CreditCard y;
    private CardVariant z;
    
    static {
        ProductSummaryActivity.a = -2147483647;
    }
    
    private int a(final String[] array) {
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < array.length) {
            if (array[i] == null) {
                ++n2;
                n = i;
            }
            ++i;
        }
        if (n2 == 1) {
            return n;
        }
        return -1;
    }
    
    public static String a(final Resources resources, final CardVariant cardVariant) {
        if (cardVariant != null) {
            ShippingType shippingType;
            if (cardVariant.d() != null) {
                shippingType = cardVariant.d().f();
            }
            else {
                shippingType = ShippingType.a;
            }
            TaxType taxType;
            if (cardVariant.d() != null) {
                taxType = cardVariant.d().h();
            }
            else {
                taxType = TaxType.a;
            }
            if (shippingType == ShippingType.c) {
                switch (ah.a[taxType.ordinal()]) {
                    default: {
                        return "";
                    }
                    case 1: {
                        return resources.getString(2131296488, new Object[] { b("$", cardVariant.d().g()) });
                    }
                    case 2: {
                        return resources.getString(2131296490, new Object[] { b("$", cardVariant.d().g()) });
                    }
                    case 3: {
                        return resources.getString(2131296492);
                    }
                }
            }
            else if (shippingType == ShippingType.b) {
                switch (ah.a[taxType.ordinal()]) {
                    case 1: {
                        return resources.getString(2131296487, new Object[] { b("$", cardVariant.d().e()), b("$", cardVariant.d().g()) });
                    }
                    case 2: {
                        return resources.getString(2131296489, new Object[] { b("$", cardVariant.d().e()), b("$", cardVariant.d().g()) });
                    }
                    case 3: {
                        return resources.getString(2131296491, new Object[] { b("$", cardVariant.d().e()) });
                    }
                }
            }
        }
        return "";
    }
    
    private void a(final int result) {
        if (this.aa != null) {
            this.aa.a(result);
        }
        this.setResult(result);
    }
    
    private void a(final Bundle bundle) {
        int n = 0;
        Label_0069: {
            if (bundle != null) {
                final ArrayList parcelableArrayList = bundle.getParcelableArrayList("commerce_bundle_errors");
                n = 0;
                if (parcelableArrayList != null) {
                    this.v.c(parcelableArrayList);
                    final Iterator<ServerError> iterator = parcelableArrayList.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().b() == ServerErrorType.k) {
                            this.a((BigDecimal)null);
                            n = 1;
                            break Label_0069;
                        }
                    }
                    n = 1;
                }
            }
        }
        if (n == 0) {
            Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296666), 1).show();
        }
    }
    
    private void a(final Bundle bundle, final boolean b) {
        this.l.setVisibility(8);
        this.R = null;
        this.S = true;
        int n = 0;
        Label_0049: {
            if (b && bundle != null) {
                if (!this.H.equalsIgnoreCase(bundle.getString("cart_bundle_id"))) {
                    n = 1;
                }
                else {
                    ArrayList parcelableArrayList;
                    try {
                        com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now::product_detail::load_finished", this.G);
                        com.twitter.android.commerce.util.e.a((Context)this, this.F, PromotedEvent.ae);
                        parcelableArrayList = bundle.getParcelableArrayList("getproductinfo_bundle_variants");
                        if (parcelableArrayList.size() == 0) {
                            throw new CardVariantList$CardVariantListException("Expected non-empty variant list to be returned");
                        }
                    }
                    catch (CardVariantList$CardVariantListException ex) {
                        ex.printStackTrace();
                        n = 1;
                        break Label_0049;
                    }
                    this.A.a(parcelableArrayList);
                    if (this.A.a().size() > 1) {
                        this.p.setVisibility(0);
                        this.m.setVisibility(0);
                        for (int i = 0; i < this.m.getChildCount(); ++i) {
                            this.a(this.m.getChildAt(i), i);
                        }
                    }
                    else if (this.A.a().size() == 1) {
                        this.b(this.A.a().get(0));
                    }
                    this.e.setEnabled(true);
                    n = 0;
                }
            }
            else {
                n = 1;
            }
        }
        if (n != 0) {
            com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now::product_detail::load_aborted", this.G);
            com.twitter.android.commerce.util.e.a((Context)this, this.F, PromotedEvent.af);
            this.a(bundle);
        }
    }
    
    private void a(final View view, final int n) {
        final Spinner spinner = (Spinner)view.findViewById(2131886505);
        final TextView textView = (TextView)view.findViewById(2131886504);
        final ErrorTextView errorTextView = (ErrorTextView)view.findViewById(2131886503);
        final String b = this.b(n + 1);
        textView.setText((CharSequence)b);
        this.h[n] = spinner;
        this.i[n] = errorTextView;
        final ProductSummaryActivity$ProductSelectAdapter adapter = new ProductSummaryActivity$ProductSelectAdapter((Context)this, 17367048, 16908308);
        adapter.setDropDownViewResource(2130968683);
        spinner.setAdapter((SpinnerAdapter)adapter);
        final List a = this.A.a(n, new String[this.A.b()]);
        adapter.add((Object)this.getResources().getString(2131296674, new Object[] { b }));
        final Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            adapter.add((Object)iterator.next());
        }
        spinner.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)null);
        spinner.setSelection(0);
        adapter.notifyDataSetChanged();
        spinner.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
        this.K = false;
    }
    
    private void a(final ProductSummaryActivity$MatchProductOrCartCallback$RequestType productSummaryActivity$MatchProductOrCartCallback$RequestType, final String s) {
        final y b = this.b(productSummaryActivity$MatchProductOrCartCallback$RequestType, s);
        if (b != null) {
            as.a((Context)this).a(b, this.Y = new ProductSummaryActivity$MatchProductOrCartCallback(this, productSummaryActivity$MatchProductOrCartCallback$RequestType));
        }
    }
    
    private void a(final Address address, final Email email) {
        com.twitter.android.commerce.util.e.a(this, this.F, this.G, address, email, null, this.s(), this.V, 1, false);
    }
    
    private void a(final CreditCard creditCard) {
        final View viewById = this.findViewById(2131886539);
        if (viewById != null) {
            viewById.setVisibility(8);
        }
        final View viewById2 = this.findViewById(2131886537);
        if (viewById2 != null) {
            viewById2.setVisibility(8);
        }
        this.s.setText((CharSequence)com.twitter.android.commerce.util.a.a(creditCard, (Context)this));
        this.r.setImageResource(ImageHelper.a(creditCard.a()).a());
        this.M = null;
        this.N = creditCard.i();
        this.r();
    }
    
    private void a(final CreditCard creditCard, final Address address) {
        this.s.setText((CharSequence)"");
        this.t.setText((CharSequence)"");
        this.u.setText((CharSequence)"");
        this.s.setText((CharSequence)com.twitter.android.commerce.util.a.a(creditCard, (Context)this));
        final StringBuilder sb = new StringBuilder();
        this.a(sb, address.b());
        this.a(sb, address.c());
        this.a(sb, address.e());
        this.a(sb, address.f());
        this.a(sb, address.g());
        this.t.setText((CharSequence)this.getResources().getString(2131296697, new Object[] { sb.toString() }));
        this.u.setText((CharSequence)address.g());
        this.r.setImageResource(ImageHelper.a(creditCard.a()).a());
        this.M = address.h();
        this.N = creditCard.i();
        this.r();
    }
    
    private void a(final Email email) {
        if (this.F != null && this.G != null) {
            com.twitter.android.commerce.util.e.a((Context)this, this.F, com.twitter.android.commerce.util.e.a(false, "store_profile:payment_method:start"), this.G);
            com.twitter.android.commerce.util.e.a((Context)this, this.F, PromotedEvent.ai);
        }
        final Intent intent = new Intent((Context)this, (Class)CardEmailEntryActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putSerializable("commerce_profile_email", (Serializable)email);
        bundle.putParcelable("commerce_buynow_tweet", (Parcelable)this.F);
        bundle.putBoolean("commerce_launched_from_settings", false);
        if (this.s() != null && com.twitter.android.commerce.util.e.e()) {
            bundle.putSerializable("commerce_partial_card_object", (Serializable)this.s());
        }
        intent.putExtras(bundle);
        this.startActivityForResult(intent, 1);
    }
    
    private void a(final String s) {
        final MediaImageView b = this.b;
        k a;
        if (s != null) {
            a = com.twitter.library.media.manager.j.a(s);
        }
        else {
            a = null;
        }
        b.a(a);
    }
    
    private void a(final String text, final String text2, final boolean b) {
        if (!TextUtils.isEmpty((CharSequence)text) && !TextUtils.isEmpty((CharSequence)text2)) {
            final DescriptionHeader descriptionHeader = new DescriptionHeader((Context)this);
            descriptionHeader.b.setText((CharSequence)text);
            descriptionHeader.c.setText((CharSequence)text2);
            if (!b) {
                descriptionHeader.a.setVisibility(8);
            }
            this.o.addView((View)descriptionHeader);
        }
    }
    
    private void a(final StringBuilder sb, final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            sb.append(s);
            sb.append(" ");
        }
    }
    
    private void a(final BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            String text;
            if (this.T) {
                text = this.getResources().getString(2131296484);
            }
            else {
                text = this.getResources().getString(2131296485);
            }
            this.k.setText((CharSequence)text);
            this.k.setTextColor(this.getResources().getColor(2131689520));
            final String b = b("$", bigDecimal);
            this.j.setTextColor(this.getResources().getColor(2131689521));
            this.j.setText((CharSequence)b);
            return;
        }
        this.k.setText((CharSequence)this.getResources().getString(2131296486));
        this.k.setTextColor(this.getResources().getColor(2131689544));
        this.j.setTextColor(this.getResources().getColor(2131689540));
    }
    
    private void a(final boolean b) {
        if (this.q() != b) {
            if (!b) {
                this.e.setVisibility(0);
                this.f.setVisibility(8);
                this.q.setVisibility(8);
                this.g.setText(this.getResources().getText(2131296494));
                return;
            }
            this.e.setVisibility(8);
            this.f.setVisibility(0);
            this.q.setVisibility(0);
            if (this.z == null) {
                this.g.setText((CharSequence)"");
                return;
            }
            this.g.setText((CharSequence)this.c(this.z));
        }
    }
    
    private void a(final String[] array, final ProductSummaryActivity$ProductSelectAdapter productSummaryActivity$ProductSelectAdapter, final int n) {
        final List a = this.A.a(array);
        if (a != null && a.size() > 0) {
            final ProductVariant d = a.get(0).d();
            if (d != null) {
                if (!this.m()) {
                    productSummaryActivity$ProductSelectAdapter.a(n, b("$", d.c()));
                }
                if (d.b() == 0) {
                    productSummaryActivity$ProductSelectAdapter.a(n, ProductSummaryActivity$ProductSelectAdapter$SpinnerState.c);
                }
            }
        }
    }
    
    private boolean a(final CardVariant cardVariant) {
        return cardVariant != null && cardVariant.d() != null && cardVariant.d().c() != null;
    }
    
    private boolean a(final String s, final boolean b) {
        return com.twitter.android.commerce.util.e.a(this.B, s, b);
    }
    
    private CardVariant b(final String[] array) {
        while (true) {
            for (int length = array.length, i = 0; i < length; ++i) {
                if (array[i] == null) {
                    final int n = 0;
                    CardVariant cardVariant = null;
                    if (n != 0) {
                        final List a = this.A.a(array);
                        cardVariant = null;
                        if (a != null) {
                            final int size = a.size();
                            cardVariant = null;
                            if (size > 0) {
                                cardVariant = a.get(0);
                            }
                        }
                    }
                    return cardVariant;
                }
            }
            final int n = 1;
            continue;
        }
    }
    
    private y b(final ProductSummaryActivity$MatchProductOrCartCallback$RequestType productSummaryActivity$MatchProductOrCartCallback$RequestType, final String s) {
        final ArrayList<String> list = new ArrayList<String>();
        final Session b = az.a((Context)this).b();
        final boolean b2 = com.twitter.android.commerce.util.e.b();
        if (com.twitter.android.commerce.util.e.f() && productSummaryActivity$MatchProductOrCartCallback$RequestType == ProductSummaryActivity$MatchProductOrCartCallback$RequestType.b) {
            list.add(this.z.a());
            return new qv((Context)this, b, this.H, this.I, this.J, this.G, list, com.twitter.util.k.a(s));
        }
        final Iterator<CardVariant> iterator = this.A.a().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().a());
        }
        if (list.size() > 0) {
            return new rk((Context)this, b, this.H, this.I, this.J, this.G, list, productSummaryActivity$MatchProductOrCartCallback$RequestType == ProductSummaryActivity$MatchProductOrCartCallback$RequestType.b, b2, com.twitter.util.k.a(s));
        }
        return null;
    }
    
    private String b(final int n) {
        return this.b("item_attribute" + n);
    }
    
    private String b(final String s) {
        return com.twitter.android.commerce.util.e.a(this.B, s);
    }
    
    private static String b(final String s, final BigDecimal bigDecimal) {
        return Card.a(bigDecimal);
    }
    
    private void b(final long n) {
        new Handler().postDelayed((Runnable)new af(this), n);
    }
    
    private void b(final Bundle bundle, final boolean b) {
        this.l.setVisibility(8);
        this.R = null;
        int n = 0;
        Label_0069: {
            if (b && bundle != null) {
                this.X = bundle.getString("cart_bundle_id");
                ArrayList parcelableArrayList = null;
                Label_0109: {
                    try {
                        parcelableArrayList = bundle.getParcelableArrayList("getproductinfo_bundle_variants");
                        if (parcelableArrayList.size() == 0) {
                            throw new CardVariantList$CardVariantListException("Expected non-empty variant list to be returned");
                        }
                        break Label_0109;
                    }
                    catch (CardVariantList$CardVariantListException ex) {
                        ex.printStackTrace();
                        n = 1;
                    }
                    break Label_0069;
                }
                this.z.a((ProductVariant)null);
                this.A.a(parcelableArrayList);
                if (this.z.d() == null) {
                    n = 1;
                }
                else if (this.x == null) {
                    n = 1;
                }
                else {
                    CreditCard creditCard = com.twitter.android.commerce.util.e.a(this.x);
                    if (this.W) {
                        final Address a = com.twitter.android.commerce.util.e.a(creditCard, this.x);
                        n = 0;
                        if (a != null) {
                            this.a(creditCard, a);
                            n = 0;
                        }
                    }
                    else {
                        if (creditCard == null) {
                            creditCard = com.twitter.android.commerce.util.e.b(this.x);
                        }
                        this.a(creditCard);
                        n = 0;
                    }
                }
            }
            else {
                n = 1;
            }
        }
        if (n != 0) {
            this.a(bundle);
            this.f.setEnabled(true);
        }
        new Handler().postDelayed((Runnable)new ae(this), 500L);
    }
    
    private void b(final CardVariant z) {
        this.z = z;
        if (this.z == null) {
            this.b.a(com.twitter.library.media.manager.j.a(this.w));
            BigDecimal bigDecimal;
            if (this.A.a().size() > 0) {
                bigDecimal = new BigDecimal(this.A.a().get(0).b());
            }
            else {
                bigDecimal = null;
            }
            this.a(bigDecimal);
            return;
        }
        final String c = this.z.c();
        if (c != null) {
            this.a(c);
        }
        else {
            this.b.a(com.twitter.library.media.manager.j.a(this.w));
        }
        final ProductVariant d = this.z.d();
        BigDecimal c2;
        if (d != null) {
            c2 = d.c();
        }
        else {
            c2 = new BigDecimal(this.z.b());
        }
        if (this.S && this.z.d() != null && this.z.d().b() != 0) {
            this.a(c2);
            this.e.setEnabled(true);
            return;
        }
        if (this.S) {
            this.a((BigDecimal)null);
            this.e.setEnabled(false);
            return;
        }
        this.a(new BigDecimal(this.z.b()));
    }
    
    private void b(final boolean b) {
        int text;
        if (b) {
            text = 2131297168;
        }
        else {
            text = 2131296493;
        }
        this.e.setText(text);
        this.e.setEnabled(!b);
    }
    
    private String c(final CardVariant cardVariant) {
        return a(this.getResources(), cardVariant);
    }
    
    private void c(final Bundle bundle, final boolean b) {
        int n = 0;
        this.l.setVisibility(8);
        if (b && bundle != null) {
            final boolean boolean1 = bundle.getBoolean("output_success");
            final String string = bundle.getString("auth_cart_id");
            if (boolean1 && !TextUtils.isEmpty((CharSequence)string)) {
                this.U = string;
                final long n2 = 2000L - Math.abs(System.currentTimeMillis() - this.i());
                if (n2 > 0L) {
                    this.b(n2);
                }
                else {
                    this.t();
                    n = 0;
                }
            }
            else {
                n = 1;
            }
        }
        else {
            n = 1;
        }
        if (n != 0) {
            com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now::product_detail::purchase_failure", this.G);
            com.twitter.android.commerce.util.e.a((Context)this, this.F, PromotedEvent.ap);
            this.removeDialog(2);
            this.f.setEnabled(true);
            this.a(bundle);
        }
    }
    
    private void c(final boolean b) {
        this.a(false);
        final Intent intent = new Intent((Context)this, (Class)ProfileSummaryActivity.class);
        final Bundle bundle = new Bundle();
        if (this.F != null) {
            bundle.putParcelable("commerce_buynow_tweet", (Parcelable)this.F);
        }
        if (this.G != null) {
            bundle.putString("commerce_buynow_card_url", this.G);
        }
        if (this.x != null) {
            bundle.putSerializable("commerce_profile_entry", (Serializable)this.x);
        }
        if (this.V != null) {
            bundle.putSerializable("commerce_allowed_states_for_item", (Serializable)this.V);
        }
        bundle.putSerializable("commerce_in_buy_mode", (Serializable)b);
        intent.putExtras(bundle);
        this.startActivityForResult(intent, 1);
        com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now:payment_settings:::start", this.G);
    }
    
    private void e(final boolean b) {
        this.e.setEnabled(false);
        final as a = as.a((Context)this);
        final rw rw = new rw((Context)this, az.a((Context)this).b());
        this.b(true);
        a.a(rw, new com.twitter.android.commerce.network.f(this, b));
    }
    
    private int j() {
        try {
            this.A = new CardVariantList(this.B);
            final int b = this.A.b();
            this.h = new Spinner[b];
            this.i = new ErrorTextView[b];
            for (int i = 0; i < b; ++i) {
                final View inflate = this.getLayoutInflater().inflate(2130968675, (ViewGroup)null);
                this.a(inflate, i);
                this.m.addView(inflate, i);
            }
            this.T = this.a("item_shipping_included", true);
            this.W = this.a("item_shipping_address_required", true);
            if (!this.k()) {
                return 2131296592;
            }
            if (b > 0) {
                this.a(new BigDecimal(this.A.a().get(0).b()));
            }
            this.G = this.b("card_url");
            if (TextUtils.isEmpty((CharSequence)this.G)) {
                throw new InvalidDataException("Expected card_url in binding values list");
            }
            this.H = this.b("item_id");
            if (TextUtils.isEmpty((CharSequence)this.H)) {
                throw new InvalidDataException("Expected item_id in binding values list");
            }
            final String b2 = this.b("marketplace_id");
            if (TextUtils.isEmpty((CharSequence)b2)) {
                throw new InvalidDataException("Expected marketplace_id in binding values list");
            }
            this.I = Long.parseLong(b2);
            final String b3 = this.b("merchant_id");
            if (TextUtils.isEmpty((CharSequence)b3)) {
                throw new InvalidDataException("Expected merchant_id in binding values list");
            }
            this.J = Long.parseLong(b3);
            final String b4 = this.b("item_image");
            this.a(b4);
            this.w = com.twitter.util.k.a(b4);
            this.c.setText((CharSequence)this.b("item_title"));
            final String b5 = this.b("merchant_name");
            this.d.setText((CharSequence)this.getString(2131296677, new Object[] { b5, this.b("marketplace_name") }));
            this.setTitle(b5);
            this.a(this.getString(2131296662), this.b("item_description"), false);
            this.a(this.getString(2131296675), this.b("item_shipping_policy"), true);
            this.a(this.getString(2131296673), this.b("item_sale_terms"), true);
            return 0;
        }
        catch (CardVariantList$CardVariantListException ex) {}
        catch (InvalidDataException ex2) {
            goto Label_0446;
        }
        catch (NumberFormatException ex3) {
            goto Label_0446;
        }
    }
    
    private boolean k() {
        (this.V = new ArrayList()).add("US");
        if (com.twitter.library.commerce.model.b.a()) {
            final List b = com.twitter.library.commerce.model.b.b();
            final String b2 = this.b("item_shipping_countries");
            if (!TextUtils.isEmpty((CharSequence)b2)) {
                final List a = com.twitter.android.commerce.util.e.a(b2);
                if (!com.twitter.library.commerce.model.b.a(a)) {
                    this.V = com.twitter.library.commerce.model.b.a(b, a);
                }
                else {
                    this.V = b;
                }
                if (this.V == null || this.V.size() == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private void l() {
        final j imageRequest = this.b.getImageRequest();
        if (imageRequest != null && imageRequest.o()) {
            com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now::product_detail:product_image:open", this.G);
            com.twitter.android.commerce.util.e.a((Context)this, this.F, PromotedEvent.ag);
            final Uri parse = Uri.parse(imageRequest.c());
            this.startActivity(new Intent((Context)this, (Class)CommerceImageActivity.class).setData(parse).putExtra("image_url", parse.toString()).putExtra("android.intent.extra.TEXT", this.c.getText()));
        }
    }
    
    private boolean m() {
        int i = 1;
        if (this.R == null) {
            if (this.A == null || this.A.a() == null || this.A.a().size() == 0) {
                this.R = false;
            }
            else {
                final ArrayList a = this.A.a();
                final CardVariant cardVariant = a.get(0);
                this.R = (i != 0);
                CardVariant cardVariant2 = cardVariant;
                while (i < a.size()) {
                    final CardVariant cardVariant3 = a.get(i);
                    if (!this.a(cardVariant3) || !this.a(cardVariant2) || !cardVariant3.d().c().equals(cardVariant2.d().c())) {
                        this.R = false;
                        break;
                    }
                    ++i;
                    cardVariant2 = cardVariant3;
                }
            }
        }
        return this.R;
    }
    
    private String[] n() {
        final String[] array = new String[this.h.length];
        for (int i = 0; i < array.length; ++i) {
            if (this.h[i].getSelectedItemPosition() > 0) {
                array[i] = (String)this.h[i].getSelectedItem();
            }
        }
        return array;
    }
    
    private BigDecimal p() {
        final ProductVariant d = this.z.d();
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        if (d != null) {
            final BigDecimal c = d.c();
            final BigDecimal g = d.g();
            final BigDecimal e = d.e();
            bigDecimal = c;
            bigDecimal2 = g;
            bigDecimal3 = e;
        }
        else {
            final BigDecimal bigDecimal4 = new BigDecimal(this.z.b());
            final BigDecimal bigDecimal5 = new BigDecimal(0);
            final BigDecimal bigDecimal6 = new BigDecimal(0);
            bigDecimal = bigDecimal4;
            bigDecimal2 = bigDecimal5;
            bigDecimal3 = bigDecimal6;
        }
        if (bigDecimal2 != null) {
            bigDecimal = bigDecimal.add(bigDecimal2);
        }
        if (bigDecimal3 != null) {
            bigDecimal = bigDecimal.add(bigDecimal3);
        }
        return bigDecimal;
    }
    
    private boolean q() {
        return this.f.getVisibility() == 0;
    }
    
    private void r() {
        new Handler().postDelayed((Runnable)new ad(this), 500L);
    }
    
    private CreditCard s() {
        return this.y;
    }
    
    private void t() {
        this.removeDialog(2);
        this.showDialog(3);
        com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now::product_detail::purchase_success", this.G);
        com.twitter.android.commerce.util.e.a((Context)this, this.F, PromotedEvent.ao);
        this.L = true;
        new Handler().postDelayed((Runnable)new ag(this), 2000L);
    }
    
    private void u() {
        this.removeDialog(3);
        final Intent intent = new Intent((Context)this, (Class)OrderHistoryDetailsActivity.class);
        intent.putExtra("commerce_order_history_item_id", this.U);
        com.twitter.android.commerce.network.c.a(intent.getExtras(), az.a((Context)this).b().e());
        final String string = this.getResources().getString(2131296692, new Object[] { this.b("item_title") });
        ((NotificationManager)this.getSystemService("notification")).notify((String)null, ProductSummaryActivity.a, new NotificationCompat$Builder((Context)this).setSmallIcon(2130839309).setTicker(this.getResources().getString(2131296691)).setContentTitle(this.getResources().getString(2131296691)).setContentText(string).setOngoing(false).setContentIntent(PendingIntent.getActivity((Context)this, 0, intent, 0)).setPriority(1).setAutoCancel(true).build());
        Toast.makeText((Context)this, (CharSequence)string, 1).show();
        this.a(-1);
        this.finish();
    }
    
    private boolean w() {
        boolean b;
        if (this.A.a().size() > 1) {
            int i = 0;
            b = false;
            while (i < this.h.length) {
                if (this.h[i].getSelectedItemPosition() == 0) {
                    this.i[i].setError(this.getResources().getString(2131296593, new Object[] { this.b(i + 1) }));
                    b = true;
                }
                ++i;
            }
        }
        else {
            b = false;
        }
        return b;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968684);
        bn.b(14);
        bn.a(false);
        return bn;
    }
    
    public void a(final long o) {
        this.O = o;
    }
    
    public void a(final boolean b, final Profile profile) {
        final CreditCard a = com.twitter.android.commerce.util.e.a(profile);
        final Address a2 = com.twitter.android.commerce.util.e.a(a, profile);
        final Email c = com.twitter.android.commerce.util.e.c(profile);
        this.y = null;
        if (profile != null) {
            this.y = profile.b();
        }
        boolean b2;
        if (this.W) {
            if (a2 != null) {
                b2 = true;
            }
            else {
                b2 = false;
            }
        }
        else {
            b2 = true;
        }
        int n;
        if (a != null && b2) {
            if (!this.W || b.a(a2.d(), this.V)) {
                this.x = profile;
                String h;
                if (a2 != null) {
                    h = a2.h();
                }
                else {
                    h = null;
                }
                this.M = h;
                this.a(ProductSummaryActivity$MatchProductOrCartCallback$RequestType.b, this.M);
                n = 1;
            }
            else {
                int n2;
                if (this.V == null || this.V.size() == 0) {
                    n2 = 2131296592;
                    this.b(false);
                    n = 1;
                }
                else {
                    n2 = 2131296543;
                    com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now::product_detail:buy_button:error_address_not_supported", this.G);
                    n = 0;
                }
                Toast.makeText((Context)this, (CharSequence)this.getResources().getString(n2), 1).show();
            }
        }
        else {
            n = 0;
        }
        if (n == 0) {
            if (!b) {
                this.b(false);
                Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296589), 1).show();
                return;
            }
            if (this.W) {
                this.b(false);
                this.a(a2, c);
            }
            else {
                if (com.twitter.android.commerce.util.e.b(profile) != null) {
                    this.x = profile;
                    this.M = null;
                    this.a(ProductSummaryActivity$MatchProductOrCartCallback$RequestType.b, this.M);
                    return;
                }
                this.b(false);
                this.a(c);
            }
        }
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        if (super.a(jv, toolBar)) {
            jv.a(2131951622, toolBar);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == 2131887406) {
            com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now:::payment_settings_menu_item:click", this.G);
            final boolean q = this.q();
            this.a(false);
            this.c(q);
        }
        return super.a(jx);
    }
    
    public void b(final Bundle bundle) {
        this.b(false);
        this.e.setEnabled(true);
        this.a(bundle);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.b = (MediaImageView)this.findViewById(2131886507);
        this.c = (TextView)this.findViewById(2131886509);
        this.d = (TextView)this.findViewById(2131886543);
        this.o = (LinearLayout)this.findViewById(2131886548);
        this.j = (TextView)this.findViewById(2131886511);
        this.k = (TextView)this.findViewById(2131886544);
        this.e = (TwitterButton)this.findViewById(2131886540);
        this.f = (TwitterButton)this.findViewById(2131886541);
        this.g = (TextView)this.findViewById(2131886542);
        this.q = (LinearLayout)this.findViewById(2131886536);
        this.m = (LinearLayout)this.findViewById(2131886547);
        this.l = (ProgressBar)this.findViewById(2131886545);
        this.p = this.findViewById(2131886546);
        this.n = (LinearLayout)this.findViewById(2131886535);
        this.v = new f((Context)this);
        this.r = (ImageView)this.findViewById(2131886523);
        this.s = (TextView)this.findViewById(2131886524);
        this.t = (TextView)this.findViewById(2131886538);
        this.u = (TextView)this.findViewById(2131886435);
        this.q.setOnClickListener((View$OnClickListener)this);
        this.z = null;
        this.e.setOnClickListener((View$OnClickListener)this);
        this.e.setEnabled(false);
        this.n.setVisibility(8);
        this.e.setOnClickListener((View$OnClickListener)this);
        this.f.setOnClickListener((View$OnClickListener)this);
        this.b.setOnClickListener((View$OnClickListener)this);
        final Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            this.F = (Tweet)extras.getParcelable("commerce_buynow_tweet");
            if (this.F != null) {
                this.B = (HashMap)extras.getSerializable("commerce_product_values");
                final int j = this.j();
                if (j != 0) {
                    Toast.makeText((Context)this, (CharSequence)this.getResources().getString(j), 1).show();
                    this.a(0);
                    this.finish();
                }
                else {
                    final DescriptionHeader descriptionHeader = new DescriptionHeader((Context)this);
                    descriptionHeader.c.setShouldTrim(false);
                    descriptionHeader.b.setText((CharSequence)this.getString(2131296683));
                    com.twitter.android.commerce.util.i.a((Context)this, this.I, descriptionHeader.c);
                    this.o.addView((View)descriptionHeader);
                    this.Q = System.currentTimeMillis();
                    if (this.A != null && this.A.a().size() > 0) {
                        if (this.A.a().size() == 1) {
                            this.b(this.A.a().get(0));
                        }
                        this.m.setVisibility(8);
                        this.a(ProductSummaryActivity$MatchProductOrCartCallback$RequestType.a, null);
                        new Handler().postDelayed((Runnable)new ac(this), 500L);
                        return;
                    }
                    Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296666), 1).show();
                    this.a(0);
                    this.finish();
                }
            }
        }
    }
    
    y h() {
        final Session b = az.a((Context)this).b();
        BigDecimal c;
        if (this.z.d() != null) {
            c = this.z.d().c();
        }
        else {
            c = new BigDecimal(this.z.b());
        }
        if (com.twitter.android.commerce.util.e.f()) {
            return new sg((Context)this, b, this.X, this.G, this.H, this.z.a(), this.M, this.N, this.J, this.I, c, this.z.d().g(), this.z.d().e(), this.z.d().d(), this.P, this.F.D, this.Q);
        }
        return new qn((Context)this, b, this.G, this.H, this.z.a(), this.M, this.N, this.J, this.I, c, this.z.d().g(), this.z.d().e(), this.z.d().d(), this.P, this.F.D, this.Q);
    }
    
    public long i() {
        return this.O;
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == 1 && intent != null) {
            final Bundle extras = intent.getExtras();
            if (extras != null && extras.getString("commerce_profile_id_added") != null) {
                this.e(false);
            }
        }
    }
    
    @Override
    public void onBackPressed() {
        if (this.q()) {
            this.a(false);
            return;
        }
        super.onBackPressed();
    }
    
    public void onClick(final View view) {
        if (view.getId() == this.e.getId()) {
            if (this.w()) {
                Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296547), 1).show();
                return;
            }
            com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now::product_detail:buy_button:click", this.G);
            com.twitter.android.commerce.util.e.a((Context)this, this.F, PromotedEvent.ah);
            this.e(true);
        }
        else {
            if (view.getId() == this.f.getId()) {
                this.f.setEnabled(false);
                com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now::product_detail:buy_button:confirm", this.G);
                com.twitter.android.commerce.util.e.a((Context)this, this.F, PromotedEvent.an);
                if (TextUtils.isEmpty((CharSequence)this.P)) {
                    this.P = UUID.randomUUID().toString();
                }
                final as a = as.a((Context)this);
                final y h = this.h();
                this.Z = new ai(this);
                this.showDialog(2);
                a.a(h, this.Z);
                return;
            }
            if (view.getId() == this.q.getId()) {
                com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now::product_detail:change_payment_profile_button:click", this.G);
                com.twitter.android.commerce.util.e.a((Context)this, this.F, PromotedEvent.ar);
                this.a(false);
                this.c(true);
                return;
            }
            if (view.getId() == this.b.getId()) {
                this.l();
            }
        }
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 2: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setProgressStyle(0);
                progressDialog.setMessage(this.getText(2131296534));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 3: {
                final ProgressDialog progressDialog2 = new ProgressDialog((Context)this);
                progressDialog2.setIndeterminateDrawable(this.getResources().getDrawable(2130838609));
                progressDialog2.setMessage(this.getText(2131296691));
                progressDialog2.setIndeterminate(true);
                progressDialog2.setCancelable(false);
                return (Dialog)progressDialog2;
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.isFinishing() && !this.L) {
            com.twitter.android.commerce.util.e.a((Context)this, this.F, "buy_now::product_detail::exit", this.G);
            com.twitter.android.commerce.util.e.a((Context)this, this.F, PromotedEvent.aq);
        }
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (!this.K) {
            CardVariant b = null;
            while (true) {
                String[] n3;
                int a;
                int n4 = 0;
                String[] array;
                List a2;
                Spinner spinner;
                HashSet set;
                ProductSummaryActivity$ProductSelectAdapter productSummaryActivity$ProductSelectAdapter;
                boolean b2 = false;
                int n5;
                Label_0119_Outer:Label_0301_Outer:
                while (true) {
                Label_0326:
                    while (true) {
                    Label_0301:
                        while (true) {
                        Label_0313:
                            while (true) {
                                Label_0307: {
                                    while (true) {
                                        Label_0201: {
                                            try {
                                                this.K = true;
                                                this.a(false);
                                                n3 = this.n();
                                                a = this.a(n3);
                                                b = this.b(n3);
                                                n4 = 0;
                                                if (n4 >= n3.length) {
                                                    break;
                                                }
                                                array = n3.clone();
                                                array[n4] = null;
                                                a2 = this.A.a(n4, array);
                                                spinner = this.h[n4];
                                                set = new HashSet(a2);
                                                productSummaryActivity$ProductSelectAdapter = (ProductSummaryActivity$ProductSelectAdapter)spinner.getAdapter();
                                                if (n4 != a) {
                                                    break Label_0307;
                                                }
                                                b2 = true;
                                                productSummaryActivity$ProductSelectAdapter.a();
                                                n5 = 1;
                                                if (n5 >= productSummaryActivity$ProductSelectAdapter.getCount()) {
                                                    break Label_0201;
                                                }
                                                if (!set.contains(productSummaryActivity$ProductSelectAdapter.getItem(n5))) {
                                                    productSummaryActivity$ProductSelectAdapter.a(n5, ProductSummaryActivity$ProductSelectAdapter$SpinnerState.b);
                                                    break Label_0301;
                                                }
                                                break Label_0313;
                                                array[n4] = (String)productSummaryActivity$ProductSelectAdapter.getItem(n5);
                                                this.a(array, productSummaryActivity$ProductSelectAdapter, n5);
                                                break Label_0301;
                                            }
                                            catch (CardVariantList$CardVariantListException ex) {
                                                return;
                                                // iftrue(Label_0262:, spinner == adapterView)
                                                try {
                                                    spinner.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)null);
                                                    if (productSummaryActivity$ProductSelectAdapter.a(spinner.getSelectedItemPosition())) {
                                                        spinner.setSelection(0);
                                                    }
                                                }
                                                finally {
                                                    spinner.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
                                                }
                                            }
                                            finally {
                                                this.K = false;
                                            }
                                        }
                                        Label_0262: {
                                            this.i[n4].setError(null);
                                        }
                                        break Label_0326;
                                        ++n5;
                                        continue Label_0301_Outer;
                                    }
                                }
                                b2 = false;
                                continue Label_0301_Outer;
                            }
                            if (b == null && !b2) {
                                continue Label_0301;
                            }
                            break;
                        }
                        continue;
                    }
                    ++n4;
                    continue Label_0119_Outer;
                }
            }
            if (b != null) {
                this.b(b);
            }
            else {
                this.b((CardVariant)null);
            }
            this.K = false;
        }
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
    
    public void onPause() {
        if (this.q()) {
            this.a(false);
        }
        super.onPause();
    }
}
