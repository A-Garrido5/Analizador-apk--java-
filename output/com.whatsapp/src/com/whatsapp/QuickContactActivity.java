// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Rect;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;
import android.graphics.Paint;
import com.whatsapp.util.cq;
import android.content.Context;
import android.view.View$OnTouchListener;
import android.os.Build$VERSION;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.app.Fragment;
import java.util.Collection;
import android.graphics.Bitmap;
import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import com.whatsapp.util.FloatingChildLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class QuickContactActivity extends DialogToastActivity implements aws
{
    private static final String[] z;
    private a_9 k;
    private TextView l;
    private ImageView m;
    private FloatingChildLayout n;
    
    static {
        final String[] z2 = new String[3];
        String s = "gL:";
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
                        c2 = ']';
                        break;
                    }
                    case 0: {
                        c2 = '\r';
                        break;
                    }
                    case 1: {
                        c2 = '%';
                        break;
                    }
                    case 2: {
                        c2 = '^';
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
                    s = "|P7\u001d6nJ0\n<nQ7\u0010;b\n=\f8lQ;";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "|P7\u001d6nJ0\n<nQ7\u0010;b\n:\u001b.yW1\u0007";
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
    
    static void a(final QuickContactActivity quickContactActivity) {
        quickContactActivity.b();
    }
    
    static void a(final QuickContactActivity quickContactActivity, final boolean b) {
        quickContactActivity.b(b);
    }
    
    static ImageView b(final QuickContactActivity quickContactActivity) {
        return quickContactActivity.m;
    }
    
    private void b() {
        if (this.n.d()) {
            this.b(true);
        }
    }
    
    private void b(final boolean b) {
        this.getSupportLoaderManager().destroyLoader(0);
        if (b) {
            this.n.b();
            if (!this.n.b(new aac(this))) {
                this.finish();
            }
            if (!App.I) {
                return;
            }
        }
        ActivityCompat.finishAfterTransition(this);
    }
    
    static a_9 c(final QuickContactActivity quickContactActivity) {
        return quickContactActivity.k;
    }
    
    static FloatingChildLayout d(final QuickContactActivity quickContactActivity) {
        return quickContactActivity.n;
    }
    
    private void e() {
        final boolean i = App.I;
        final Bitmap a = this.k.a(this.getResources().getDimensionPixelSize(2131361945), 0.0f, false);
        if (a != null) {
            this.m.setImageBitmap(a);
            if (!i) {
                return;
            }
        }
        if (this.k.m()) {
            this.m.setImageResource(2130837603);
            if (!i) {
                return;
            }
        }
        if (this.k.k()) {
            this.m.setImageResource(2130837598);
            if (!i) {
                return;
            }
        }
        this.m.setImageResource(2130837601);
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
        this.e();
    }
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    public void d(final String s) {
    }
    
    public void onAttachFragment(final Fragment fragment) {
    }
    
    @Override
    public void onBackPressed() {
        this.b(true);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        Log.i(QuickContactActivity.z[1]);
        this.getWindow().requestFeature(12);
        super.onCreate(bundle);
        if (Build$VERSION.SDK_INT >= 21) {
            this.getWindow().addFlags(Integer.MIN_VALUE);
        }
        final Intent intent = this.getIntent();
        this.k = App.S.e(intent.getStringExtra(QuickContactActivity.z[0]));
        this.getWindow().setFlags(131072, 131072);
        this.setContentView(2130903208);
        (this.n = (FloatingChildLayout)this.findViewById(2131755735)).setOnOutsideTouchListener((View$OnTouchListener)new um(this));
        final Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            this.n.setChildTargetScreen(sourceBounds);
            this.n.setCircularReveal(true);
        }
        (this.l = (TextView)this.findViewById(2131755405)).setText(cq.b(this.k.a((Context)this), (Context)this, (Paint)this.l.getPaint()));
        Label_0259: {
            if (this.k.b || this.k.m() || this.k.k()) {
                this.findViewById(2131755443).setVisibility(0);
                this.findViewById(2131755736).setVisibility(8);
                if (!i) {
                    break Label_0259;
                }
            }
            this.findViewById(2131755443).setVisibility(8);
            this.findViewById(2131755736).setVisibility(0);
        }
        this.m = (ImageView)this.findViewById(2131755367);
        this.e();
        this.m.setOnClickListener((View$OnClickListener)new qu(this));
        this.findViewById(2131755375).setOnClickListener((View$OnClickListener)new a9r(this));
        final View viewById = this.findViewById(2131755378);
        Label_0374: {
            if (this.k.m() || this.k.k()) {
                viewById.setVisibility(8);
                this.findViewById(2131755737).setVisibility(8);
                if (!i) {
                    break Label_0374;
                }
            }
            viewById.setOnClickListener((View$OnClickListener)new a2_(this));
        }
        this.findViewById(2131755738).setOnClickListener((View$OnClickListener)new a8y(this));
        this.findViewById(2131755736).setOnClickListener((View$OnClickListener)new oj(this));
        FloatingChildLayout.b((View)this.n, new jv(this));
        App.b((aws)this);
    }
    
    public void onDestroy() {
        super.onDestroy();
        Log.i(QuickContactActivity.z[2]);
        App.a((aws)this);
    }
}
