// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.app.AlertDialog;
import android.os.Bundle;
import android.app.Dialog;
import com.twitter.android.client.bh;
import com.twitter.library.client.bk;
import android.view.View;
import android.widget.Toast;
import com.twitter.library.api.ay;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.preference.DialogPreference;

public class TwitterAccessPreference extends DialogPreference implements View$OnClickListener, RadioGroup$OnCheckedChangeListener
{
    RadioGroup a;
    Button b;
    EditText c;
    EditText d;
    LinearLayout e;
    RadioGroup f;
    private final SharedPreferences g;
    
    public TwitterAccessPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.setDialogLayoutResource(2130969170);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.setSummary((CharSequence)this.a(defaultSharedPreferences));
        this.g = defaultSharedPreferences;
    }
    
    static ay a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: new             Ljava/net/URL;
        //     5: dup            
        //     6: aload_0        
        //     7: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    10: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    13: checkcast       Ljava/net/HttpURLConnection;
        //    16: astore          4
        //    18: aload           4
        //    20: sipush          10000
        //    23: invokevirtual   java/net/HttpURLConnection.setReadTimeout:(I)V
        //    26: aload           4
        //    28: sipush          15000
        //    31: invokevirtual   java/net/HttpURLConnection.setConnectTimeout:(I)V
        //    34: aload           4
        //    36: ldc             "GET"
        //    38: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //    41: aload           4
        //    43: iconst_1       
        //    44: invokevirtual   java/net/HttpURLConnection.setDoInput:(Z)V
        //    47: aload           4
        //    49: invokevirtual   java/net/HttpURLConnection.connect:()V
        //    52: aload           4
        //    54: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    57: sipush          200
        //    60: if_icmpne       92
        //    63: aload           4
        //    65: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //    68: invokestatic    com/twitter/library/api/bh.a:(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;
        //    71: invokestatic    com/twitter/library/api/bh.l:(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/twitter/library/api/ClientConfiguration;
        //    74: getfield        com/twitter/library/api/ClientConfiguration.b:Lcom/twitter/library/api/ay;
        //    77: astore          11
        //    79: aload           4
        //    81: ifnull          89
        //    84: aload           4
        //    86: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    89: aload           11
        //    91: areturn        
        //    92: aload           4
        //    94: ifnull          102
        //    97: aload           4
        //    99: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   102: aconst_null    
        //   103: areturn        
        //   104: astore          6
        //   106: aconst_null    
        //   107: astore          4
        //   109: aload           4
        //   111: ifnull          119
        //   114: aload           4
        //   116: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   119: aconst_null    
        //   120: areturn        
        //   121: astore          5
        //   123: aconst_null    
        //   124: astore          4
        //   126: aload           4
        //   128: ifnull          136
        //   131: aload           4
        //   133: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   136: aconst_null    
        //   137: areturn        
        //   138: astore_3       
        //   139: aconst_null    
        //   140: astore          4
        //   142: aload           4
        //   144: ifnull          152
        //   147: aload           4
        //   149: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   152: aconst_null    
        //   153: areturn        
        //   154: astore_2       
        //   155: aload_1        
        //   156: ifnull          163
        //   159: aload_1        
        //   160: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   163: aload_2        
        //   164: athrow         
        //   165: astore          10
        //   167: aload           4
        //   169: astore_1       
        //   170: aload           10
        //   172: astore_2       
        //   173: goto            155
        //   176: astore          9
        //   178: goto            142
        //   181: astore          8
        //   183: goto            126
        //   186: astore          7
        //   188: goto            109
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      18     104    109    Ljava/net/MalformedURLException;
        //  2      18     121    126    Ljava/net/ProtocolException;
        //  2      18     138    142    Ljava/io/IOException;
        //  2      18     154    155    Any
        //  18     79     186    191    Ljava/net/MalformedURLException;
        //  18     79     181    186    Ljava/net/ProtocolException;
        //  18     79     176    181    Ljava/io/IOException;
        //  18     79     165    176    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0089:
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
    
    private String a(final SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains("twitter_access_config")) {
            return "Twitter Access is currently On";
        }
        return "Twitter Access is currently Off";
    }
    
    private void b(final String s) {
        final Toast text = Toast.makeText(this.getContext(), (CharSequence)s, 1);
        text.setGravity(48, 0, 0);
        text.show();
    }
    
    protected void onBindDialogView(final View view) {
        super.onBindDialogView(view);
        final SharedPreferences g = this.g;
        final boolean contains = g.contains("twitter_access_config");
        final EditText c = (EditText)view.findViewById(2131887330);
        c.setText((CharSequence)g.getString("twitter_access_carrier", "twitter_test"));
        c.setEnabled(contains);
        this.c = c;
        final EditText d = (EditText)view.findViewById(2131887331);
        d.setText((CharSequence)Long.toString(bk.a().d() / 1000L));
        d.setEnabled(contains);
        this.d = d;
        final RadioGroup radioGroup = (RadioGroup)view.findViewById(2131887327);
        radioGroup.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)this);
        this.f = radioGroup;
        c.setEnabled(contains);
        if (contains) {
            radioGroup.check(2131887329);
        }
        else {
            radioGroup.check(2131887328);
        }
        radioGroup.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)new ga(this));
        this.a = radioGroup;
        this.e = (LinearLayout)view.findViewById(2131886727);
    }
    
    public void onCheckedChanged(final RadioGroup radioGroup, final int n) {
    }
    
    public void onClick(final View view) {
        if (this.a.getCheckedRadioButtonId() == 2131887329) {
            bk.a().a(1000L * Long.parseLong(this.d.getText().toString()));
            new gb(this, null).execute((Object[])new String[] { this.c.getText().toString() });
            return;
        }
        this.b("TwitterAccess is turned off");
        final Dialog dialog = this.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        this.g.edit().remove("twitter_access_carrier").apply();
        bh.a(this.getContext()).a(null, this.g);
        this.setSummary((CharSequence)this.a(this.g));
    }
    
    protected void showDialog(final Bundle bundle) {
        super.showDialog(bundle);
        final Dialog dialog = this.getDialog();
        if (dialog instanceof AlertDialog) {
            (this.b = ((AlertDialog)dialog).getButton(-1)).setOnClickListener((View$OnClickListener)this);
        }
    }
}
