// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.BaseAdapter;

class io extends BaseAdapter
{
    private int a;
    final bi b;
    private Context c;
    
    public io(final bi b, final Context c, final int a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public int getCount() {
        if (bi.c(this.b) == 0) {
            return 0;
        }
        return (-1 + (bi.a()[this.a].a() + bi.c(this.b))) / bi.c(this.b);
    }
    
    public Object getItem(final int n) {
        return null;
    }
    
    public long getItemId(final int n) {
        return 0L;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        LinearLayout linearLayout;
        if (view == null || ((LinearLayout)view).getChildCount() != bi.c(this.b)) {
            linearLayout = new EmojiPicker$EmojiAdapter$1(this, bi.g(this.b));
            int j = 0;
            while (j < bi.c(this.b)) {
                final EmojiPicker$EmojiImageView emojiPicker$EmojiImageView = new EmojiPicker$EmojiImageView(this.b, this.c);
                emojiPicker$EmojiImageView.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(bi.f(this.b), bi.h(this.b)));
                linearLayout.addView((View)emojiPicker$EmojiImageView);
                ++j;
                if (i) {
                    break;
                }
            }
        }
        else {
            linearLayout = (LinearLayout)view;
        }
        int n3;
        for (int k = 0; k < bi.c(this.b); k = n3) {
            final EmojiPicker$EmojiImageView emojiPicker$EmojiImageView2 = (EmojiPicker$EmojiImageView)linearLayout.getChildAt(k);
            final int n2 = k + n * bi.c(this.b);
            Label_0245: {
                if (n2 < bi.a()[this.a].a()) {
                    emojiPicker$EmojiImageView2.setEmojiCode(bi.a()[this.a].a(n2));
                    emojiPicker$EmojiImageView2.setBackgroundDrawable((Drawable)new mm(null));
                    emojiPicker$EmojiImageView2.setClickable(true);
                    emojiPicker$EmojiImageView2.setOnClickListener(bi.b(this.b));
                    if (!i) {
                        break Label_0245;
                    }
                }
                emojiPicker$EmojiImageView2.setEmojiCode(0);
                emojiPicker$EmojiImageView2.setBackgroundDrawable((Drawable)null);
                emojiPicker$EmojiImageView2.setClickable(false);
            }
            n3 = k + 1;
            if (i) {
                break;
            }
        }
        linearLayout.setClickable(false);
        return (View)linearLayout;
    }
}
