// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.app.PendingIntent;
import android.content.IntentSender$SendIntentException;
import com.whatsapp.util.Log;
import com.google.android.gms.common.ConnectionResult;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

final class e implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final int a;
    final int b;
    final Activity c;
    
    static {
        final String[] z2 = new String[2];
        String s = "}o\u0003oR\u007f&\u0004rMv$\u0016cP7n\u0003tKh&\u0015oEvd\u0016&T\u007fe\u0015oJ}+\u0018hP\u007fe\u0005&Mi+\u001fsHv+\u0017iV:n\u0003tKh+\u0012i@\u007f1Q";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '$';
                        break;
                    }
                    case 0: {
                        c2 = '\u001a';
                        break;
                    }
                    case 1: {
                        c2 = '\u000b';
                        break;
                    }
                    case 2: {
                        c2 = 'q';
                        break;
                    }
                    case 3: {
                        c2 = '\u0006';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "}o\u0003oR\u007f&\u0004rMv$\u0016cP7n\u0003tKh&\u0015oEvd\u0016";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    e(final int a, final Activity c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        try {
            final PendingIntent errorPendingIntent = GooglePlayServicesUtil.getErrorPendingIntent(this.a, (Context)this.c, this.b);
            Label_0056: {
                if (errorPendingIntent == null) {
                    break Label_0056;
                }
                final ConnectionResult connectionResult = new ConnectionResult(this.a, errorPendingIntent);
                try {
                    connectionResult.startResolutionForResult(this.c, this.b);
                    if (GoogleDriveService.F != 0) {
                        Log.e(e.z[0] + this.a);
                    }
                }
                catch (IntentSender$SendIntentException ex) {
                    throw ex;
                }
            }
        }
        catch (IntentSender$SendIntentException ex2) {
            Log.b(e.z[1], (Throwable)ex2);
        }
    }
}
