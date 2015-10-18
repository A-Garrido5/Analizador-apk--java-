// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.proto;

import com.google.aJ;
import com.google.dg;
import com.google.a8;
import com.google.ch;
import com.google.ep;
import com.google.fm;
import com.google.ci;
import com.google.hv;
import java.io.InputStream;
import com.google.bl;
import com.google.fp;
import com.google.fu;
import com.google.cL;
import com.google.ce;
import com.google.du;
import com.google.dS;

public final class E2E$Message extends dS implements E2E$MessageOrBuilder
{
    public static final int CONVERSATION_FIELD_NUMBER = 1;
    public static du PARSER;
    public static final int SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER = 2;
    private static final E2E$Message defaultInstance;
    public static boolean e;
    private static final long serialVersionUID;
    private int bitField0_;
    private Object conversation_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private E2E$Message$SenderKeyDistributionMessage senderKeyDistributionMessage_;
    private final ce unknownFields;
    
    static {
        E2E$Message.PARSER = new E2E$Message$1();
        (defaultInstance = new E2E$Message(true)).initFields();
    }
    
    private E2E$Message(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/proto/E2E$Message.e:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   com/google/dS.<init>:()V
        //     8: aload_0        
        //     9: iconst_m1      
        //    10: putfield        com/whatsapp/proto/E2E$Message.memoizedIsInitialized:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        com/whatsapp/proto/E2E$Message.memoizedSerializedSize:I
        //    18: aload_0        
        //    19: invokespecial   com/whatsapp/proto/E2E$Message.initFields:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            214
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 228
        //               10: 313
        //               18: 134
        //          default: 76
        //        }
        //    76: iload           5
        //    78: istore          10
        //    80: aload_0        
        //    81: aload_1        
        //    82: aload           4
        //    84: aload_2        
        //    85: iload           9
        //    87: invokevirtual   com/whatsapp/proto/E2E$Message.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    90: istore          17
        //    92: iload           17
        //    94: ifne            210
        //    97: iload_3        
        //    98: ifeq            307
        //   101: iconst_1       
        //   102: istore          10
        //   104: aload_1        
        //   105: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   108: astore          11
        //   110: aload_0        
        //   111: iconst_1       
        //   112: aload_0        
        //   113: getfield        com/whatsapp/proto/E2E$Message.bitField0_:I
        //   116: ior            
        //   117: putfield        com/whatsapp/proto/E2E$Message.bitField0_:I
        //   120: aload_0        
        //   121: aload           11
        //   123: putfield        com/whatsapp/proto/E2E$Message.conversation_:Ljava/lang/Object;
        //   126: iload_3        
        //   127: ifeq            210
        //   130: iload           10
        //   132: istore          5
        //   134: iconst_2       
        //   135: aload_0        
        //   136: getfield        com/whatsapp/proto/E2E$Message.bitField0_:I
        //   139: iand           
        //   140: iconst_2       
        //   141: if_icmpne       301
        //   144: aload_0        
        //   145: getfield        com/whatsapp/proto/E2E$Message.senderKeyDistributionMessage_:Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //   148: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.toBuilder:()Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder;
        //   151: astore          15
        //   153: aload           15
        //   155: astore          12
        //   157: aload_0        
        //   158: aload_1        
        //   159: getstatic       com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.PARSER:Lcom/google/du;
        //   162: aload_2        
        //   163: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   166: checkcast       Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //   169: putfield        com/whatsapp/proto/E2E$Message.senderKeyDistributionMessage_:Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //   172: aload           12
        //   174: ifnull          196
        //   177: aload           12
        //   179: aload_0        
        //   180: getfield        com/whatsapp/proto/E2E$Message.senderKeyDistributionMessage_:Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //   183: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.mergeFrom:(Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;)Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder;
        //   186: pop            
        //   187: aload_0        
        //   188: aload           12
        //   190: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.buildPartial:()Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //   193: putfield        com/whatsapp/proto/E2E$Message.senderKeyDistributionMessage_:Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //   196: aload_0        
        //   197: iconst_2       
        //   198: aload_0        
        //   199: getfield        com/whatsapp/proto/E2E$Message.bitField0_:I
        //   202: ior            
        //   203: putfield        com/whatsapp/proto/E2E$Message.bitField0_:I
        //   206: iload           5
        //   208: istore          10
        //   210: iload_3        
        //   211: ifeq            294
        //   214: aload_0        
        //   215: aload           4
        //   217: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   220: putfield        com/whatsapp/proto/E2E$Message.unknownFields:Lcom/google/ce;
        //   223: aload_0        
        //   224: invokevirtual   com/whatsapp/proto/E2E$Message.c:()V
        //   227: return         
        //   228: iload_3        
        //   229: ifeq            307
        //   232: iconst_1       
        //   233: istore          10
        //   235: goto            80
        //   238: astore          16
        //   240: aload           16
        //   242: athrow         
        //   243: astore          8
        //   245: aload           8
        //   247: aload_0        
        //   248: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   251: athrow         
        //   252: astore          7
        //   254: aload_0        
        //   255: aload           4
        //   257: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   260: putfield        com/whatsapp/proto/E2E$Message.unknownFields:Lcom/google/ce;
        //   263: aload_0        
        //   264: invokevirtual   com/whatsapp/proto/E2E$Message.c:()V
        //   267: aload           7
        //   269: athrow         
        //   270: astore          13
        //   272: aload           13
        //   274: athrow         
        //   275: astore          6
        //   277: new             Lcom/google/bg;
        //   280: dup            
        //   281: aload           6
        //   283: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   286: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   289: aload_0        
        //   290: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   293: athrow         
        //   294: iload           10
        //   296: istore          5
        //   298: goto            30
        //   301: aconst_null    
        //   302: astore          12
        //   304: goto            157
        //   307: iconst_1       
        //   308: istore          10
        //   310: goto            210
        //   313: iload           5
        //   315: istore          10
        //   317: goto            104
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     243    252    Lcom/google/bg;
        //  35     41     275    294    Ljava/io/IOException;
        //  35     41     252    270    Any
        //  80     92     238    243    Lcom/google/bg;
        //  80     92     275    294    Ljava/io/IOException;
        //  80     92     252    270    Any
        //  104    126    243    252    Lcom/google/bg;
        //  104    126    275    294    Ljava/io/IOException;
        //  104    126    252    270    Any
        //  134    153    243    252    Lcom/google/bg;
        //  134    153    275    294    Ljava/io/IOException;
        //  134    153    252    270    Any
        //  157    172    270    275    Lcom/google/bg;
        //  157    172    275    294    Ljava/io/IOException;
        //  157    172    252    270    Any
        //  177    196    270    275    Lcom/google/bg;
        //  177    196    275    294    Ljava/io/IOException;
        //  177    196    252    270    Any
        //  196    206    243    252    Lcom/google/bg;
        //  196    206    275    294    Ljava/io/IOException;
        //  196    206    252    270    Any
        //  240    243    243    252    Lcom/google/bg;
        //  240    243    275    294    Ljava/io/IOException;
        //  240    243    252    270    Any
        //  245    252    252    270    Any
        //  272    275    243    252    Lcom/google/bg;
        //  272    275    275    294    Ljava/io/IOException;
        //  272    275    252    270    Any
        //  277    294    252    270    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0157:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    E2E$Message(final cL cl, final fu fu, final E2E$1 e2E$1) {
        this(cl, fu);
    }
    
