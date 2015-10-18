// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.os.AsyncTask;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import java.lang.ref.WeakReference;
import android.app.Activity;

public abstract class pr
{
    protected static ay b;
    private static final String[] z;
    protected boolean a;
    private final Activity c;
    private final i9 d;
    
    static {
        final String[] z2 = new String[12];
        String s = "B5_\u0018kM=^\u0016~@?_\u0014\"P9L\u001dbS\u007f_\u0014~@?_\u0014kF?@\u0013lW;X\u0001iA5Y\u001ehF\"B\u0003nU\"I\u001fb@6B\u0004cP1^\u001a\u007fQ$_\b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\r';
                        break;
                    }
                    case 0: {
                        c2 = '4';
                        break;
                    }
                    case 1: {
                        c2 = 'P';
                        break;
                    }
                    case 2: {
                        c2 = '-';
                        break;
                    }
                    case 3: {
                        c2 = 'q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "B5_\u0018kM=^\u0016~@?_\u0014\"P9L\u001dbS\u007f@\u0014i]1N\u0010\u007fP>B\u0005k[%C\u0015lG;_\u0014yF)";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "B5_\u0018kM=^\u0016~@?_\u0014\"P9L\u001dbS\u007f^\u0014yA ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "B5_\u0018kM=^\u0016~@?_\u0014\"P9L\u001dbS\u007f_\u0014~@?_\u0014iA5Y\u001ehF\"B\u0003";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "B5_\u0018kM=^\u0016~@?_\u0014\"P9L\u001dbS\u007fJ\u0003bA ^\bcW";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "B5_\u0018kM=^\u0016~@?_\u0014\"P9L\u001dbS\u007fN\u0010cZ?Y\\n[>C\u0014n@";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "B5_\u0018kM=^\u0016~@?_\u0014\"P9L\u001dbS\u007f_\u0014~@?_\u0014";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "B5_\u0018kM=^\u0016~@?_\u0014\"P9L\u001dbS\u007f@\u0002jG$B\u0003hZ?Y\u0003hG$B\u0003hP";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "B5_\u0018kM=^\u0016~@?_\u0014\"P9L\u001dbS\u007fF\u0014tG5_\u0007dW5X\u001flB1D\u001dlV<H";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "B5_\u0018kM=^\u0016~@?_\u0014\"P9L\u001dbS\u007f@\u0002jG$B\u0003hQ\"_\u001e\u007f";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "B5_\u0018kM=^\u0016~@?_\u0014\"A#H\u0019dG$B\u0003t]6H\tdG$^^oU3F\u0004}R9A\u0014~R?X\u001fi\u0014";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "F5J\u0018~@5_\u001flY5\u0002\u001chG#L\u0016hG$B\u0003hB5_\u0018k]5I^`]#^\u0018cS}]\u0010\u007fU=^Qo[%C\u0012h\u0014$BQ\u007fQ7]\u0019bZ5";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        pr.b = null;
    }
    
    public pr(final Activity c) {
        this.a = false;
        this.c = c;
        this.d = new i9(new WeakReference((T)c), null);
    }
    
    static Activity a(final pr pr) {
        return pr.c;
    }
    
    private Dialog a(final int n, final int message) {
        return new AlertDialog$Builder((Context)this.c).setMessage(message).setCancelable(false).setPositiveButton(2131231609, (DialogInterface$OnClickListener)new bc(this, n)).setNegativeButton(2131231359, (DialogInterface$OnClickListener)new vs(this, n)).create();
    }
    
    static i9 b(final pr pr) {
        return pr.d;
    }
    
