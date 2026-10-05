package defpackage;

import java.util.List;
import java.util.Map;

/* Writer AI, OpenAI-compatible provider. */
public final class wf0 implements xc1 {
    public static final wf0 a = new wf0();
    public static final l12 b = l12.f;
    public static final String c = "writer_model";
    public static final String d = "palmyra-x6";
    public static final List e = ed1.D("palmyra-x6", "palmyra-x5");

    private wf0() {}
    @Override public final boolean a(String str, String str2) { str.getClass(); str2.getClass(); return true; }
    @Override public final l12 b() { return b; }
    @Override public final boolean c(boolean z) { return z; }
    @Override public final Map d(String str) { return r30.e; }
    @Override public final String e(String str) { return "https://api.writer.com/v1"; }
    @Override public final String f() { return d; }
    @Override public final String g() { return c; }
    @Override public final String h(String str) { return null; }
    @Override public final String i(String str) {
        String s = str != null ? os1.n0(str).toString() : "";
        return (s.length() == 0 || e.contains(s)) ? d : s;
    }
}