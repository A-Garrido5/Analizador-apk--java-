// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

import com.twitter.library.commerce.model.CreditCard;
import com.twitter.library.commerce.model.ClientCreditCard;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import com.twitter.android.commerce.util.e;
import android.view.View;
import java.util.Iterator;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class CardForm extends RelativeLayout
{
    private CardEntryContainer a;
    private ViewGroup b;
    private HashSet c;
    
    public CardForm(final Context context) {
        super(context);
        this.a(context);
    }
    
    public CardForm(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context);
    }
    
    public CardForm(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context);
    }
    
    private void a() {
        this.getEntry().a();
        this.b.setVisibility(8);
        final Iterator<h> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            iterator.next().h();
        }
    }
    
    private void a(final Context context) {
        this.c = new HashSet();
        View.inflate(context, 2130968649, (ViewGroup)this);
        this.a = (CardEntryContainer)this.findViewById(2131886412);
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131886409);
        e.a(context, viewGroup, Integer.valueOf(2130838774), 2131296509, false);
        (this.b = (ViewGroup)viewGroup.findViewById(2131886449)).setOnClickListener((View$OnClickListener)new g(this));
        this.getEntry().a((ImageView)this.findViewById(2131886410), (ImageView)this.findViewById(2131886411));
        this.getEntry().setTextHelper((TextView)viewGroup.findViewById(2131886448));
    }
    
    public void a(final h h) {
        this.c.add(h);
    }
    
    public void b(final h h) {
        this.c.remove(h);
    }
    
    public ClientCreditCard getCreditCard() {
        return this.getEntry().getCreditCard();
    }
    
    public CardEntryContainer getEntry() {
        return this.a;
    }
    
    public void setPartialCreditCard(final CreditCard partialCard) {
        this.getEntry().setPartialCard(partialCard);
        this.b.setVisibility(0);
    }
}
