// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.proto;

import com.google.bg;
import com.google.fu;
import com.google.cL;
import com.google.ch;
import com.google.fE;
import com.google.aJ;
import com.google.a8;
import com.google.fx;
import com.google.fm;
import com.google.ci;
import com.google.bl;
import com.google.dg;
import com.google.hv;
import com.google.fp;

public final class E2E$Message$SenderKeyDistributionMessage$Builder extends fp implements E2E$Message$SenderKeyDistributionMessageOrBuilder
{
    private hv axolotlSenderKeyDistributionMessage_;
    private int bitField0_;
    private Object groupId_;
    
    private E2E$Message$SenderKeyDistributionMessage$Builder() {
        this.groupId_ = "";
        this.axolotlSenderKeyDistributionMessage_ = hv.b;
        this.maybeForceBuilderInitialization();
    }
    
    private E2E$Message$SenderKeyDistributionMessage$Builder(final dg dg) {
        super(dg);
        this.groupId_ = "";
        this.axolotlSenderKeyDistributionMessage_ = hv.b;
        this.maybeForceBuilderInitialization();
    }
    
    E2E$Message$SenderKeyDistributionMessage$Builder(final dg dg, final E2E$1 e2E$1) {
        this(dg);
    }
    
    static E2E$Message$SenderKeyDistributionMessage$Builder access$600() {
        return create();
    }
    
    private static E2E$Message$SenderKeyDistributionMessage$Builder create() {
        return new E2E$Message$SenderKeyDistributionMessage$Builder();
    }
    
    public static final bl getDescriptor() {
        return E2E.access$300();
    }
    
    private void maybeForceBuilderInitialization() {
        if (E2E$Message$SenderKeyDistributionMessage.access$800()) {}
    }
    
    @Override
    public ci build() {
        return this.build();
    }
    
