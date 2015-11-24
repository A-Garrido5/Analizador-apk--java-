// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.TextView;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.view.View$OnClickListener;
import android.os.Handler;
import android.app.Activity;
import android.widget.ImageView;

abstract class ahl extends ahw
{
    private static final String[] z;
    private final int[] c;
    private int d;
    Runnable e;
    private ImageView[] f;
    private Activity g;
    private final Handler h;
    
    static {
        final String[] z2 = new String[3];
        String s = "\rI?.1";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'E';
                        break;
                    }
                    case 0: {
                        c2 = '_';
                        break;
                    }
                    case 1: {
                        c2 = ',';
                        break;
                    }
                    case 2: {
                        c2 = 'L';
                        break;
                    }
                    case 3: {
                        c2 = 'K';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ",X-? ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = ",X-? ";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ahl(final Activity g) {
        super(g, 2130903080);
        this.h = new Handler();
        this.d = 0;
        this.c = new int[] { 2131755182, 2131755183, 2131755184, 2131755185, 2131755186 };
        this.e = new wr(this);
        this.g = g;
    }
    
    static int[] a(final ahl ahl) {
        return ahl.c;
    }
    
    static int b(final ahl ahl) {
        return ahl.d;
    }
    
    static Handler c(final ahl ahl) {
        return ahl.h;
    }
    
    static ImageView[] d(final ahl ahl) {
        return ahl.f;
    }
    
    @Override
    public void a() {
        if (this.g.getResources().getConfiguration().orientation == 1) {
            this.findViewById(2131755280).setVisibility(0);
            this.findViewById(2131755283).setVisibility(0);
            if (!App.I) {
                return;
            }
        }
        this.findViewById(2131755280).setVisibility(8);
        this.findViewById(2131755283).setVisibility(8);
    }
    
    protected void a(final int d) {
        final boolean i = App.I;
        Label_0434: {
            switch (this.d = d) {
                case 1: {
                    this.f = new ImageView[this.c.length];
                    int n;
                    for (int j = 0; j < this.c.length; j = n) {
                        (this.f[j] = (ImageView)this.findViewById(this.c[j])).setVisibility(0);
                        this.f[j].setImageDrawable(this.g.getResources().getDrawable(2130837763).mutate());
                        n = j + 1;
                        if (i) {
                            break;
                        }
                    }
                    this.findViewById(2131755190).setVisibility(0);
                    this.findViewById(2131755286).setVisibility(0);
                    this.findViewById(2131755286).setOnClickListener((View$OnClickListener)null);
                    this.findViewById(2131755286).setClickable(false);
                    ((Button)this.findViewById(2131755286)).setText(2131231371);
                    this.findViewById(2131755288).setVisibility(8);
                    this.findViewById(2131755289).setVisibility(0);
                    final vc b = vc.b();
                    final View viewById = this.findViewById(2131755190);
                    final TranslateAnimation translateAnimation = new TranslateAnimation(-50.0f * b.b, 0.0f, 0.0f, 0.0f);
                    ((Animation)translateAnimation).setDuration(200L);
                    viewById.startAnimation((Animation)translateAnimation);
                    final View viewById2 = this.findViewById(2131755282);
                    final TranslateAnimation translateAnimation2 = new TranslateAnimation(50.0f * b.b, 0.0f, 0.0f, 0.0f);
                    ((Animation)translateAnimation2).setDuration(200L);
                    viewById2.startAnimation((Animation)translateAnimation2);
                    this.h.removeCallbacks(this.e);
                    this.h.postDelayed(this.e, 500L);
                    if (!false) {
                        final AlphaAnimation[] array = new AlphaAnimation[this.c.length];
                        int k = 0;
                        while (k < this.f.length) {
                            ((Animation)(array[k] = new AlphaAnimation(1.0f, 0.0f))).setDuration(50L);
                            ((Animation)array[k]).setFillAfter(true);
                            this.f[k].startAnimation((Animation)array[k]);
                            ++k;
                            if (i) {
                                break;
                            }
                        }
                    }
                    ((TextView)this.findViewById(2131755284)).setVisibility(4);
                    ((TextView)this.findViewById(2131755285)).setVisibility(4);
                    if (i) {
                        break Label_0434;
                    }
                    break;
                }
                case 2: {
                    int l = 0;
                    while (l < this.c.length) {
                        this.findViewById(this.c[l]).setVisibility(8);
                        ++l;
                        if (i) {
                            break;
                        }
                    }
                    final vc b2 = vc.b();
                    final View viewById3 = this.findViewById(2131755190);
                    final TranslateAnimation translateAnimation3 = new TranslateAnimation(50.0f * b2.b, 0.0f, 0.0f, 0.0f);
                    ((Animation)translateAnimation3).setDuration(200L);
                    viewById3.startAnimation((Animation)translateAnimation3);
                    final View viewById4 = this.findViewById(2131755282);
                    final AnimationSet set = new AnimationSet(true);
                    set.addAnimation((Animation)new TranslateAnimation(-50.0f * b2.b, 0.0f, 0.0f, 0.0f));
                    set.addAnimation((Animation)new AlphaAnimation(1.0f, 0.0f));
                    set.setDuration(200L);
                    viewById4.startAnimation((Animation)set);
                    this.findViewById(2131755282).setVisibility(8);
                    this.findViewById(2131755190).setVisibility(0);
                    this.findViewById(2131755286).setVisibility(8);
                    this.findViewById(2131755288).setVisibility(4);
                    this.findViewById(2131755287).setVisibility(0);
                    this.findViewById(2131755289).setVisibility(8);
                    final TextView textView = (TextView)this.findViewById(2131755284);
                    textView.setText(2131231534);
                    textView.setVisibility(0);
                    final TextView textView2 = (TextView)this.findViewById(2131755285);
                    textView2.setText((CharSequence)App.C.a(2131296295, App.ak.G(), new Object[] { App.ak.G() }));
                    textView2.setVisibility(0);
                }
            }
        }
    }
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract void d();
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.findViewById(2131755286).setOnClickListener((View$OnClickListener)new aop(this));
        this.findViewById(2131755288).setOnClickListener((View$OnClickListener)new a90(this));
        this.findViewById(2131755287).setOnClickListener((View$OnClickListener)new ri(this));
        Label_0121: {
            if (this.g.getResources().getConfiguration().orientation == 1) {
                this.findViewById(2131755280).setVisibility(0);
                this.findViewById(2131755283).setVisibility(0);
                if (!App.I) {
                    break Label_0121;
                }
            }
            this.findViewById(2131755280).setVisibility(8);
            this.findViewById(2131755283).setVisibility(8);
        }
        int int1 = 0;
        if (bundle != null) {
            int1 = bundle.getInt(ahl.z[1]);
        }
        this.a(int1);
        this.getWindow().setSoftInputMode(3);
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        if (App.aV == 3) {
            menu.add(0, 0, 0, (CharSequence)ahl.z[0]);
        }
        return true;
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 0: {
                App.k((Context)this.g);
                return true;
            }
        }
    }
    
    public Bundle onSaveInstanceState() {
        final Bundle onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            onSaveInstanceState.putInt(ahl.z[2], this.d);
        }
        return onSaveInstanceState;
    }
}
