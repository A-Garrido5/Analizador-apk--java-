// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import java.util.List;
import com.twitter.library.client.az;
import java.util.Collection;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.twitter.library.commerce.model.Address;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.android.commerce.network.ProfileSaveCallback;
import com.twitter.library.client.as;
import com.twitter.android.client.bn;
import android.widget.TextView$BufferType;
import android.text.method.LinkMovementMethod;
import com.twitter.android.commerce.util.i;
import android.text.SpannableString;
import android.widget.TextView;
import com.twitter.library.commerce.model.Email;
import com.twitter.library.api.PromotedEvent;
import android.content.Context;
import com.twitter.android.commerce.util.e;
import android.os.Bundle;
import com.twitter.android.commerce.network.ProfileSaveCallback$RequestType;
import com.twitter.library.provider.Tweet;
import com.twitter.android.commerce.network.c;
import android.widget.Button;
import com.twitter.android.commerce.util.f;
import android.widget.LinearLayout;
import android.widget.EditText;
import com.twitter.android.commerce.widget.creditcard.CardForm;
import com.twitter.android.commerce.network.h;
import com.twitter.android.commerce.network.b;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class CardEmailEntryActivity extends TwitterFragmentActivity implements View$OnClickListener, b, h, com.twitter.android.commerce.widget.creditcard.h
{
    private CardForm a;
    private EditText b;
    private LinearLayout c;
    private f d;
    private Button e;
    private boolean f;
    private c g;
    private Tweet h;
    private boolean i;
    
    private void a(final ProfileSaveCallback$RequestType profileSaveCallback$RequestType, final Bundle bundle) {
        this.a(false);
        if (profileSaveCallback$RequestType == ProfileSaveCallback$RequestType.b) {
            com.twitter.android.commerce.util.e.a((Context)this, this.h, com.twitter.android.commerce.util.e.a(this.i, "store_profile::failure"), "");
            com.twitter.android.commerce.util.e.a((Context)this, this.h, PromotedEvent.am);
        }
        this.j().a((Context)this, bundle);
        this.a.getEntry().j();
    }
    
    private void a(final Email email) {
        this.b.setText((CharSequence)email.toString());
    }
    
    private void a(final boolean b) {
        int text;
        if (b) {
            text = 2131297602;
        }
        else {
            text = 2131296496;
        }
        this.e.setText(text);
        this.e.setEnabled(!b);
    }
    
    private void i() {
        final String string = this.getString(2131296682);
        final String string2 = this.getString(2131296656, new Object[] { string });
        final TextView textView = (TextView)this.findViewById(2131886437);
        final SpannableString spannableString = new SpannableString((CharSequence)string2);
        com.twitter.android.commerce.util.i.a(spannableString, string2, string, "https://twitter.com/privacy");
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText((CharSequence)spannableString, TextView$BufferType.SPANNABLE);
    }
    
    private f j() {
        synchronized (this) {
            if (this.d == null) {
                this.d = new a(this, (Context)this, this.a.getEntry());
            }
            return this.d;
        }
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        this.getWindow().setFlags(8192, 8192);
        bn.c(2130968656);
        bn.b(14);
        bn.a(false);
        return bn;
    }
    
    public void a() {
        final as a = as.a((Context)this);
        final ra ra = new ra((Context)this, this.g.a(), false);
        this.a(true);
        a.a(ra, new ProfileSaveCallback(this, ProfileSaveCallback$RequestType.a));
        com.twitter.android.commerce.util.e.a((Context)this, this.h, com.twitter.android.commerce.util.e.a(this.i, "store_profile::submit"), "");
        com.twitter.android.commerce.util.e.a((Context)this, this.h, PromotedEvent.ak);
    }
    
    public void a(final Bundle bundle) {
        this.a(ProfileSaveCallback$RequestType.a, bundle);
    }
    
    public void a_(final Bundle bundle) {
        while (true) {
            Label_0116: {
                if (bundle == null) {
                    break Label_0116;
                }
                final String string = bundle.getString("createaddr_bundle_signature");
                final String string2 = bundle.getString("createaddr_bundle_timestamp");
                if (string == null || string2 == null) {
                    break Label_0116;
                }
                final as a = as.a((Context)this);
                final sd sd = new sd((Context)this, this.g.a(), null, this.a.getCreditCard(), string, string2, false);
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
        this.c = (LinearLayout)this.findViewById(2131886423);
        this.a = new CardForm((Context)this);
        this.c.addView((View)this.a);
        this.b = (EditText)this.findViewById(2131886426);
        this.e = (Button)this.findViewById(2131886436);
        this.a.a(this);
        this.a.getEntry().k();
        this.e.setOnClickListener((View$OnClickListener)this);
        this.i();
        final Bundle extras = this.getIntent().getExtras();
        if (extras == null) {
            Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296595), 1).show();
            this.finish();
        }
        Email email;
        if (com.twitter.android.commerce.util.e.b()) {
            email = (Email)extras.getSerializable("commerce_profile_email");
        }
        else {
            email = null;
        }
        this.h = (Tweet)extras.getParcelable("commerce_buynow_tweet");
        this.i = extras.getBoolean("commerce_launched_from_settings", false);
        if (!com.twitter.android.commerce.util.e.b()) {
            this.b.setVisibility(8);
        }
        if (com.twitter.android.commerce.util.e.b() && email != null) {
            this.a(email);
        }
        this.a(false);
        this.g = new c((Context)this, extras);
    }
    
    public void d(final Bundle bundle) {
        while (true) {
            Label_0141: {
                if (bundle == null) {
                    break Label_0141;
                }
                final String string = bundle.getString("storeprofile_bundle_profileid");
                if (string == null) {
                    break Label_0141;
                }
                com.twitter.android.commerce.util.e.a((Context)this, this.h, com.twitter.android.commerce.util.e.a(this.i, "store_profile::success"), "");
                com.twitter.android.commerce.util.e.a((Context)this, this.h, PromotedEvent.al);
                final Intent intent = new Intent();
                intent.putExtra("commerce_profile_id_added", string);
                this.setResult(-1, intent);
                this.f = true;
                this.finish();
                final int n = 0;
                if (n != 0) {
                    com.twitter.android.commerce.util.e.a((Context)this, this.h, com.twitter.android.commerce.util.e.a(this.i, "store_profile::failure"), "");
                    com.twitter.android.commerce.util.e.a((Context)this, this.h, PromotedEvent.am);
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
    }
    
    public void onClick(final View view) {
        if (view.getId() == this.e.getId()) {
            final List c = this.a.getCreditCard().c();
            final boolean b = com.twitter.android.commerce.util.e.b();
            Email email = null;
            if (b) {
                email = new Email();
                email.a(this.b.getText().toString());
                c.addAll(email.c());
            }
            if (c.size() != 0 || email == null) {
                this.j().d(c);
                this.a.getEntry().j();
                return;
            }
            as.a((Context)this).a(new qx((Context)this, az.a((Context)this).b(), email), new com.twitter.android.commerce.network.a(this));
        }
    }
    
    public void onDestroy() {
        this.a.b(this);
        super.onDestroy();
    }
    
    protected void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        this.M().setTitle(this.getString(2131296658));
    }
    
    @Override
    protected void onStop() {
        if (!this.f) {
            com.twitter.android.commerce.util.e.a((Context)this, this.h, com.twitter.android.commerce.util.e.a(this.i, "store_profile::exit"), "");
            com.twitter.android.commerce.util.e.a((Context)this, this.h, PromotedEvent.aj);
        }
        super.onStop();
    }
}
