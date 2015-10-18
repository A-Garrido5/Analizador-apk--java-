// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.util.bj;
import android.view.MotionEvent;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import android.graphics.Canvas;
import android.os.Looper;
import java.util.Iterator;
import com.twitter.library.card.property.Vector2;
import com.twitter.library.card.property.Spacing;
import android.view.View;
import java.util.ArrayList;
import android.graphics.RectF;
import com.twitter.library.card.property.Vector2F;
import android.support.v4.view.GestureDetectorCompat;
import android.content.Context;
import com.twitter.library.card.property.Style;
import com.twitter.library.card.CardView;
import com.twitter.library.card.Card;
import android.graphics.Paint;
import java.io.Externalizable;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;

class a implements Runnable
{
    final /* synthetic */ Element a;
    
    a(final Element a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a();
    }
}
