// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.internal.android.widget.ToolBar;
import android.content.DialogInterface;
import com.twitter.android.client.bn;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.widget.PromptDialogFragment;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import com.twitter.library.commerce.model.Email;
import com.twitter.android.commerce.util.ImageHelper;
import com.twitter.android.commerce.util.a;
import com.twitter.android.commerce.network.d;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.commerce.model.CreditCard;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.app.Activity;
import com.twitter.library.commerce.model.Address;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import com.twitter.android.commerce.util.f;
import java.util.List;
import com.twitter.android.commerce.network.c;
import com.twitter.library.provider.Tweet;
import com.twitter.library.commerce.model.Profile;
import com.twitter.android.commerce.network.g;
import com.twitter.android.commerce.network.e;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class ProfileSummaryActivity extends TwitterFragmentActivity implements View$OnClickListener, e, g, com.twitter.ui.dialog.e
{
    private jx A;
    private jx B;
    private jx F;
    private Profile a;
    private boolean b;
    private Tweet c;
    private String d;
    private c e;
    private boolean f;
    private String g;
    private List h;
    private f i;
    private ViewGroup j;
    private ViewGroup k;
    private ViewGroup l;
    private ViewGroup m;
    private ViewGroup n;
    private ViewGroup o;
    private ImageView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private ViewGroup t;
    private TextView u;
    private TextView v;
    private ViewGroup w;
    private ViewGroup x;
    private ProgressBar y;
    private jx z;
    
    private void a(final Address address) {
        com.twitter.android.commerce.util.e.a(this, this.c, this.d, address, com.twitter.android.commerce.util.e.c(this.a), this.e.a().e(), this.h(), this.h, 1, this.f);
    }
    
    private void a(final String s) {
        this.a(s, null);
    }
    
    private void a(final String text, final String text2) {
        this.u.setText((CharSequence)text);
        this.v.setText((CharSequence)text2);
        if (!TextUtils.isEmpty((CharSequence)text)) {
            this.y.setVisibility(8);
            return;
        }
        this.y.setVisibility(0);
    }
    
    private void a(final boolean b) {
        this.z.b(false);
        this.A.b(false);
        this.B.b(false);
        this.F.b(false);
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        int visibility2 = 0;
        if (b) {
            visibility2 = 8;
        }
        this.j.setVisibility(visibility);
        this.t.setVisibility(visibility2);
    }
    
    private void d(final Bundle bundle) {
        this.i.a((Context)this, bundle);
    }
    
    private CreditCard h() {
        if (this.a != null) {
            return this.a.b();
        }
        return null;
    }
    
    private void i() {
        as.a((Context)this).a(new rw((Context)this, this.e.a()), new com.twitter.android.commerce.network.f(this, false));
    }
    
    private void j() {
        as.a((Context)this).a(new rc((Context)this, this.e.a()), new d(this));
    }
    
    private void k() {
        CreditCard creditCard = com.twitter.android.commerce.util.e.a(this.a);
        if (creditCard == null) {
            creditCard = com.twitter.android.commerce.util.e.b(this.a);
        }
        final Address a = com.twitter.android.commerce.util.e.a(creditCard, this.a);
        final Email c = com.twitter.android.commerce.util.e.c(this.a);
        if (creditCard != null) {
            this.q.setText((CharSequence)com.twitter.android.commerce.util.a.a(creditCard, (Context)this));
            this.p.setImageResource(ImageHelper.a(creditCard.a()).a());
            if (a != null) {
                this.r.setText((CharSequence)a.toString());
            }
            if (com.twitter.android.commerce.util.e.b() && c != null) {
                this.s.setText((CharSequence)c.a());
            }
            this.a(true);
        }
        else {
            this.a(this.getString(2131296587), this.getString(2131296588));
            this.a(false);
        }
        this.l();
        this.p();
    }
    
    private void l() {
        int n = 8;
        if (com.twitter.android.commerce.util.e.d()) {
            this.k.removeAllViews();
            final boolean m = this.m();
            if (m) {
                final b a = com.twitter.android.commerce.view.b.a((Context)this, this.a, null);
                for (int i = 0; i < a.getCount(); ++i) {
                    this.k.addView(a.getView(i, null, null));
                }
            }
            final View viewById = this.findViewById(2131886526);
            if (viewById != null) {
                final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)viewById.getLayoutParams();
                layoutParams.topMargin = 0;
                viewById.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                viewById.requestLayout();
            }
            final ImageView imageView = (ImageView)this.n.findViewById(2131886447);
            if (imageView != null) {
                imageView.setVisibility(n);
            }
            final ImageView imageView2 = (ImageView)this.findViewById(2131886527);
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            this.o.setVisibility(n);
            this.w.setVisibility(n);
            final ViewGroup k = this.k;
            int visibility;
            if (m) {
                visibility = 0;
            }
            else {
                visibility = n;
            }
            k.setVisibility(visibility);
            final ViewGroup l = this.l;
            if (!m) {
                n = 0;
            }
            l.setVisibility(n);
        }
    }
    
    private boolean m() {
        final Profile a = this.a;
        boolean b = false;
        if (a != null) {
            final int length = this.a.f().length;
            b = false;
            if (length > 0) {
                b = true;
            }
        }
        return b;
    }
    
    private boolean n() {
        final CreditCard a = com.twitter.android.commerce.util.e.a(this.a);
        final Address a2 = com.twitter.android.commerce.util.e.a(a, this.a);
        return a != null && a2 != null;
    }
    
    private void p() {
        final boolean b = !this.n();
        this.z.b(b);
        this.A.b(!this.b && com.twitter.android.commerce.util.e.d());
        this.B.b(!b);
        final jx f = this.F;
        boolean b2 = false;
        Label_0094: {
            if (b) {
                final boolean m = this.m();
                b2 = false;
                if (!m) {
                    break Label_0094;
                }
            }
            b2 = true;
        }
        f.b(b2);
    }
    
    private void q() {
        PromptDialogFragment.b(1).d(2131296528).c(2131296529).h(2131296786).j(2131296445).a(this).a(this.getSupportFragmentManager());
    }
    
    private void r() {
        this.a(com.twitter.android.commerce.util.e.a(com.twitter.android.commerce.util.e.a(this.a), this.a));
    }
    
    private void s() {
        final Intent intent = new Intent((Context)this, (Class)CreditCardNumberEntryActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putBoolean("commerce_launched_from_settings", this.f);
        bundle.putParcelable("commerce_buynow_tweet", (Parcelable)this.c);
        intent.putExtras(bundle);
        this.startActivityForResult(intent, 2);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        this.b = false;
        final Bundle extras = this.getIntent().getExtras();
        int n;
        if (extras != null) {
            this.f = extras.getBoolean("commerce_launched_from_settings", false);
            if (this.f) {
                bn.b(false);
                n = 2130968682;
            }
            else {
                n = 2130968681;
            }
            this.h = (List)extras.getSerializable("commerce_allowed_states_for_item");
            this.b = extras.getBoolean("commerce_in_buy_mode", false);
        }
        else {
            n = 2130968681;
        }
        bn.c(n);
        bn.b(14);
        bn.a(false);
        return bn;
    }
    
    public void a() {
        com.twitter.android.commerce.util.e.a((Context)this, this.c, com.twitter.android.commerce.util.e.a(this.f, "::profile_deletion_success"), this.d);
        this.a(this.getString(2131296587), this.getString(2131296588));
        this.a = null;
        this.l();
        this.a(false);
        this.p();
        final Intent intent = new Intent();
        intent.putExtra("commerce_profiles_deleted", true);
        this.setResult(-1, intent);
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        switch (n) {
            case 1: {
                if (n2 == -1) {
                    this.a(this.getString(2131296531));
                    this.a(false);
                    if (this.g != null) {
                        com.twitter.android.commerce.util.e.a((Context)this, this.c, this.g, this.d);
                    }
                    this.g = null;
                    this.j();
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final Bundle bundle) {
        com.twitter.android.commerce.util.e.a((Context)this, this.c, com.twitter.android.commerce.util.e.a(this.f, "::profile_deletion_failure"), this.d);
        this.d(bundle);
        this.a(false);
        this.i();
    }
    
    public void a(final boolean b, final Profile a) {
        this.a = a;
        this.k();
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        final boolean a = super.a(jv, toolBar);
        boolean b = false;
        if (a) {
            jv.a(2131951623, toolBar);
            this.z = toolBar.a(2131887407);
            this.A = toolBar.a(2131887408);
            this.B = toolBar.a(2131887409);
            this.F = toolBar.a(2131887410);
            if (!this.n()) {
                this.a(false);
                this.p();
                this.i();
            }
            else {
                this.k();
            }
            b = true;
        }
        return b;
    }
    
    @Override
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887409) {
            com.twitter.android.commerce.util.e.a((Context)this, this.c, com.twitter.android.commerce.util.e.a(this.f, ":edit_menu_item:click"), this.d);
            this.r();
        }
        else if (a == 2131887408) {
            this.s();
        }
        else if (a == 2131887410) {
            this.g = com.twitter.android.commerce.util.e.a(this.f, ":delete_menu_item:click");
            this.q();
        }
        else if (a == 2131887407) {
            com.twitter.android.commerce.util.e.a((Context)this, this.c, "settings:payment_settings::add_menu_item:click", this.d);
            this.a((Address)null);
        }
        return super.a(jx);
    }
    
    public void b(final Bundle bundle) {
        this.d(bundle);
        this.a(this.getString(2131296589));
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.j = (ViewGroup)this.findViewById(2131886522);
        this.k = (ViewGroup)this.findViewById(2131886533);
        this.l = (ViewGroup)this.findViewById(2131886532);
        this.q = (TextView)this.findViewById(2131886524);
        this.p = (ImageView)this.findViewById(2131886523);
        this.r = (TextView)this.findViewById(2131886492);
        this.s = (TextView)this.findViewById(2131886426);
        this.t = (ViewGroup)this.findViewById(2131886521);
        this.u = (TextView)this.findViewById(2131886501);
        this.v = (TextView)this.findViewById(2131886502);
        this.w = (ViewGroup)this.findViewById(2131886528);
        this.x = (ViewGroup)this.findViewById(2131886529);
        this.m = (ViewGroup)this.findViewById(2131886530);
        this.y = (ProgressBar)this.findViewById(2131886476);
        this.i = new f((Context)this);
        this.n = (ViewGroup)this.findViewById(2131886409);
        int n = 2131296511;
        if (com.twitter.android.commerce.util.e.d()) {
            n = 2131296661;
        }
        com.twitter.android.commerce.util.e.a((Context)this, this.n, Integer.valueOf(2130838774), n, false);
        com.twitter.android.commerce.util.e.a((Context)this, this.o = (ViewGroup)this.findViewById(2131886525), Integer.valueOf(2130838775), 2131296696, true);
        com.twitter.android.commerce.util.e.a((Context)this, (ViewGroup)this.findViewById(2131886531), null, 2131296651, true);
        if (!com.twitter.android.commerce.util.e.d()) {
            this.m.setVisibility(8);
        }
        this.u.setText((CharSequence)null);
        this.v.setText((CharSequence)null);
        this.x.setOnClickListener((View$OnClickListener)this);
        this.w.setOnClickListener((View$OnClickListener)this);
        final Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            this.c = (Tweet)extras.getParcelable("commerce_buynow_tweet");
            this.d = extras.getString("commerce_buynow_card_url");
            this.a = (Profile)extras.getSerializable("commerce_profile_entry");
        }
        this.e = new c((Context)this, extras);
        if (!com.twitter.android.commerce.util.e.b()) {
            this.s.setVisibility(8);
        }
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if ((n == 1 || n == 2) && intent != null) {
            final Bundle extras = intent.getExtras();
            if (extras != null && extras.getString("commerce_profile_id_added") != null) {
                this.setResult(-1, intent);
                if (!this.b) {
                    this.a(false);
                    this.i();
                    return;
                }
                this.finish();
            }
        }
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == this.w.getId()) {
            com.twitter.android.commerce.util.e.a((Context)this, this.c, com.twitter.android.commerce.util.e.a(this.f, ":edit_cta:click"), this.d);
            this.r();
        }
        else if (id == this.x.getId()) {
            this.g = com.twitter.android.commerce.util.e.a(this.f, ":delete_cta:click");
            this.q();
        }
    }
}
