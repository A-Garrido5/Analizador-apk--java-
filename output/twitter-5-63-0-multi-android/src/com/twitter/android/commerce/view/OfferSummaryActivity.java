// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.app.ProgressDialog;
import android.app.Dialog;
import java.util.Collection;
import com.twitter.library.commerce.model.Address;
import java.io.Serializable;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.commerce.util.i;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.os.Parcelable;
import android.net.Uri;
import java.util.UUID;
import com.twitter.android.commerce.network.ProfileSaveCallback;
import com.twitter.android.commerce.network.ProfileSaveCallback$RequestType;
import com.twitter.library.util.InvalidDataException;
import android.text.TextUtils;
import com.twitter.library.api.PromotedEvent;
import java.util.TimeZone;
import java.util.Date;
import java.text.SimpleDateFormat;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.manager.j;
import com.twitter.library.commerce.model.ServerErrorType;
import com.twitter.library.commerce.model.ServerError;
import java.util.ArrayList;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.android.commerce.util.ImageHelper;
import com.twitter.android.commerce.util.a;
import com.twitter.library.commerce.model.CreditCard;
import com.twitter.library.commerce.model.Email;
import com.twitter.android.commerce.util.e;
import com.twitter.library.commerce.model.OfferDetails;
import android.os.Bundle;
import android.widget.Toast;
import android.app.PendingIntent;
import android.support.v4.app.NotificationCompat$Style;
import android.support.v4.app.NotificationCompat$BigTextStyle;
import android.support.v4.app.NotificationCompat$Builder;
import android.app.NotificationManager;
import com.twitter.library.provider.ae;
import com.twitter.library.client.az;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.TweetActivity;
import android.os.Handler;
import com.twitter.library.provider.Tweet;
import java.util.HashMap;
import com.twitter.android.commerce.widget.creditcard.CardEntryContainer;
import com.twitter.android.commerce.util.f;
import android.widget.ImageView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.twitter.ui.widget.TwitterButton;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.commerce.model.OfferDetails$OfferStatus;
import java.util.List;
import com.twitter.library.commerce.model.ClientCreditCard;
import com.twitter.library.commerce.model.Profile;
import com.twitter.android.commerce.network.h;
import com.twitter.android.commerce.network.g;
import com.twitter.android.commerce.network.b;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class OfferSummaryActivity extends TwitterFragmentActivity implements View$OnClickListener, b, g, h
{
    private static int a;
    private String A;
    private String B;
    private Profile F;
    private long G;
    private String H;
    private long I;
    private long J;
    private ClientCreditCard K;
    private boolean L;
    private boolean M;
    private List N;
    private com.twitter.android.commerce.view.b O;
    private OfferDetails$OfferStatus P;
    private boolean Q;
    private int R;
    private t S;
    private u T;
    private MediaImageView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TwitterButton g;
    private TwitterButton h;
    private ProgressBar i;
    private LinearLayout j;
    private LinearLayout k;
    private LinearLayout l;
    private View m;
    private LinearLayout n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private View s;
    private LinearLayout t;
    private ImageView u;
    private TextView v;
    private f w;
    private CardEntryContainer x;
    private HashMap y;
    private Tweet z;
    
    static {
        OfferSummaryActivity.a = -2147483647;
    }
    
    private void A() {
        this.L = true;
        this.removeDialog(2);
        this.showDialog(3);
        new Handler().postDelayed((Runnable)new r(this), 2000L);
    }
    
    private void X() {
        this.removeDialog(3);
        final Intent setData = new Intent((Context)this, (Class)TweetActivity.class).setData(ae.b(this.z.Q, az.a((Context)this).b().g()));
        final String string = this.getResources().getString(2131296636);
        ((NotificationManager)this.getSystemService("notification")).notify((String)null, OfferSummaryActivity.a, new NotificationCompat$Builder((Context)this).setSmallIcon(2130839309).setTicker(this.getResources().getString(2131296635)).setContentTitle(this.getResources().getString(2131296635)).setContentText(string).setStyle(new NotificationCompat$BigTextStyle().bigText(string)).setOngoing(false).setContentIntent(PendingIntent.getActivity((Context)this, 0, setData, 0)).setPriority(1).setAutoCancel(true).build());
        Toast.makeText((Context)this, (CharSequence)string, 1).show();
        this.setResult(-1);
        this.s.setVisibility(0);
    }
    
    private void a(final long n, final long n2) {
        this.n.setVisibility(0);
        if (n > 0L && n2 > 0L) {
            this.o.setText((CharSequence)this.getResources().getString(2131296650, new Object[] { this.b(n), this.b(n2) }));
            return;
        }
        if (n2 > 0L) {
            this.o.setText((CharSequence)this.getResources().getString(2131296648, new Object[] { this.b(n2) }));
            return;
        }
        if (n > 0L) {
            this.o.setText((CharSequence)this.getResources().getString(2131296649, new Object[] { this.b(n) }));
            return;
        }
        this.n.setVisibility(8);
    }
    
    private void a(final Bundle bundle, final boolean b) {
        int n;
        if (b && bundle != null) {
            final OfferDetails offerDetails = (OfferDetails)bundle.getSerializable("offer_details");
            final String a = offerDetails.a();
            final boolean b2 = offerDetails.b();
            this.J = offerDetails.c();
            if (!this.B.equalsIgnoreCase(a) || !b2) {
                n = 1;
            }
            else {
                this.P = offerDetails.e();
                this.N = offerDetails.f();
                if (this.P == OfferDetails$OfferStatus.b) {
                    this.a(offerDetails.d(), offerDetails.c());
                }
                else {
                    this.a(this.P);
                }
                this.k();
                n = 0;
            }
        }
        else {
            n = 1;
        }
        if (n != 0) {
            if (!b) {
                com.twitter.android.commerce.util.e.a((Context)this, this.z, "cl_offer::product_detail::load_aborted", this.A, this.u());
            }
            this.i.setVisibility(8);
            this.a(false, false);
            this.h(bundle);
        }
    }
    
    private void a(final CreditCard creditCard) {
        this.p.setText(2131296665);
        this.t.setVisibility(0);
        this.v.setText((CharSequence)"");
        final String a = com.twitter.android.commerce.util.a.a(creditCard, (Context)this);
        int count;
        if (this.O != null) {
            count = this.O.getCount();
        }
        else {
            count = 0;
        }
        if (count == 1) {
            this.v.setText((CharSequence)a);
        }
        else if (count == 2) {
            this.v.setText((CharSequence)this.getResources().getString(2131296507, new Object[] { a }));
        }
        else {
            this.v.setText((CharSequence)this.getResources().getString(2131296506, new Object[] { a, count - 1 }));
        }
        this.u.setImageResource(ImageHelper.a(creditCard.a()).a());
    }
    
    private void a(final Email email) {
        as.a((Context)this).a(new qx((Context)this, az.a((Context)this).b(), email), new com.twitter.android.commerce.network.a(this));
    }
    
    private void a(final OfferDetails$OfferStatus offerDetails$OfferStatus) {
        this.i.setVisibility(8);
        this.s.setVisibility(0);
        this.q();
        this.a(false, false);
        final int n = com.twitter.android.commerce.view.s.a[offerDetails$OfferStatus.ordinal()];
        String s = null;
        switch (n) {
            case 1: {
                s = this.getResources().getString(2131296624);
                break;
            }
            case 2: {
                s = this.getResources().getString(2131296634);
                break;
            }
            case 3: {
                s = this.getResources().getString(2131296637);
                break;
            }
            case 4: {
                s = this.getResources().getString(2131296582);
                break;
            }
        }
        if (s != null && !this.isFinishing()) {
            new AlertDialog$Builder((Context)this).setMessage((CharSequence)s.toString()).setCancelable(true).setPositiveButton(2131297362, (DialogInterface$OnClickListener)new p(this)).create().show();
            return;
        }
        final ArrayList<ServerError> list = new ArrayList<ServerError>();
        list.add(new ServerError("", "", ServerErrorType.a));
        this.w.c(list);
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
    
    private void a(final boolean b) {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this);
        if (defaultSharedPreferences != null) {
            final SharedPreferences$Editor edit = defaultSharedPreferences.edit();
            edit.putBoolean("OFFERS_NUX_HAS_RUN", true);
            edit.apply();
        }
    }
    
    private void a(final boolean b, final boolean enabled) {
        int text;
        if (b) {
            text = 2131297168;
        }
        else {
            text = 2131296640;
        }
        this.h.setText(text);
        this.h.setEnabled(enabled);
        this.h.setVisibility(0);
    }
    
    private CharSequence b(final long n) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yy");
        final Date date = new Date(n);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }
    
    private String b(final String s) {
        return com.twitter.android.commerce.util.e.a(this.y, s);
    }
    
    private void b(final Bundle bundle, final boolean b) {
        this.i.setVisibility(8);
        int n2;
        if (b && bundle != null) {
            com.twitter.android.commerce.util.e.a((Context)this, this.z, "cl_offer::product_detail::save_success", this.A, this.u());
            com.twitter.android.commerce.util.e.a((Context)this, this.z, PromotedEvent.aw);
            if (bundle.getBoolean("saveoffer_success_boolean")) {
                final long n = 2000L - Math.abs(System.currentTimeMillis() - this.h());
                if (n > 0L) {
                    this.c(n);
                }
                else {
                    this.A();
                }
                n2 = 0;
            }
            else {
                n2 = 1;
            }
        }
        else {
            n2 = 1;
        }
        if (n2 != 0) {
            com.twitter.android.commerce.util.e.a((Context)this, this.z, "cl_offer::product_detail::save_failure", this.A, this.u());
            this.removeDialog(2);
            this.a(false, true);
            this.h(bundle);
        }
    }
    
    private void c(final long n) {
        new Handler().postDelayed((Runnable)new q(this), n);
    }
    
    private void g(final Bundle bundle) {
        this.i.setVisibility(8);
        this.a(false, true);
        this.h(bundle);
    }
    
    private void h(final Bundle bundle) {
        this.w.a((Context)this, bundle);
    }
    
    private boolean i() {
        long long1 = 0L;
        try {
            this.A = this.b("card_url");
            if (TextUtils.isEmpty((CharSequence)this.A)) {
                throw new InvalidDataException("Expected card_url in binding values list");
            }
            this.B = this.b("offer_id");
            if (TextUtils.isEmpty((CharSequence)this.B)) {
                throw new InvalidDataException("Expected item_id in binding values list");
            }
            this.a(this.b("offer_image"));
            this.c.setText((CharSequence)this.b("offer_title"));
            this.d.setText((CharSequence)this.getString(2131296639, new Object[] { this.b("offer_merchant_name") }));
            this.e.setText((CharSequence)this.b("offer_description"));
            this.f.setText((CharSequence)this.b("offer_legal_text"));
            final String b = this.b("start_date");
            final String b2 = this.b("end_date");
            long long2;
            if (!TextUtils.isEmpty((CharSequence)b)) {
                long2 = Long.parseLong(b);
            }
            else {
                long2 = long1;
            }
            if (!TextUtils.isEmpty((CharSequence)b2)) {
                long1 = Long.parseLong(b2);
            }
            this.a(long2, long1);
            return true;
        }
        catch (InvalidDataException ex) {
            return false;
        }
        catch (NumberFormatException ex2) {
            return false;
        }
    }
    
    private boolean j() {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this);
        return defaultSharedPreferences == null || defaultSharedPreferences.getBoolean("OFFERS_NUX_HAS_RUN", false);
    }
    
    private void k() {
        as.a((Context)this).a(new rw((Context)this, az.a((Context)this).b()), new com.twitter.android.commerce.network.f(this, true));
    }
    
    private void l() {
        as.a((Context)this).a(new rh((Context)this, az.a((Context)this).b(), this.B), this.S = new t(this));
    }
    
    private void m() {
        as.a((Context)this).a(new ra((Context)this, az.a((Context)this).b(), true), new ProfileSaveCallback(this, ProfileSaveCallback$RequestType.a));
    }
    
    private void n() {
        if (TextUtils.isEmpty((CharSequence)this.H)) {
            this.H = UUID.randomUUID().toString();
        }
        final as a = as.a((Context)this);
        final sa sa = new sa((Context)this, az.a((Context)this).b(), this.A, this.B, this.J, this.H, this.z.D, this.I);
        this.T = new u(this);
        this.showDialog(2);
        com.twitter.android.commerce.util.e.a((Context)this, this.z, "cl_offer::product_detail:save_button:click", this.A, this.u());
        a.a(sa, this.T);
    }
    
    private void p() {
        final j imageRequest = this.b.getImageRequest();
        if (imageRequest != null && imageRequest.o()) {
            com.twitter.android.commerce.util.e.a((Context)this, this.z, "cl_offer::product_detail:product_image:open", this.A, this.u());
            final Uri parse = Uri.parse(imageRequest.a());
            this.startActivity(new Intent((Context)this, (Class)CommerceImageActivity.class).setData(parse).putExtra("image_url", parse.toString()).putExtra("android.intent.extra.TEXT", this.c.getText()));
        }
    }
    
    private void q() {
        this.g.setVisibility(8);
        this.j.setVisibility(0);
    }
    
    private void r() {
        this.g.setVisibility(0);
        this.j.setVisibility(8);
    }
    
    private void s() {
        final Intent intent = new Intent((Context)this, (Class)OfferSinglePageNUXActivity.class);
        final Bundle bundle = new Bundle();
        if (this.z != null) {
            bundle.putParcelable("commerce_buynow_tweet", (Parcelable)this.z);
        }
        if (this.A != null) {
            bundle.putString("commerce_buynow_card_url", this.A);
        }
        intent.putExtras(bundle);
        this.startActivity(intent);
        this.overridePendingTransition(2131034156, 2131034157);
    }
    
    private void t() {
        final TypefacesTextView typefacesTextView = (TypefacesTextView)this.findViewById(2131887084);
        if (this.Q) {
            this.f.setVisibility(8);
            typefacesTextView.setText(2131296638);
        }
        else {
            this.f.setVisibility(0);
            typefacesTextView.setText(2131296623);
            com.twitter.android.commerce.util.e.a((Context)this, this.z, "cl_offer::product_detail:detail_view:click", this.A, this.u());
        }
        this.Q = !this.Q;
    }
    
    private String u() {
        return String.format("{\"num_cards\": %d, \"step\": \"%s\"}", this.R, this.w());
    }
    
    private String w() {
        if (this.g.getVisibility() == 8) {
            return "save_offer";
        }
        return "add_offer_for_free";
    }
    
    private void x() {
        this.p.setText(2131296664);
        if (this.N != null) {
            this.x.setSupportedCardTypes(this.N);
        }
        this.l.setVisibility(0);
    }
    
    private CreditCard y() {
        if (this.O != null && !this.O.isEmpty()) {
            return (CreditCard)this.O.getItem(0);
        }
        return null;
    }
    
    private void z() {
        this.showDialog(2);
        new com.twitter.android.commerce.view.h((Context)this, new o(this)).a();
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968953);
        bn.b(14);
        bn.a(false);
        return bn;
    }
    
    public void a() {
        this.m();
    }
    
    public void a(final long g) {
        this.G = g;
    }
    
    public void a(final Bundle bundle) {
        this.removeDialog(2);
        this.g(bundle);
    }
    
    public void a(final boolean b, final Profile f) {
        this.i.setVisibility(8);
        this.F = f;
        this.R = f.f().length;
        this.O = b.a((Context)this, f, this.N);
        final CreditCard y = this.y();
        int n;
        if (y != null) {
            this.q();
            this.a(y);
            n = 0;
        }
        else if (b) {
            if (this.P != OfferDetails$OfferStatus.b) {
                this.q();
            }
            else {
                this.r();
                this.g.setEnabled(true);
            }
            this.x();
            n = 0;
        }
        else {
            Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296589), 1).show();
            n = 1;
        }
        if (n != 0) {
            com.twitter.android.commerce.util.e.a((Context)this, this.z, "cl_offer::product_detail::load_aborted", this.A, this.u());
            this.a(false, false);
        }
        else {
            com.twitter.android.commerce.util.e.a((Context)this, this.z, "cl_offer::product_detail::load_finished", this.A, this.u());
            boolean b2;
            if (this.P != null && this.P.equals(OfferDetails$OfferStatus.b)) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b2) {
                this.a(false, true);
            }
            final int count = this.O.getCount();
            String string;
            if (this.N != null && this.N.size() > 0) {
                string = this.getResources().getString(2131296522, new Object[] { com.twitter.android.commerce.util.e.a((Context)this, this.N) });
            }
            else {
                string = "";
            }
            int n2 = 2131296644;
            int text = 2131296640;
            if (count == 0) {
                com.twitter.android.commerce.util.i.a((Context)this, 2131296642, this.r);
            }
            else if (count == 1) {
                com.twitter.android.commerce.util.i.a((Context)this, 2131296643, this.r);
            }
            else {
                n2 = 2131296645;
                text = 2131296646;
                com.twitter.android.commerce.util.i.a((Context)this, 2131296641, this.r);
            }
            this.h.setText(text);
            if (b2) {
                this.q.setText((CharSequence)this.getResources().getString(n2, new Object[] { string }));
                this.q.setVisibility(0);
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
            final Intent intent = new Intent((Context)this, (Class)ProfileSummaryActivity.class);
            final Bundle bundle = new Bundle();
            if (this.z != null) {
                bundle.putParcelable("commerce_buynow_tweet", (Parcelable)this.z);
            }
            if (this.A != null) {
                bundle.putString("commerce_buynow_card_url", this.A);
            }
            bundle.putSerializable("commerce_in_buy_mode", (Serializable)false);
            intent.putExtras(bundle);
            this.startActivityForResult(intent, 2);
        }
        return super.a(jx);
    }
    
    public void a_(final Bundle bundle) {
        int n;
        if (bundle != null) {
            final Address address = (Address)bundle.getSerializable("createaddr_bundle_address");
            final String string = bundle.getString("createaddr_bundle_signature");
            final String string2 = bundle.getString("createaddr_bundle_timestamp");
            if (string != null && string2 != null) {
                this.M = true;
                as.a((Context)this).a(new sd((Context)this, az.a((Context)this).b(), address, this.K, string, string2, true), new ProfileSaveCallback(this, ProfileSaveCallback$RequestType.b));
                n = 0;
            }
            else {
                n = 1;
            }
        }
        else {
            n = 1;
        }
        if (n != 0) {
            this.a(false, false);
            Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296595), 1).show();
        }
    }
    
    public void b(final Bundle bundle) {
        this.g(bundle);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.b = (MediaImageView)this.findViewById(2131887078);
        this.c = (TextView)this.findViewById(2131887079);
        this.d = (TextView)this.findViewById(2131887081);
        this.e = (TextView)this.findViewById(2131887082);
        this.f = (TextView)this.findViewById(2131887083);
        this.g = (TwitterButton)this.findViewById(2131887087);
        this.h = (TwitterButton)this.findViewById(2131887096);
        this.t = (LinearLayout)this.findViewById(2131887091);
        this.i = (ProgressBar)this.findViewById(2131887080);
        this.j = (LinearLayout)this.findViewById(2131887088);
        this.k = (LinearLayout)this.findViewById(2131887090);
        this.n = (LinearLayout)this.findViewById(2131887085);
        this.o = (TextView)this.findViewById(2131887086);
        this.s = this.findViewById(2131887098);
        this.p = (TextView)this.findViewById(2131887089);
        this.q = (TextView)this.findViewById(2131887095);
        this.r = (TextView)this.findViewById(2131887097);
        this.w = new f((Context)this);
        this.u = (ImageView)this.findViewById(2131887092);
        this.v = (TextView)this.findViewById(2131887093);
        this.l = (LinearLayout)this.findViewById(2131886471);
        this.m = this.findViewById(2131887094);
        (this.x = (CardEntryContainer)this.findViewById(2131886474)).a((ImageView)this.findViewById(2131886472), (ImageView)this.findViewById(2131886473));
        this.x.setPanOnly(true);
        this.x.setPanHintResource(2131296535);
        this.x.setDismissKeyboardOnComplete(true);
        this.t.setOnClickListener((View$OnClickListener)this);
        this.m.setOnClickListener((View$OnClickListener)this);
        this.setTitle(2131296647);
        com.twitter.android.commerce.util.i.a((Context)this, 2131296642, this.r);
        this.s.setVisibility(8);
        this.j.setVisibility(8);
        this.k.setVisibility(8);
        this.h.setEnabled(false);
        this.g.setEnabled(false);
        this.h.setOnClickListener((View$OnClickListener)this);
        this.b.setOnClickListener((View$OnClickListener)this);
        this.g.setOnClickListener((View$OnClickListener)this);
        this.findViewById(2131887099).setOnClickListener((View$OnClickListener)this);
        this.findViewById(2131887084).setOnClickListener((View$OnClickListener)this);
        final Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            this.z = (Tweet)extras.getParcelable("commerce_buynow_tweet");
            if (this.z != null) {
                this.y = (HashMap)extras.getSerializable("commerce_product_values");
                if (!this.i()) {
                    Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296666), 1).show();
                    this.setResult(0);
                    this.finish();
                }
                else {
                    this.I = System.currentTimeMillis();
                    this.k.setVisibility(0);
                    this.h.setVisibility(0);
                    this.t.setVisibility(8);
                    this.l.setVisibility(8);
                    this.a(true, false);
                    this.l();
                    if (!this.j()) {
                        this.a(true);
                        new Handler().postDelayed((Runnable)new n(this), 1000L);
                    }
                }
            }
        }
    }
    
    public void d(final Bundle bundle) {
        this.n();
    }
    
    public void e(final Bundle bundle) {
        this.removeDialog(2);
        this.g(bundle);
    }
    
    public void f(final Bundle bundle) {
        this.removeDialog(2);
        this.g(bundle);
    }
    
    public long h() {
        return this.G;
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if ((n == 1 || n == 2) && intent != null) {
            final Bundle extras = intent.getExtras();
            if (extras != null) {
                final String string = extras.getString("commerce_profile_id_added");
                final boolean boolean1 = extras.getBoolean("commerce_profiles_deleted", false);
                if (string != null || boolean1) {
                    this.k.setVisibility(0);
                    this.h.setVisibility(0);
                    this.t.setVisibility(8);
                    this.l.setVisibility(8);
                    this.i.setVisibility(0);
                    this.a(true, false);
                    this.k();
                }
            }
        }
    }
    
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
    
    public void onClick(final View view) {
        if (view.getId() == this.h.getId()) {
            int n;
            if (this.t.getVisibility() == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            final boolean b = this.l.getVisibility() == 0;
            Object o = null;
            int n2;
            int n3;
            if (n != 0) {
                this.n();
                n2 = 0;
                n3 = 0;
            }
            else if (b) {
                this.K = this.x.getCreditCard();
                if (TextUtils.isEmpty((CharSequence)this.x.getCardNumber())) {
                    n2 = 2131296566;
                    n3 = 1;
                    o = null;
                }
                else if (!CreditCard.a(this.K, this.N)) {
                    if (this.N != null && this.N.size() > 0) {
                        final String a = com.twitter.android.commerce.util.e.a((Context)this, this.N);
                        n3 = 1;
                        o = a;
                        n2 = 2131296695;
                    }
                    else {
                        n2 = 2131296570;
                        n3 = 1;
                        o = null;
                    }
                }
                else if (this.F.c() != null) {
                    this.showDialog(2);
                    this.m();
                    n2 = 0;
                    o = null;
                    n3 = 0;
                }
                else {
                    this.z();
                    n2 = 0;
                    o = null;
                    n3 = 0;
                }
            }
            else {
                n3 = 1;
                n2 = 0;
                o = null;
            }
            if (n3 == 0) {
                this.h.setEnabled(false);
                return;
            }
            if (n2 == 0) {
                n2 = 2131296595;
            }
            String s;
            if (o != null) {
                s = this.getResources().getString(n2, new Object[] { o });
            }
            else {
                s = this.getResources().getString(n2);
            }
            Toast.makeText((Context)this, (CharSequence)s, 1).show();
        }
        else {
            if (view.getId() == this.b.getId()) {
                this.p();
                return;
            }
            if (view.getId() == this.g.getId()) {
                this.q();
                return;
            }
            if (view.getId() == 2131887099) {
                this.s();
                return;
            }
            if (view.getId() == 2131887084) {
                com.twitter.android.commerce.util.e.a((Context)this, this.z, "cl_offer::product_detail:add_button:click", this.A, this.u());
                this.t();
                return;
            }
            if (view.getId() == this.t.getId() || view.getId() == this.m.getId()) {
                final Intent intent = new Intent((Context)this, (Class)CardSummaryActivity.class);
                intent.putExtra("profile_bundle", (Serializable)this.F);
                if (this.N != null && this.N.size() > 0) {
                    intent.putExtra("commerce_valid_card_types", (Serializable)new ArrayList<Object>(this.N));
                }
                this.startActivityForResult(intent, 1);
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
                progressDialog.setMessage(this.getText(2131296533));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 3: {
                final ProgressDialog progressDialog2 = new ProgressDialog((Context)this);
                progressDialog2.setIndeterminateDrawable(this.getResources().getDrawable(2130838609));
                progressDialog2.setMessage(this.getText(2131296635));
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
            com.twitter.android.commerce.util.e.a((Context)this, this.z, "cl_offer::product_detail::exit", this.A, this.u());
        }
    }
}
