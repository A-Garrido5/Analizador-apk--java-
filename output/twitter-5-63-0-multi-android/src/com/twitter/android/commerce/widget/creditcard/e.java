// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

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
import android.os.CountDownTimer;

class e extends CountDownTimer
{
    final /* synthetic */ int a;
    final /* synthetic */ CardEntryBase b;
    final /* synthetic */ CardEntryContainer c;
    
    e(final CardEntryContainer c, final long n, final long n2, final int a, final CardEntryBase b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super(n, n2);
    }
    
    public void onFinish() {
        this.c.scrollTo(this.a, 0);
        this.c.e(this.b);
    }
    
    public void onTick(final long n) {
        this.c.scrollTo((int)((300.0 - n) / 300.0 * this.a), 0);
    }
}
