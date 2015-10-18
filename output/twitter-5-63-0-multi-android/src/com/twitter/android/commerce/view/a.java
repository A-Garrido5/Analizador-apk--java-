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
import com.twitter.library.commerce.model.Email;
import com.twitter.library.api.PromotedEvent;
import com.twitter.android.commerce.util.e;
import android.os.Bundle;
import com.twitter.android.commerce.network.ProfileSaveCallback$RequestType;
import com.twitter.library.provider.Tweet;
import com.twitter.android.commerce.network.c;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.EditText;
import com.twitter.android.commerce.widget.creditcard.CardForm;
import com.twitter.android.commerce.network.h;
import com.twitter.android.commerce.network.b;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;
import android.widget.TextView;
import android.content.Context;
import com.twitter.android.commerce.widget.creditcard.CardEntryContainer;
import com.twitter.android.commerce.util.f;

class a extends f
{
    final /* synthetic */ CardEntryContainer a;
    final /* synthetic */ CardEmailEntryActivity b;
    
    a(final CardEmailEntryActivity b, final Context context, final CardEntryContainer a) {
        this.b = b;
        this.a = a;
        super(context);
        this.a(Integer.valueOf(2131296566), (TextView)this.a.b);
        this.a(Integer.valueOf(2131296567), (TextView)this.a.b);
        this.a(Integer.valueOf(2131296570), (TextView)this.a.b);
        this.a(Integer.valueOf(2131296569), (TextView)this.a.b);
        this.a(Integer.valueOf(2131296572), (TextView)this.a.c);
        this.a(Integer.valueOf(2131296571), (TextView)this.a.c);
        this.a(Integer.valueOf(2131296564), (TextView)this.a.c);
        this.a(Integer.valueOf(2131296560), (TextView)this.a.c);
        this.a(Integer.valueOf(2131296559), (TextView)this.a.d);
        this.a(Integer.valueOf(2131296558), (TextView)this.a.d);
        this.a(Integer.valueOf(2131296565), (TextView)this.a.c);
        this.a(Integer.valueOf(2131296564), (TextView)this.a.c);
        this.a(Integer.valueOf(2131296573), (TextView)this.a.e);
        this.a(Integer.valueOf(2131296545), (TextView)this.b.b);
        this.a(Integer.valueOf(2131296575), (TextView)this.b.b);
    }
}
