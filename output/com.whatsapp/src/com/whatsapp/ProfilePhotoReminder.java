// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View$OnClickListener;
import android.content.Context;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.content.res.Configuration;
import android.app.Activity;
import android.content.Intent;
import java.util.Collection;
import android.graphics.Bitmap$Config;
import android.widget.TextView;
import android.os.Handler;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.EditText;

public class ProfilePhotoReminder extends DialogToastActivity implements aws
{
    public static boolean l;
    private static final String[] z;
    private n7 k;
    private EditText m;
    private Runnable n;
    private ImageView o;
    private View p;
    private Bitmap q;
    private eu r;
    private a_9 s;
    private Handler t;
    private TextView u;
    
    static {
        final String[] z2 = new String[7];
        String s = "6\u001e}kf*\tbe`2\u0003`hb/\u0002vh}i\bw~{4\u0003k";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000f';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = 'l';
                        break;
                    }
                    case 2: {
                        c2 = '\u0012';
                        break;
                    }
                    case 3: {
                        c2 = '\r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "6\u001e}kf*\tbe`2\u0003`hb/\u0002vh}i\u000f~bl-Ae\u007f`(\u000b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "%\u0003|{j4\u001fsyf)\u0002a-m)\u0019|njf\u0018}-b'\u0005|";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "6\u001e}kf*\tbe`2\u0003`hb/\u0002vh}i\u000f`hn2\t=c`k\u0001w";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "6\u001e}kf*\tbe`2\u0003`hb/\u0002vh}i\u000f`hn2\t";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "6\u001e}kf*\tbe`2\u0003`hb/\u0002vh}i\u001fe j>\u001c{\u007fj\"";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "/\u001fM\u007fj5\tf";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ProfilePhotoReminder() {
        this.r = new no(this);
    }
    
    static TextView a(final ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.u;
    }
    
    private void a(final Bitmap imageBitmap) {
        this.o.setImageBitmap(imageBitmap);
    }
    
    static a_9 b(final ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.s;
    }
    
    private void b() {
        this.p.setVisibility(8);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131361949);
        final float dimension = this.getResources().getDimension(2131361813);
        Bitmap bitmap;
        if (_r.a(this.s.u)) {
            this.o.setEnabled(false);
            this.p.setVisibility(0);
            if (this.q == null) {
                this.q = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap$Config.ALPHA_8);
            }
            bitmap = this.q;
        }
        else {
            this.o.setEnabled(true);
            this.p.setVisibility(4);
            bitmap = this.s.a(dimensionPixelSize, dimension, false);
            if (bitmap == null) {
                Label_0217: {
                    if (this.s.q == 0 && this.s.v == 0) {
                        this.p.setVisibility(0);
                        if (this.t == null) {
                            this.t = new Handler();
                            this.n = new aa_(this);
                        }
                        this.t.removeCallbacks(this.n);
                        this.t.postDelayed(this.n, 30000L);
                        if (!App.I) {
                            break Label_0217;
                        }
                    }
                    this.p.setVisibility(4);
                }
                bitmap = a_9.a(2130837599, dimensionPixelSize, dimension);
            }
        }
        this.a(bitmap);
    }
    
    static EditText c(final ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.m;
    }
    
    static View d(final ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.p;
    }
    
    static n7 e(final ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.k;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String s) {
        if (this.s != null && s.equals(this.s.u)) {
            this.s = App.S.e();
            this.b();
        }
    }
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    public void d(final String s) {
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final boolean i = App.I;
        Label_0090: {
            switch (n) {
                case 12: {
                    if (n2 != -1) {
                        break;
                    }
                    if (intent != null && intent.getBooleanExtra(ProfilePhotoReminder.z[6], false)) {
                        this.p.setVisibility(0);
                        qp.b(this.s, this);
                        if (!i) {
                            break;
                        }
                    }
                    qp.a(intent, this.s, this, 13, this);
                    if (i) {
                        break Label_0090;
                    }
                    break;
                }
                case 13: {
                    qp.b().delete();
                    if (n2 == -1) {
                        if (!qp.a(this.s, this)) {
                            break;
                        }
                        this.p.setVisibility(0);
                        if (!i) {
                            break;
                        }
                    }
                    if (n2 == 0 && intent != null) {
                        qp.a(intent, this);
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
        this.k.a(configuration);
    }
    
    public void onCreate(final Bundle bundle) {
        Log.i(ProfilePhotoReminder.z[4]);
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayShowCustomEnabled(true);
        this.setContentView(2130903206);
        this.s = App.S.e();
        if (this.s == null) {
            Log.i(ProfilePhotoReminder.z[3]);
            App.F(ProfilePhotoReminder.z[2]);
            this.startActivity(new Intent((Context)this, (Class)Main.class));
            this.finish();
            return;
        }
        (this.u = (TextView)this.findViewById(2131755727)).setText((CharSequence)Integer.toString(25));
        this.findViewById(2131755548).setOnClickListener((View$OnClickListener)new a61(this));
        (this.k = new n7(this)).a(this.r);
        (this.o = (ImageView)this.findViewById(2131755691)).setOnClickListener((View$OnClickListener)new z5(this));
        a81.a(this, this.getSupportActionBar(), this.getString(2131231410), (View$OnClickListener)new ar(this));
        this.p = this.findViewById(2131755433);
        this.b();
        alm.a(this.m = (EditText)this.findViewById(2131755724));
        this.m.addTextChangedListener((TextWatcher)new m8(this));
        this.m.setFilters(new InputFilter[] { new InputFilter$LengthFilter(25) });
        final String q = App.q((Context)this);
        this.m.setText((CharSequence)q);
        alm.a((TextView)this.m, q);
        this.m.setSelection(this.m.length());
        Label_0371: {
            if (App.aq.D()) {
                Log.w(ProfilePhotoReminder.z[1]);
                this.a();
                if (!App.I) {
                    break Label_0371;
                }
            }
            if (App.w()) {
                Log.w(ProfilePhotoReminder.z[5]);
                this.d();
            }
        }
        App.b((aws)this);
    }
    
    public void onDestroy() {
        super.onDestroy();
        Log.i(ProfilePhotoReminder.z[0]);
        if (this.s != null) {
            App.a((aws)this);
        }
        if (this.t != null) {
            this.t.removeCallbacks(this.n);
        }
    }
}
