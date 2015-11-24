// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.widget.ImageView;

public class ConversationRowImage$RowImageView extends ImageView
{
    private int a;
    private Bitmap b;
    private MediaData c;
    private int d;
    private boolean e;
    private Rect f;
    private Paint g;
    private Rect h;
    private boolean i;
    
    public ConversationRowImage$RowImageView(final Context context) {
        super(context);
        this.g = new Paint();
        this.h = new Rect();
        this.f = new Rect();
        this.a();
    }
    
    public ConversationRowImage$RowImageView(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = new Paint();
        this.h = new Rect();
        this.f = new Rect();
        this.a();
    }
    
    public ConversationRowImage$RowImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.g = new Paint();
        this.h = new Rect();
        this.f = new Rect();
        this.a();
    }
    
    static int a(final ConversationRowImage$RowImageView conversationRowImage$RowImageView) {
        return conversationRowImage$RowImageView.a;
    }
    
    static int a(final ConversationRowImage$RowImageView conversationRowImage$RowImageView, final int a) {
        return conversationRowImage$RowImageView.a = a;
    }
    
    static Bitmap a(final ConversationRowImage$RowImageView conversationRowImage$RowImageView, final Bitmap b) {
        return conversationRowImage$RowImageView.b = b;
    }
    
    static MediaData a(final ConversationRowImage$RowImageView conversationRowImage$RowImageView, final MediaData c) {
        return conversationRowImage$RowImageView.c = c;
    }
    
    private void a() {
        this.g.setAntiAlias(true);
        this.g.setDither(true);
        this.g.setFilterBitmap(true);
        this.g.setColor(-1);
    }
    
    static boolean a(final ConversationRowImage$RowImageView conversationRowImage$RowImageView, final boolean i) {
        return conversationRowImage$RowImageView.i = i;
    }
    
    static int b(final ConversationRowImage$RowImageView conversationRowImage$RowImageView, final int d) {
        return conversationRowImage$RowImageView.d = d;
    }
    
    static boolean b(final ConversationRowImage$RowImageView conversationRowImage$RowImageView, final boolean e) {
        return conversationRowImage$RowImageView.e = e;
    }
    
    protected void onDraw(final Canvas canvas) {
        final boolean i = App.I;
        this.g.setColor(-1);
        this.h.set(0, 0, this.getWidth(), this.getHeight());
        if (this.b != null) {
            final Rect rect = new Rect(0, 0, this.b.getWidth(), this.b.getHeight());
            Label_0270: {
                if (this.b.getHeight() > this.b.getWidth()) {
                    rect.bottom = this.b.getWidth();
                    int faceY;
                    if (this.c.faceY > 0) {
                        faceY = this.c.faceY;
                    }
                    else {
                        faceY = this.d / 3;
                    }
                    if (faceY > this.a / 3) {
                        final int bottom = rect.bottom;
                        rect.bottom = Math.min(this.b.getHeight(), faceY * this.b.getHeight() / this.d + bottom * 2 / 3);
                        rect.top = rect.bottom - bottom;
                        if (rect.top < 0) {
                            rect.top = 0;
                            rect.bottom = bottom;
                        }
                    }
                    if (!i) {
                        break Label_0270;
                    }
                }
                if (10 * this.b.getWidth() > 24 * this.b.getHeight()) {
                    rect.left = (this.b.getWidth() - 24 * this.b.getHeight() / 10) / 2;
                    rect.right = (this.b.getWidth() + 24 * this.b.getHeight() / 10) / 2;
                }
            }
            canvas.drawBitmap(this.b, rect, this.h, this.g);
        }
        if (this.i) {
            Label_0400: {
                if (App.ak()) {
                    ConversationRowImage.a().setBounds(this.h.right - ConversationRowImage.a().getIntrinsicWidth(), this.h.bottom - ConversationRowImage.a().getIntrinsicHeight(), this.h.right, this.h.bottom);
                    if (!i) {
                        break Label_0400;
                    }
                }
                ConversationRowImage.a().setBounds(this.h.left, this.h.bottom - ConversationRowImage.a().getIntrinsicHeight(), this.h.left + ConversationRowImage.a().getIntrinsicWidth(), this.h.bottom);
            }
            ConversationRowImage.a().draw(canvas);
        }
        Drawable drawable;
        if (this.e) {
            drawable = ConversationRowImage.O;
        }
        else {
            drawable = ConversationRowImage.T;
        }
        drawable.setBounds(this.h);
        drawable.draw(canvas);
    }
    
    protected void onMeasure(final int n, final int n2) {
        final View decorView = ((Activity)this.getContext()).getWindow().getDecorView();
        final int n3 = 70 * Math.min(decorView.getWidth(), decorView.getHeight()) / 100;
        int n4 = n3 * this.d / this.a;
        Label_0087: {
            if (n4 > n3) {
                if (!App.I) {
                    n4 = n3;
                    break Label_0087;
                }
                n4 = n3;
            }
            if (n3 * 10 > n4 * 24) {
                n4 = n3 * 10 / 24;
            }
        }
        this.setMeasuredDimension(n3, n4);
    }
}
