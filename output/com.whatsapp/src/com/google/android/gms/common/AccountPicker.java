// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import com.google.android.gms.common.internal.zzu;
import android.os.Parcelable;
import java.io.Serializable;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import android.accounts.Account;

public final class AccountPicker
{
    public static Intent newChooseAccountIntent(final Account account, final ArrayList list, final String[] array, final boolean b, final String s, final String s2, final String[] array2, final Bundle bundle) {
        return zza(account, list, array, b, s, s2, array2, bundle, false);
    }
    
    public static Intent zza(final Account account, final ArrayList list, final String[] array, final boolean b, final String s, final String s2, final String[] array2, final Bundle bundle, final boolean b2) {
        return zza(account, list, array, b, s, s2, array2, bundle, b2, 0, 0);
    }
    
    public static Intent zza(final Account account, final ArrayList list, final String[] array, final boolean b, final String s, final String s2, final String[] array2, final Bundle bundle, final boolean b2, final int n, final int n2) {
        final boolean a = GooglePlayServicesUtil.a;
        final Intent intent = new Intent();
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", (Serializable)list);
        intent.putExtra("allowableAccountTypes", array);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", (Parcelable)account);
        intent.putExtra("alwaysPromptForAccount", b);
        intent.putExtra("descriptionTextOverride", s);
        intent.putExtra("authTokenType", s2);
        intent.putExtra("addAccountRequiredFeatures", array2);
        intent.putExtra("setGmsCoreAccount", b2);
        intent.putExtra("overrideTheme", n);
        intent.putExtra("overrideCustomTheme", n2);
        if (a) {
            ++zzu.a;
        }
        return intent;
    }
}
