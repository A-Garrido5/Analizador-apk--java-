// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.library.client.Session;
import com.twitter.library.commerce.model.ClientCreditCard;
import java.util.Collection;
import android.content.Intent;
import java.io.Serializable;
import android.view.View;
import android.widget.Toast;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.android.commerce.network.ProfileSaveCallback;
import com.twitter.library.client.as;
import com.twitter.android.client.bn;
import android.widget.TextView$BufferType;
import android.text.method.LinkMovementMethod;
import com.twitter.android.commerce.util.i;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import java.util.Collections;
import com.twitter.library.commerce.model.b;
import java.util.List;
import com.twitter.library.commerce.model.Email;
import com.twitter.util.k;
import com.twitter.library.commerce.model.Address;
import com.twitter.library.api.PromotedEvent;
import android.content.Context;
import com.twitter.android.commerce.util.e;
import android.os.Bundle;
import com.twitter.android.commerce.network.ProfileSaveCallback$RequestType;
import com.twitter.library.commerce.model.Country;
import com.twitter.library.commerce.model.CreditCard;
import com.twitter.library.provider.Tweet;
import com.twitter.android.commerce.network.c;
import android.widget.Button;
import com.twitter.android.commerce.util.f;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.EditText;
import com.twitter.android.commerce.widget.creditcard.CardForm;
import com.twitter.android.commerce.network.h;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class ProfileEntryActivity extends TwitterFragmentActivity implements View$OnClickListener, h, com.twitter.android.commerce.widget.creditcard.h
{
    private CardForm a;
    private EditText b;
    private EditText c;
    private EditText d;
    private EditText e;
    private Spinner f;
    private EditText g;
    private Spinner h;
    private TextView i;
    private TextView j;
    private EditText k;
    private EditText l;
    private LinearLayout m;
    private ArrayAdapter n;
    private ArrayAdapter o;
    private String[] p;
    private f q;
    private Button r;
    private boolean s;
    private ProfileEntryActivity$Mode t;
    private c u;
    private Tweet v;
    private boolean w;
    private CreditCard x;
    
    private int a(final String s) {
        for (int i = 0; i < this.o.getCount(); ++i) {
            if (((Country)this.o.getItem(i)).a().equalsIgnoreCase(s)) {
                return i;
            }
        }
        return -1;
    }
    
    private void a(final ProfileSaveCallback$RequestType profileSaveCallback$RequestType, final Bundle bundle) {
        this.a(false);
        if (profileSaveCallback$RequestType == ProfileSaveCallback$RequestType.b) {
            com.twitter.android.commerce.util.e.a((Context)this, this.v, com.twitter.android.commerce.util.e.a(this.w, "store_profile::failure"), "");
            com.twitter.android.commerce.util.e.a((Context)this, this.v, PromotedEvent.am);
        }
        this.n().a((Context)this, bundle);
        this.a.getEntry().j();
    }
    
    private void a(final Address address) {
        this.b.setText((CharSequence)address.k());
        this.d.setText((CharSequence)address.b());
        this.e.setText((CharSequence)address.c());
        final String a = com.twitter.util.k.a(address.d());
        final int a2 = this.a(a);
        if (a2 >= 0) {
            this.f.setSelection(a2);
        }
        if ("US".equals(a)) {
            this.b(address.f());
        }
        else {
            this.k.setText((CharSequence)address.f());
        }
        this.g.setText((CharSequence)address.e());
        this.l.setText((CharSequence)address.g());
    }
    
    private void a(final CreditCard creditCard) {
        this.x = creditCard;
        this.t = ProfileEntryActivity$Mode.c;
        this.a.setPartialCreditCard(creditCard);
        this.j();
    }
    
    private void a(final Email email) {
        this.c.setText((CharSequence)email.toString());
    }
    
    private void a(final List list) {
        if (list != null) {
            if (list.size() == 0) {
                list.add("US");
            }
            this.b(com.twitter.library.commerce.model.b.a((Context)this).a(list.toArray(new String[0])));
            return;
        }
        final List b = com.twitter.library.commerce.model.b.b();
        if (!b.isEmpty()) {
            this.b(com.twitter.library.commerce.model.b.a((Context)this).a(b.toArray(new String[0])));
            return;
        }
        this.m();
    }
    
    private void a(final boolean b) {
        int text;
        if (b) {
            text = 2131297602;
        }
        else if (this.t == ProfileEntryActivity$Mode.b) {
            text = 2131296495;
        }
        else {
            text = 2131296496;
        }
        this.r.setText(text);
        this.r.setEnabled(!b);
    }
    
    private void b(final String s) {
        final String[] stringArray = this.getResources().getStringArray(2131361799);
        for (int i = 0; i < stringArray.length; ++i) {
            if (stringArray[i].equals(s)) {
                this.h.setSelection(i + 1);
                break;
            }
        }
    }
    
    private void b(final List list) {
        Collections.sort((List<Comparable>)list);
        this.o = new ArrayAdapter((Context)this, 17367049, list);
        this.f.setAdapter((SpinnerAdapter)this.o);
        this.f.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new al(this));
    }
    
    private void i() {
        this.x = null;
        this.t = ProfileEntryActivity$Mode.a;
        this.j();
    }
    
    private void j() {
        final TextView textView = (TextView)((ViewGroup)this.findViewById(2131886424)).findViewById(2131886446);
        switch (an.a[this.t.ordinal()]) {
            default: {}
            case 1: {
                textView.setVisibility(8);
            }
            case 2: {
                textView.setVisibility(0);
                textView.setText(2131296512);
            }
            case 3: {
                textView.setVisibility(0);
                textView.setText(2131296513);
            }
        }
    }
    
    private void k() {
        this.n = new ArrayAdapter((Context)this, 17367049, (Object[])this.getResources().getStringArray(2131361800));
        this.h.setAdapter((SpinnerAdapter)this.n);
        this.p = this.getResources().getStringArray(2131361799);
        this.h.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new ak(this));
    }
    
    private void l() {
        final String string = this.getString(2131296682);
        final String string2 = this.getString(2131296656, new Object[] { string });
        final TextView textView = (TextView)this.findViewById(2131886437);
        final SpannableString spannableString = new SpannableString((CharSequence)string2);
        com.twitter.android.commerce.util.i.a(spannableString, string2, string, "https://twitter.com/privacy");
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText((CharSequence)spannableString, TextView$BufferType.SPANNABLE);
    }
    
    private void m() {
        this.b(com.twitter.library.commerce.model.b.a((Context)this).c());
    }
    
    private f n() {
        synchronized (this) {
            if (this.q == null) {
                this.q = new am(this, (Context)this, this.a.getEntry());
            }
            return this.q;
        }
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        this.getWindow().setFlags(8192, 8192);
        bn.c(2130968655);
        bn.b(14);
        bn.a(false);
        return bn;
    }
    
    public void a_(final Bundle bundle) {
        while (true) {
            Label_0137: {
                if (bundle == null) {
                    break Label_0137;
                }
                final Address address = (Address)bundle.getSerializable("createaddr_bundle_address");
                final String string = bundle.getString("createaddr_bundle_signature");
                final String string2 = bundle.getString("createaddr_bundle_timestamp");
                if (address == null || string == null || string2 == null) {
                    break Label_0137;
                }
                final as a = as.a((Context)this);
                final sd sd = new sd((Context)this, this.u.a(), address, this.a.getCreditCard(), string, string2, false);
                this.a(true);
                a.a(sd, new ProfileSaveCallback(this, ProfileSaveCallback$RequestType.b));
                final int n = 0;
                if (n != 0) {
                    this.a(false);
                    Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296595), 1).show();
                }
                return;
            }
            final int n = 1;
            continue;
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.t = ProfileEntryActivity$Mode.a;
        this.m = (LinearLayout)this.findViewById(2131886423);
        this.a = new CardForm((Context)this);
        this.m.addView((View)this.a);
        this.b = (EditText)this.findViewById(2131886425);
        this.c = (EditText)this.findViewById(2131886426);
        this.d = (EditText)this.findViewById(2131886427);
        this.e = (EditText)this.findViewById(2131886428);
        this.f = (Spinner)this.findViewById(2131886430);
        this.g = (EditText)this.findViewById(2131886431);
        this.h = (Spinner)this.findViewById(2131886433);
        this.i = (TextView)this.findViewById(2131886432);
        this.j = (TextView)this.findViewById(2131886429);
        this.k = (EditText)this.findViewById(2131886434);
        this.l = (EditText)this.findViewById(2131886435);
        this.r = (Button)this.findViewById(2131886436);
        this.a.a(this);
        this.a.getEntry().k();
        this.a.getEntry().setNextExternalView((View)this.b);
        this.r.setOnClickListener((View$OnClickListener)this);
        final Bundle extras = this.getIntent().getExtras();
        if (extras == null) {
            Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296595), 1).show();
            this.finish();
        }
        final Serializable serializable = extras.getSerializable("commerce_address_object");
        if (!com.twitter.library.commerce.model.b.a()) {
            this.f.setVisibility(8);
        }
        this.a((List)extras.getSerializable("commerce_allowed_states_for_item"));
        this.l();
        this.k();
        final Address address = (Address)serializable;
        Email email;
        if (com.twitter.android.commerce.util.e.b()) {
            email = (Email)extras.getSerializable("commerce_profile_email");
        }
        else {
            email = null;
        }
        this.v = (Tweet)extras.getParcelable("commerce_buynow_tweet");
        this.w = extras.getBoolean("commerce_launched_from_settings", false);
        if (address != null) {
            this.t = ProfileEntryActivity$Mode.b;
            this.a(address);
            this.findViewById(2131886437).setVisibility(8);
        }
        else {
            final Serializable serializable2 = extras.getSerializable("commerce_partial_card_object");
            if (serializable2 != null) {
                this.a((CreditCard)serializable2);
            }
        }
        if (!com.twitter.android.commerce.util.e.b()) {
            this.c.setVisibility(8);
        }
        if (com.twitter.android.commerce.util.e.b() && email != null) {
            this.a(email);
        }
        this.a(false);
        this.u = new c((Context)this, extras);
        com.twitter.android.commerce.util.e.a((Context)this, (ViewGroup)this.findViewById(2131886424), Integer.valueOf(2130838775), 2131296696, true, false);
        this.j();
    }
    
    public void d(final Bundle bundle) {
        while (true) {
            Label_0142: {
                if (bundle == null) {
                    break Label_0142;
                }
                final String string = bundle.getString("storeprofile_bundle_profileid");
                if (string == null) {
                    break Label_0142;
                }
                com.twitter.android.commerce.util.e.a((Context)this, this.v, com.twitter.android.commerce.util.e.a(this.w, "store_profile::success"), "");
                com.twitter.android.commerce.util.e.a((Context)this, this.v, PromotedEvent.al);
                final Intent intent = new Intent();
                intent.putExtra("commerce_profile_id_added", string);
                this.setResult(-1, intent);
                this.s = true;
                this.finish();
                final int n = 0;
                if (n != 0) {
                    com.twitter.android.commerce.util.e.a((Context)this, this.v, com.twitter.android.commerce.util.e.a(this.w, "store_profile::failure"), "");
                    com.twitter.android.commerce.util.e.a((Context)this, this.v, PromotedEvent.am);
                    Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296595), 1).show();
                    this.a(false);
                }
                return;
            }
            final int n = 1;
            continue;
        }
    }
    
    public void e(final Bundle bundle) {
        this.a(ProfileSaveCallback$RequestType.a, bundle);
    }
    
    public void f(final Bundle bundle) {
        this.a(ProfileSaveCallback$RequestType.b, bundle);
    }
    
    public void h() {
        this.i();
    }
    
    public void onClick(final View view) {
        if (view.getId() == this.r.getId()) {
            final ClientCreditCard creditCard = this.a.getCreditCard();
            final Address address = new Address();
            address.i(this.b.getText().toString());
            address.h("");
            address.a(this.d.getText().toString());
            address.b(this.e.getText().toString());
            address.d(this.g.getText().toString());
            Email email;
            if (com.twitter.android.commerce.util.e.b()) {
                email = new Email();
                email.a(this.c.getText().toString());
            }
            else {
                email = null;
            }
            final int selectedItemPosition = this.f.getSelectedItemPosition();
            if (selectedItemPosition >= 0) {
                address.c(((Country)this.o.getItem(selectedItemPosition)).a());
                if ("US".equals(address.d())) {
                    final int selectedItemPosition2 = this.h.getSelectedItemPosition();
                    if (selectedItemPosition2 > 0) {
                        address.e(this.p[selectedItemPosition2 - 1]);
                    }
                }
                else {
                    address.e(this.k.getText().toString());
                }
            }
            address.f(this.l.getText().toString());
            creditCard.a(address);
            final List c = creditCard.c();
            c.addAll(address.a());
            if (com.twitter.android.commerce.util.e.b()) {
                c.addAll(email.c());
            }
            if (c.size() != 0) {
                this.n().d(c);
                this.a.getEntry().j();
                return;
            }
            final as a = as.a((Context)this);
            final Session a2 = this.u.a();
            String i;
            if (this.t == ProfileEntryActivity$Mode.c) {
                i = creditCard.i();
            }
            else {
                i = null;
            }
            final qq qq = new qq((Context)this, a2, address, email, creditCard.f(), i, true, false, this.a.getEntry().c());
            this.a(true);
            a.a(qq, new ProfileSaveCallback(this, ProfileSaveCallback$RequestType.a));
            com.twitter.android.commerce.util.e.a((Context)this, this.v, com.twitter.android.commerce.util.e.a(this.w, "store_profile::submit"), "");
            com.twitter.android.commerce.util.e.a((Context)this, this.v, PromotedEvent.ak);
        }
    }
    
    public void onDestroy() {
        this.a.b(this);
        super.onDestroy();
    }
    
    protected void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        if (!this.t.equals(ProfileEntryActivity$Mode.a)) {
            this.M().setTitle(this.getString(2131296657));
            return;
        }
        this.M().setTitle(this.getString(2131296661));
    }
    
    @Override
    protected void onStop() {
        if (!this.s) {
            com.twitter.android.commerce.util.e.a((Context)this, this.v, com.twitter.android.commerce.util.e.a(this.w, "store_profile::exit"), "");
            com.twitter.android.commerce.util.e.a((Context)this, this.v, PromotedEvent.aj);
        }
        super.onStop();
    }
}
