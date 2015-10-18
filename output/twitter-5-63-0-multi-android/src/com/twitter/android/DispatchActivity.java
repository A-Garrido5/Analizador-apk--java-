// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.featureswitch.d;
import android.app.ProgressDialog;
import android.app.Dialog;
import com.twitter.library.client.Session;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.twitter.library.client.bh;
import android.preference.PreferenceManager;
import com.twitter.android.metrics.e;
import com.twitter.android.metrics.a;
import com.twitter.android.metrics.LaunchTracker;
import com.twitter.android.util.ap;
import com.twitter.android.util.AppEventTrack;
import com.twitter.android.util.AppEventTrack$EventType;
import android.os.Build$VERSION;
import android.os.StatFs;
import android.os.Environment;
import android.os.Bundle;
import android.view.View;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.account.w;
import com.twitter.library.client.as;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import android.database.Cursor;
import android.support.v4.content.Loader;
import com.twitter.library.client.bj;
import android.net.Uri;
import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import com.twitter.android.util.x;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;

public class DispatchActivity extends BaseFragmentActivity implements LoaderManager$LoaderCallbacks, View$OnClickListener
{
    private c a;
    private az b;
    private x c;
    private SignUpFlowController d;
    private boolean e;
    private fl f;
    private String g;
    
    public DispatchActivity() {
        this.f = new fl(this, null);
    }
    
    public static void a(final Activity activity) {
        activity.startActivity(new Intent((Context)activity, (Class)DispatchActivity.class).setFlags(67108864));
        activity.finish();
    }
    
    public static void a(final Activity activity, final Intent intent) {
        activity.startActivity(new Intent((Context)activity, (Class)DispatchActivity.class).setFlags(67108864).putExtra("android.intent.extra.INTENT", (Parcelable)intent));
        activity.finish();
    }
    
    protected static void a(final fj fj) {
        try {
            if (!fj.a()) {
                fj.b();
            }
        }
        catch (SecurityException ex) {
            fj.b();
        }
    }
    
    private void a(final String s, final String s2, final String s3, final String s4, final String s5, final String s6) {
        final Intent putExtra = new Intent((Context)this, (Class)EditAccountActivity.class).putExtra("fullname", s).putExtra("avatar_uri", s6).putExtra("username", s2).putExtra("email", s3).putExtra("password", s5).putExtra("default_password", s4);
        final Intent intent = (Intent)this.getIntent().getParcelableExtra("android.intent.extra.INTENT");
        if (intent != null) {
            putExtra.putExtra("android.intent.extra.INTENT", (Parcelable)intent);
        }
        this.startActivity(putExtra);
    }
    
    private void c() {
        MainActivity.a(this, null);
    }
    
    private void d() {
        this.a.a(this.b.b().g(), "front:welcome:::impression");
        this.setContentView(2130969117);
        this.findViewById(2131887285).setOnClickListener((View$OnClickListener)this);
        this.findViewById(2131887286).setOnClickListener((View$OnClickListener)this);
    }
    
