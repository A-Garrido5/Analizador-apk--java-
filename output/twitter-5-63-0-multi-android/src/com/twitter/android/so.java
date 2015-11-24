// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ImageView;
import android.app.AlertDialog;
import android.view.KeyEvent;
import com.twitter.android.util.w;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import com.twitter.library.client.bj;
import com.twitter.library.scribe.ScribeLog;
import android.text.method.MovementMethod;
import com.twitter.library.client.bh;
import com.twitter.library.util.a;
import com.twitter.library.client.App;
import android.text.method.LinkMovementMethod;
import com.twitter.util.collection.CollectionUtils;
import android.app.Activity;
import com.twitter.library.scribe.TwitterScribeLog;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.content.DialogInterface;
import android.widget.TextView;
import android.app.Dialog;
import com.twitter.android.client.bn;
import com.twitter.android.widget.PromptDialogFragment;
import android.widget.Toast;
import com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat;
import android.os.Bundle;
import android.text.TextUtils;
import android.content.Intent;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.library.api.as;
import com.twitter.library.client.Session;
import android.widget.ScrollView;
import android.widget.EditText;
import android.widget.ListAdapter;
import java.util.Collection;
import com.twitter.internal.android.widget.PopupEditText;
import android.widget.ArrayAdapter;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.android.widget.ProgressDialogFragment;
import com.twitter.android.util.ao;
import com.twitter.android.util.k;
import android.widget.Button;
import com.twitter.ui.dialog.e;
import com.twitter.ui.dialog.c;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.graphics.Bitmap;
import android.os.AsyncTask;

class so extends AsyncTask
{
    final /* synthetic */ SignUpActivity a;
    
    so(final SignUpActivity a) {
        this.a = a;
    }
    
    protected Bitmap a(final String... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/net/URL;
        //     3: dup            
        //     4: aload_1        
        //     5: iconst_0       
        //     6: aaload         
        //     7: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    10: invokevirtual   java/net/URL.openStream:()Ljava/io/InputStream;
        //    13: astore          7
        //    15: aload           7
        //    17: astore_3       
        //    18: aload_0        
        //    19: getfield        com/twitter/android/so.a:Lcom/twitter/android/SignUpActivity;
        //    22: aload_3        
        //    23: invokestatic    com/twitter/library/media/decoder/ImageDecoder.a:(Landroid/content/Context;Ljava/io/InputStream;)Lcom/twitter/library/media/decoder/ImageDecoder;
        //    26: invokevirtual   com/twitter/library/media/decoder/ImageDecoder.b:()Landroid/graphics/Bitmap;
        //    29: astore          10
        //    31: aload_3        
        //    32: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    35: aload           10
        //    37: areturn        
        //    38: astore          6
        //    40: aconst_null    
        //    41: astore_3       
        //    42: aload_3        
        //    43: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    46: aconst_null    
        //    47: areturn        
        //    48: astore          5
        //    50: aconst_null    
        //    51: astore_3       
        //    52: aload_3        
        //    53: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    56: aconst_null    
        //    57: areturn        
        //    58: astore_2       
        //    59: aconst_null    
        //    60: astore_3       
        //    61: aload_2        
        //    62: astore          4
        //    64: aload_3        
        //    65: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    68: aload           4
        //    70: athrow         
        //    71: astore          4
        //    73: goto            64
        //    76: astore          9
        //    78: goto            52
        //    81: astore          8
        //    83: goto            42
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      15     38     42     Ljava/net/MalformedURLException;
        //  0      15     48     52     Ljava/io/IOException;
        //  0      15     58     64     Any
        //  18     31     81     86     Ljava/net/MalformedURLException;
        //  18     31     76     81     Ljava/io/IOException;
        //  18     31     71     76     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
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
    
    protected void a(final Bitmap v) {
        this.a.x();
        if (v == null) {
            this.a.u = null;
            this.a.m();
        }
        else {
            this.a.v = v;
            if (!this.a.isFinishing()) {
                this.a.showDialog(1);
            }
        }
    }
}
