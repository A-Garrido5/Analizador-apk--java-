// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.accountsync;

import android.os.Environment;
import com.whatsapp.util.WhatsAppLibLoader;
import android.os.Bundle;
import android.os.AsyncTask;
import com.whatsapp.a8s;
import android.os.AsyncTask$Status;
import com.whatsapp.adc;
import android.database.Cursor;
import android.app.Activity;
import com.whatsapp.fieldstats.bq;
import com.whatsapp.Conversation;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.Main;
import com.whatsapp.a_9;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import com.whatsapp.VerifyMessageStoreActivity;

public class ProfileActivity extends VerifyMessageStoreActivity
{
    private static final String[] z;
    f l;
    
    static {
        final String[] z2 = new String[11];
        String s = "R%W2<Q.V7uM9\u00190\u007fU5O8hX|X=nD=](<G5W8oI5W60\u00015^?sS5W6<F3M>]B(P'uU%\u00192}M0";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001c';
                        break;
                    }
                    case 0: {
                        c2 = '!';
                        break;
                    }
                    case 1: {
                        c2 = '\\';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = 'Q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "L5T4hX,\\";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "E=M0-";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "G=P=yE|M><F3\u00190rX+Q4nD|_#sL|J(rB|I#sG5U4<@?M8jH(@j<H2M4rUa";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "W2]\u007f}O8K>uErZ$nR3K\u007fuU9T~jO8\u00172sLrN9}U/X!l\u000f*V8l\u000f?X=p";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "W2]\u007f}O8K>uErZ$nR3K\u007fuU9T~jO8\u00172sLrN9}U/X!l\u000f,K>zH0\\";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Q.V7uM9X2hH*P%e\u000e?K4}U9\u00163}B7L!zH0\\\"zN)W5<";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Q.V7uM9X2hH*P%e\u000e?K4}U9";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "L3L?hD8";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "L3L?hD8f#s";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "@>V#hH2^qxT9\u0019%s\u00012X%uW9\u0019=uC.X#uD/\u0019<uR/P?{";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ProfileActivity() {
        this.l = null;
    }
    
    private void a() {
        final boolean a = PerformSyncManager.a;
        if (this.isFinishing()) {
            Log.w(ProfileActivity.z[0]);
            return;
        }
        Label_0219: {
            if (this.getIntent().getData() == null) {
                break Label_0219;
            }
            final Cursor query = this.getContentResolver().query(this.getIntent().getData(), (String[])null, (String)null, (String[])null, (String)null);
            if (query == null) {
                break Label_0219;
            }
            try {
                if (query.moveToNext()) {
                    final String string = query.getString(query.getColumnIndex(ProfileActivity.z[1]));
                    final a_9 e = App.S.e(query.getString(query.getColumnIndex(ProfileActivity.z[2])));
                    Label_0202: {
                        if (e == null || e.m() || a_9.h(e.u)) {
                            this.startActivity(new Intent((Context)this, Main.h()));
                            if (!a) {
                                break Label_0202;
                            }
                        }
                        if (ProfileActivity.z[5].equals(string)) {
                            this.startActivity(Conversation.a(e));
                            if (!a) {
                                break Label_0202;
                            }
                        }
                        if (ProfileActivity.z[4].equals(string)) {
                            App.a(e, this, bq.ANDROID_CONTACTS_APPLICATION);
                        }
                    }
                    this.finish();
                    return;
                }
                query.close();
                Log.e(ProfileActivity.z[3] + this.getIntent());
                this.finish();
            }
            finally {
                query.close();
            }
        }
    }
    
    static void a(final ProfileActivity profileActivity) {
        profileActivity.a();
    }
    
    @Override
    protected void f() {
        if (adc.e) {
            if (this.l != null && this.l.getStatus() == AsyncTask$Status.RUNNING) {
                return;
            }
            a8s.a(this.l = new f(this), new Void[0]);
            if (!PerformSyncManager.a) {
                return;
            }
        }
        this.a();
    }
    
    public void onCreate(final Bundle bundle) {
        final boolean a = PerformSyncManager.a;
        super.onCreate(bundle);
        Log.i(ProfileActivity.z[7]);
        if (!WhatsAppLibLoader.a(null)) {
            Log.i(ProfileActivity.z[10]);
            this.finish();
        }
        else {
            if (App.aX == null || App.c((Context)this) != 3) {
                App.a((Context)this, 2131231129, 1);
                this.finish();
                return;
            }
            if (!App.ak.l()) {
                final String externalStorageState = Environment.getExternalStorageState();
                Label_0169: {
                    if (!externalStorageState.equals(ProfileActivity.z[8]) && !externalStorageState.equals(ProfileActivity.z[9])) {
                        this.showDialog(107);
                        if (!a) {
                            break Label_0169;
                        }
                    }
                    final int p = App.ak.p();
                    Log.i(ProfileActivity.z[6] + p);
                    if (p > 0) {
                        this.showDialog(105);
                        if (!a) {
                            break Label_0169;
                        }
                    }
                    this.b(false);
                }
                if (!a) {
                    return;
                }
            }
            this.f();
        }
    }
}
