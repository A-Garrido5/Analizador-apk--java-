// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ImageView;
import android.text.TextUtils;
import android.content.Context;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import com.whatsapp.util.Log;
import android.app.Activity;
import android.view.View$OnClickListener;

class ahh extends ahw
{
    private static final String[] z;
    final RegisterName c;
    private int d;
    private boolean e;
    private long f;
    private View$OnClickListener g;
    
    static {
        final String[] z2 = new String[5];
        String s = "ic.\u000e3oc;\t!vcf\u00120\u007fg=\u00023og=\u0002ohr(\u0013%;";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = '\u001b';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "ic.\u000e3oc;\t!vcf\u00149uef\u0001)uo:\u000f%\u007f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "hr(\u0013%";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "hr(\u0013%";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "~~9\u000e2zr \b.Db(\u0013%";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ahh(final RegisterName c) {
        super(this.c = c, 2130903202);
        this.d = 0;
        this.g = (View$OnClickListener)new li(this);
    }
    
    protected void a(final int d) {
        final boolean i = App.I;
        Log.i(ahh.z[0] + d);
        this.d = d;
        if (d == 1 || App.c(this.getContext()) == 3) {
            this.findViewById(2131755705).setVisibility(0);
            this.findViewById(2131755706).setVisibility(8);
            RegisterName.c(this.c);
            if (RegisterName.k(this.c) != null) {
                RegisterName.k(this.c).setVisibility(8);
            }
            RegisterName.f(this.c).removeMessages(0);
            Log.i(ahh.z[1]);
            final j3 j3 = new j3(this);
            this.findViewById(2131755705).setOnClickListener((View$OnClickListener)j3);
            this.findViewById(2131755710).setOnClickListener((View$OnClickListener)j3);
            this.findViewById(2131755709).setOnClickListener((View$OnClickListener)new al7(this));
            this.findViewById(2131755711).setOnClickListener((View$OnClickListener)new ad7(this));
            final View viewById = this.findViewById(2131755697);
            final View viewById2 = this.findViewById(2131755699);
            final View viewById3 = this.findViewById(2131755703);
            final boolean shown = viewById3.isShown();
            if (!this.e) {
                this.e = true;
                viewById.startAnimation((Animation)new awz(this, viewById, viewById2, viewById3, shown));
            }
            viewById.setOnClickListener((View$OnClickListener)new ark(this, viewById, shown, viewById3, viewById2));
            Label_0332: {
                if (this.f < 86400000L) {
                    this.findViewById(2131755708).setVisibility(0);
                    this.findViewById(2131755704).setVisibility(8);
                    if (!i) {
                        break Label_0332;
                    }
                }
                this.findViewById(2131755708).setVisibility(8);
                this.findViewById(2131755704).setVisibility(0);
            }
            if (!i) {
                return;
            }
        }
        this.findViewById(2131755705).setVisibility(8);
        this.findViewById(2131755706).setVisibility(0);
    }
    
    public void b() {
        RegisterName.a(this.c, this.findViewById(2131755696));
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        super.onCreate(bundle);
        this.getWindow().setFormat(1);
        this.getWindow().addFlags(4096);
        this.getWindow().setSoftInputMode(3);
        final TextView textView = (TextView)this.findViewById(2131755161);
        textView.setPaintFlags(0x8 | textView.getPaintFlags());
        textView.setOnClickListener(this.g);
        textView.setOnTouchListener(RegisterName.d(this.c));
        final TextView textView2 = (TextView)this.findViewById(2131755703);
        long a = ade.a(ahh.z[4]);
        if (a == 0L) {
            a = 31536000000L + System.currentTimeMillis();
        }
        this.f = a - System.currentTimeMillis();
        final int j = App.i((Context)this.c);
        while (true) {
            String s = null;
            Label_0898: {
                if (a >= 4444444444000L) {
                    s = this.c.getString(2131231267);
                    textView2.setVisibility(4);
                    if (!i) {
                        break Label_0898;
                    }
                }
                if (this.f >= 31104000000L) {
                    final int n = (int)(this.f / 31536000000L);
                    int n2;
                    if (n == 0) {
                        n2 = 1;
                    }
                    else {
                        n2 = n;
                    }
                    int n3;
                    if (j == 0) {
                        n3 = 2131296303;
                    }
                    else {
                        n3 = 2131296304;
                    }
                    s = String.format(App.C.a(n3, n2), n2);
                    if (!i) {
                        break Label_0898;
                    }
                }
                if (this.f >= 2592000000L) {
                    final int n4 = (int)(this.f / 2592000000L);
                    int n5;
                    if (j == 0) {
                        n5 = 2131296282;
                    }
                    else {
                        n5 = 2131296283;
                    }
                    s = String.format(App.C.a(n5, n4), n4);
                    if (!i) {
                        break Label_0898;
                    }
                }
                if (this.f >= 86400000L) {
                    final int n6 = (int)(this.f / 86400000L);
                    int n7;
                    if (j == 0) {
                        n7 = 2131296266;
                    }
                    else {
                        n7 = 2131296267;
                    }
                    s = String.format(App.C.a(n7, n6), n6);
                    if (!i) {
                        break Label_0898;
                    }
                }
                if (this.f > 0L) {
                    s = this.c.getString(2131231648);
                    if (!i) {
                        break Label_0898;
                    }
                }
                final String string = this.c.getString(2131231647);
                final TextView textView3 = (TextView)this.findViewById(2131755701);
                int n8 = 0;
                Label_0737: {
                    if (textView3 != null) {
                        final int index = string.indexOf(10, 0);
                        final int index2 = string.indexOf(10, index + 1);
                        String substring;
                        if (index > 0) {
                            substring = string.substring(0, index);
                        }
                        else {
                            substring = "";
                        }
                        String text;
                        if (index2 > index) {
                            text = string.substring(index + 1, index2);
                        }
                        else {
                            text = string.substring(index + 1);
                        }
                        String substring2;
                        if (index2 > 0) {
                            substring2 = string.substring(index2 + 1);
                        }
                        else {
                            substring2 = "";
                        }
                        final TextView textView4 = (TextView)this.findViewById(2131755700);
                        final TextView textView5 = (TextView)this.findViewById(2131755702);
                        Label_0561: {
                            if (!TextUtils.isEmpty((CharSequence)substring)) {
                                textView4.setText((CharSequence)substring);
                                if (!i) {
                                    break Label_0561;
                                }
                            }
                            textView4.setVisibility(8);
                        }
                        Label_0587: {
                            if (!TextUtils.isEmpty((CharSequence)text)) {
                                textView3.setText((CharSequence)text);
                                if (!i) {
                                    break Label_0587;
                                }
                            }
                            textView3.setVisibility(8);
                        }
                        Label_0613: {
                            if (!TextUtils.isEmpty((CharSequence)substring2)) {
                                textView5.setText((CharSequence)substring2);
                                if (!i) {
                                    break Label_0613;
                                }
                            }
                            textView5.setVisibility(8);
                        }
                        Label_0670: {
                            if (this.f < 86400000L) {
                                ((ImageView)this.findViewById(2131755698)).setImageResource(2130838679);
                                n8 = 2131231644;
                                textView2.setPadding(0, 0, 0, (int)(textView2.getTextSize() / 2.0f));
                                if (!i) {
                                    break Label_0670;
                                }
                            }
                            n8 = 2131231645;
                        }
                        if (!i) {
                            break Label_0737;
                        }
                    }
                    ((TextView)this.findViewById(2131755700)).setText((CharSequence)string.replace('\n', ' '));
                    if (this.f < 86400000L) {
                        ((ImageView)this.findViewById(2131755698)).setImageResource(2130838680);
                        n8 = 2131231644;
                        if (!i) {
                            break Label_0737;
                        }
                    }
                    n8 = 2131231645;
                }
                final String p = App.p((Context)this.c);
                if (p != null) {
                    textView2.setText((CharSequence)this.c.getString(n8, new Object[] { p }));
                }
                int int1;
                if (bundle == null) {
                    int1 = 0;
                }
                else {
                    int1 = bundle.getInt(ahh.z[3]);
                }
                this.a(int1);
                RegisterName.a(this.c, this.findViewById(2131755696));
                if (RegisterName.k(this.c) != null) {
                    RegisterName.k(this.c).setOnClickListener((View$OnClickListener)new a6h(this));
                }
                return;
            }
            final String string = s;
            continue;
        }
    }
    
    public Bundle onSaveInstanceState() {
        final Bundle onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            onSaveInstanceState.putInt(ahh.z[2], this.d);
        }
        return onSaveInstanceState;
    }
}
