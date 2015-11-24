// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.view.View;
import com.whatsapp.util.o;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.widget.LinearLayout$LayoutParams;
import com.whatsapp.protocol.bi;
import android.content.Context;

public class ConversationRowText extends ConversationRow
{
    private final TextEmojiLabel F;
    
    ConversationRowText(final Context context, final bi bi) {
        super(context, bi);
        (this.F = (TextEmojiLabel)this.findViewById(2131755497)).setLinkHandler(new aav());
        this.F.setAutoLinkMask(0);
        this.F.setLinksClickable(false);
        this.F.setFocusable(false);
        this.F.setClickable(false);
        this.F.setLongClickable(false);
        this.b(bi);
    }
    
    private void b(final bi bi) {
        final String c = bi.c();
        int measuredWidth;
        if (App.ak()) {
            int n2;
            if (c != null) {
                final int lastIndex = c.lastIndexOf(10);
                String substring;
                if (lastIndex > 0) {
                    substring = c.substring(lastIndex);
                }
                else {
                    substring = c;
                }
                int n;
                if (!alm.a.isRtl(substring)) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                n2 = n;
            }
            else {
                n2 = 1;
            }
            final View viewById = this.findViewById(2131755487);
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)viewById.getLayoutParams();
            if (n2 != 0) {
                viewById.measure(View$MeasureSpec.makeMeasureSpec(-2, 0), View$MeasureSpec.makeMeasureSpec(-2, 0));
                measuredWidth = viewById.getMeasuredWidth();
            }
            else {
                measuredWidth = 0;
            }
            if (linearLayout$LayoutParams.leftMargin != -measuredWidth) {
                final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
                layoutParams.leftMargin = -measuredWidth;
                layoutParams.gravity = 80;
                viewById.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
        }
        else {
            measuredWidth = 0;
        }
        this.setMessageText(c, this.F, measuredWidth, bi);
        this.F.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.F.clearAnimation();
        if ((c.length() == 1 && (c.charAt(0) == '\ue022' || c.charAt(0) == '\u2764')) || (c.length() == 2 && c.charAt(0) == '\u2764' && c.charAt(1) == '\ufe0f')) {
            this.F.setCompoundDrawablesWithIntrinsicBounds(2130838886, 0, 0, 0);
            final ScaleAnimation scaleAnimation = new ScaleAnimation(0.85f, 0.8f, 0.85f, 0.8f, 1, 0.5f, 1, 0.5f);
            ((Animation)scaleAnimation).setInterpolator((Interpolator)new DecelerateInterpolator());
            ((Animation)scaleAnimation).setDuration(500L);
            ((Animation)scaleAnimation).setRepeatMode(2);
            ((Animation)scaleAnimation).setRepeatCount(-1);
            this.F.startAnimation((Animation)scaleAnimation);
            this.F.setText((CharSequence)"");
        }
        final ImageView imageView = (ImageView)this.findViewById(2131755496);
        if (imageView != null) {
            imageView.setVisibility(8);
            if (bi.N != null) {
                final byte[] array = (byte[])bi.N;
                final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(array, 0, array.length);
                if (decodeByteArray != null) {
                    imageView.setVisibility(0);
                    final float n3 = 3.0f * this.F.getPaint().getFontSpacing();
                    imageView.setImageBitmap(Bitmap.createScaledBitmap(decodeByteArray, (int)(n3 * decodeByteArray.getWidth() / decodeByteArray.getHeight()), (int)n3, true));
                    com.whatsapp.util.o.a(this.F.getText(), (View)imageView, this.F, ((Activity)this.getContext()).getWindowManager().getDefaultDisplay());
                }
            }
        }
    }
    
    @Override
    public void a(final bi bi, final boolean b) {
        final boolean b2 = bi != this.t | b;
        super.a(bi, b2);
        if (b2) {
            this.b(bi);
        }
    }
    
    @Override
    protected int b() {
        return 2130903126;
    }
    
    @Override
    public void d() {
        this.b(this.t);
        super.d();
    }
    
    @Override
    public void n() {
        super.n();
        if (App.ak()) {
            this.F.setPadding(this.F.getPaddingLeft(), this.F.getPaddingTop(), 4 * this.F.getPaddingRight(), this.F.getPaddingBottom());
        }
    }
    
    @Override
    protected int p() {
        return 2130903127;
    }
}
