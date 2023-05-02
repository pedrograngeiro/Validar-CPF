public class Main {
  public static void main(String[] args) {
    String cpf = "123.456.789-00";
    boolean cpfValido = ValidaCPF.valida(cpf);
    if (cpfValido) {
      System.out.println("CPF Valido");
    } else {
      System.out.println("CPF Invalido");
    }
  }
}