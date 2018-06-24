package DecoratorPattern;

import java.util.stream.IntStream;

public class MyStringBuilder {

    private StringBuilder sb;

    public MyStringBuilder(String str) {
        sb = new StringBuilder(str);
    }

    public MyStringBuilder() {
        sb = new StringBuilder();
    }

    public MyStringBuilder concat(String str){
        return new MyStringBuilder(sb.toString().concat(str));
    }

    public MyStringBuilder addNewLine(String str){
        sb.append(System.lineSeparator()).append(str);
        return this;
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    //Delegated Methods

    public MyStringBuilder append(Object obj) {
         sb.append(obj);
         return this;
    }

    public MyStringBuilder append(String str) {
         sb.append(str);
         return this;
    }

    public MyStringBuilder append(StringBuffer sb) {
         this.sb.append(sb);
         return this;
    }

    public MyStringBuilder append(CharSequence s) {
         sb.append(s);
         return this;
    }

    public MyStringBuilder append(CharSequence s, int start, int end) {
         sb.append(s, start, end);
         return this;
    }

    public MyStringBuilder append(char[] str) {
         sb.append(str);
         return this;
    }

    public MyStringBuilder append(char[] str, int offset, int len) {
         sb.append(str, offset, len);
         return this;
    }

    public MyStringBuilder append(boolean b) {
         sb.append(b);
         return this;
    }

    public MyStringBuilder append(char c) {
         sb.append(c);
         return this;
    }

    public MyStringBuilder append(int i) {
         sb.append(i);
         return this;
    }

    public MyStringBuilder append(long lng) {
         sb.append(lng);
         return this;
    }

    public MyStringBuilder append(float f) {
         sb.append(f);
         return this;
    }

    public MyStringBuilder append(double d) {
         sb.append(d);
         return this;
    }

    public MyStringBuilder appendCodePoint(int codePoint) {
         sb.appendCodePoint(codePoint);
         return this;
    }

    public MyStringBuilder delete(int start, int end) {
         sb.delete(start, end);
         return this;
    }

    public MyStringBuilder deleteCharAt(int index) {
         sb.deleteCharAt(index);
         return this;
    }

    public MyStringBuilder replace(int start, int end, String str) {
         sb.replace(start, end, str);
         return this;
    }

    public MyStringBuilder insert(int index, char[] str, int offset, int len) {
         sb.insert(index, str, offset, len);
         return this;
    }

    public MyStringBuilder insert(int offset, Object obj) {
         sb.insert(offset, obj);
         return this;
    }

    public MyStringBuilder insert(int offset, String str) {
         sb.insert(offset, str);
         return this;
    }

    public MyStringBuilder insert(int offset, char[] str) {
         sb.insert(offset, str);
         return this;
    }

    public MyStringBuilder insert(int dstOffset, CharSequence s) {
         sb.insert(dstOffset, s);
         return this;
    }

    public MyStringBuilder insert(int dstOffset, CharSequence s, int start, int end) {
         sb.insert(dstOffset, s, start, end);
         return this;
    }

    public MyStringBuilder insert(int offset, boolean b) {
         sb.insert(offset, b);
         return this;
    }

    public MyStringBuilder insert(int offset, char c) {
         sb.insert(offset, c);
         return this;
    }

    public MyStringBuilder insert(int offset, int i) {
         sb.insert(offset, i);
         return this;
    }

    public MyStringBuilder insert(int offset, long l) {
         sb.insert(offset, l);
         return this;
    }

    public MyStringBuilder insert(int offset, float f) {
         sb.insert(offset, f);
         return this;
    }

    public MyStringBuilder insert(int offset, double d) {
         sb.insert(offset, d);
         return this;
    }


}
