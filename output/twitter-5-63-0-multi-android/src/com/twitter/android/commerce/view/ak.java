// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.library.client.Session;
import com.twitter.library.commerce.model.ClientCreditCard;
import java.util.Collection;
import android.content.Intent;
import java.io.Serializable;
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
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

class ak implements AdapterView$OnItemSelectedListener
{
    final /* synthetic */ ProfileEntryActivity a;
    
    ak(final ProfileEntryActivity a) {
        this.a = a;
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (this.a.i != null) {
            this.a.i.setError((CharSequence)null);
            this.a.i.setVisibility(8);
        }
        this.a.k.setError((CharSequence)null);
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
}
