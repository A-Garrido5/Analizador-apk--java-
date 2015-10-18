// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

import java.lang.ref.SoftReference;
import com.fasterxml.jackson.core.util.a;
import java.io.OutputStreamWriter;
import com.fasterxml.jackson.core.io.h;
import java.io.CharArrayReader;
import java.io.StringReader;
import java.io.Reader;
import java.io.InputStream;
import java.io.Writer;
import java.io.OutputStream;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.Serializable;

public class JsonFactory implements Serializable
{
    protected static final int a = 0;
    protected static final int b = 0;
    protected static final int c = 0;
    protected static final ThreadLocal d;
    private static final d g;
    private static final long serialVersionUID = 3306684576057132431L;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected b _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected d _rootValueSeparator;
    protected final transient w e;
    protected final transient t f;
    
    static {
        g = DefaultPrettyPrinter.a;
        d = new ThreadLocal();
    }
    
    public JsonFactory() {
        this(null);
    }
    
    protected JsonFactory(final JsonFactory jsonFactory, final b b) {
        this.e = w.a();
        this.f = t.a();
        this._factoryFeatures = JsonFactory.a;
        this._parserFeatures = JsonFactory.b;
        this._generatorFeatures = JsonFactory.c;
        this._rootValueSeparator = JsonFactory.g;
        this._objectCodec = null;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
    }
    
    public JsonFactory(final b objectCodec) {
        this.e = w.a();
        this.f = t.a();
        this._factoryFeatures = JsonFactory.a;
        this._parserFeatures = JsonFactory.b;
        this._generatorFeatures = JsonFactory.c;
        this._rootValueSeparator = JsonFactory.g;
        this._objectCodec = objectCodec;
    }
    
    public JsonGenerator a(final OutputStream outputStream) {
        return this.a(outputStream, JsonEncoding.a);
    }
    
    public JsonGenerator a(final OutputStream outputStream, final JsonEncoding jsonEncoding) {
        final com.fasterxml.jackson.core.io.b a = this.a(outputStream, false);
        a.a(jsonEncoding);
        if (jsonEncoding == JsonEncoding.a) {
            return this.a(this.b(outputStream, a), a);
        }
        return this.a(this.b(this.a(outputStream, jsonEncoding, a), a), a);
    }
    
    protected JsonGenerator a(final OutputStream outputStream, final com.fasterxml.jackson.core.io.b b) {
        final q q = new q(b, this._generatorFeatures, this._objectCodec, outputStream);
        if (this._characterEscapes != null) {
            q.a(this._characterEscapes);
        }
        final d rootValueSeparator = this._rootValueSeparator;
        if (rootValueSeparator != JsonFactory.g) {
            q.a(rootValueSeparator);
        }
        return q;
    }
    
    public JsonGenerator a(final Writer writer) {
        final com.fasterxml.jackson.core.io.b a = this.a(writer, false);
        return this.a(this.b(writer, a), a);
    }
    
    protected JsonGenerator a(final Writer writer, final com.fasterxml.jackson.core.io.b b) {
        final s s = new s(b, this._generatorFeatures, this._objectCodec, writer);
        if (this._characterEscapes != null) {
            s.a(this._characterEscapes);
        }
        final d rootValueSeparator = this._rootValueSeparator;
        if (rootValueSeparator != JsonFactory.g) {
            s.a(rootValueSeparator);
        }
        return s;
    }
    
    public JsonParser a(final InputStream inputStream) {
        final com.fasterxml.jackson.core.io.b a = this.a(inputStream, false);
        return this.a(this.b(inputStream, a), a);
    }
    
    protected JsonParser a(final InputStream inputStream, final com.fasterxml.jackson.core.io.b b) {
        return new k(b, inputStream).a(this._parserFeatures, this._objectCodec, this.f, this.e, this._factoryFeatures);
    }
    
    public JsonParser a(final Reader reader) {
        final com.fasterxml.jackson.core.io.b a = this.a(reader, false);
        return this.a(this.b(reader, a), a);
    }
    
    protected JsonParser a(final Reader reader, final com.fasterxml.jackson.core.io.b b) {
        return new p(b, this._parserFeatures, reader, this._objectCodec, this.e.b(this._factoryFeatures));
    }
    