    @Override
    public fm build() {
        return this.build();
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessage build() {
        final E2E$Message$SenderKeyDistributionMessage buildPartial = this.buildPartial();
        try {
            if (!buildPartial.isInitialized()) {
                throw fx.a(buildPartial);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return buildPartial;
    }
    
    @Override
    public ci buildPartial() {
        return this.buildPartial();
    }
    
    @Override
    public fm buildPartial() {
        return this.buildPartial();
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessage buildPartial() {
        final boolean e = E2E$Message.e;
        final E2E$Message$SenderKeyDistributionMessage e2E$Message$SenderKeyDistributionMessage = new E2E$Message$SenderKeyDistributionMessage(this, null);
        final int bitField0_ = this.bitField0_;
        int n;
        if ((bitField0_ & 0x1) == 0x1) {
            n = 1;
        }
        else {
            n = 0;
        }
        E2E$Message$SenderKeyDistributionMessage.access$1002(e2E$Message$SenderKeyDistributionMessage, this.groupId_);
        if ((bitField0_ & 0x2) == 0x2) {
            n |= 0x2;
        }
        while (true) {
            while (true) {
                Label_0105: {
                    try {
                        E2E$Message$SenderKeyDistributionMessage.access$1102(e2E$Message$SenderKeyDistributionMessage, this.axolotlSenderKeyDistributionMessage_);
                        E2E$Message$SenderKeyDistributionMessage.access$1202(e2E$Message$SenderKeyDistributionMessage, n);
                        this.b();
                        if (E2E.a != 0) {
                            final boolean e2 = false;
                            if (!e) {
                                break Label_0105;
                            }
                            E2E$Message.e = e2;
                        }
                        return e2E$Message$SenderKeyDistributionMessage;
                    }
                    catch (NullPointerException ex) {
                        try {
                            throw ex;
                        }
                        catch (NullPointerException ex2) {
                            throw ex2;
                        }
                    }
                }
                final boolean e2 = true;
                continue;
            }
        }
    }
    
    public a8 clear() {
        return this.clear();
    }
    
    public aJ clear() {
        return this.clear();
    }
    
    @Override
    public fp clear() {
        return this.clear();
    }
    
    public fx clear() {
        return this.clear();
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessage$Builder clear() {
        super.clear();
        this.groupId_ = "";
        this.bitField0_ &= 0xFFFFFFFE;
        this.axolotlSenderKeyDistributionMessage_ = hv.b;
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }
    
    public E2E$Message$SenderKeyDistributionMessage$Builder clearAxolotlSenderKeyDistributionMessage() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.axolotlSenderKeyDistributionMessage_ = E2E$Message$SenderKeyDistributionMessage.getDefaultInstance().getAxolotlSenderKeyDistributionMessage();
        this.c();
        return this;
    }
    
    public E2E$Message$SenderKeyDistributionMessage$Builder clearGroupId() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.groupId_ = E2E$Message$SenderKeyDistributionMessage.getDefaultInstance().getGroupId();
        this.c();
        return this;
    }
    
    @Override
    public a8 clone() {
        return this.clone();
    }
    
    @Override
    public aJ clone() {
        return this.clone();
    }
    
    @Override
    public fE clone() {
        return this.clone();
    }
    
    @Override
    public fp clone() {
        return this.clone();
    }
    
    @Override
    public fx clone() {
        return this.clone();
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessage$Builder clone() {
        return create().mergeFrom(this.buildPartial());
    }
    
    @Override
    public Object clone() {
        return this.clone();
    }
    
    @Override
    public hv getAxolotlSenderKeyDistributionMessage() {
        return this.axolotlSenderKeyDistributionMessage_;
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
    public E2E$Message$SenderKeyDistributionMessage getDefaultInstanceForType() {
        return E2E$Message$SenderKeyDistributionMessage.getDefaultInstance();
    }
    
    @Override
    public bl getDescriptorForType() {
        return E2E.access$300();
    }
    
    @Override
    public String getGroupId() {
        final Object groupId_ = this.groupId_;
        if (!(groupId_ instanceof String)) {
            final hv hv = (hv)groupId_;
            final String i = hv.i();
            try {
                if (hv.b()) {
                    this.groupId_ = i;
                }
                return i;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return (String)groupId_;
    }
    
    @Override
    public hv getGroupIdBytes() {
        final Object groupId_ = this.groupId_;
        if (groupId_ instanceof String) {
            return (hv)(this.groupId_ = hv.b((String)groupId_));
        }
        return (hv)groupId_;
    }
    
    @Override
    public boolean hasAxolotlSenderKeyDistributionMessage() {
        try {
            if ((this.bitField0_ & 0x2) == 0x2) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public boolean hasGroupId() {
        try {
            if ((this.bitField0_ & 0x1) == 0x1) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return E2E.access$400().a(E2E$Message$SenderKeyDistributionMessage.class, E2E$Message$SenderKeyDistributionMessage$Builder.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return true;
    }
    
    @Override
    public a8 mergeFrom(final cL cl, final fu fu) {
        return this.mergeFrom(cl, fu);
    }
    
    @Override
    public a8 mergeFrom(final fm fm) {
        return this.mergeFrom(fm);
    }
    
    @Override
    public aJ mergeFrom(final cL cl, final fu fu) {
        return this.mergeFrom(cl, fu);
    }
    
    @Override
    public fE mergeFrom(final cL cl, final fu fu) {
        return this.mergeFrom(cl, fu);
    }
    
    @Override
    public fx mergeFrom(final cL cl, final fu fu) {
        return this.mergeFrom(cl, fu);
    }
    
    @Override
    public fx mergeFrom(final fm fm) {
        return this.mergeFrom(fm);
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessage$Builder mergeFrom(final cL cl, final fu fu) {
        while (true) {
            try {
                E2E$Message$SenderKeyDistributionMessage e2E$Message$SenderKeyDistributionMessage3;
                Throwable t;
                try {
                    final E2E$Message$SenderKeyDistributionMessage e2E$Message$SenderKeyDistributionMessage = (E2E$Message$SenderKeyDistributionMessage)E2E$Message$SenderKeyDistributionMessage.PARSER.parsePartialFrom(cl, fu);
                    if (e2E$Message$SenderKeyDistributionMessage == null) {
                        return this;
                    }
                    try {
                        this.mergeFrom(e2E$Message$SenderKeyDistributionMessage);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final E2E$Message$SenderKeyDistributionMessage e2E$Message$SenderKeyDistributionMessage2 = (E2E$Message$SenderKeyDistributionMessage)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        e2E$Message$SenderKeyDistributionMessage3 = e2E$Message$SenderKeyDistributionMessage2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (e2E$Message$SenderKeyDistributionMessage3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.mergeFrom(e2E$Message$SenderKeyDistributionMessage3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final E2E$Message$SenderKeyDistributionMessage e2E$Message$SenderKeyDistributionMessage3 = null;
                continue;
            }
            break;
        }
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessage$Builder mergeFrom(final fm fm) {
        try {
            if (fm instanceof E2E$Message$SenderKeyDistributionMessage) {
                return this.mergeFrom((E2E$Message$SenderKeyDistributionMessage)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public E2E$Message$SenderKeyDistributionMessage$Builder mergeFrom(final E2E$Message$SenderKeyDistributionMessage p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.getDefaultInstance:()Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //     3: astore_3       
        //     4: aload_1        
        //     5: aload_3        
        //     6: if_acmpne       14
        //     9: aload_0        
        //    10: areturn        
        //    11: astore_2       
        //    12: aload_2        
        //    13: athrow         
        //    14: aload_1        
        //    15: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.hasGroupId:()Z
        //    18: ifeq            43
        //    21: aload_0        
        //    22: iconst_1       
        //    23: aload_0        
        //    24: getfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.bitField0_:I
        //    27: ior            
        //    28: putfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.bitField0_:I
        //    31: aload_0        
        //    32: aload_1        
        //    33: invokestatic    com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.access$1000:(Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;)Ljava/lang/Object;
        //    36: putfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.groupId_:Ljava/lang/Object;
        //    39: aload_0        
        //    40: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.c:()V
        //    43: aload_1        
        //    44: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.hasAxolotlSenderKeyDistributionMessage:()Z
        //    47: ifeq            59
        //    50: aload_0        
        //    51: aload_1        
        //    52: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.getAxolotlSenderKeyDistributionMessage:()Lcom/google/hv;
        //    55: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.setAxolotlSenderKeyDistributionMessage:(Lcom/google/hv;)Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder;
        //    58: pop            
        //    59: aload_0        
        //    60: aload_1        
        //    61: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.getUnknownFields:()Lcom/google/ce;
        //    64: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.b:(Lcom/google/ce;)Lcom/google/fp;
        //    67: pop            
        //    68: aload_0        
        //    69: areturn        
        //    70: astore          4
        //    72: aload           4
        //    74: athrow         
        //    75: astore          5
        //    77: aload           5
        //    79: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      11     14     Ljava/lang/NullPointerException;
        //  14     43     70     75     Ljava/lang/NullPointerException;
        //  43     59     75     80     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    public E2E$Message$SenderKeyDistributionMessage$Builder setAxolotlSenderKeyDistributionMessage(final hv axolotlSenderKeyDistributionMessage_) {
        if (axolotlSenderKeyDistributionMessage_ == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.bitField0_ |= 0x2;
        this.axolotlSenderKeyDistributionMessage_ = axolotlSenderKeyDistributionMessage_;
        this.c();
        return this;
    }
    
    public E2E$Message$SenderKeyDistributionMessage$Builder setGroupId(final String groupId_) {
        if (groupId_ == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.bitField0_ |= 0x1;
        this.groupId_ = groupId_;
        this.c();
        return this;
    }
    
    public E2E$Message$SenderKeyDistributionMessage$Builder setGroupIdBytes(final hv groupId_) {
        if (groupId_ == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.bitField0_ |= 0x1;
        this.groupId_ = groupId_;
        this.c();
        return this;
    }
}
