// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.content.pm.ActivityInfo;
import android.util.Log;
import android.content.pm.PackageManager$NameNotFoundException;
import android.support.v4.content.IntentCompat;
import android.content.Context;
import android.content.ComponentName;
import android.content.Intent;
import android.app.Activity;

class NavUtils$NavUtilsImplBase implements NavUtils$NavUtilsImpl
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u0011!\u001b\u0006\u00136,\u001e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'g';
                        break;
                    }
                    case 0: {
                        c2 = '_';
                        break;
                    }
                    case 1: {
                        c2 = '@';
                        break;
                    }
                    case 2: {
                        c2 = 'm';
                        break;
                    }
                    case 3: {
                        c2 = 'S';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "8%\u0019\u0003\u0006-%\u0003'&<4\u0004%\u000e+9$=\u0013:.\u0019iG=!\ts\u0017>2\b=\u0013\u001e#\u0019:\u001164\u0014\u001d\u00062%Mt";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "x`\u0004=G2!\u0003:\u0001:3\u0019";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ">.\t!\b6$C:\t+%\u0003'I>#\u0019:\b1n \u0012.\u0011";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = ">.\t!\b6$C \u0012/0\u0002!\u0013q\u0010,\u0001\"\u0011\u00142\u0012$\u000b\t;\u001a3\u0006";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public Intent getParentActivityIntent(final Activity activity) {
        final String parentActivityName = NavUtils.getParentActivityName(activity);
        if (parentActivityName == null) {
            return null;
        }
        final ComponentName component = new ComponentName((Context)activity, parentActivityName);
        try {
            if (NavUtils.getParentActivityName((Context)activity, component) == null) {
                try {
                    return IntentCompat.makeMainActivity(component);
                }
                catch (PackageManager$NameNotFoundException ex) {
                    throw ex;
                }
            }
        }
        catch (PackageManager$NameNotFoundException ex2) {
            Log.e(NavUtils$NavUtilsImplBase.z[0], NavUtils$NavUtilsImplBase.z[1] + parentActivityName + NavUtils$NavUtilsImplBase.z[2]);
            return null;
        }
        return new Intent().setComponent(component);
    }
    
    @Override
    public String getParentActivityName(final Context context, final ActivityInfo activityInfo) {
        String string;
        if (activityInfo.metaData == null) {
            string = null;
        }
        else {
            string = activityInfo.metaData.getString(NavUtils$NavUtilsImplBase.z[4]);
            if (string == null) {
                return null;
            }
            if (string.charAt(0) == '.') {
                return context.getPackageName() + string;
            }
        }
        return string;
    }
    
    @Override
    public void navigateUpTo(final Activity activity, final Intent intent) {
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }
    
    @Override
    public boolean shouldUpRecreateTask(final Activity activity, final Intent intent) {
        final String action = activity.getIntent().getAction();
        return action != null && !action.equals(NavUtils$NavUtilsImplBase.z[3]);
    }
}