    private E2E$Message(final fp fp) {
        super(fp);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = fp.getUnknownFields();
    }
    
    E2E$Message(final fp fp, final E2E$1 e2E$1) {
        this(fp);
    }
    
    private E2E$Message(final boolean b) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ce.d();
    }
    
    static boolean access$1500() {
        return E2E$Message.d;
    }
    
    static Object access$1700(final E2E$Message e2E$Message) {
        return e2E$Message.conversation_;
    }
    
    static Object access$1702(final E2E$Message e2E$Message, final Object conversation_) {
        return e2E$Message.conversation_ = conversation_;
    }
    
    static E2E$Message$SenderKeyDistributionMessage access$1802(final E2E$Message e2E$Message, final E2E$Message$SenderKeyDistributionMessage senderKeyDistributionMessage_) {
        return e2E$Message.senderKeyDistributionMessage_ = senderKeyDistributionMessage_;
    }
    
    static int access$1902(final E2E$Message e2E$Message, final int bitField0_) {
        return e2E$Message.bitField0_ = bitField0_;
    }
    
    public static E2E$Message getDefaultInstance() {
        return E2E$Message.defaultInstance;
    }
    
    public static final bl getDescriptor() {
        return E2E.access$000();
    }
    
    private void initFields() {
        this.conversation_ = "";
        this.senderKeyDistributionMessage_ = E2E$Message$SenderKeyDistributionMessage.getDefaultInstance();
    }
    
    public static E2E$Message$Builder newBuilder() {
        return E2E$Message$Builder.access$1300();
    }
    
    public static E2E$Message$Builder newBuilder(final E2E$Message e2E$Message) {
        return newBuilder().mergeFrom(e2E$Message);
    }
    
    public static E2E$Message parseDelimitedFrom(final InputStream inputStream) {
        return (E2E$Message)E2E$Message.PARSER.b(inputStream);
    }
    
    public static E2E$Message parseDelimitedFrom(final InputStream inputStream, final fu fu) {
        return (E2E$Message)E2E$Message.PARSER.a(inputStream, fu);
    }
    
    public static E2E$Message parseFrom(final cL cl) {
        return (E2E$Message)E2E$Message.PARSER.a(cl);
    }
    
    public static E2E$Message parseFrom(final cL cl, final fu fu) {
        return (E2E$Message)E2E$Message.PARSER.a(cl, fu);
    }
    
    public static E2E$Message parseFrom(final hv hv) {
        return (E2E$Message)E2E$Message.PARSER.a(hv);
    }
    
    public static E2E$Message parseFrom(final hv hv, final fu fu) {
        return (E2E$Message)E2E$Message.PARSER.a(hv, fu);
    }
    
    public static E2E$Message parseFrom(final InputStream inputStream) {
        return (E2E$Message)E2E$Message.PARSER.a(inputStream);
    }
    
    public static E2E$Message parseFrom(final InputStream inputStream, final fu fu) {
        return (E2E$Message)E2E$Message.PARSER.b(inputStream, fu);
    }
    
    public static E2E$Message parseFrom(final byte[] array) {
        return (E2E$Message)E2E$Message.PARSER.a(array);
    }
    
    public static E2E$Message parseFrom(final byte[] array, final fu fu) {
        return (E2E$Message)E2E$Message.PARSER.a(array, fu);
    }
    
    @Override
    public String getConversation() {
        final Object conversation_ = this.conversation_;
        if (conversation_ instanceof String) {
            return (String)conversation_;
        }
        final hv hv = (hv)conversation_;
        final String i = hv.i();
        if (hv.b()) {
            this.conversation_ = i;
        }
        return i;
    }
    
    @Override
    public hv getConversationBytes() {
        final Object conversation_ = this.conversation_;
        if (conversation_ instanceof String) {
            return (hv)(this.conversation_ = hv.b((String)conversation_));
        }
        return (hv)conversation_;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.getDefaultInstanceForType();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.getDefaultInstanceForType();
    }
    
    @Override
    public E2E$Message getDefaultInstanceForType() {
        return E2E$Message.defaultInstance;
    }
    
    @Override
    public du getParserForType() {
        return E2E$Message.PARSER;
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessage getSenderKeyDistributionMessage() {
        return this.senderKeyDistributionMessage_;
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessageOrBuilder getSenderKeyDistributionMessageOrBuilder() {
        return this.senderKeyDistributionMessage_;
    }
    
    @Override
    public int getSerializedSize() {
        final int memoizedSerializedSize = this.memoizedSerializedSize;
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        final int n = 0x1 & this.bitField0_;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.getConversationBytes());
        }
        if ((0x2 & this.bitField0_) == 0x2) {
            n2 += ep.f(2, this.senderKeyDistributionMessage_);
        }
        return this.memoizedSerializedSize = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.unknownFields;
    }
    
    @Override
    public boolean hasConversation() {
        return (0x1 & this.bitField0_) == 0x1;
    }
    
    @Override
    public boolean hasSenderKeyDistributionMessage() {
        return (0x2 & this.bitField0_) == 0x2;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return E2E.access$100().a(E2E$Message.class, E2E$Message$Builder.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte memoizedIsInitialized = this.memoizedIsInitialized;
        if (memoizedIsInitialized == 1) {
            return true;
        }
        if (memoizedIsInitialized == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.newBuilderForType();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.newBuilderForType(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.newBuilderForType();
    }
    
    @Override
    public E2E$Message$Builder newBuilderForType() {
        return newBuilder();
    }
    
    @Override
    protected E2E$Message$Builder newBuilderForType(final dg dg) {
        return new E2E$Message$Builder(dg, null);
    }
    
    @Override
    public a8 toBuilder() {
        return this.toBuilder();
    }
    
    @Override
    public aJ toBuilder() {
        return this.toBuilder();
    }
    
    @Override
    public E2E$Message$Builder toBuilder() {
        return newBuilder(this);
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.bitField0_) == 0x1) {
            ep.c(1, this.getConversationBytes());
        }
        if ((0x2 & this.bitField0_) == 0x2) {
            ep.e(2, this.senderKeyDistributionMessage_);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
