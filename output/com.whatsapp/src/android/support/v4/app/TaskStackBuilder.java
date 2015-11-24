// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.support.v4.content.ContextCompat;
import android.os.Bundle;
import java.util.Iterator;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.ComponentName;
import android.app.Activity;
import android.content.Intent;
import android.os.Build$VERSION;
import android.content.Context;
import java.util.ArrayList;

public class TaskStackBuilder implements Iterable
{
    private static final TaskStackBuilder$TaskStackBuilderImpl IMPL;
    private static final String[] z;
    private final ArrayList mIntents;
    private final Context mSourceContext;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u000bj\u001a5&1`T(;ed^8-!%N3h\u0011dI7\u001b1dY7\n0lV8-7>\u001a?)+kU(h6q[.<\u0004fN5>,qS9;";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0015:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
            Label_0184_Outer:
                while (true) {
                    Label_0139: {
                        if (length > n3) {
                            break Label_0139;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "\u0007d^|\u000b*hJ3& kN\u0012)(`\u001a+ ,i_|<7dL9:6lT;h$fN5>,qC|8$w_2<eh_()!dN=";
                                n2 = 1;
                                array = z2;
                                n = 0;
                                continue Label_0015;
                            }
                            case 0: {
                                array[n2] = intern;
                                n2 = 2;
                                array = z2;
                                s = "\u0011dI7\u001b1dY7\n0lV8-7";
                                n = 1;
                                continue Label_0015;
                            }
                            case 1: {
                                break;
                            }
                        }
                        array[n2] = intern;
                        z = z2;
                        try {
                            if (Build$VERSION.SDK_INT >= 11) {
                                IMPL = new TaskStackBuilder$TaskStackBuilderImplHoneycomb();
                                return;
                            }
                            break Label_0015;
                            Label_0180: {
                                final char c = 'H';
                            }
                            while (true) {
                                break Label_0184;
                                Label_0214:
                                char c = ':';
                                break Label_0184;
                                final char c2 = charArray[n3];
                                Label_0208:
                                c = '\u0005';
                                charArray[n3] = (char)(c ^ c2);
                                ++n3;
                                continue Label_0184_Outer;
                                Label_0221:
                                c = '\\';
                                continue;
                                Label_0201:
                                c = 'E';
                                continue;
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@50ca044a, n3 % 5)
                        catch (IllegalArgumentException ex) {
                            throw ex;
                        }
                    }
                    break Label_0015;
                }
            }
            break;
        }
        IMPL = new TaskStackBuilder$TaskStackBuilderImplBase();
    }
    
    private TaskStackBuilder(final Context mSourceContext) {
        this.mIntents = new ArrayList();
        this.mSourceContext = mSourceContext;
    }
    
    public static TaskStackBuilder create(final Context context) {
        return new TaskStackBuilder(context);
    }
    
    public TaskStackBuilder addNextIntent(final Intent intent) {
        this.mIntents.add(intent);
        return this;
    }
    
    public TaskStackBuilder addParentStack(final Activity activity) {
        final boolean b = activity instanceof TaskStackBuilder$SupportParentable;
        Intent supportParentActivityIntent = null;
        if (b) {
            supportParentActivityIntent = ((TaskStackBuilder$SupportParentable)activity).getSupportParentActivityIntent();
        }
        Intent parentActivityIntent;
        if (supportParentActivityIntent == null) {
            parentActivityIntent = NavUtils.getParentActivityIntent(activity);
        }
        else {
            parentActivityIntent = supportParentActivityIntent;
        }
        if (parentActivityIntent != null) {
            ComponentName componentName = parentActivityIntent.getComponent();
            if (componentName == null) {
                componentName = parentActivityIntent.resolveActivity(this.mSourceContext.getPackageManager());
            }
            this.addParentStack(componentName);
            this.addNextIntent(parentActivityIntent);
        }
        return this;
    }
    
    public TaskStackBuilder addParentStack(final ComponentName componentName) {
        final int a = Fragment.a;
        final int size = this.mIntents.size();
        try {
            Intent intent = NavUtils.getParentActivityIntent(this.mSourceContext, componentName);
            while (intent != null) {
                this.mIntents.add(size, intent);
                intent = NavUtils.getParentActivityIntent(this.mSourceContext, intent.getComponent());
                if (a != 0) {
                    break;
                }
            }
            return this;
        }
        catch (PackageManager$NameNotFoundException ex) {
            Log.e(TaskStackBuilder.z[2], TaskStackBuilder.z[1]);
            throw new IllegalArgumentException((Throwable)ex);
        }
    }
    
    @Override
    public Iterator iterator() {
        return this.mIntents.iterator();
    }
    
    public void startActivities() {
        this.startActivities(null);
    }
    
    public void startActivities(final Bundle bundle) {
        try {
            if (this.mIntents.isEmpty()) {
                throw new IllegalStateException(TaskStackBuilder.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final Intent[] array = this.mIntents.toArray(new Intent[this.mIntents.size()]);
        array[0] = new Intent(array[0]).addFlags(268484608);
        if (!ContextCompat.startActivities(this.mSourceContext, array, bundle)) {
            final Intent intent = new Intent(array[-1 + array.length]);
            intent.addFlags(268435456);
            this.mSourceContext.startActivity(intent);
        }
    }
}
