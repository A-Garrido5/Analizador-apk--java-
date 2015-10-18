// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.app.ProgressDialog;
import android.app.Dialog;
import com.twitter.library.commerce.model.ClientCreditCard;
import com.twitter.library.commerce.model.CreditCard$Type;
import java.util.ArrayList;
import com.twitter.library.commerce.model.Email;
import com.twitter.library.commerce.model.CreditCard;
import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.android.commerce.util.i;
import android.widget.TextView;
import com.twitter.android.commerce.util.e;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.android.commerce.network.ProfileSaveCallback;
import com.twitter.library.commerce.model.Address;
import com.twitter.library.client.as;
import com.twitter.android.client.bn;
import android.content.Context;
import android.os.Bundle;
import com.twitter.android.commerce.network.ProfileSaveCallback$RequestType;
import java.util.List;
import com.twitter.android.commerce.network.c;
import android.widget.Button;
import com.twitter.android.commerce.util.f;
import com.twitter.android.commerce.widget.creditcard.CardEntryContainer;
import com.twitter.android.commerce.network.h;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class CreditCardNumberEntryActivity extends TwitterFragmentActivity implements View$OnClickListener, h
{
    private CardEntryContainer a;
    private f b;
    private Button c;
    private c d;
    private List e;
    
    private void a(final ProfileSaveCallback$RequestType profileSaveCallback$RequestType, final Bundle bundle) {
        this.a(false);
        this.removeDialog(1);
        this.h().a((Context)this, bundle);
    }
    
    private void a(final boolean b) {
        int text;
        if (b) {
            text = 2131297602;
        }
        else {
            text = 2131296496;
        }
        this.c.setText(text);
        this.c.setEnabled(!b);
    }
    
    private f h() {
        synchronized (this) {
            if (this.b == null) {
                this.b = new g(this, (Context)this, this.a);
            }
            return this.b;
        }
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968657);
        bn.b(14);
        bn.a(false);
        return bn;
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
                final sd sd = new sd((Context)this, this.d.a(), null, this.a.getCreditCard(), string, string2, true);
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
        (this.a = (CardEntryContainer)this.findViewById(2131886474)).a((ImageView)this.findViewById(2131886472), (ImageView)this.findViewById(2131886473));
        this.a.setPanOnly(true);
        this.a.setDismissKeyboardOnComplete(true);
        com.twitter.android.commerce.util.e.a((Context)this, (ViewGroup)this.findViewById(2131886409), Integer.valueOf(2130838774), 2131296509, false);
        (this.c = (Button)this.findViewById(2131886436)).setOnClickListener((View$OnClickListener)this);
        com.twitter.android.commerce.util.i.a((Context)this, 2131296475, (TextView)this.findViewById(2131886437));
        final Bundle extras = this.getIntent().getExtras();
        this.d = new c((Context)this, extras);
        if (extras.containsKey("commerce_valid_card_types")) {
            this.e = (List)extras.getSerializable("commerce_valid_card_types");
            this.a.setSupportedCardTypes(this.e);
        }
        this.a(false);
    }
    
    public void d(final Bundle bundle) {
        this.removeDialog(1);
        while (true) {
            Label_0114: {
                if (bundle == null) {
                    break Label_0114;
                }
                final String string = bundle.getString("storeprofile_bundle_profileid");
                if (string == null) {
                    break Label_0114;
                }
                final Intent intent = new Intent();
                intent.putExtra("commerce_profile_id_added", string);
                intent.putExtra("commerce_profile_last_four", this.a.getCreditCard().b());
                intent.putExtra("commerce_profile_cctype", (Serializable)this.a.getCreditCard().a());
                this.setResult(-1, intent);
                this.finish();
                final int n = 0;
                if (n != 0) {
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
    
    public void onClick(final View view) {
        if (view.getId() == this.c.getId()) {
            final ClientCreditCard creditCard = this.a.getCreditCard();
            final boolean empty = TextUtils.isEmpty((CharSequence)this.a.getCardNumber());
            boolean b;
            if (!CreditCard.a(creditCard, this.e)) {
                b = true;
            }
            else {
                b = false;
            }
            if (!empty && !b) {
                this.showDialog(1);
                final as a = as.a((Context)this);
                final qq qq = new qq((Context)this, this.d.a(), null, null, null, null, true, true, false);
                this.a(true);
                a.a(qq, new ProfileSaveCallback(this, ProfileSaveCallback$RequestType.a));
                return;
            }
            final ArrayList<Integer> list = new ArrayList<Integer>();
            if (empty) {
                list.add(2131296566);
            }
            else if (creditCard.a() == CreditCard$Type.a || b) {
                list.add(2131296570);
            }
            this.h().d(list);
            this.a.j();
        }
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setProgressStyle(0);
                progressDialog.setMessage(this.getText(2131297602));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
        }
    }
    
    @Override
    protected void onStop() {
        super.onStop();
    }
}
