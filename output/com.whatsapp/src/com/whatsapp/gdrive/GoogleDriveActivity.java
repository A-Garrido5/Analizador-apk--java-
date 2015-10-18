// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.app.Dialog;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtil;
import android.accounts.Account;
import android.os.AsyncTask;
import com.whatsapp.a8s;
import android.accounts.AccountManager;
import android.content.Intent;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import java.io.File;
import com.whatsapp.util.bm;
import android.view.View$OnClickListener;
import android.widget.Button;
import com.whatsapp.util.b6;
import android.text.format.Formatter;
import com.whatsapp.App;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.whatsapp.aol;
import com.whatsapp.util.Log;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Pair;
import android.widget.ProgressBar;
import android.os.Handler;
import android.os.ConditionVariable;
import android.widget.TextView;
import android.content.ServiceConnection;
import com.whatsapp.DialogToastActivity;

public final class GoogleDriveActivity extends DialogToastActivity
{
    private static final String[] z;
    private final ServiceConnection k;
    private TextView l;
    private final ConditionVariable m;
    private long n;
    private final Handler o;
    private GoogleDriveService p;
    private final ConditionVariable q;
    private boolean r;
    private ProgressBar s;
    private final cs t;
    
    static {
        final String[] z2 = new String[31];
        String s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0017N\u0001Ro\u0000";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0807:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\'';
                        break;
                    }
                    case 0: {
                        c2 = '\u0002';
                        break;
                    }
                    case 1: {
                        c2 = 'e';
                        break;
                    }
                    case 2: {
                        c2 = '+';
                        break;
                    }
                    case 3: {
                        c2 = 'r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "l\u0000\\-Mk\u0001";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "a\nF\\Pj\u0004_\u0001Fr\u0015t\u0002Ug\u0003N\u0000Bl\u0006N\u0001";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0006Y\u0017Fv\u0000\u0004\u0011Hl\u0011B\u001cRgHF\u0001@/\u0017N\u0001Sm\u0017N";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0006Y\u0017Fv\u0000\u0004\u001fTeHY\u0017Tv\nY\u0017\nc\tY\u0017Ff\u001c\u0006\u0014Nl\fX\u001aBfI\u000b\u0017_k\u0011B\u001c@";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u000bN\u0005\nk\u000b_\u0017IvE^\u001cBz\u0015N\u0011Sg\u0001\u000b\u0013Dv\fD\u001c\u001d\"";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "c\u0006_\u001bHl:X\u001aHu:Y\u0017Tv\nY\u0017xm\u000bN-Sk\bN-Tg\u0011^\u0002";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0016C\u001dP/\u000bN\u0005\nw\u0016N\u0000\nq\u0000_\u0006Nl\u0002X";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0006Y\u0017Fv\u0000";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0006Y\u0017Fv\u0000\u000b\u001cH\"\u0004H\u0006Nm\u000b\u000b\u0002Um\u0013B\u0016BfK";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\bX\u0015\np\u0000X\u0006Hp\u0000\u0006\u0014Nl\fX\u001a\u000b\"2B_akEJ\u0004Fk\tJ\u0010KgI\u000b\u0001Sc\u0017_\u001bIeEF\u0017Ck\u0004\u000b\u0000Bq\u0011D\u0000B,";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0016C\u001dP/\u0017N\u0001Sm\u0017NR";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "c\u000bO\u0000Hk\u0001\u0005\u001bIv\u0000E\u0006\tc\u0006_\u001bHlKf3nL";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "c\u000bO\u0000Hk\u0001\u0005\u001bIv\u0000E\u0006\ta\u0004_\u0017@m\u0017R\\oM(n";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\"\u0012B\u0006O\"\u0002O\u0000Nt\u0000m\u001bKg(J\u0002";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0002N\u0006\n`\u0000X\u0006\n`\u0004X\u0017\nd\nG\u0016BpEM\u001bIc\t\u000b\u0010Fq\u0000m\u001dKf\u0000Y;C\"\fXR";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "e\u0001Y\u001bQg:M\u001bKg:F\u0013W";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\nE\u0017\nv\fF\u0017\nq\u0000_\u0007W";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "a\nF\\@m\nL\u001eB";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\nE\u0017\nv\fF\u0017\nq\u0000_\u0007W\"$h&nM+t!oM2t bQ1d b]*e7xV,f7xQ \u007f'w\"\u0006J\u001eKg\u0001\u0005";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0001N\u0011Nf\u0000\u000b\u001eHa\u0004GRJq\u0002X\u0006Hp\u0000\u000b\u0016Hg\u0016\u000b\u001cHvEN\nNq\u0011\u0005";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0001N\u0011Nf\u0000\u000b\u0000Bo\n_\u0017\u0007f\u0007m\u001bKgEO\u001dBqEE\u001dS\"\u0000S\u001bTv";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0001N\u0011Nf\u0000\u000b\u001fFi\fE\u0015\u0007cEY\u0017Vw\u0000X\u0006\u0007v\n\u000b\u0014Bv\u0006CRKc\u0016_RJm\u0001B\u0014Ng\u0001\u000b\u0006No\u0000X\u0006Fo\u0015\u000b\u001dA\"\u0017N\u001fHv\u0000\u000b\u0016E\"\u0003B\u001eB,";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0001N\u0011Nf\u0000\u000b\u0000Bo\n_\u0017\u0007f\u0007m\u001bKgEO\u001dBqEE\u001dS\"\u0000S\u001bTv";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0001N\u0011Nf\u0000\u000b>Ha\u0004GRJg\u0016X\u0013@gEI\u0013Di\u0010[ROc\u0016\u000b\u0001Fo\u0000\u000b\u001fC7EJ\u0001\u0007e\nD\u0015KgEO\u0000Nt\u0000\u0005";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0001N\u0011Nf\u0000\u000b\u001eHa\u0004GREc\u0006@\u0007W\"\u0003B\u001eB\"\fXRIg\u0012N\u0000\u0007v\rJ\u001c\u0007m\u000bNRHlEl\u001dHe\tNRcp\f]\u0017\u0007c\u000bORSj\u0000\u000b\u0006PmEM\u001bKg\u0016\u000b\u0013UgE\u000b\u0016Nd\u0003N\u0000Bl\u0011\u000b\u0013T\"\u0012N\u001eK.E_\u001aBp\u0000M\u001dUgI\u000b\u0005B\"\u0012B\u001eK\"\u0010X\u0017\u0007v\rNRKm\u0006J\u001e\u0007m\u000bNRAm\u0017\u000b\u0000Bq\u0011D\u0000B\"\tD\u0011Fn_\u000b";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u000b\u0017N\u001fHv\u0000\u0011R";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0001N\u0011Nf\u0000\u000b\u001eHa\u0004GRJq\u0002X\u0006Hp\u0000\u000b\u0017_k\u0016_\u0001\u0007`\u0010_RNqEN\u001fWv\u001c\u0005";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0001N\u0011Nf\u0000\u000b5Hm\u0002G\u0017\u0007F\u0017B\u0004B\"\bN\u0001Tc\u0002NREc\u0006@\u0007W\"\fXRIg\u0012N\u0000\u0007v\rJ\u001c\u0007n\nH\u0013K,";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "c\u0006_\u001bHl:Y\u0017Tv\nY\u0017xo\u0000O\u001bF";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "e\u0001Y\u001bQgHJ\u0011Sk\u0013B\u0006^-\u0017N\u0001Sm\u0017N_Jg\u0001B\u0013\u0007q\u0011J\u0000Sk\u000bLRUg\u0016_\u001dUgED\u0014\u0007o\u0000O\u001bF\"\u0003B\u001eBqK";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    break Label_0807;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public GoogleDriveActivity() {
        this.o = new Handler();
        this.m = new ConditionVariable(false);
        this.q = new ConditionVariable(false);
        this.k = (ServiceConnection)new a_(this);
        this.t = new a2(this);
    }
    
    static Pair a(final GoogleDriveActivity googleDriveActivity, final q q) {
        return googleDriveActivity.a(q);
    }
    
    private Pair a(@NonNull final q q) {
        ag ag = null;
        final int f = GoogleDriveService.F;
        final ag[] c = q.c(null, GoogleDriveService.a((Context)this));
        if (c.length == 0) {
            return new Pair((Object)null, (Object)null);
        }
        final int length = c.length;
        int i = 0;
        ag ag2 = null;
        while (i < length) {
            final ag ag3 = c[i];
            final ag e = q.e(ag3.b(), GoogleDriveActivity.z[16]);
            if (e != null && (ag2 == null || e.h() > ag2.h())) {
                ag2 = e;
                ag = ag3;
            }
            ++i;
            if (f != 0) {
                break;
            }
        }
        Log.i(GoogleDriveActivity.z[15] + ag.b() + GoogleDriveActivity.z[14] + ag2);
        return new Pair((Object)ag, (Object)ag2);
    }
    
    static GoogleDriveService a(final GoogleDriveActivity googleDriveActivity, final GoogleDriveService p2) {
        return googleDriveActivity.p = p2;
    }
    
    private void a() {
        final int f = GoogleDriveService.F;
        aol.a();
        this.r = true;
        this.findViewById(2131755177).setVisibility(8);
        this.findViewById(2131755176).setVisibility(8);
        this.findViewById(2131755174).setVisibility(0);
        this.findViewById(2131755175).setVisibility(8);
        this.findViewById(2131755178).setVisibility(8);
        this.findViewById(2131755179).setVisibility(8);
        this.findViewById(2131755180).setVisibility(0);
        final int[] array = { 2131755182, 2131755183, 2131755184, 2131755185, 2131755186, 2131755187, 2131755188, 2131755189 };
        final ImageView[] array2 = new ImageView[array.length];
        final am am = new am(this, array, array2);
        int n;
        for (int i = 0; i < array.length; i = n) {
            (array2[i] = (ImageView)this.findViewById(array[i])).setVisibility(0);
            array2[i].setImageDrawable(this.getResources().getDrawable(2130837763).mutate());
            n = i + 1;
            if (f != 0) {
                break;
            }
        }
        this.o.removeCallbacks((Runnable)am);
        this.o.postDelayed((Runnable)am, 500L);
        if (!false) {
            final AlphaAnimation[] array3 = new AlphaAnimation[array.length];
            int j = 0;
            while (j < array2.length) {
                ((Animation)(array3[j] = new AlphaAnimation(1.0f, 0.0f))).setDuration(50L);
                ((Animation)array3[j]).setFillAfter(true);
                array2[j].startAnimation((Animation)array3[j]);
                ++j;
                if (f != 0) {
                    break;
                }
            }
        }
        this.s = (ProgressBar)this.findViewById(2131755191);
        this.l = (TextView)this.findViewById(2131755192);
        this.s.setVisibility(0);
        this.s.setIndeterminate(true);
        this.l.setVisibility(0);
        if (App.ak()) {
            ((TextView)this.findViewById(2131755173)).setCompoundDrawablesWithIntrinsicBounds(2130838741, 0, 0, 0);
            if (f == 0) {
                return;
            }
        }
        ((TextView)this.findViewById(2131755173)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130838741, 0);
    }
    
    private void a(final long n) {
        aol.b();
        this.n = n;
        String s;
        if (n == 0L) {
            s = this.getString(2131232026);
        }
        else {
            s = this.getString(2131232024, new Object[] { Formatter.formatShortFileSize((Context)this, n) });
        }
        this.m.block();
        this.runOnUiThread((Runnable)new ay(this, s));
    }
    
    static void a(final GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.e();
    }
    
    static void a(final GoogleDriveActivity googleDriveActivity, final long n) {
        googleDriveActivity.a(n);
    }
    
    static void a(final GoogleDriveActivity googleDriveActivity, final at at) {
        googleDriveActivity.a(at);
    }
    
    static void a(final GoogleDriveActivity googleDriveActivity, final bq bq) {
        googleDriveActivity.a(bq);
    }
    
    static void a(final GoogleDriveActivity googleDriveActivity, final boolean b) {
        googleDriveActivity.b(b);
    }
    
    private void a(final at at) {
        Log.i(GoogleDriveActivity.z[11] + a7.a(at.f));
        final String f = at.f;
        final bq a = at.a;
        final ag d = at.a.d();
        final q b = at.b;
        this.setContentView(2130903071);
        this.b();
        this.m.open();
        this.setTitle(2131231988);
        Label_0139: {
            if (at.e) {
                final TextView textView = (TextView)this.findViewById(2131755175);
                int text;
                if (App.aw()) {
                    text = 2131232095;
                }
                else {
                    text = 2131232141;
                }
                textView.setText(text);
                if (GoogleDriveService.F == 0) {
                    break Label_0139;
                }
            }
            ((TextView)this.findViewById(2131755175)).setText(2131232071);
        }
        final StringBuilder sb = new StringBuilder(this.getString(2131232009));
        final StringBuilder sb2 = new StringBuilder(this.getString(2131232023));
        if (d.h() > 0L) {
            sb.setLength(0);
            sb.append(b6.l((Context)this, d.h()));
        }
        long b2;
        if (at.e) {
            b2 = 0L;
        }
        else {
            b2 = at.a.b();
        }
        this.n = b2;
        if (d.c() != null) {
            sb2.setLength(0);
            sb2.append(Formatter.formatShortFileSize((Context)this, a.b()));
        }
        if (!at.d) {
            sb.setLength(0);
            sb.append(b6.l((Context)this, GoogleDriveService.D.lastModified()));
        }
        final TextView textView2 = (TextView)this.findViewById(2131755174);
        int n;
        if (at.e) {
            n = 2131232088;
        }
        else {
            n = 2131232072;
        }
        textView2.setText((CharSequence)this.getString(n, new Object[] { f, sb.toString(), sb2.toString() }));
        ((Button)this.findViewById(2131755177)).setOnClickListener((View$OnClickListener)new ai(this, f));
        ((Button)this.findViewById(2131755176)).setOnClickListener((View$OnClickListener)new k(this, f, a, b, at));
    }
    
    private void a(final bq bq) {
        bm.a(new bh(this, bq));
    }
    
    static boolean a(final GoogleDriveActivity googleDriveActivity, final String s, final q q, final String s2) {
        return googleDriveActivity.a(s, q, s2);
    }
    
    private boolean a(final String s, final q q, final String s2) {
        final File d = GoogleDriveService.D;
        try {
            if (!d.exists()) {
                Log.i(GoogleDriveActivity.z[20]);
                GoogleDriveService.a(true);
                return true;
            }
        }
        catch (b2 b2) {
            throw b2;
        }
        try {
            if (d.length() == 0L) {
                Log.i(GoogleDriveActivity.z[27]);
                GoogleDriveService.a(true);
                return true;
            }
        }
        catch (b2 b3) {
            throw b3;
        }
        if (s == null) {
            try {
                Log.e(GoogleDriveActivity.z[23]);
                GoogleDriveService.a(false);
                return false;
            }
            catch (b2 b4) {
                throw b4;
            }
        }
        try {
            if (a7.a(d).equals(s)) {
                Log.i(GoogleDriveActivity.z[24]);
                GoogleDriveService.a(false);
                return false;
            }
        }
        catch (b2 b5) {
            throw b5;
        }
        Log.i(GoogleDriveActivity.z[22]);
        Label_0182: {
            while (true) {
                try {
                    final ag b6 = q.b(s2);
                    if (b6 == null) {
                        final String[] array = GoogleDriveActivity.z;
                        final int n = 21;
                        final String s3 = array[n];
                        Log.e(s3);
                        final boolean b7 = false;
                        GoogleDriveService.a(b7);
                        return false;
                    }
                    break Label_0182;
                }
                catch (b2 b9) {
                    Log.b(b9);
                    final ag b6 = null;
                    continue;
                }
                break;
            }
            try {
                final String[] array = GoogleDriveActivity.z;
                final int n = 21;
                final String s3 = array[n];
                Log.e(s3);
                final boolean b7 = false;
                GoogleDriveService.a(b7);
                return false;
            }
            catch (b2 b10) {
                throw b10;
            }
            try {
                final ag b6;
                if (d.lastModified() < b6.h()) {
                    Log.i(GoogleDriveActivity.z[28]);
                    GoogleDriveService.a(true);
                    return true;
                }
            }
            catch (b2 b11) {
                throw b11;
            }
        }
        Log.i(GoogleDriveActivity.z[25] + a7.a(d) + GoogleDriveActivity.z[26] + s);
        GoogleDriveService.a(false);
        return false;
    }
    
    private void b() {
        final TextView textView = (TextView)this.findViewById(2131755173);
        if (textView != null) {
            int n;
            if (this.r) {
                n = 2130838741;
            }
            else {
                n = 2130838740;
            }
            if (App.ak()) {
                textView.setCompoundDrawablesWithIntrinsicBounds(n, 0, 0, 0);
                if (GoogleDriveService.F == 0) {
                    return;
                }
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, n, 0);
        }
    }
    
    private void b(final boolean b) {
        this.setTitle(2131231988);
        String message;
        if (b) {
            message = this.getString(2131232060);
        }
        else {
            message = this.getString(2131232059);
        }
        if (App.j() != 1) {
            new AlertDialog$Builder((Context)this).setMessage(message).setTitle(2131232144).setCancelable(false).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new c_(this)).setNegativeButton(2131232073, (DialogInterface$OnClickListener)new com.whatsapp.gdrive.b6(this)).create().show();
            if (GoogleDriveService.F == 0) {
                return;
            }
        }
        Log.i(GoogleDriveActivity.z[10]);
        this.f();
        this.setResult(3);
        this.finish();
    }
    
    static boolean b(final GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.g();
    }
    
    static void c(final GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.a();
    }
    
    static long d(final GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.n;
    }
    
    static GoogleDriveService e(final GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.p;
    }
    
    private void e() {
        Log.i(GoogleDriveActivity.z[7]);
        this.startActivityForResult(new Intent((Context)this, (Class)GoogleDriveNewUserSetupActivity.class), 3);
    }
    
    private void f() {
        Log.i(GoogleDriveActivity.z[30]);
        final Intent intent = new Intent((Context)this, (Class)GoogleDriveService.class);
        intent.setAction(GoogleDriveActivity.z[29]);
        this.startService(intent);
    }
    
    static void f(final GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.f();
    }
    
    static ConditionVariable g(final GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.q;
    }
    
    private boolean g() {
        return App.aq.getSharedPreferences(GoogleDriveActivity.z[2], 0).getBoolean(GoogleDriveActivity.z[1], false);
    }
    
    static TextView h(final GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.l;
    }
    
    private void h() {
        while (true) {
            try {
                final Account[] accountsByType = AccountManager.get((Context)this).getAccountsByType(GoogleDriveActivity.z[18]);
                Log.i(GoogleDriveActivity.z[19]);
                a8s.a(new g(this, accountsByType), new Object[0]);
            }
            catch (Exception ex) {
                Log.b(GoogleDriveActivity.z[17], ex);
                final Account[] accountsByType = new Account[0];
                continue;
            }
            break;
        }
    }
    
    static cs i(final GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.t;
    }
    
    static Handler j(final GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.o;
    }
    
    static ProgressBar k(final GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.s;
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final int f = GoogleDriveService.F;
        if (n == 3) {
            this.finish();
            if (f == 0) {
                return;
            }
        }
        if (n == 5) {
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable((Context)this) == 0) {
                this.h();
                if (f == 0) {
                    return;
                }
            }
            this.setResult(0);
            this.finish();
        }
    }
    