    public JsonParser a(final String s) {
        final int length = s.length();
        if (this._inputDecorator != null || length > 32768 || !this.a()) {
            return this.a(new StringReader(s));
        }
        final com.fasterxml.jackson.core.io.b a = this.a(s, true);
        final char[] a2 = a.a(length);
        s.getChars(0, length, a2, 0);
        return this.a(a2, 0, length, a, true);
    }
    
    public JsonParser a(final byte[] array) {
        final com.fasterxml.jackson.core.io.b a = this.a(array, true);
        if (this._inputDecorator != null) {
            final InputStream a2 = this._inputDecorator.a(a, array, 0, array.length);
            if (a2 != null) {
                return this.a(a2, a);
            }
        }
        return this.a(array, 0, array.length, a);
    }
    
    protected JsonParser a(final byte[] array, final int n, final int n2, final com.fasterxml.jackson.core.io.b b) {
        return new k(b, array, n, n2).a(this._parserFeatures, this._objectCodec, this.f, this.e, this._factoryFeatures);
    }
    
    public JsonParser a(final char[] array) {
        return this.a(array, 0, array.length);
    }
    
    public JsonParser a(final char[] array, final int n, final int n2) {
        if (this._inputDecorator != null) {
            return this.a(new CharArrayReader(array, n, n2));
        }
        return this.a(array, n, n2, this.a(array, true), false);
    }
    
    protected JsonParser a(final char[] array, final int n, final int n2, final com.fasterxml.jackson.core.io.b b, final boolean b2) {
        return new p(b, this._parserFeatures, null, this._objectCodec, this.e.b(this._factoryFeatures), array, n, n + n2, b2);
    }
    
    protected com.fasterxml.jackson.core.io.b a(final Object o, final boolean b) {
        return new com.fasterxml.jackson.core.io.b(this.b(), o, b);
    }
    
    protected Writer a(final OutputStream outputStream, final JsonEncoding jsonEncoding, final com.fasterxml.jackson.core.io.b b) {
        if (jsonEncoding == JsonEncoding.a) {
            return new h(b, outputStream);
        }
        return new OutputStreamWriter(outputStream, jsonEncoding.a());
    }
    
    public boolean a() {
        return true;
    }
    
    @Deprecated
    public JsonGenerator b(final Writer writer) {
        return this.a(writer);
    }
    
    @Deprecated
    public JsonParser b(final InputStream inputStream) {
        return this.a(inputStream);
    }
    
    @Deprecated
    public JsonParser b(final String s) {
        return this.a(s);
    }
    
    public a b() {
        final SoftReference<a> softReference = JsonFactory.d.get();
        a a;
        if (softReference == null) {
            a = null;
        }
        else {
            a = softReference.get();
        }
        if (a == null) {
            a = new a();
            JsonFactory.d.set(new SoftReference<a>(a));
        }
        return a;
    }
    
    protected final InputStream b(InputStream inputStream, final com.fasterxml.jackson.core.io.b b) {
        if (this._inputDecorator != null) {
            final InputStream a = this._inputDecorator.a(b, inputStream);
            if (a != null) {
                inputStream = a;
            }
        }
        return inputStream;
    }
    
    protected final OutputStream b(OutputStream outputStream, final com.fasterxml.jackson.core.io.b b) {
        if (this._outputDecorator != null) {
            final OutputStream a = this._outputDecorator.a(b, outputStream);
            if (a != null) {
                outputStream = a;
            }
        }
        return outputStream;
    }
    
    protected final Reader b(Reader reader, final com.fasterxml.jackson.core.io.b b) {
        if (this._inputDecorator != null) {
            final Reader a = this._inputDecorator.a(b, reader);
            if (a != null) {
                reader = a;
            }
        }
        return reader;
    }
    
    protected final Writer b(Writer writer, final com.fasterxml.jackson.core.io.b b) {
        if (this._outputDecorator != null) {
            final Writer a = this._outputDecorator.a(b, writer);
            if (a != null) {
                writer = a;
            }
        }
        return writer;
    }
    
    protected Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }
}
