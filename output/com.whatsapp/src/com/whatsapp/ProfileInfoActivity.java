// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.view.View$OnClickListener;
import com.whatsapp.util.cq;
import com.whatsapp.fieldstats.aq;
import android.content.Context;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import java.util.Collection;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;

public class ProfileInfoActivity extends DialogToastActivity implements aws
{
    private static final String[] z;
    private Handler k;
    private TextView l;
    private ImageView m;
    private boolean n;
    private a_9 o;
    private View p;
    private Runnable q;
    
    static {
        final String[] z2 = new String[7];
        String s = " '^d_:1u";
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
                        c2 = ':';
                        break;
                    }
                    case 0: {
                        c2 = 'I';
                        break;
                    }
                    case 1: {
                        c2 = 'T';
                        break;
                    }
                    case 2: {
                        c2 = '\u0001';
                        break;
                    }
                    case 3: {
                        c2 = '\u0016';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "9&npS%1hx\\&{esI=&no";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "*;o`_;'`bS&:r6X&!ou_i n6W(=o";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "9&npS%1hx\\&{bd_( d9T&yls";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "9&npS%1hx\\&{bd_( d";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "(6ndN :f6^<1!bUi:`bS?1!zS+&`dS,'!{S:'hx]";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "(:edU 0/\u007fT=1ob\u0014(7u\u007fU'z@Bn\b\u0017II~\b\u0000@";
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
    
    static View a(final ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.p;
    }
    
    private void b() {
        final boolean i = App.I;
        this.p.setVisibility(8);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131361943);
        final float n = 6.0f * dimensionPixelSize / Math.min(this.getWindowManager().getDefaultDisplay().getWidth(), this.getWindowManager().getDefaultDisplay().getHeight());
        Label_0110: {
            if (_r.a(this.o.u)) {
                this.m.setEnabled(false);
                this.p.setVisibility(0);
                if (!i) {
                    break Label_0110;
                }
            }
            this.m.setEnabled(true);
            this.p.setVisibility(4);
        }
        Bitmap imageBitmap = this.o.a(dimensionPixelSize, n, false);
        Label_0248: {
            if (imageBitmap == null) {
                Label_0224: {
                    if (this.o.q == 0 && this.o.v == 0) {
                        this.p.setVisibility(0);
                        if (this.k == null) {
                            this.k = new Handler();
                            this.q = new w1(this);
                        }
                        this.k.removeCallbacks(this.q);
                        this.k.postDelayed(this.q, 30000L);
                        if (!i) {
                            break Label_0224;
                        }
                    }
                    this.p.setVisibility(4);
                }
                imageBitmap = a_9.a(2130837601, dimensionPixelSize, n);
                this.n = false;
                if (!i) {
                    break Label_0248;
                }
            }
            this.n = true;
        }
        this.m.setImageBitmap(imageBitmap);
    }
    
    static boolean b(final ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.n;
    }
    
    static a_9 c(final ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.o;
    }
    
    static TextView d(final ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.l;
    }
    
    static ImageView e(final ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.m;
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
        if (this.o != null && s.equals(this.o.u)) {
            this.o = App.S.e();
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
        Label_0089: {
            switch (n) {
                case 12: {
                    if (n2 != -1) {
                        break;
                    }
                    if (intent != null && intent.getBooleanExtra(ProfileInfoActivity.z[0], false)) {
                        this.p.setVisibility(0);
                        qp.b(this.o, this);
                        if (!i) {
                            break;
                        }
                    }
                    qp.a(intent, this.o, this, 13, this);
                    if (i) {
                        break Label_0089;
                    }
                    break;
                }
                case 13: {
                    qp.b().delete();
                    if (n2 == -1) {
                        if (!qp.a(this.o, this)) {
                            break;
                        }
                        this.b();
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
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Log.i(ProfileInfoActivity.z[4]);
        if (!WhatsAppLibLoader.a(null)) {
            Log.i(ProfileInfoActivity.z[5]);
            this.finish();
        }
        else {
            this.setContentView(2130903205);
            aam.a(aq.PROFILE);
            this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            this.o = App.S.e();
            if (this.o == null) {
                Log.i(ProfileInfoActivity.z[3]);
                App.F(ProfileInfoActivity.z[2]);
                this.startActivity(new Intent((Context)this, (Class)Main.class));
                this.finish();
                return;
            }
            (this.l = (TextView)this.findViewById(2131755724)).setText(cq.c(App.q((Context)this), (Context)this));
            this.findViewById(2131755726).setOnClickListener((View$OnClickListener)new q9(this));
            (this.m = (ImageView)this.findViewById(2131755359)).setOnClickListener((View$OnClickListener)new j0(this));
            this.findViewById(2131755691).setOnClickListener((View$OnClickListener)new are(this));
            this.p = this.findViewById(2131755433);
            this.b();
            App.b((aws)this);
            if (ProfileInfoActivity.z[6].equals(this.getIntent().getAction())) {
                qp.a(this.getIntent(), this.o, this, 13, this);
            }
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
        Log.i(ProfileInfoActivity.z[1]);
        if (this.o != null) {
            App.a((aws)this);
        }
        if (this.k != null) {
            this.k.removeCallbacks(this.q);
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
}