    @Override
    public void onBackPressed() {
        final Intent intent = new Intent(GoogleDriveActivity.z[12]);
        intent.addCategory(GoogleDriveActivity.z[13]);
        intent.setFlags(268435456);
        this.startActivity(intent);
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Log.i(GoogleDriveActivity.z[8]);
        if (!GoogleDriveService.am()) {
            this.setResult(0);
            this.finish();
            return;
        }
        this.setContentView(2130903070);
        this.setTitle(2131231989);
        final Intent intent = this.getIntent();
        if (intent.getAction() == null) {
            Log.e(GoogleDriveActivity.z[9]);
            this.finish();
            return;
        }
        this.onNewIntent(intent);
    }
    
    public void onDestroy() {
        if (this.p != null) {
            this.unbindService(this.k);
        }
        super.onDestroy();
    }
    
    @Override
    protected void onNewIntent(final Intent intent) {
        final int f = GoogleDriveService.F;
        this.bindService(new Intent((Context)this, (Class)GoogleDriveService.class), this.k, 1);
        final String action = intent.getAction();
        int n = -1;
        switch (action.hashCode()) {
            case -1725923122: {
                if (action.equals(GoogleDriveActivity.z[6])) {
                    n = 0;
                    break;
                }
                break;
            }
        }
        switch (n) {
            default: {
                Log.e(GoogleDriveActivity.z[5] + intent.getAction());
                this.finish();
                break;
            }
            case 0: {
                final Dialog a = a7.a(GooglePlayServicesUtil.isGooglePlayServicesAvailable((Context)this), this, 5, (DialogInterface$OnCancelListener)new b7(this), false);
                if (a != null) {
                    a.show();
                    if (f == 0) {
                        break;
                    }
                }
                if (GoogleDriveService.o() == null) {
                    this.h();
                    if (f == 0) {
                        break;
                    }
                }
                if (GoogleDriveService.g()) {
                    Log.i(GoogleDriveActivity.z[3]);
                    this.setContentView(2130903071);
                    this.b();
                    this.a();
                    final String o = GoogleDriveService.o();
                    final long d = GoogleDriveService.d(o);
                    final long a2 = GoogleDriveService.a(o);
                    String s = this.getString(2131232009);
                    if (a2 > 0L) {
                        s = b6.l((Context)this, a2);
                    }
                    String l;
                    if (!GoogleDriveService.T()) {
                        l = b6.l((Context)this, GoogleDriveService.D.lastModified());
                    }
                    else {
                        l = s;
                    }
                    ((TextView)this.findViewById(2131755174)).setText((CharSequence)this.getString(2131232072, new Object[] { o, l, Formatter.formatShortFileSize((Context)this, d) }));
                    bm.a(new co(this));
                    if (f == 0) {
                        break;
                    }
                }
                Log.i(GoogleDriveActivity.z[4]);
                this.finish();
            }
        }
    }
    
    public void onResume() {
        super.onResume();
        Log.i(GoogleDriveActivity.z[0]);
        this.b();
    }
}
