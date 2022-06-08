public class Date {
    private String mes;
    private String dia;
    private String ano;

    public Date(String mes, String dia, String ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return this.mes;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return this.dia;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAno() {
        return this.ano;
    }

    public void displayDate() {
        System.out.printf("%s/%s/%s", this.mes, this.dia, this.ano);
    }
}
