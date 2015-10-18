// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

import android.graphics.Paint;
import java.util.List;
import android.view.MotionEvent;
import android.view.animation.Animation;
import com.twitter.android.commerce.util.h;
import java.util.Calendar;
import com.twitter.library.commerce.model.PartialClientCreditCard;
import com.twitter.library.commerce.model.ClientCreditCard;
import com.twitter.android.commerce.util.ImageHelper$Image;
import com.twitter.android.commerce.util.ImageHelper;
import android.os.Handler;
import com.twitter.library.commerce.model.CreditCard$Type;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.commerce.model.CreditCard;
import android.view.View;
import com.twitter.android.commerce.util.ImageHelper$Image$AnimationType;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.view.GestureDetector$OnGestureListener;
import android.widget.HorizontalScrollView;

public class CardEntryContainer extends HorizontalScrollView implements GestureDetector$OnGestureListener, View$OnClickListener, View$OnTouchListener, f
{
    public final TextView a;
    public final CardNumber b;
    public final CardExpiration c;
    public final CardCCV d;
    public final InternationalCardZip e;
    private ImageView f;
    private ImageView g;
    private ImageHelper$Image$AnimationType h;
    private View i;
    private TextView j;
    private CardEntryContainer$State k;
    private CardEntryBase l;
    private boolean m;
    private boolean n;
    private boolean o;
    private CreditCard p;
    
    public CardEntryContainer(final Context context) {
        this(context, null);
    }
    
    public CardEntryContainer(final Context context, final AttributeSet set) {
        super(context, set);
        this.k = CardEntryContainer$State.a;
        View.inflate(context, 2130968648, (ViewGroup)this);
        this.setHorizontalScrollBarEnabled(false);
        this.setOnTouchListener((View$OnTouchListener)this);
        this.setSmoothScrollingEnabled(true);
        (this.a = (TextView)this.findViewById(2131886405)).setGravity(17);
        this.a.setImeOptions(268435456);
        this.a.setBackgroundColor(this.getResources().getColor(17170445));
        this.b = (CardNumber)this.findViewById(2131886404);
        this.c = (CardExpiration)this.findViewById(2131886406);
        this.d = (CardCCV)this.findViewById(2131886407);
        this.e = (InternationalCardZip)this.findViewById(2131886408);
        this.b.setDelegate(this);
        this.c.setDelegate(this);
        this.d.setDelegate(this);
        this.e.setDelegate(this);
        this.b(false);
    }
    
    private void b(final CardEntryBase cardEntryBase) {
        if (cardEntryBase.getVisibility() == 4) {
            cardEntryBase.setVisibility(0);
        }
    }
    
    private boolean c(final CardEntryBase cardEntryBase) {
        if (cardEntryBase.getVisibility() == 0 && !TextUtils.isEmpty(cardEntryBase.getError())) {
            this.e(cardEntryBase);
            return true;
        }
        return false;
    }
    
    private void d(final CardEntryBase cardEntryBase) {
        String s = this.b.getText().toString();
        if (s.length() > 4) {
            s = s.substring(-4 + s.length());
        }
        final int n = this.b.getWidth() - ((int)((Paint)this.b.getPaint()).measureText(s) + this.b.getPaddingRight());
        this.b(cardEntryBase);
        new e(this, 300L, 5L, n, cardEntryBase).start();
    }
    
    private void e(final CardEntryBase cardEntryBase) {
        cardEntryBase.setFocusable(true);
        cardEntryBase.setFocusableInTouchMode(false);
        cardEntryBase.requestFocusFromTouch();
    }
    
    private CreditCard$Type getCurrentType() {
        if (this.c()) {
            return this.p.a();
        }
        return this.b.getType();
    }
    
    private void setCurrentState(final CardEntryContainer$State k) {
        this.k = k;
    }
    
    public void a() {
        this.p = null;
        this.b();
        this.b.setVisibility(0);
        this.a.setVisibility(8);
        this.a(CreditCard$Type.a);
        this.setFocus(this.b);
    }
    
    public void a(final ImageView f, final ImageView g) {
        this.f = f;
        this.g = g;
        this.f.setOnClickListener((View$OnClickListener)this);
        this.g.setOnClickListener((View$OnClickListener)this);
    }
    
    public void a(final CardEntryBase cardEntryBase) {
        final int currentTextColor = cardEntryBase.getCurrentTextColor();
        cardEntryBase.setTextColor(-65536);
        if (cardEntryBase.getLastError() != 0) {
            cardEntryBase.setError((CharSequence)this.getResources().getString(cardEntryBase.getLastError()));
        }
        if (currentTextColor != -65536) {
            new Handler().postDelayed((Runnable)new b(this, cardEntryBase, currentTextColor), 1000L);
        }
    }
    
    public void a(final CreditCard$Type creditCard$Type) {
        final ImageHelper$Image a = ImageHelper.a(creditCard$Type);
        this.f.setImageResource(a.a());
        this.g.setImageResource(a.b());
        this.h = a.c();
        this.a(false);
    }
    
    public void a(final boolean m) {
        if (this.m != m) {
            if (this.h == ImageHelper$Image$AnimationType.b) {
                this.i();
            }
            else if (this.h == ImageHelper$Image$AnimationType.a) {
                this.h();
            }
        }
        this.m = m;
    }
    
    public void b() {
        this.b.setText((CharSequence)"");
        this.c.setText((CharSequence)"");
        this.d.setText((CharSequence)"");
        this.e.setText((CharSequence)"");
    }
    