    protected Dialog a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 100: {
                Log.i(pr.z[2]);
                (pr.b = new ay((Context)this.c)).setTitle((CharSequence)this.c.getString(2131231368));
                pr.b.setMessage((CharSequence)this.c.getString(2131231367));
                pr.b.setIndeterminate(false);
                pr.b.setCancelable(false);
                pr.b.setProgressStyle(1);
                return (Dialog)pr.b;
            }
            case 101: {
                Log.i(pr.z[9]);
                return new AlertDialog$Builder((Context)this.c).setTitle(2131230802).setMessage(this.c.getString(2131231361)).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new zn(this)).create();
            }
            case 102: {
                Log.i(pr.z[1]);
                final AlertDialog$Builder setTitle = new AlertDialog$Builder((Context)this.c).setTitle(2131230802);
                final Activity c = this.c;
                int n2;
                if (App.aw()) {
                    n2 = 2131231365;
                }
                else {
                    n2 = 2131231366;
                }
                return setTitle.setMessage(c.getString(n2)).setPositiveButton(2131231609, (DialogInterface$OnClickListener)new t3(this)).setNegativeButton(2131231739, (DialogInterface$OnClickListener)new qr(this)).setCancelable(false).create();
            }
            case 107: {
                Log.i(pr.z[0]);
                final StringBuilder append = new StringBuilder().append(this.c.getString(2131231364)).append(" ");
                final Activity c2 = this.c;
                int n3;
                if (App.aw()) {
                    n3 = 2131231365;
                }
                else {
                    n3 = 2131231366;
                }
                return new AlertDialog$Builder((Context)this.c).setTitle(2131230802).setMessage(append.append(c2.getString(n3)).toString()).setPositiveButton(2131231609, (DialogInterface$OnClickListener)new aqa(this)).setNegativeButton(2131231739, (DialogInterface$OnClickListener)new atz(this)).setCancelable(false).create();
            }
            case 103: {
                Log.i(pr.z[6]);
                return new AlertDialog$Builder((Context)this.c).setTitle(2131231346).setMessage(this.c.getString(2131231357)).setPositiveButton(2131231977, (DialogInterface$OnClickListener)new fx(this)).setNegativeButton(2131231411, (DialogInterface$OnClickListener)new p7(this)).setCancelable(false).create();
            }
            case 105: {
                Log.i(pr.z[3]);
                return new AlertDialog$Builder((Context)this.c).setTitle(2131231348).setMessage(this.c.getString(2131231364) + " " + this.c.getString(2131231358)).setPositiveButton(2131231369, (DialogInterface$OnClickListener)new yn(this)).setNegativeButton(2131231359, (DialogInterface$OnClickListener)new arh(this)).setCancelable(false).create();
            }
            case 106: {
                return new AlertDialog$Builder((Context)this.c).setTitle(2131231356).setMessage(this.c.getString(2131231363)).setPositiveButton(2131231359, (DialogInterface$OnClickListener)new d3(this)).setNegativeButton(2131231369, (DialogInterface$OnClickListener)new xb(this)).setCancelable(false).create();
            }
            case 108: {
                Log.i(pr.z[7]);
                return new AlertDialog$Builder((Context)this.c).setTitle(2131230802).setMessage(this.c.getString(2131231362)).setPositiveButton(2131231435, null).create();
            }
            case 104: {
                Log.i(pr.z[4]);
                final ay ay = new ay((Context)this.c);
                ay.setTitle((CharSequence)this.c.getString(2131231592));
                ay.setMessage((CharSequence)this.c.getString(2131231591));
                ay.setIndeterminate(true);
                ay.setCancelable(false);
                return (Dialog)ay;
            }
            case 201: {
                Log.i(pr.z[8]);
                return this.a(201, 2131231374);
            }
            case 200: {
                Log.i(pr.z[5]);
                return this.a(200, 2131231373);
            }
        }
    }
    
    protected void a() {
        final int p = App.ak.p();
        Log.i(pr.z[10] + p);
        if (p > 0) {
            this.c.showDialog(103);
            if (!App.I) {
                return;
            }
        }
        this.a(false, true);
    }
    
    protected void a(final boolean b) {
        this.a(b, false);
    }
    
    protected void a(final boolean b, final boolean b2) {
        if (!b2 && !this.c.isFinishing() && (!this.a || b)) {
            this.c.showDialog(100);
        }
        final App$Me x = App.x((Context)this.c);
        x.jabber_id = App.m((Context)App.aq);
        if (x.jabber_id != null) {
            App.aX = x;
            App.an = false;
            App.r((Context)this.c.getApplication());
            App.a8();
            MessageService.b((Context)App.aq);
            int a;
            if (b) {
                a = App.ak.a(App.ak.a(new a28(this, b, b2), new w0(this)));
            }
            else {
                a = 0;
            }
            if (a == 0) {
                a8s.a(new jl(this, b, this.a, b2), new Object[0]);
                if (!App.I) {
                    return;
                }
            }
            this.d.sendEmptyMessageDelayed(1, 32000L);
            return;
        }
        Log.e(pr.z[11]);
        App.b((Context)this.c, 1);
        this.c.startActivity(new Intent((Context)this.c, (Class)RegisterPhone.class));
        this.c.finish();
    }
    
    protected abstract void b();
    
    protected void b(final boolean a) {
        this.a = a;
    }
    
    protected abstract void c();
}
