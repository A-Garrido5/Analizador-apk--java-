// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.os.AsyncTask;
import android.support.v4.os.AsyncTaskCompat;
import android.text.TextUtils;
import android.content.pm.ResolveInfo;
import java.util.HashMap;
import android.content.Intent;
import android.content.Context;
import java.util.List;
import java.util.Map;
import android.database.DataSetObservable;

public class ActivityChooserModel extends DataSetObservable
{
    private static final String LOG_TAG;
    private static final Map sDataModelRegistry;
    private static final Object sRegistryLock;
    private static final String[] z;
    private final List mActivities;
    private ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivityChooserModel$ActivitySorter mActivitySorter;
    private boolean mCanReadHistoricalData;
    private final Context mContext;
    private final List mHistoricalRecords;
    private boolean mHistoricalRecordsChanged;
    private final String mHistoryFileName;
    private int mHistoryMaxSize;
    private final Object mInstanceLock;
    private Intent mIntent;
    private boolean mReadShareHistoryCalled;
    private boolean mReloadActivities;
    
    static {
        final String[] z2 = new String[10];
        String s = "hs_\u0011g\u001bi[\u0000mI\u007fMCdRw[ClTo\u001e\u0014gWw\u0013\u0005mIv[\u0007,";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0002';
                        break;
                    }
                    case 0: {
                        c2 = ';';
                        break;
                    }
                    case 1: {
                        c2 = '\u001b';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "OrS\u0006";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "L~W\u0004jO";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "SrM\u0017mIr]\u0002n\u0016i[\u0000mI\u007fM";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "SrM\u0017mIr]\u0002n\u0016i[\u0000mI\u007f";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "ZxJ\ntRoG";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "hs_\u0011g\u001bi[\u0000mI\u007fMCdRw[CfT~MClTo\u001e\u0010vZiJCuRoVCjRhJ\fpRx_\u000f/I~]\fp_h\u001e\u0017c\\5";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "~iL\fp\u001bi[\u0002fRuYCjRhJ\fpRx_\u000f\"I~]\u0011m_;X\nn^!\u001e";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "~iL\fp\u001bi[\u0002fRuYCjRhJ\fpRx_\u000f\"I~]\u0011m_;X\nn^!\u001e";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "ut\u001e\u0013p^x[\u0007kU|\u001e\u0000cWw\u001e\u0017m\u001b8L\u0006c_SW\u0010vTiW\u0000cW__\u0017c";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    break Label_0282;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        LOG_TAG = ActivityChooserModel.class.getSimpleName();
        sRegistryLock = new Object();
        sDataModelRegistry = new HashMap();
    }
    
    static Context access$200(final ActivityChooserModel activityChooserModel) {
        return activityChooserModel.mContext;
    }
    
    static String access$300() {
        return ActivityChooserModel.LOG_TAG;
    }
    
    static String access$400(final ActivityChooserModel activityChooserModel) {
        return activityChooserModel.mHistoryFileName;
    }
    
    static boolean access$502(final ActivityChooserModel activityChooserModel, final boolean mCanReadHistoricalData) {
        return activityChooserModel.mCanReadHistoricalData = mCanReadHistoricalData;
    }
    
