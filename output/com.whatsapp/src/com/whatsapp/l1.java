// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewTreeObserver;
import android.view.Display;
import com.whatsapp.util.Log;
import android.content.res.Configuration;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.widget.RelativeLayout;
import android.content.Context;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.ImageButton;
import android.widget.PopupWindow;

public class l1 extends PopupWindow
{
    private static final String[] z;
    private ImageButton a;
    private bi b;
    private boolean c;
    private Activity d;
    private ViewGroup e;
    private eu f;
    private View g;
    private ViewTreeObserver$OnGlobalLayoutListener h;
    private View i;
    private ImageButton j;
    
    static {
        final String[] z2 = new String[9];
        String s = "S^9+\u001ciC91\u0000Fl: \u001bR@5 \u0005Sl>$\u001cQ[\"";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'u';
                        break;
                    }
                    case 0: {
                        c2 = '6';
                        break;
                    }
                    case 1: {
                        c2 = '3';
                        break;
                    }
                    case 2: {
                        c2 = 'V';
                        break;
                    }
                    case 3: {
                        c2 = 'A';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "S^9+\u001ciC91\u0000Fl>$\u001cQ[\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "U\\;o\u0002^R\"2\u0014FC\t1\u0007SU33\u0010XP32";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0016Jl";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "U\\87\u0010D@75\u001cY]3,\u001a\\Z&.\u0005CC!(\u001bR\\!n\u0006^\\!a\u0014T\\ $O";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0016[l";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "U\\;o\u0002^R\"2\u0014FC\t1\u0007SU33\u0010XP32";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "S^9+\u001ciC91\u0000Fl: \u001bR@5 \u0005Sl>$\u001cQ[\"";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "S^9+\u001ciC91\u0000Fl>$\u001cQ[\"";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public l1(final Activity d) {
        super((Context)d);
        this.h = (ViewTreeObserver$OnGlobalLayoutListener)new a_o(this);
        this.d = d;
    }
    
    static Activity a(final l1 l1) {
        return l1.d;
    }
    
    private void a() {
        vc.b();
        final RelativeLayout contentView = new RelativeLayout((Context)this.d);
        alm.a(this.d.getLayoutInflater(), 2130903152, (ViewGroup)contentView, true);
        this.e = (ViewGroup)contentView.findViewById(2131755551);
        this.e.getLayoutParams().height = -1;
        this.e.setVisibility(0);
        if (alm.c) {
            contentView.setLayoutDirection(3);
        }
        this.setContentView((View)contentView);
        this.setWidth(-1);
        this.setHeight(-2);
        this.setBackgroundDrawable((Drawable)new BitmapDrawable());
        this.setTouchInterceptor((View$OnTouchListener)new zc(this));
        this.setTouchable(true);
        this.setFocusable(false);
        this.setOutsideTouchable(true);
        this.setInputMethodMode(2);
        (this.b = new bi((Context)this.d, this.e)).b(this.d.getWindowManager().getDefaultDisplay().getWidth() / this.d.getResources().getDimensionPixelSize(2131361909));
        this.b.a(true);
        this.b.a(this.f);
    }
    
    private void a(final int n) {
        String s;
        if (this.d.getResources().getConfiguration().orientation == 2) {
            s = l1.z[7];
        }
        else {
            s = l1.z[8];
        }
        App.aq.getSharedPreferences(l1.z[6], 0).edit().putInt(s, n).commit();
    }
    
    static void a(final l1 l1, final int n) {
        l1.a(n);
    }
    
    static boolean a(final l1 l1, final boolean c) {
        return l1.c = c;
    }
    
    static ImageButton b(final l1 l1) {
        return l1.a;
    }
    
    static View c(final l1 l1) {
        return l1.i;
    }
    
    static View d(final l1 l1) {
        return l1.g;
    }
    
    public void a(final Configuration configuration) {
        if (this.b != null) {
            vc.b();
            this.b.b(this.d.getWindowManager().getDefaultDisplay().getWidth() / this.d.getResources().getDimensionPixelSize(2131361909));
        }
    }
    
    public void a(final View i, final ImageButton a, final ImageButton j, final View g) {
        if (this.b == null) {
            this.a();
        }
        if (this.i != null) {
            this.i.getViewTreeObserver().removeGlobalOnLayoutListener(this.h);
        }
        this.i = i;
        this.a = a;
        this.j = j;
        this.g = g;
        this.a.setImageResource(2130838879);
        final vc b = vc.b();
        final int height = i.getHeight();
        final int[] array = new int[2];
        i.getLocationOnScreen(array);
        int n = 0 + (height + array[1]);
        final Display defaultDisplay = this.d.getWindowManager().getDefaultDisplay();
        final int width = defaultDisplay.getWidth();
        final boolean b2 = defaultDisplay.getHeight() - n < 128.0f * b.b;
        int n2 = 0;
        Label_0212: {
            if (b2) {
                n2 = (int)Math.min(240.0f * b.b, defaultDisplay.getHeight());
                this.setHeight(n2);
                n -= n2 + height;
                if (!App.I) {
                    break Label_0212;
                }
            }
            n2 = defaultDisplay.getHeight() - n;
            this.setHeight(n2);
            this.a(n2);
        }
        final int n3 = n2;
        final int n4 = n;
        this.setWidth(width);
        final ViewTreeObserver viewTreeObserver = this.i.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.h);
        }
        Log.i(l1.z[4] + b2 + l1.z[3] + n4 + l1.z[5] + n3);
        this.showAtLocation(i, 51, 0, n4);
        this.b.b(width / this.d.getResources().getDimensionPixelSize(2131361909));
    }
    
    public void a(final eu f) {
        this.f = f;
        if (this.b != null) {
            this.b.a(f);
        }
    }
    
    public void a(final boolean c) {
        this.c = c;
    }
    
    public int b() {
        String s;
        if (this.d.getResources().getConfiguration().orientation == 2) {
            s = l1.z[0];
        }
        else {
            s = l1.z[1];
        }
        return App.aq.getSharedPreferences(l1.z[2], 0).getInt(s, 0);
    }
    
    public boolean c() {
        return this.c;
    }
    
    public void dismiss() {
        if (this.i != null) {
            this.i.getViewTreeObserver().removeGlobalOnLayoutListener(this.h);
        }
        if (this.a != null) {
            this.a.setImageResource(2130838877);
        }
        super.dismiss();
    }
}
