// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.content.ClipDescription;
import android.content.ClipData;
import android.os.Bundle;
import android.content.Intent;

class RemoteInputCompatJellybean
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[8];
        String s = "\u0015\u0013F\u000fZ\u001d\u0019\f\u000fP\u0019\u0012V\u0018\\\u001a\rW\t\u001b\u0006\u0018Q\bY\u0000\u000ef\u001cA\u0015";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = 't';
                        break;
                    }
                    case 1: {
                        c2 = '}';
                        break;
                    }
                    case 2: {
                        c2 = '\"';
                        break;
                    }
                    case 3: {
                        c2 = '}';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0000\u0018Z\t\u001a\u0002\u0013FST\u001a\u0019P\u0012\\\u0010SK\u0013A\u0011\u0013V";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0015\u0013F\u000fZ\u001d\u0019\f\u000fP\u0019\u0012V\u0018\\\u001a\rW\t\u001b\u0006\u0018Q\bY\u0000\u000e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0017\u0015M\u0014V\u0011\u000e";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0011\u0005V\u000fT\u0007";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0018\u001c@\u0018Y";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0006\u0018Q\bY\u00006G\u0004";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0015\u0011N\u0012B2\u000fG\u0018s\u001b\u000fO4[\u0004\bV";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    static Bundle getResultsFromIntent(final Intent intent) {
        final ClipData clipData = intent.getClipData();
        if (clipData != null) {
            final ClipDescription description = clipData.getDescription();
            if (description.hasMimeType(RemoteInputCompatJellybean.z[1]) && description.getLabel().equals(RemoteInputCompatJellybean.z[2])) {
                return (Bundle)clipData.getItemAt(0).getIntent().getExtras().getParcelable(RemoteInputCompatJellybean.z[0]);
            }
        }
        return null;
    }
    
    static Bundle toBundle(final RemoteInputCompatBase$RemoteInput remoteInputCompatBase$RemoteInput) {
        final Bundle bundle = new Bundle();
        bundle.putString(RemoteInputCompatJellybean.z[6], remoteInputCompatBase$RemoteInput.getResultKey());
        bundle.putCharSequence(RemoteInputCompatJellybean.z[5], remoteInputCompatBase$RemoteInput.getLabel());
        bundle.putCharSequenceArray(RemoteInputCompatJellybean.z[3], remoteInputCompatBase$RemoteInput.getChoices());
        bundle.putBoolean(RemoteInputCompatJellybean.z[7], remoteInputCompatBase$RemoteInput.getAllowFreeFormInput());
        bundle.putBundle(RemoteInputCompatJellybean.z[4], remoteInputCompatBase$RemoteInput.getExtras());
        return bundle;
    }
    
    static Bundle[] toBundleArray(final RemoteInputCompatBase$RemoteInput[] array) {
        final int a = NotificationCompatBase$Action.a;
        if (array == null) {
            return null;
        }
        final Bundle[] array2 = new Bundle[array.length];
        int i = 0;
        while (i < array.length) {
            array2[i] = toBundle(array[i]);
            ++i;
            if (a != 0) {
                break;
            }
        }
        return array2;
    }
}