    private boolean addHisoricalRecord(final ActivityChooserModel$HistoricalRecord activityChooserModel$HistoricalRecord) {
        final boolean add = this.mHistoricalRecords.add(activityChooserModel$HistoricalRecord);
        if (!add) {
            return add;
        }
        try {
            this.mHistoricalRecordsChanged = true;
            this.pruneExcessiveHistoricalRecordsIfNeeded();
            this.persistHistoricalDataIfNeeded();
            this.sortActivitiesIfNeeded();
            this.notifyChanged();
            return add;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private void ensureConsistentState() {
        final boolean b = this.loadActivitiesIfNeeded() | this.readHistoricalDataIfNeeded();
        try {
            this.pruneExcessiveHistoricalRecordsIfNeeded();
            if (b) {
                this.sortActivitiesIfNeeded();
                this.notifyChanged();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private boolean loadActivitiesIfNeeded() {
        while (true) {
            final int a = AdapterViewCompat.a;
            while (true) {
                int n2 = 0;
                Label_0133: {
                    try {
                        final boolean mReloadActivities = this.mReloadActivities;
                        boolean b = false;
                        if (mReloadActivities) {
                            final Intent mIntent = this.mIntent;
                            b = false;
                            if (mIntent != null) {
                                this.mReloadActivities = false;
                                this.mActivities.clear();
                                final List queryIntentActivities = this.mContext.getPackageManager().queryIntentActivities(this.mIntent, 0);
                                final int size = queryIntentActivities.size();
                                final int n = 0;
                                if (n < size) {
                                    this.mActivities.add(new ActivityChooserModel$ActivityResolveInfo(this, queryIntentActivities.get(n)));
                                    n2 = n + 1;
                                    if (a == 0) {
                                        break Label_0133;
                                    }
                                }
                                b = true;
                            }
                        }
                        return b;
                    }
                    catch (IllegalStateException ex) {
                        throw ex;
                    }
                }
                final int n = n2;
                continue;
            }
        }
    }
    
    private void persistHistoricalDataIfNeeded() {
        try {
            if (!this.mReadShareHistoryCalled) {
                throw new IllegalStateException(ActivityChooserModel.z[9]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        while (true) {
            try {
                if (!this.mHistoricalRecordsChanged) {
                    return;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            try {
                this.mHistoricalRecordsChanged = false;
                if (!TextUtils.isEmpty((CharSequence)this.mHistoryFileName)) {
                    AsyncTaskCompat.executeParallel(new ActivityChooserModel$PersistHistoryAsyncTask(this, null), new Object[] { this.mHistoricalRecords, this.mHistoryFileName });
                }
            }
            catch (IllegalStateException ex3) {
                throw ex3;
            }
        }
    }
    
    private void pruneExcessiveHistoricalRecordsIfNeeded() {
        final int a = AdapterViewCompat.a;
        final int n = this.mHistoricalRecords.size() - this.mHistoryMaxSize;
        if (n > 0) {
            this.mHistoricalRecordsChanged = true;
            int n2;
            for (int i = 0; i < n; i = n2) {
                final ActivityChooserModel$HistoricalRecord activityChooserModel$HistoricalRecord = this.mHistoricalRecords.remove(0);
                n2 = i + 1;
                if (a != 0) {
                    break;
                }
            }
        }
    }
    
    private boolean readHistoricalDataIfNeeded() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/widget/ActivityChooserModel.mCanReadHistoricalData:Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifeq            57
        //    11: aload_0        
        //    12: getfield        android/support/v7/internal/widget/ActivityChooserModel.mHistoricalRecordsChanged:Z
        //    15: istore          5
        //    17: iload           5
        //    19: ifeq            57
        //    22: aload_0        
        //    23: getfield        android/support/v7/internal/widget/ActivityChooserModel.mHistoryFileName:Ljava/lang/String;
        //    26: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    29: ifne            57
        //    32: aload_0        
        //    33: iconst_0       
        //    34: putfield        android/support/v7/internal/widget/ActivityChooserModel.mCanReadHistoricalData:Z
        //    37: aload_0        
        //    38: iconst_1       
        //    39: putfield        android/support/v7/internal/widget/ActivityChooserModel.mReadShareHistoryCalled:Z
        //    42: aload_0        
        //    43: invokespecial   android/support/v7/internal/widget/ActivityChooserModel.readHistoricalDataImpl:()V
        //    46: iconst_1       
        //    47: ireturn        
        //    48: astore_1       
        //    49: aload_1        
        //    50: athrow         
        //    51: astore_2       
        //    52: aload_2        
        //    53: athrow         
        //    54: astore_3       
        //    55: aload_3        
        //    56: athrow         
        //    57: iconst_0       
        //    58: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      48     51     Ljava/lang/IllegalStateException;
        //  11     17     51     54     Ljava/lang/IllegalStateException;
        //  22     46     54     57     Ljava/lang/IllegalStateException;
        //  49     51     51     54     Ljava/lang/IllegalStateException;
        //  52     54     54     57     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 35, Size: 35
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
    
    private void readHistoricalDataImpl() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        android/support/v7/internal/widget/ActivityChooserModel.mContext:Landroid/content/Context;
        //    10: aload_0        
        //    11: getfield        android/support/v7/internal/widget/ActivityChooserModel.mHistoryFileName:Ljava/lang/String;
        //    14: invokevirtual   android/content/Context.openFileInput:(Ljava/lang/String;)Ljava/io/FileInputStream;
        //    17: astore          4
        //    19: invokestatic    android/util/Xml.newPullParser:()Lorg/xmlpull/v1/XmlPullParser;
        //    22: astore          14
        //    24: aload           14
        //    26: aload           4
        //    28: aconst_null    
        //    29: invokeinterface org/xmlpull/v1/XmlPullParser.setInput:(Ljava/io/InputStream;Ljava/lang/String;)V
        //    34: iload_1        
        //    35: iconst_1       
        //    36: if_icmpeq       60
        //    39: iload_1        
        //    40: iconst_2       
        //    41: if_icmpeq       60
        //    44: aload           14
        //    46: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //    51: istore          23
        //    53: iload           23
        //    55: istore_1       
        //    56: iload_2        
        //    57: ifeq            34
        //    60: getstatic       android/support/v7/internal/widget/ActivityChooserModel.z:[Ljava/lang/String;
        //    63: iconst_3       
        //    64: aaload         
        //    65: aload           14
        //    67: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //    72: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    75: ifne            145
        //    78: new             Lorg/xmlpull/v1/XmlPullParserException;
        //    81: dup            
        //    82: getstatic       android/support/v7/internal/widget/ActivityChooserModel.z:[Ljava/lang/String;
        //    85: bipush          6
        //    87: aaload         
        //    88: invokespecial   org/xmlpull/v1/XmlPullParserException.<init>:(Ljava/lang/String;)V
        //    91: athrow         
        //    92: astore          15
        //    94: aload           15
        //    96: athrow         
        //    97: astore          11
        //    99: getstatic       android/support/v7/internal/widget/ActivityChooserModel.LOG_TAG:Ljava/lang/String;
        //   102: new             Ljava/lang/StringBuilder;
        //   105: dup            
        //   106: invokespecial   java/lang/StringBuilder.<init>:()V
        //   109: getstatic       android/support/v7/internal/widget/ActivityChooserModel.z:[Ljava/lang/String;
        //   112: bipush          7
        //   114: aaload         
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   118: aload_0        
        //   119: getfield        android/support/v7/internal/widget/ActivityChooserModel.mHistoryFileName:Ljava/lang/String;
        //   122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   125: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   128: aload           11
        //   130: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   133: pop            
        //   134: aload           4
        //   136: ifnull          144
        //   139: aload           4
        //   141: invokevirtual   java/io/FileInputStream.close:()V
        //   144: return         
        //   145: aload_0        
        //   146: getfield        android/support/v7/internal/widget/ActivityChooserModel.mHistoricalRecords:Ljava/util/List;
        //   149: astore          16
        //   151: aload           16
        //   153: invokeinterface java/util/List.clear:()V
        //   158: aload           14
        //   160: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   165: istore          17
        //   167: iload           17
        //   169: iconst_1       
        //   170: if_icmpne       384
        //   173: iload_2        
        //   174: ifeq            335
        //   177: goto            384
        //   180: aload           14
        //   182: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   187: astore          18
        //   189: getstatic       android/support/v7/internal/widget/ActivityChooserModel.z:[Ljava/lang/String;
        //   192: iconst_4       
        //   193: aaload         
        //   194: aload           18
        //   196: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   199: ifne            271
        //   202: new             Lorg/xmlpull/v1/XmlPullParserException;
        //   205: dup            
        //   206: getstatic       android/support/v7/internal/widget/ActivityChooserModel.z:[Ljava/lang/String;
        //   209: iconst_0       
        //   210: aaload         
        //   211: invokespecial   org/xmlpull/v1/XmlPullParserException.<init>:(Ljava/lang/String;)V
        //   214: athrow         
        //   215: astore          19
        //   217: aload           19
        //   219: athrow         
        //   220: astore          8
        //   222: getstatic       android/support/v7/internal/widget/ActivityChooserModel.LOG_TAG:Ljava/lang/String;
        //   225: new             Ljava/lang/StringBuilder;
        //   228: dup            
        //   229: invokespecial   java/lang/StringBuilder.<init>:()V
        //   232: getstatic       android/support/v7/internal/widget/ActivityChooserModel.z:[Ljava/lang/String;
        //   235: bipush          8
        //   237: aaload         
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   241: aload_0        
        //   242: getfield        android/support/v7/internal/widget/ActivityChooserModel.mHistoryFileName:Ljava/lang/String;
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   251: aload           8
        //   253: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   256: pop            
        //   257: aload           4
        //   259: ifnull          144
        //   262: aload           4
        //   264: invokevirtual   java/io/FileInputStream.close:()V
        //   267: return         
        //   268: astore          10
        //   270: return         
        //   271: aload           16
        //   273: new             Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
        //   276: dup            
        //   277: aload           14
        //   279: aconst_null    
        //   280: getstatic       android/support/v7/internal/widget/ActivityChooserModel.z:[Ljava/lang/String;
        //   283: iconst_5       
        //   284: aaload         
        //   285: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   290: aload           14
        //   292: aconst_null    
        //   293: getstatic       android/support/v7/internal/widget/ActivityChooserModel.z:[Ljava/lang/String;
        //   296: iconst_1       
        //   297: aaload         
        //   298: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   303: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   306: aload           14
        //   308: aconst_null    
        //   309: getstatic       android/support/v7/internal/widget/ActivityChooserModel.z:[Ljava/lang/String;
        //   312: iconst_2       
        //   313: aaload         
        //   314: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   319: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //   322: invokespecial   android/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord.<init>:(Ljava/lang/String;JF)V
        //   325: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   330: pop            
        //   331: iload_2        
        //   332: ifeq            158
        //   335: aload           4
        //   337: ifnull          144
        //   340: aload           4
        //   342: invokevirtual   java/io/FileInputStream.close:()V
        //   345: return         
        //   346: astore          22
        //   348: return         
        //   349: astore          21
        //   351: aload           21
        //   353: athrow         
        //   354: astore          5
        //   356: aload           4
        //   358: ifnull          366
        //   361: aload           4
        //   363: invokevirtual   java/io/FileInputStream.close:()V
        //   366: aload           5
        //   368: athrow         
        //   369: astore          7
        //   371: aload           7
        //   373: athrow         
        //   374: astore          13
        //   376: return         
        //   377: astore          6
        //   379: goto            366
        //   382: astore_3       
        //   383: return         
        //   384: iload           17
        //   386: iconst_3       
        //   387: if_icmpeq       158
        //   390: iload           17
        //   392: iconst_4       
        //   393: if_icmpne       180
        //   396: iload_2        
        //   397: ifeq            158
        //   400: goto            180
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  6      19     382    384    Ljava/io/FileNotFoundException;
        //  19     34     97     144    Lorg/xmlpull/v1/XmlPullParserException;
        //  19     34     220    271    Ljava/io/IOException;
        //  19     34     354    374    Any
        //  44     53     97     144    Lorg/xmlpull/v1/XmlPullParserException;
        //  44     53     220    271    Ljava/io/IOException;
        //  44     53     354    374    Any
        //  60     92     92     97     Ljava/io/FileNotFoundException;
        //  60     92     97     144    Lorg/xmlpull/v1/XmlPullParserException;
        //  60     92     220    271    Ljava/io/IOException;
        //  60     92     354    374    Any
        //  94     97     97     144    Lorg/xmlpull/v1/XmlPullParserException;
        //  94     97     220    271    Ljava/io/IOException;
        //  94     97     354    374    Any
        //  99     134    354    374    Any
        //  139    144    374    377    Ljava/io/IOException;
        //  145    158    97     144    Lorg/xmlpull/v1/XmlPullParserException;
        //  145    158    220    271    Ljava/io/IOException;
        //  145    158    354    374    Any
        //  158    167    97     144    Lorg/xmlpull/v1/XmlPullParserException;
        //  158    167    220    271    Ljava/io/IOException;
        //  158    167    354    374    Any
        //  180    189    97     144    Lorg/xmlpull/v1/XmlPullParserException;
        //  180    189    220    271    Ljava/io/IOException;
        //  180    189    354    374    Any
        //  189    215    215    220    Ljava/io/FileNotFoundException;
        //  189    215    97     144    Lorg/xmlpull/v1/XmlPullParserException;
        //  189    215    220    271    Ljava/io/IOException;
        //  189    215    354    374    Any
        //  217    220    97     144    Lorg/xmlpull/v1/XmlPullParserException;
        //  217    220    220    271    Ljava/io/IOException;
        //  217    220    354    374    Any
        //  222    257    354    374    Any
        //  262    267    268    271    Ljava/io/IOException;
        //  271    331    97     144    Lorg/xmlpull/v1/XmlPullParserException;
        //  271    331    220    271    Ljava/io/IOException;
        //  271    331    354    374    Any
        //  340    345    346    349    Ljava/io/IOException;
        //  340    345    349    354    Lorg/xmlpull/v1/XmlPullParserException;
        //  361    366    377    382    Ljava/io/IOException;
        //  361    366    369    374    Lorg/xmlpull/v1/XmlPullParserException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 186, Size: 186
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    private boolean sortActivitiesIfNeeded() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/widget/ActivityChooserModel.mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          90
        //    11: aload_0        
        //    12: getfield        android/support/v7/internal/widget/ActivityChooserModel.mIntent:Landroid/content/Intent;
        //    15: astore          6
        //    17: aload           6
        //    19: ifnull          90
        //    22: aload_0        
        //    23: getfield        android/support/v7/internal/widget/ActivityChooserModel.mActivities:Ljava/util/List;
        //    26: invokeinterface java/util/List.isEmpty:()Z
        //    31: istore          7
        //    33: iload           7
        //    35: ifne            90
        //    38: aload_0        
        //    39: getfield        android/support/v7/internal/widget/ActivityChooserModel.mHistoricalRecords:Ljava/util/List;
        //    42: invokeinterface java/util/List.isEmpty:()Z
        //    47: ifne            90
        //    50: aload_0        
        //    51: getfield        android/support/v7/internal/widget/ActivityChooserModel.mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;
        //    54: aload_0        
        //    55: getfield        android/support/v7/internal/widget/ActivityChooserModel.mIntent:Landroid/content/Intent;
        //    58: aload_0        
        //    59: getfield        android/support/v7/internal/widget/ActivityChooserModel.mActivities:Ljava/util/List;
        //    62: aload_0        
        //    63: getfield        android/support/v7/internal/widget/ActivityChooserModel.mHistoricalRecords:Ljava/util/List;
        //    66: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //    69: invokeinterface android/support/v7/internal/widget/ActivityChooserModel$ActivitySorter.sort:(Landroid/content/Intent;Ljava/util/List;Ljava/util/List;)V
        //    74: iconst_1       
        //    75: ireturn        
        //    76: astore_1       
        //    77: aload_1        
        //    78: athrow         
        //    79: astore_2       
        //    80: aload_2        
        //    81: athrow         
        //    82: astore_3       
        //    83: aload_3        
        //    84: athrow         
        //    85: astore          4
        //    87: aload           4
        //    89: athrow         
        //    90: iconst_0       
        //    91: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      76     79     Ljava/lang/IllegalStateException;
        //  11     17     79     82     Ljava/lang/IllegalStateException;
        //  22     33     82     85     Ljava/lang/IllegalStateException;
        //  38     74     85     90     Ljava/lang/IllegalStateException;
        //  77     79     79     82     Ljava/lang/IllegalStateException;
        //  80     82     82     85     Ljava/lang/IllegalStateException;
        //  83     85     85     90     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 46, Size: 46
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
    
    public Intent chooseActivity(final int n) {
        synchronized (this.mInstanceLock) {
            if (this.mIntent == null) {
                return null;
            }
            this.ensureConsistentState();
            final ActivityChooserModel$ActivityResolveInfo activityChooserModel$ActivityResolveInfo = this.mActivities.get(n);
            final ComponentName component = new ComponentName(activityChooserModel$ActivityResolveInfo.resolveInfo.activityInfo.packageName, activityChooserModel$ActivityResolveInfo.resolveInfo.activityInfo.name);
            final Intent intent = new Intent(this.mIntent);
            intent.setComponent(component);
            if (this.mActivityChoserModelPolicy != null && this.mActivityChoserModelPolicy.onChooseActivity(this, new Intent(intent))) {
                return null;
            }
            this.addHisoricalRecord(new ActivityChooserModel$HistoricalRecord(component, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }
    
    public ResolveInfo getActivity(final int n) {
        synchronized (this.mInstanceLock) {
            this.ensureConsistentState();
            return this.mActivities.get(n).resolveInfo;
        }
    }
    
    public int getActivityCount() {
        synchronized (this.mInstanceLock) {
            this.ensureConsistentState();
            return this.mActivities.size();
        }
    }
    
    public int getActivityIndex(final ResolveInfo resolveInfo) {
        while (true) {
            final int a = AdapterViewCompat.a;
            while (true) {
                int n;
                synchronized (this.mInstanceLock) {
                    this.ensureConsistentState();
                    final List mActivities = this.mActivities;
                    final int size = mActivities.size();
                    n = 0;
                    if (n >= size) {
                        return -1;
                    }
                    if (mActivities.get(n).resolveInfo == resolveInfo) {
                        return n;
                    }
                }
                ++n;
                if (a != 0) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    public ResolveInfo getDefaultActivity() {
        synchronized (this.mInstanceLock) {
            this.ensureConsistentState();
            if (!this.mActivities.isEmpty()) {
                return this.mActivities.get(0).resolveInfo;
            }
            return null;
        }
    }
    
    public int getHistorySize() {
        synchronized (this.mInstanceLock) {
            this.ensureConsistentState();
            return this.mHistoricalRecords.size();
        }
    }
    
    public void setDefaultActivity(final int n) {
        while (true) {
            while (true) {
                synchronized (this.mInstanceLock) {
                    this.ensureConsistentState();
                    final ActivityChooserModel$ActivityResolveInfo activityChooserModel$ActivityResolveInfo = this.mActivities.get(n);
                    final ActivityChooserModel$ActivityResolveInfo activityChooserModel$ActivityResolveInfo2 = this.mActivities.get(0);
                    if (activityChooserModel$ActivityResolveInfo2 != null) {
                        final float n2 = 5.0f + (activityChooserModel$ActivityResolveInfo2.weight - activityChooserModel$ActivityResolveInfo.weight);
                        if (AdapterViewCompat.a == 0) {
                            this.addHisoricalRecord(new ActivityChooserModel$HistoricalRecord(new ComponentName(activityChooserModel$ActivityResolveInfo.resolveInfo.activityInfo.packageName, activityChooserModel$ActivityResolveInfo.resolveInfo.activityInfo.name), System.currentTimeMillis(), n2));
                            return;
                        }
                    }
                }
                final float n2 = 1.0f;
                continue;
            }
        }
    }
}
