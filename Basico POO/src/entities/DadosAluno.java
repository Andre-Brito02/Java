package entities;

public class DadosAluno {
    private String nome;
    private double notaTrimestre1;
    private double notaTrimestre2;
    private double notaTrimestre3;

    public DadosAluno(String nome, double notaTrimestre1, double notaTrimestre2, double notaTrimestre3) {
        this.nome = nome;
        this.notaTrimestre1 = notaTrimestre1;
        this.notaTrimestre2 = notaTrimestre2;
        this.notaTrimestre3 = notaTrimestre3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaTrimestre1() {
        return notaTrimestre1;
    }

    public void setNotaTrimestre1(double notaTrimestre1) {
        this.notaTrimestre1 = notaTrimestre1;
    }

    public double getNotaTrimestre2() {
        return notaTrimestre2;
    }

    public void setNotaTrimestre2(double notaTrimestre2) {
        this.notaTrimestre2 = notaTrimestre2;
    }

    public double getNotaTrimestre3() {
        return notaTrimestre3;
    }

    public void setNotaTrimestre3(double notaTrimestre3) {
        this.notaTrimestre3 = notaTrimestre3;
    }

    public double calculaMedia() {
        return (notaTrimestre1 + notaTrimestre2 + notaTrimestre3) / 3;
    }

    public String toString(){
        if(calculaMedia() >= 6.0){
            return "Nome: " + nome + " Média: " + calculaMedia() + " Aprovado";
        }else{
            return "Nome: " + nome + " Média: " + calculaMedia() + " Reprovado";
        }

    }
}