    private void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: aload_0        
        //     3: ldc             2130969118
        //     5: invokevirtual   com/twitter/android/DispatchActivity.setContentView:(I)V
        //     8: aload_0        
        //     9: ldc             2131886255
        //    11: invokevirtual   com/twitter/android/DispatchActivity.findViewById:(I)Landroid/view/View;
        //    14: checkcast       Landroid/widget/TextView;
        //    17: astore_2       
        //    18: aload_0        
        //    19: getfield        com/twitter/android/DispatchActivity.a:Lcom/twitter/android/client/c;
        //    22: aload_0        
        //    23: getfield        com/twitter/android/DispatchActivity.b:Lcom/twitter/library/client/az;
        //    26: invokevirtual   com/twitter/library/client/az.b:()Lcom/twitter/library/client/Session;
        //    29: invokevirtual   com/twitter/library/client/Session.g:()J
        //    32: iconst_1       
        //    33: anewarray       Ljava/lang/String;
        //    36: dup            
        //    37: iconst_0       
        //    38: ldc             "signup:form:instant_card::impression"
        //    40: aastore        
        //    41: invokevirtual   com/twitter/android/client/c.a:(J[Ljava/lang/String;)V
        //    44: aload_2        
        //    45: invokestatic    android/text/method/LinkMovementMethod.getInstance:()Landroid/text/method/MovementMethod;
        //    48: invokevirtual   android/widget/TextView.setMovementMethod:(Landroid/text/method/MovementMethod;)V
        //    51: aload_0        
        //    52: ldc             2131887288
        //    54: invokevirtual   com/twitter/android/DispatchActivity.findViewById:(I)Landroid/view/View;
        //    57: aload_0        
        //    58: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    61: aload_0        
        //    62: ldc             2131887290
        //    64: invokevirtual   com/twitter/android/DispatchActivity.findViewById:(I)Landroid/view/View;
        //    67: aload_0        
        //    68: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    71: aload_0        
        //    72: ldc             2131887286
        //    74: invokevirtual   com/twitter/android/DispatchActivity.findViewById:(I)Landroid/view/View;
        //    77: aload_0        
        //    78: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    81: aload_0        
        //    82: ldc             2131887287
        //    84: invokevirtual   com/twitter/android/DispatchActivity.findViewById:(I)Landroid/view/View;
        //    87: checkcast       Landroid/widget/TextView;
        //    90: astore_3       
        //    91: aload_0        
        //    92: ldc             2131886373
        //    94: invokevirtual   com/twitter/android/DispatchActivity.findViewById:(I)Landroid/view/View;
        //    97: checkcast       Landroid/widget/TextView;
        //   100: astore          4
        //   102: aload_0        
        //   103: ldc             2131886250
        //   105: invokevirtual   com/twitter/android/DispatchActivity.findViewById:(I)Landroid/view/View;
        //   108: checkcast       Landroid/widget/ImageView;
        //   111: astore          5
        //   113: aload_3        
        //   114: aload_0        
        //   115: getfield        com/twitter/android/DispatchActivity.c:Lcom/twitter/android/util/x;
        //   118: invokeinterface com/twitter/android/util/x.d:()Ljava/lang/String;
        //   123: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   126: aload           4
        //   128: aload_0        
        //   129: getfield        com/twitter/android/DispatchActivity.c:Lcom/twitter/android/util/x;
        //   132: invokeinterface com/twitter/android/util/x.e:()Ljava/lang/String;
        //   137: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   140: aload_0        
        //   141: getfield        com/twitter/android/DispatchActivity.c:Lcom/twitter/android/util/x;
        //   144: invokeinterface com/twitter/android/util/x.i:()Ljava/lang/String;
        //   149: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   152: astore          6
        //   154: aload           6
        //   156: ifnull          228
        //   159: aload_0        
        //   160: invokevirtual   com/twitter/android/DispatchActivity.getContentResolver:()Landroid/content/ContentResolver;
        //   163: aload           6
        //   165: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   168: astore          10
        //   170: aload           10
        //   172: astore          7
        //   174: aload           5
        //   176: aload           7
        //   178: aconst_null    
        //   179: invokestatic    android/graphics/drawable/Drawable.createFromStream:(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
        //   182: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   185: aload           7
        //   187: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   190: return         
        //   191: astore          9
        //   193: aconst_null    
        //   194: astore          7
        //   196: aload           7
        //   198: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   201: return         
        //   202: astore          8
        //   204: aload_1        
        //   205: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   208: aload           8
        //   210: athrow         
        //   211: astore          12
        //   213: aload           7
        //   215: astore_1       
        //   216: aload           12
        //   218: astore          8
        //   220: goto            204
        //   223: astore          11
        //   225: goto            196
        //   228: aconst_null    
        //   229: astore          7
        //   231: goto            185
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  159    170    191    196    Ljava/lang/Exception;
        //  159    170    202    204    Any
        //  174    185    223    228    Ljava/lang/Exception;
        //  174    185    211    223    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0185:
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
    
    private void f() {
        this.showDialog(1);
        this.e = true;
        this.c.p();
        this.g = this.b.a(this.c.d(), this.c.f(), this.c.e(), this.c.h(), "", "", this.f, null);
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        if (cursor == null || !cursor.moveToFirst()) {
            this.c.a("name", "failure");
            this.d();
            return;
        }
        this.c.c(cursor.getString(cursor.getColumnIndex("display_name")));
        final String d = this.c.d();
        if (TextUtils.isEmpty((CharSequence)d)) {
            this.c.a("name", "failure_empty");
            this.d();
            return;
        }
        if (!d.equals(bq.e(d))) {
            this.c.a("name", "failure_twitter");
            this.d();
            return;
        }
        if (kq.a.matcher(d).matches()) {
            this.c.a("name", "failure_all_digits");
            this.d();
            return;
        }
        if (d.length() >= 20) {
            this.c.a("name", "failure_length");
            this.d();
            return;
        }
        this.c.a("name", "success");
        this.e();
        this.b();
    }
    
