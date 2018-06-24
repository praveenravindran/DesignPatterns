package flyweight;

public class FormattedText {
    private String plainText;
    private boolean[] capitalize;

    public FormattedText(String plainText) {
        this.plainText = plainText;
        capitalize = new boolean[plainText.length()];
    }

    public void capitalize(int start, int end) {
        for (int i = start; i < end; ++i) {
            capitalize[i] = true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); ++i) {
            char ch = plainText.charAt(i);
            if (capitalize[i]) {
                ch = Character.toUpperCase(ch);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
