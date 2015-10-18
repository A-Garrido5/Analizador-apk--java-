// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Canvas;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

class EmojiPicker$EmojiImageView extends View
{
    private Drawable a;
    final bi b;
    private int c;
    
    public EmojiPicker$EmojiImageView(final bi b, final Context context) {
        this.b = b;
        super(context);
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.a == null && this.c != 0) {
            this.a = bi.b(this.getContext(), this.c);
        }
        if (this.a != null) {
            final int intrinsicWidth = this.a.getIntrinsicWidth();
            final int intrinsicHeight = this.a.getIntrinsicHeight();
            final int n = (this.getWidth() - intrinsicWidth) / 2;
            final int n2 = (this.getHeight() - intrinsicHeight) / 2;
            this.a.setBounds(n, n2, intrinsicWidth + n, intrinsicHeight + n2);
            this.a.draw(canvas);
        }
    }
    
    public void setEmojiCode(final int c) {
        if (this.c != c) {
            this.c = c;
            this.setTag((Object)c);
            this.a = null;
        }
    }
}
