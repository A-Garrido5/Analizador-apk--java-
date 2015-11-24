// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.b9;
import android.content.Context;
import com.whatsapp.fieldstats.a5;
import android.text.TextWatcher;
import android.text.InputFilter;
import android.view.View$OnClickListener;
import android.widget.RatingBar$OnRatingBarChangeListener;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.RatingBar;
import com.whatsapp.fieldstats.Events$Call;
import android.view.View;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;

public class CallRatingActivity extends AppCompatActivity
{
    private static CallRatingActivity e;
    private static int f;
    private static int h;
    public static String j;
    public static String l;
    private static final String[] z;
    private EditText c;
    private View d;
    private Events$Call g;
    private RatingBar i;
    private TextView k;
    private boolean m;
    
    static {
        int n = -1;
        final String[] z2 = new String[2];
        int n2 = 0;
        String[] array = z2;
        String s = "\u001d\u001e\"<T\u001f\u000b'>A\u001f\u001c:9P\u0017\u000b7\u007fE\f\u001a/$C";
        int n3 = n;
        String intern = null;
    Label_0095:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n4 = 0; i > n4; ++n4) {
                final char c = charArray[n4];
                char c2 = '\0';
                switch (n4 % 5) {
                    default: {
                        c2 = '&';
                        break;
                    }
                    case 0: {
                        c2 = '~';
                        break;
                    }
                    case 1: {
                        c2 = '\u007f';
                        break;
                    }
                    case 2: {
                        c2 = 'N';
                        break;
                    }
                    case 3: {
                        c2 = 'P';
                        break;
                    }
                }
                charArray[n4] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u001d\u001e\"<T\u001f\u000b'>A\u001f\u001c:9P\u0017\u000b7\u007fB\u001b\f:\"I\u0007";
                    n3 = 0;
                    continue;
                }
                case 0: {
                    break Label_0095;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        String s2 = "\u001b\t+>R";
        String intern2 = null;
    Label_0361:
        while (true) {
            final char[] charArray2 = s2.toCharArray();
            for (int j = charArray2.length, n5 = 0; j > n5; ++n5) {
                final char c3 = charArray2[n5];
                char c4 = '\0';
                switch (n5 % 5) {
                    default: {
                        c4 = '&';
                        break;
                    }
                    case 0: {
                        c4 = '~';
                        break;
                    }
                    case 1: {
                        c4 = '\u007f';
                        break;
                    }
                    case 2: {
                        c4 = 'N';
                        break;
                    }
                    case 3: {
                        c4 = 'P';
                        break;
                    }
                }
                charArray2[n5] = (char)(c4 ^ c3);
            }
            intern2 = new String(charArray2).intern();
            switch (n) {
                default: {
                    CallRatingActivity.l = intern2;
                    s2 = "\u000b\u000f\"?G\u001a9'5J\u001a,:1R";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0361;
                }
            }
        }
        CallRatingActivity.j = intern2;
        CallRatingActivity.h = 3;
        CallRatingActivity.f = 1024;
    }
    
    static EditText a(final CallRatingActivity callRatingActivity) {
        return callRatingActivity.c;
    }
    
    public static void a() {
        if (CallRatingActivity.e != null) {
            App.aq.a5().post((Runnable)new a8m());
        }
    }
    
    static int b() {
        return CallRatingActivity.f;
    }
    
    static void b(final CallRatingActivity callRatingActivity) {
        callRatingActivity.c();
    }
    
    static RatingBar c(final CallRatingActivity callRatingActivity) {
        return callRatingActivity.i;
    }
    
    private void c() {
        final int n = (int)this.i.getRating();
        final String trim = this.c.getText().toString().trim();
        final View d = this.d;
        boolean enabled = false;
        Label_0061: {
            if (n <= 0) {
                final int codePointCount = trim.codePointCount(0, trim.length());
                final int h = CallRatingActivity.h;
                enabled = false;
                if (codePointCount < h) {
                    break Label_0061;
                }
            }
            enabled = true;
        }
        d.setEnabled(enabled);
    }
    
    static CallRatingActivity d() {
        return CallRatingActivity.e;
    }
    
    static Events$Call d(final CallRatingActivity callRatingActivity) {
        return callRatingActivity.g;
    }
    
    static TextView e(final CallRatingActivity callRatingActivity) {
        return callRatingActivity.k;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        Log.i(CallRatingActivity.z[0]);
        super.onCreate(bundle);
        this.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(this.getResources().getColor(2131624024)));
        if (this.getIntent().getBundleExtra(CallRatingActivity.l) != null) {
            aam.a(this.g = new Events$Call(), this.getIntent().getBundleExtra(CallRatingActivity.l));
            this.m = this.getIntent().getBooleanExtra(CallRatingActivity.j, false);
        }
        this.setContentView(alm.a(this.getLayoutInflater(), 2130903085, null, false));
        this.c = (EditText)this.findViewById(2131755302);
        this.i = (RatingBar)this.findViewById(2131755301);
        this.k = (TextView)this.findViewById(2131755300);
        (this.d = this.findViewById(2131755304)).setEnabled(false);
        this.i.setOnRatingBarChangeListener((RatingBar$OnRatingBarChangeListener)new a_i(this));
        this.findViewById(2131755303).setOnClickListener((View$OnClickListener)new a0s(this));
        this.d.setOnClickListener((View$OnClickListener)new a0h(this));
        this.c.setFilters(new InputFilter[] { new aw8(CallRatingActivity.f) });
        this.c.addTextChangedListener((TextWatcher)new n(this));
        CallRatingActivity.e = this;
    }
    
    public void onDestroy() {
        Log.i(CallRatingActivity.z[1]);
        super.onDestroy();
        CallRatingActivity.e = null;
        if (this.g != null) {
            a5.a((Context)App.aq, this.g);
            if (this.m) {
                aam.b();
            }
        }
    }
}
