// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.library.commerce.model.CreditCard;
import com.twitter.library.commerce.model.CreditCard$Type;
import android.widget.ListAdapter;
import com.twitter.library.commerce.model.Profile;
import android.widget.ListView;
import java.io.Serializable;
import java.util.Collection;
import java.util.ArrayList;
import android.content.Context;
import android.content.Intent;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.util.List;
import com.twitter.android.client.TwitterFragmentActivity;

public class CardSummaryActivity extends TwitterFragmentActivity
{
    private b a;
    private jx b;
    private List c;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968650);
        bn.b(14);
        bn.a(false);
        return bn;
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        if (super.a(jv, toolBar)) {
            jv.a(2131951621, toolBar);
            this.b = toolBar.a(2131887405);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == this.b.a()) {
            final Intent intent = new Intent((Context)this, (Class)CreditCardNumberEntryActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putBoolean("commerce_launched_from_settings", false);
            if (this.c != null && this.c.size() > 0) {
                bundle.putSerializable("commerce_valid_card_types", (Serializable)new ArrayList<Object>(this.c));
            }
            intent.putExtras(bundle);
            this.startActivityForResult(intent, 1);
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.setTitle(this.getResources().getString(2131296651));
        final ListView listView = (ListView)this.findViewById(2131886413);
        final Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("commerce_valid_card_types")) {
                this.c = (List)extras.getSerializable("commerce_valid_card_types");
            }
            listView.setAdapter((ListAdapter)(this.a = com.twitter.android.commerce.view.b.a((Context)this, (Profile)extras.getSerializable("profile_bundle"), this.c)));
            return;
        }
        listView.setVisibility(8);
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == 1 && intent != null) {
            final Bundle extras = intent.getExtras();
            if (extras != null) {
                final String string = extras.getString("commerce_profile_id_added");
                if (string != null) {
                    final Intent intent2 = new Intent();
                    intent2.putExtra("commerce_profile_id_added", string);
                    this.setResult(-1, intent2);
                    final CardSummaryActivity$1 cardSummaryActivity$1 = new CardSummaryActivity$1(this, (CreditCard$Type)extras.getSerializable("commerce_profile_cctype"), extras.getString("commerce_profile_last_four"));
                    if (CreditCard.a(cardSummaryActivity$1, this.c)) {
                        this.a.a(cardSummaryActivity$1);
                    }
                }
            }
        }
    }
}
