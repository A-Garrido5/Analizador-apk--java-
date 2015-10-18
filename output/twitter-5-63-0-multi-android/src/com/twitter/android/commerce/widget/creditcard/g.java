// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

import com.twitter.library.commerce.model.CreditCard;
import com.twitter.library.commerce.model.ClientCreditCard;
import android.widget.TextView;
import android.widget.ImageView;
import com.twitter.android.commerce.util.e;
import java.util.Iterator;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.view.View;
import android.view.View$OnClickListener;

class g implements View$OnClickListener
{
    final /* synthetic */ CardForm a;
    
    g(final CardForm a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.a();
    }
}
