// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Map;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.z;
import com.twitter.library.client.az;
import com.twitter.android.widget.MessagePreference;
import android.os.Bundle;
import java.util.Iterator;
import com.twitter.android.widget.UserCheckBoxPreference;
import com.twitter.library.api.TwitterUser;
import java.util.ArrayList;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.android.client.x;
import com.twitter.library.platform.PushService;
import android.content.Context;
import java.util.HashMap;
import android.content.Intent;
import android.preference.Preference;
import com.twitter.library.client.Session;
import android.preference.PreferenceCategory;
import android.preference.CheckBoxPreference;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class TweetSettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener
{
    CheckBoxPreference a;
    PreferenceCategory b;
    private Session c;
    private Preference d;
    private Preference e;
    private Intent f;
    private final HashMap g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    
    public TweetSettingsActivity() {
        this.g = new HashMap();
        this.h = -1;
    }
    
    private Intent a(final boolean j, final int n) {
        if (this.f == null) {
            this.f = new Intent();
        }
        this.j = j;
        this.f.putExtra("enabled", j).putExtra("count", n);
        return this.f;
    }
    
    public static void a(final Context context, final String s, final boolean b) {
        final boolean g = PushService.g(context, s);
        final x a = x.a(context);
        if (b) {
            a.a(s, !g);
            return;
        }
        a.c(s);
    }
    
    public static boolean a(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: getstatic       com/twitter/library/provider/n.a:Landroid/net/Uri;
        //     7: aload_1        
        //     8: invokestatic    android/net/Uri.withAppendedPath:(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
        //    11: iconst_1       
        //    12: anewarray       Ljava/lang/String;
        //    15: dup            
        //    16: iconst_0       
        //    17: ldc             "notif_tweet"
        //    19: aastore        
        //    20: aconst_null    
        //    21: aconst_null    
        //    22: aconst_null    
        //    23: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    26: astore          4
        //    28: aload           4
        //    30: astore_3       
        //    31: aload_3        
        //    32: ifnull          113
        //    35: aload_3        
        //    36: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    41: ifeq            113
        //    44: aload_3        
        //    45: iconst_0       
        //    46: invokeinterface android/database/Cursor.isNull:(I)Z
        //    51: ifne            113
        //    54: aload_3        
        //    55: iconst_0       
        //    56: invokeinterface android/database/Cursor.getInt:(I)I
        //    61: istore          7
        //    63: iload           7
        //    65: istore          5
        //    67: iload           5
        //    69: ifeq            88
        //    72: iconst_1       
        //    73: istore          6
        //    75: aload_3        
        //    76: ifnull          85
        //    79: aload_3        
        //    80: invokeinterface android/database/Cursor.close:()V
        //    85: iload           6
        //    87: ireturn        
        //    88: iconst_0       
        //    89: istore          6
        //    91: goto            75
        //    94: astore_2       
        //    95: aconst_null    
        //    96: astore_3       
        //    97: aload_3        
        //    98: ifnull          107
        //   101: aload_3        
        //   102: invokeinterface android/database/Cursor.close:()V
        //   107: aload_2        
        //   108: athrow         
        //   109: astore_2       
        //   110: goto            97
        //   113: iconst_0       
        //   114: istore          5
        //   116: goto            67
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      28     94     97     Any
        //  35     63     109    113    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0067:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void b() {
        if (this.d == null) {
            final Preference d = new Preference((Context)this);
            d.setOrder(0);
            d.setTitle(2131297732);
            d.setShouldDisableView(false);
            d.setSelectable(false);
            this.d = d;
        }
        this.b.addPreference(this.d);
    }
    
    public void a(final int n, final y y) {
        final aa aa = (aa)y.l().b();
        if (n == 1) {
            final oy oy = (oy)y;
            this.a.setEnabled(true);
            if (!aa.a()) {
                this.b.setTitle((CharSequence)null);
                Toast.makeText((Context)this, 2131298068, 1).show();
                return;
            }
            this.a(oy.a());
        }
    }
    
    void a(final ArrayList list) {
        final boolean checked = this.a.isChecked();
        final PreferenceCategory b = this.b;
        int n;
        if (list.isEmpty()) {
            if (checked) {
                this.b();
                n = 0;
            }
            else {
                n = 0;
            }
        }
        else {
            final Iterator<TwitterUser> iterator = list.iterator();
            n = 0;
            while (iterator.hasNext()) {
                final TwitterUser twitterUser = iterator.next();
                final UserCheckBoxPreference userCheckBoxPreference = new UserCheckBoxPreference((Context)this);
                userCheckBoxPreference.a(twitterUser);
                userCheckBoxPreference.setDefaultValue((Object)twitterUser.friendship);
                userCheckBoxPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
                b.addPreference((Preference)userCheckBoxPreference);
                userCheckBoxPreference.setDependency("notif_tweets");
                ++n;
            }
            this.e.setOrder(n + 1);
        }
        b.setTitle((CharSequence)this.getResources().getQuantityString(2131427351, n, new Object[] { n }));
        this.b = b;
        this.h = n;
        this.i = n;
        this.setResult(-1, this.a(checked, this.i));
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = this.getIntent();
        this.addPreferencesFromResource(2131165211);
        final CheckBoxPreference a = (CheckBoxPreference)this.findPreference((CharSequence)"notif_tweets");
        this.setTitle(2131297731);
        this.j = intent.getBooleanExtra("enabled", false);
        this.k = this.j;
        a.setChecked(this.j);
        a.setEnabled(false);
        a.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.a = a;
        final PreferenceCategory b = new PreferenceCategory((Context)this);
        b.setTitle(2131297168);
        this.getPreferenceScreen().addPreference((Preference)b);
        this.b = b;
        final MessagePreference e = new MessagePreference((Context)this);
        e.setKey("msg");
        e.setSummary((CharSequence)this.getString(2131297733, new Object[] { this.getString(2131298067) }));
        e.setShouldDisableView(false);
        e.setSelectable(false);
        e.setPersistent(false);
        b.addPreference(this.e = e);
        final Session b2 = az.a((Context)this).b(intent.getStringExtra("TweetSettingsActivity_account_name"));
        this.c = b2;
        this.a(new oy((Context)this, b2, 16).c(400), 1);
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        boolean booleanValue;
        if ("notif_tweets".equals(preference.getKey())) {
            booleanValue = (boolean)o;
            if (this.h == 0) {
                if (booleanValue) {
                    this.b();
                }
                else if (this.d != null) {
                    this.b.removePreference(this.d);
                }
            }
        }
        else {
            final boolean checked = this.a.isChecked();
            final TwitterUser a = ((UserCheckBoxPreference)preference).a();
            if (z.i((int)o)) {
                this.g.remove(a.userId);
                ++this.i;
                booleanValue = checked;
            }
            else {
                this.g.put(a.userId, a);
                --this.i;
                final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(this.c.g());
                ((TwitterScribeLog)twitterScribeLog.b(new String[] { "settings:notifications::device_follow:deselect" })).a(a.userId);
                this.Y.a(twitterScribeLog);
                booleanValue = checked;
            }
        }
        this.setResult(-1, this.a(booleanValue, this.i));
        return true;
    }
    
    protected void onStop() {
        super.onStop();
        final Session c = this.c;
        final Iterator<Map.Entry<K, TwitterUser>> iterator = this.g.entrySet().iterator();
        while (iterator.hasNext()) {
            this.a(new py((Context)this, c, iterator.next().getValue()).a(1, false));
        }
        if (this.k != this.j && this.getIntent().getBooleanExtra("from_notification_landing", false)) {
            new wz(this, null).execute((Object[])new Void[0]);
        }
    }
}