    void b() {
        as.a((Context)this).a(new w((Context)this, this.b.b(), this.c.d(), this.c.e()), new fm(this));
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getWindow().setFormat(1);
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131887286) {
            this.a.a(this.b.b().g(), "signup:form:sign_in:button:click");
            this.startActivity(new Intent((Context)this, (Class)LoginActivity.class).putExtra("android.intent.extra.INTENT", this.getIntent().getParcelableExtra("android.intent.extra.INTENT")));
        }
        else {
            if (id == 2131887288) {
                this.a.a(this.b.b().g(), "signup:form:instant_card:button:click");
                this.f();
                return;
            }
            if (id == 2131887285 || id == 2131887290) {
                this.a.a(this.b.b().g(), "signup:form:sign_up:button:click");
                final Intent intent = this.getIntent();
                final Intent intent2 = new Intent((Context)this, (Class)SignUpActivity.class);
                if (intent.hasExtra("android.intent.extra.INTENT")) {
                    intent2.putExtra("android.intent.extra.INTENT", intent.getParcelableExtra("android.intent.extra.INTENT"));
                }
                this.d.b(intent2);
                this.startActivity(intent2);
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int n;
        if (statFs.getBlockSize() * statFs.getAvailableBlocks() > 102400L) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            this.startActivity(new Intent((Context)this, (Class)DiskCleanupPromptActivity.class));
            this.finish();
        }
        else {
            this.e = false;
            this.a = com.twitter.android.client.c.a((Context)this);
            this.b = az.a((Context)this);
            this.c = com.twitter.android.util.w.a((Context)this);
            this.d = SignUpFlowController.a((Context)this);
            final Intent intent = this.getIntent();
            if (intent.hasExtra("scribe_event") && intent.hasExtra("scribe_context")) {
                this.a.a(this.b.b().g(), new String[] { intent.getStringExtra("scribe_event"), intent.getStringExtra("scribe_context") });
                intent.removeExtra("scribe_event");
                intent.removeExtra("scribe_context");
            }
            final PackageManager packageManager = this.getPackageManager();
            while (true) {
                try {
                    final int versionCode = packageManager.getPackageInfo(this.getPackageName(), 0).versionCode;
                    final SharedPreferences preferences = this.getPreferences(0);
                    final int int1 = preferences.getInt("version_code_for_app_update", -1);
                    if (int1 == -1) {
                        as.a(this.getApplicationContext()).a(new mn(this.getApplicationContext(), this.b.b(), "android:" + Build$VERSION.RELEASE), new fk(this.getApplicationContext()));
                    }
                    if (versionCode != int1) {
                        AppEventTrack.a(this.getApplicationContext(), AppEventTrack$EventType.e, new String[0]);
                        final SharedPreferences$Editor edit = preferences.edit();
                        edit.putInt("version_code_for_app_update", versionCode);
                        edit.apply();
                    }
                    ap.a((Context)this).i();
                    final Session b = az.a((Context)this).b();
                    if (b.d()) {
                        LaunchTracker.a().a(intent);
                        final ir b2 = ir.b();
                        final long g = b.g();
                        com.twitter.android.metrics.a.a(b2, g).i();
                        com.twitter.android.metrics.e.a(b2, g).i();
                        this.c.k();
                        if (this.c.b()) {
                            this.a.a(this.b.b().g(), "edit_account:form:::return_impression");
                            this.a(this.c.d(), this.c.f(), this.c.e(), this.c.h(), this.c.g(), this.c.i());
                            return;
                        }
                        if (!FollowFlowController.e(this)) {
                            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this);
                            final String string = defaultSharedPreferences.getString("pref_category", (String)null);
                            if (string != null) {
                                this.startActivity(new Intent((Context)this, (Class)EmailExploreFetchCategoryUsersActivity.class).putExtra("explore_email_category", string).putExtra("explore_email_country", defaultSharedPreferences.getString("pref_country", (String)null)).addFlags(1073741824));
                                this.finish();
                                return;
                            }
                            if (this.getIntent().getParcelableExtra("android.intent.extra.INTENT") == null) {
                                this.c();
                            }
                        }
                    }
                    else {
                        if (bundle == null) {
                            kg.b(this, "welcome");
                            this.c.j().l().m().n().o();
                        }
                        else {
                            this.c.a(bundle);
                            this.g = bundle.getString("reqId");
                            this.b.a(this.g, this.f);
                        }
                        if (this.c.b()) {
                            this.getSupportLoaderManager().initLoader(0, null, this);
                            return;
                        }
                        this.d();
                    }
                }
                catch (PackageManager$NameNotFoundException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setProgressStyle(0);
                progressDialog.setMessage(this.getText(2131297807));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return this.c.c();
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.b != null) {
            this.b.e(this.g);
        }
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
    }
    
    @Override
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        this.removeDialog(1);
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.c.b(bundle);
        bundle.putString("reqId", this.g);
    }
    
    public boolean onSearchRequested() {
        return false;
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        com.twitter.library.featureswitch.d.a(this.getApplicationContext(), this.b.b().g());
        if (!az.a((Context)this).b().d()) {
            this.a.a(this.b.b().g(), "front::::impression");
            return;
        }
        if (FollowFlowController.e(this)) {
            FollowFlowController.f(this);
            return;
        }
        if (this.getIntent().getParcelableExtra("android.intent.extra.INTENT") != null) {
            a(new fj(this));
            return;
        }
        this.c();
    }
}
