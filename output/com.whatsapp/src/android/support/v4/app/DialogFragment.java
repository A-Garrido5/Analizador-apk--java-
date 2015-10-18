// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.support.annotation.NonNull;
import android.content.Context;
import android.support.annotation.Nullable;
import android.content.DialogInterface;
import android.view.View;
import android.app.Activity;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.app.Dialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;

public class DialogFragment extends Fragment implements DialogInterface$OnCancelListener, DialogInterface$OnDismissListener
{
    private static final String[] z;
    int mBackStackId;
    boolean mCancelable;
    Dialog mDialog;
    boolean mDismissed;
    boolean mShownByMe;
    boolean mShowsDialog;
    int mStyle;
    int mTheme;
    boolean mViewDestroyed;
    
    static {
        final String[] z2 = new String[15];
        String s = "p:-5\rx0s4\n~#:\u0003\u000bp8& ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'b';
                        break;
                    }
                    case 0: {
                        c2 = '\u0011';
                        break;
                    }
                    case 1: {
                        c2 = 'T';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
                        break;
                    }
                    case 3: {
                        c2 = 'G';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "p:-5\rx0s$\u0003\u007f7,+\u0003s8,";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "p:-5\rx0s4\u0016h8,";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "p:-5\rx0s%\u0003r?\u001a3\u0003r?\u0000#";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "p:-5\rx0s3\nt9,";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "p:-5\rx0s4\u0003g1-\u0003\u000bp8& 1e5=\"";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "U=(+\rv\u0012;&\u0005|1'3Br5'g\f~ i%\u000715=3\u0003r<,#Be;i&Br;'3\u0003x:,5Bg=,0";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "}50(\u0017e\u000b )\u0004}5=\"\u0010";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "}50(\u0017e\u000b )\u0004}5=\"\u0010";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "p:-5\rx0s4\n~#:\u0003\u000bp8& ";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "p:-5\rx0s4\u0016h8,";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "p:-5\rx0s4\u0003g1-\u0003\u000bp8& 1e5=\"";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "p:-5\rx0s3\nt9,";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "p:-5\rx0s$\u0003\u007f7,+\u0003s8,";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "p:-5\rx0s%\u0003r?\u001a3\u0003r?\u0000#";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    break Label_0407;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public DialogFragment() {
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
    }
    
    public void dismiss() {
        this.dismissInternal(false);
    }
    
    public void dismissAllowingStateLoss() {
        this.dismissInternal(true);
    }
    
    void dismissInternal(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v4/app/DialogFragment.mDismissed:Z
        //     8: istore          4
        //    10: iload           4
        //    12: ifeq            19
        //    15: return         
        //    16: astore_3       
        //    17: aload_3        
        //    18: athrow         
        //    19: aload_0        
        //    20: iconst_1       
        //    21: putfield        android/support/v4/app/DialogFragment.mDismissed:Z
        //    24: aload_0        
        //    25: iconst_0       
        //    26: putfield        android/support/v4/app/DialogFragment.mShownByMe:Z
        //    29: aload_0        
        //    30: getfield        android/support/v4/app/DialogFragment.mDialog:Landroid/app/Dialog;
        //    33: ifnull          48
        //    36: aload_0        
        //    37: getfield        android/support/v4/app/DialogFragment.mDialog:Landroid/app/Dialog;
        //    40: invokevirtual   android/app/Dialog.dismiss:()V
        //    43: aload_0        
        //    44: aconst_null    
        //    45: putfield        android/support/v4/app/DialogFragment.mDialog:Landroid/app/Dialog;
        //    48: aload_0        
        //    49: iconst_1       
        //    50: putfield        android/support/v4/app/DialogFragment.mViewDestroyed:Z
        //    53: aload_0        
        //    54: getfield        android/support/v4/app/DialogFragment.mBackStackId:I
        //    57: iflt            81
        //    60: aload_0        
        //    61: invokevirtual   android/support/v4/app/DialogFragment.getFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //    64: aload_0        
        //    65: getfield        android/support/v4/app/DialogFragment.mBackStackId:I
        //    68: iconst_1       
        //    69: invokevirtual   android/support/v4/app/FragmentManager.popBackStack:(II)V
        //    72: aload_0        
        //    73: iconst_m1      
        //    74: putfield        android/support/v4/app/DialogFragment.mBackStackId:I
        //    77: iload_2        
        //    78: ifeq            15
        //    81: aload_0        
        //    82: invokevirtual   android/support/v4/app/DialogFragment.getFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //    85: invokevirtual   android/support/v4/app/FragmentManager.beginTransaction:()Landroid/support/v4/app/FragmentTransaction;
        //    88: astore          7
        //    90: aload           7
        //    92: aload_0        
        //    93: invokevirtual   android/support/v4/app/FragmentTransaction.remove:(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
        //    96: pop            
        //    97: iload_1        
        //    98: ifeq            111
        //   101: aload           7
        //   103: invokevirtual   android/support/v4/app/FragmentTransaction.commitAllowingStateLoss:()I
        //   106: pop            
        //   107: iload_2        
        //   108: ifeq            15
        //   111: aload           7
        //   113: invokevirtual   android/support/v4/app/FragmentTransaction.commit:()I
        //   116: pop            
        //   117: return         
        //   118: astore          9
        //   120: aload           9
        //   122: athrow         
        //   123: astore          5
        //   125: aload           5
        //   127: athrow         
        //   128: astore          6
        //   130: aload           6
        //   132: athrow         
        //   133: astore          8
        //   135: aload           8
        //   137: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     16     19     Ljava/lang/IllegalStateException;
        //  19     48     123    128    Ljava/lang/IllegalStateException;
        //  48     77     128    133    Ljava/lang/IllegalStateException;
        //  90     97     133    138    Ljava/lang/IllegalStateException;
        //  101    107    118    123    Ljava/lang/IllegalStateException;
        //  111    117    118    123    Ljava/lang/IllegalStateException;
        //  135    138    118    123    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 74, Size: 74
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    @Override
    public LayoutInflater getLayoutInflater(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/DialogFragment.mShowsDialog:Z
        //     4: ifne            20
        //     7: aload_0        
        //     8: aload_1        
        //     9: invokespecial   android/support/v4/app/Fragment.getLayoutInflater:(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
        //    12: astore          8
        //    14: aload           8
        //    16: areturn        
        //    17: astore_2       
        //    18: aload_2        
        //    19: athrow         
        //    20: aload_0        
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   android/support/v4/app/DialogFragment.onCreateDialog:(Landroid/os/Bundle;)Landroid/app/Dialog;
        //    26: putfield        android/support/v4/app/DialogFragment.mDialog:Landroid/app/Dialog;
        //    29: aload_0        
        //    30: getfield        android/support/v4/app/DialogFragment.mStyle:I
        //    33: istore          4
        //    35: iload           4
        //    37: tableswitch {
        //                2: 107
        //                3: 107
        //                4: 95
        //          default: 64
        //        }
        //    64: aload_0        
        //    65: getfield        android/support/v4/app/DialogFragment.mDialog:Landroid/app/Dialog;
        //    68: ifnull          127
        //    71: aload_0        
        //    72: getfield        android/support/v4/app/DialogFragment.mDialog:Landroid/app/Dialog;
        //    75: invokevirtual   android/app/Dialog.getContext:()Landroid/content/Context;
        //    78: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //    81: bipush          7
        //    83: aaload         
        //    84: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    87: checkcast       Landroid/view/LayoutInflater;
        //    90: astore          7
        //    92: aload           7
        //    94: areturn        
        //    95: aload_0        
        //    96: getfield        android/support/v4/app/DialogFragment.mDialog:Landroid/app/Dialog;
        //    99: invokevirtual   android/app/Dialog.getWindow:()Landroid/view/Window;
        //   102: bipush          24
        //   104: invokevirtual   android/view/Window.addFlags:(I)V
        //   107: aload_0        
        //   108: getfield        android/support/v4/app/DialogFragment.mDialog:Landroid/app/Dialog;
        //   111: iconst_1       
        //   112: invokevirtual   android/app/Dialog.requestWindowFeature:(I)Z
        //   115: pop            
        //   116: goto            64
        //   119: astore_3       
        //   120: aload_3        
        //   121: athrow         
        //   122: astore          6
        //   124: aload           6
        //   126: athrow         
        //   127: aload_0        
        //   128: getfield        android/support/v4/app/DialogFragment.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   131: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //   134: bipush          8
        //   136: aaload         
        //   137: invokevirtual   android/support/v4/app/FragmentActivity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   140: checkcast       Landroid/view/LayoutInflater;
        //   143: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      14     17     20     Ljava/lang/IllegalStateException;
        //  20     35     119    122    Ljava/lang/IllegalStateException;
        //  64     92     122    127    Ljava/lang/IllegalStateException;
        //  95     107    119    122    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
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
    
    public int getTheme() {
        return this.mTheme;
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        Bundle bundle2;
        while (true) {
            try {
                super.onActivityCreated(bundle);
                if (!this.mShowsDialog) {
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            final View view = this.getView();
            if (view != null) {
                try {
                    if (view.getParent() != null) {
                        throw new IllegalStateException(DialogFragment.z[6]);
                    }
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
                this.mDialog.setContentView(view);
            }
            this.mDialog.setOwnerActivity((Activity)this.getActivity());
            this.mDialog.setCancelable(this.mCancelable);
            this.mDialog.setOnCancelListener((DialogInterface$OnCancelListener)this);
            this.mDialog.setOnDismissListener((DialogInterface$OnDismissListener)this);
            if (bundle == null) {
                return;
            }
            bundle2 = bundle.getBundle(DialogFragment.z[5]);
            if (bundle2 != null) {
                break;
            }
            return;
        }
        try {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
        catch (IllegalStateException ex3) {
            throw ex3;
        }
    }
    
    @Override
    public void onAttach(final Activity activity) {
        try {
            super.onAttach(activity);
            if (!this.mShownByMe) {
                this.mDismissed = false;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
    }
    
    @Override
    public void onCreate(@Nullable final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_0        
        //     3: aload_1        
        //     4: invokespecial   android/support/v4/app/Fragment.onCreate:(Landroid/os/Bundle;)V
        //     7: aload_0        
        //     8: getfield        android/support/v4/app/DialogFragment.mContainerId:I
        //    11: istore          4
        //    13: iload           4
        //    15: ifne            104
        //    18: aload_0        
        //    19: iload_2        
        //    20: putfield        android/support/v4/app/DialogFragment.mShowsDialog:Z
        //    23: aload_1        
        //    24: ifnull          100
        //    27: aload_0        
        //    28: aload_1        
        //    29: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //    32: iconst_2       
        //    33: aaload         
        //    34: iconst_0       
        //    35: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //    38: putfield        android/support/v4/app/DialogFragment.mStyle:I
        //    41: aload_0        
        //    42: aload_1        
        //    43: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //    46: iconst_4       
        //    47: aaload         
        //    48: iconst_0       
        //    49: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //    52: putfield        android/support/v4/app/DialogFragment.mTheme:I
        //    55: aload_0        
        //    56: aload_1        
        //    57: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //    60: iconst_1       
        //    61: aaload         
        //    62: iconst_1       
        //    63: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //    66: putfield        android/support/v4/app/DialogFragment.mCancelable:Z
        //    69: aload_0        
        //    70: aload_1        
        //    71: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //    74: iconst_0       
        //    75: aaload         
        //    76: aload_0        
        //    77: getfield        android/support/v4/app/DialogFragment.mShowsDialog:Z
        //    80: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //    83: putfield        android/support/v4/app/DialogFragment.mShowsDialog:Z
        //    86: aload_0        
        //    87: aload_1        
        //    88: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //    91: iconst_3       
        //    92: aaload         
        //    93: iconst_m1      
        //    94: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //    97: putfield        android/support/v4/app/DialogFragment.mBackStackId:I
        //   100: return         
        //   101: astore_3       
        //   102: aload_3        
        //   103: athrow         
        //   104: iconst_0       
        //   105: istore_2       
        //   106: goto            18
        //   109: astore          5
        //   111: aload           5
        //   113: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      13     101    104    Ljava/lang/IllegalStateException;
        //  18     23     109    114    Ljava/lang/IllegalStateException;
        //  27     100    109    114    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
    
    @NonNull
    public Dialog onCreateDialog(final Bundle bundle) {
        return new Dialog((Context)this.getActivity(), this.getTheme());
    }
    
    @Override
    public void onDestroyView() {
        try {
            super.onDestroyView();
            if (this.mDialog != null) {
                this.mViewDestroyed = true;
                this.mDialog.dismiss();
                this.mDialog = null;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onDetach() {
        try {
            super.onDetach();
            if (this.mShownByMe) {
                return;
            }
            final DialogFragment dialogFragment = this;
            final boolean b = dialogFragment.mDismissed;
            if (!b) {
                final DialogFragment dialogFragment2 = this;
                final boolean b2 = true;
                dialogFragment2.mDismissed = b2;
            }
            return;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final DialogFragment dialogFragment = this;
            final boolean b = dialogFragment.mDismissed;
            if (!b) {
                final DialogFragment dialogFragment2 = this;
                final boolean b2 = true;
                dialogFragment2.mDismissed = b2;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        try {
            if (!this.mViewDestroyed) {
                this.dismissInternal(true);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   android/support/v4/app/Fragment.onSaveInstanceState:(Landroid/os/Bundle;)V
        //     5: aload_0        
        //     6: getfield        android/support/v4/app/DialogFragment.mDialog:Landroid/app/Dialog;
        //     9: ifnull          38
        //    12: aload_0        
        //    13: getfield        android/support/v4/app/DialogFragment.mDialog:Landroid/app/Dialog;
        //    16: invokevirtual   android/app/Dialog.onSaveInstanceState:()Landroid/os/Bundle;
        //    19: astore          7
        //    21: aload           7
        //    23: ifnull          38
        //    26: aload_1        
        //    27: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //    30: bipush          11
        //    32: aaload         
        //    33: aload           7
        //    35: invokevirtual   android/os/Bundle.putBundle:(Ljava/lang/String;Landroid/os/Bundle;)V
        //    38: aload_0        
        //    39: getfield        android/support/v4/app/DialogFragment.mStyle:I
        //    42: ifeq            59
        //    45: aload_1        
        //    46: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //    49: bipush          10
        //    51: aaload         
        //    52: aload_0        
        //    53: getfield        android/support/v4/app/DialogFragment.mStyle:I
        //    56: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //    59: aload_0        
        //    60: getfield        android/support/v4/app/DialogFragment.mTheme:I
        //    63: ifeq            80
        //    66: aload_1        
        //    67: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //    70: bipush          12
        //    72: aaload         
        //    73: aload_0        
        //    74: getfield        android/support/v4/app/DialogFragment.mTheme:I
        //    77: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //    80: aload_0        
        //    81: getfield        android/support/v4/app/DialogFragment.mCancelable:Z
        //    84: ifne            101
        //    87: aload_1        
        //    88: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //    91: bipush          13
        //    93: aaload         
        //    94: aload_0        
        //    95: getfield        android/support/v4/app/DialogFragment.mCancelable:Z
        //    98: invokevirtual   android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
        //   101: aload_0        
        //   102: getfield        android/support/v4/app/DialogFragment.mShowsDialog:Z
        //   105: ifne            122
        //   108: aload_1        
        //   109: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //   112: bipush          9
        //   114: aaload         
        //   115: aload_0        
        //   116: getfield        android/support/v4/app/DialogFragment.mShowsDialog:Z
        //   119: invokevirtual   android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
        //   122: aload_0        
        //   123: getfield        android/support/v4/app/DialogFragment.mBackStackId:I
        //   126: iconst_m1      
        //   127: if_icmpeq       144
        //   130: aload_1        
        //   131: getstatic       android/support/v4/app/DialogFragment.z:[Ljava/lang/String;
        //   134: bipush          14
        //   136: aaload         
        //   137: aload_0        
        //   138: getfield        android/support/v4/app/DialogFragment.mBackStackId:I
        //   141: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   144: return         
        //   145: astore          8
        //   147: aload           8
        //   149: athrow         
        //   150: astore_2       
        //   151: aload_2        
        //   152: athrow         
        //   153: astore_3       
        //   154: aload_3        
        //   155: athrow         
        //   156: astore          4
        //   158: aload           4
        //   160: athrow         
        //   161: astore          5
        //   163: aload           5
        //   165: athrow         
        //   166: astore          6
        //   168: aload           6
        //   170: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  26     38     145    150    Ljava/lang/IllegalStateException;
        //  38     59     150    153    Ljava/lang/IllegalStateException;
        //  59     80     153    156    Ljava/lang/IllegalStateException;
        //  80     101    156    161    Ljava/lang/IllegalStateException;
        //  101    122    161    166    Ljava/lang/IllegalStateException;
        //  122    144    166    171    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 88, Size: 88
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    @Override
    public void onStart() {
        try {
            super.onStart();
            if (this.mDialog != null) {
                this.mViewDestroyed = false;
                this.mDialog.show();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onStop() {
        try {
            super.onStop();
            if (this.mDialog != null) {
                this.mDialog.hide();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void setCancelable(final boolean b) {
        try {
            this.mCancelable = b;
            if (this.mDialog != null) {
                this.mDialog.setCancelable(b);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void setShowsDialog(final boolean mShowsDialog) {
        this.mShowsDialog = mShowsDialog;
    }
    
    public void show(final FragmentManager fragmentManager, final String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        final FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(this, s);
        beginTransaction.commit();
    }
}
