// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.TextWatcher;
import android.text.InputFilter;
import android.view.View$OnClickListener;
import com.whatsapp.fieldstats.aq;
import android.os.Bundle;
import android.content.res.Configuration;
import java.util.Collection;
import java.util.Arrays;
import android.app.Activity;
import android.content.Intent;
import com.whatsapp.util.bm;
import com.whatsapp.util.Log;
import android.content.Context;
import com.whatsapp.util.cq;
import java.util.Vector;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageView;

public class NewGroup extends DialogToastActivity
{
    private static final String[] z;
    private ImageView k;
    private EditText l;
    private a_9 m;
    private eu n;
    private TextView o;
    private n7 p;
    
    static {
        final String[] z2 = new String[9];
        String s = "Aa8\u0019 @q?Q1]a.\n7";
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
                        c2 = 'R';
                        break;
                    }
                    case 0: {
                        c2 = '/';
                        break;
                    }
                    case 1: {
                        c2 = '\u0004';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = '~';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Fw\u0010\f7\\a;";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Aa8\u0019 @q?Q1]k?\u000e:@p ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Aa8\u0019 @q?Q Jw*\n\"Gk;\u0011";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "Aa8\u0019 @q?Q\"Gk;\u0011\"Fg$\u001b6";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "Em+\r";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Aa8\u0019 @q?Q5@$,\f7Np*^5]k:\u000eh";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Aa8\u0019 @q?Q<@$!\u001b&Xk=\u0015rNg,\u001b!\\(o\u00183Fho\n=\u000fg=\u001b3[ao\u0019 @q?";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Aa8\u0019 @q?Q6Jw;\f=V";
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
    
    public NewGroup() {
        this.n = new b_(this);
        this.m = new a_t(this);
    }
    
    static a_9 a(final NewGroup newGroup) {
        return newGroup.m;
    }
    
    private void a(final Vector vector) {
        final String a = cq.a(this.l.getText().toString());
        if (a.codePointCount(0, a.length()) > ym.m) {
            App.a((Context)this, String.format(this.getString(2131231792), ym.m), 0);
            return;
        }
        if (vector.size() == 0) {
            App.a((Context)this, this.getString(2131231428), 0);
            return;
        }
        final String d = adc.d(a);
        adc.a(d, vector);
        Label_0186: {
            if (App.O()) {
                Log.i(NewGroup.z[6] + d);
                App.ak.g(adc.a(d, a, vector, 2));
                bm.a(new x(this, d, a, vector));
                if (!App.I) {
                    break Label_0186;
                }
            }
            Log.i(NewGroup.z[7]);
            App.ak.g(adc.a(d, a, vector, 3));
        }
        this.startActivity(new Intent((Context)this, Main.h()));
        this.finish();
    }
    
    static EditText b(final NewGroup newGroup) {
        return newGroup.l;
    }
    
    static n7 c(final NewGroup newGroup) {
        return newGroup.p;
    }
    
    static TextView d(final NewGroup newGroup) {
        return newGroup.o;
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final boolean i = App.I;
        Label_0204: {
            switch (n) {
                case 12: {
                    if (n2 != -1) {
                        break;
                    }
                    if (intent != null && intent.getBooleanExtra(NewGroup.z[1], false)) {
                        Log.i(NewGroup.z[3]);
                        this.m.b().delete();
                        this.m.y().delete();
                        this.k.setImageResource(2130837602);
                        if (!i) {
                            break;
                        }
                    }
                    Log.i(NewGroup.z[2]);
                    qp.a(intent, this.m, this, 13, this);
                    if (i) {
                        break Label_0204;
                    }
                    break;
                }
                case 13: {
                    qp.b().delete();
                    if (n2 == -1) {
                        Log.i(NewGroup.z[4]);
                        this.k.setImageBitmap(this.m.a(this.getResources().getDimensionPixelSize(2131361949), 0.0f, false));
                        if (!i) {
                            break;
                        }
                    }
                    if (n2 != 0 || intent == null) {
                        break;
                    }
                    qp.a(intent, this);
                    if (i) {
                        break Label_0204;
                    }
                    break;
                }
                case 1: {
                    if (n2 == -1) {
                        this.a(new Vector((Collection<? extends E>)Arrays.asList(intent.getStringExtra(NewGroup.z[5]).split(","))));
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.p.a(configuration);
    }
    
    public void onCreate(final Bundle bundle) {
        Log.i(NewGroup.z[0]);
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowCustomEnabled(true);
        this.setContentView(2130903198);
        aam.a(aq.NEW_GROUP);
        (this.k = (ImageView)this.findViewById(2131755691)).setOnClickListener((View$OnClickListener)new h3(this));
        if (bundle == null) {
            this.m.b().delete();
            this.m.y().delete();
        }
        (this.o = (TextView)this.findViewById(2131755692)).setText((CharSequence)Integer.toString(ym.m));
        this.findViewById(2131755548).setOnClickListener((View$OnClickListener)new id(this));
        (this.p = new n7(this)).a(this.n);
        this.k.setImageResource(2130837602);
        alm.a(this.l = (EditText)this.findViewById(2131755658));
        this.l.setFilters(new InputFilter[] { new aw8(ym.m) });
        this.l.addTextChangedListener((TextWatcher)new a9n(this));
        a81.a(this, this.getSupportActionBar(), this.getString(2131231410), (View$OnClickListener)new ale(this));
    }
    
    public void onDestroy() {
        Log.i(NewGroup.z[8]);
        super.onDestroy();
    }
}
