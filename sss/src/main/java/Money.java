public class Money {
    private String naminal;
    private int amount;
    private String valuta;

    public String getNaminal() {
        return naminal;
    }

    public void setNaminal(String naminal) {
        this.naminal = naminal;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    @Override
    public String toString() {
        return "Money{" +
                "naminal='" + naminal + '\'' +
                ", amount=" + amount +
                ", valuta='" + valuta + '\'' +
                '}';
    }
}
