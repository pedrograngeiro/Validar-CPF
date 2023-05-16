public class Main {
  public static void main(String[] args) {
    String cpf = "123.456.789-00";
    boolean cpfValido = ValidaCPF.valida(cpf);
    if (cpfValido) {
      System.out.println("CPF Valido");
    } else {
      System.out.println("CPF Invalido");
    }

    String dia = "01";
    boolean dataValidaDia = ValidaData.isDay(dia);
    if (dataValidaDia) {
      System.out.println("Dia Valido");
    } else {
      System.out.println("Dia Invalido");
    }

    String mes = "09";
    boolean dataValidaMes = ValidaData.isMonth(mes);
    if (dataValidaMes) {
      System.out.println("Mês Valido");
    } else {
      System.out.println("Mês Invalido");
    }

    String ano = "2023";
    boolean dataValidaAno = ValidaData.isYear(ano);
    if (dataValidaAno) {
      System.out.println("Ano Valido");
    } else {
      System.out.println("Ano Invalido");
    }

  }
}