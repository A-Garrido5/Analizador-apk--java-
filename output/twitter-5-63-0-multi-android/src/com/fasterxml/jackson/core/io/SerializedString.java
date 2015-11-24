// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.io;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import com.fasterxml.jackson.core.d;

public class SerializedString implements d, Serializable
{
    protected char[] _quotedChars;
    protected byte[] _quotedUTF8Ref;
    protected byte[] _unquotedUTF8Ref;
    protected final String _value;
    protected transient String a;
    
    public SerializedString(final String value) {
        if (value == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this._value = value;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        this.a = objectInputStream.readUTF();
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeUTF(this._value);
    }
    
    @Override
    public final String a() {
        return this._value;
    }
    
    @Override
    public final byte[] b() {
        byte[] unquotedUTF8Ref = this._unquotedUTF8Ref;
        if (unquotedUTF8Ref == null) {
            unquotedUTF8Ref = c.a().b(this._value);
            this._unquotedUTF8Ref = unquotedUTF8Ref;
        }
        return unquotedUTF8Ref;
    }
    
    @Override
    public final byte[] c() {
        byte[] quotedUTF8Ref = this._quotedUTF8Ref;
        if (quotedUTF8Ref == null) {
            quotedUTF8Ref = c.a().a(this._value);
            this._quotedUTF8Ref = quotedUTF8Ref;
        }
        return quotedUTF8Ref;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o != null && o.getClass() == this.getClass() && this._value.equals(((SerializedString)o)._value));
    }
    
    @Override
    public final int hashCode() {
        return this._value.hashCode();
    }
    
    protected Object readResolve() {
        return new SerializedString(this.a);
    }
    
    @Override
    public final String toString() {
        return this._value;
    }
}