    public void b(final boolean cursorVisible) {
        this.c.setClickable(cursorVisible);
        this.c.setLongClickable(cursorVisible);
        this.c.setFocusable(cursorVisible);
        this.c.setFocusableInTouchMode(cursorVisible);
        this.c.setCursorVisible(cursorVisible);
        this.d.setClickable(cursorVisible);
        this.d.setLongClickable(cursorVisible);
        this.d.setFocusable(cursorVisible);
        this.d.setFocusableInTouchMode(cursorVisible);
        this.d.setCursorVisible(cursorVisible);
        this.e.setClickable(cursorVisible);
        this.e.setLongClickable(cursorVisible);
        this.e.setFocusable(cursorVisible);
        this.e.setFocusableInTouchMode(cursorVisible);
        this.e.setCursorVisible(cursorVisible);
    }
    
    public boolean c() {
        return this.p != null;
    }
    
    public void d() {
        if (!this.n) {
            this.b(true);
            this.setFocus(this.c);
        }
        else {
            final View nextExternalView = this.getNextExternalView();
            if (nextExternalView != null) {
                nextExternalView.requestFocus();
            }
            if (this.o) {
                com.twitter.android.commerce.util.e.a(this.getContext(), (View)this.b);
            }
        }
    }
    
    public void e() {
        this.setFocus(this.d);
    }
    
    public void f() {
        this.setFocus(this.e);
    }
    
    public void g() {
    }
    
    public String getCardNumber() {
        return this.b.getText().toString();
    }
    
    public ClientCreditCard getCreditCard() {
        ClientCreditCard clientCreditCard;
        if (this.c()) {
            final PartialClientCreditCard partialClientCreditCard = new PartialClientCreditCard();
            partialClientCreditCard.a(this.getCurrentType(), this.p.b());
            partialClientCreditCard.d(this.p.i());
            clientCreditCard = partialClientCreditCard;
        }
        else {
            clientCreditCard = new ClientCreditCard();
            clientCreditCard.c((String)this.b.getData());
        }
        final Calendar calendar = (Calendar)this.c.getData();
        if (calendar != null) {
            clientCreditCard.a(Integer.valueOf(1 + calendar.get(2)));
            clientCreditCard.b(Integer.valueOf(calendar.get(1)));
        }
        clientCreditCard.b((String)this.d.getData());
        clientCreditCard.a((String)this.e.getData());
        return clientCreditCard;
    }
    
    public View getNextExternalView() {
        return this.i;
    }
    
    public CreditCard getPartialCard() {
        return this.p;
    }
    
    public TextView getTextHelper() {
        return this.j;
    }
    
    public void h() {
        if (this.f.getVisibility() == 8) {
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            return;
        }
        this.f.setVisibility(8);
        this.g.setVisibility(0);
    }
    
    public void i() {
        final h h = new h((View)this.f, (View)this.g, this.g.getWidth() / 2, this.g.getHeight() / 2);
        if (this.f.getVisibility() == 8) {
            h.a();
        }
        this.f.startAnimation((Animation)h);
    }
    
    public boolean j() {
        return this.c(this.d) || this.c(this.c) || this.c(this.e);
    }
    
    public void k() {
        this.setFocus(this.b);
        this.b.requestFocus();
    }
    
    public void onClick(final View view) {
        this.k();
    }
    
    public boolean onDown(final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        return true;
    }
    
    public void onLongPress(final MotionEvent motionEvent) {
    }
    
    public boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        return false;
    }
    
    public void onShowPress(final MotionEvent motionEvent) {
    }
    
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        return true;
    }
    
    public void setDismissKeyboardOnComplete(final boolean o) {
        this.o = o;
    }
    
    public void setFocus(final CardEntryBase l) {
        if (l == this.l) {
            return;
        }
        l.setFocusable(false);
        if (this.j != null) {
            this.j.setText((CharSequence)l.getHelperText());
        }
        if (l == this.b && this.k != CardEntryContainer$State.b) {
            this.setCurrentState(CardEntryContainer$State.b);
            new c(this, 300L, 5L, this.computeHorizontalScrollOffset(), l).start();
        }
        else if (l != this.b && this.k != CardEntryContainer$State.c) {
            this.setCurrentState(CardEntryContainer$State.c);
            this.b.post((Runnable)new d(this, l));
        }
        else {
            this.b(l);
            this.e(l);
        }
        this.l = l;
        if (l.getClass().equals(CardCCV.class)) {
            ((CardCCV)l).setType(this.getCurrentType());
            this.a(true);
            return;
        }
        this.a(false);
    }
    
    public void setFocusToPrevious(final CardEntryBase cardEntryBase) {
        if (cardEntryBase == this.c && !this.c()) {
            this.setFocus(this.b);
        }
        else {
            if (cardEntryBase == this.d) {
                this.setFocus(this.c);
                return;
            }
            if (cardEntryBase == this.e) {
                this.setFocus(this.d);
            }
        }
    }
    
    public void setNextExternalView(final View i) {
        this.i = i;
    }
    
    public void setPanHintResource(final int hintResource) {
        this.b.setHintResource(hintResource);
    }
    
    public void setPanOnly(final boolean n) {
        this.n = n;
    }
    
    public void setPartialCard(final CreditCard p) {
        this.p = p;
        this.b.setVisibility(8);
        this.a.setVisibility(0);
        this.a.setText((CharSequence)p.b());
        this.a(this.p.a());
        this.b(true);
        this.setFocus(this.c);
    }
    
    public void setSupportedCardTypes(final List supportedCardTypes) {
        this.b.setSupportedCardTypes(supportedCardTypes);
    }
    
    public void setTextHelper(final TextView j) {
        this.j = j;
    }
}
