
// Crie uma classe que valide cpf com metodos de classe em java

public class ValidaCPF {
  public static boolean valida(String cpf) {
    cpf = cpf.replace(".", "")
        .replace("-", "")
        .replace("/", "")
        .replace(" ", "")
        .replace(",", "");
    if (cpf.length() != 11) {
      return false;
    }
    int soma = 0;
    for (int i = 0; i < 9; i++) {
      int num = Character.getNumericValue(cpf.charAt(i));
      soma = soma + num * (10 - i);
    }

    int digitoVerificador1 = (11 - (soma % 11)) > 9 ? 0 : 11 - (soma % 11);
    if (digitoVerificador1 != Character.getNumericValue(cpf.charAt(9))) {
      return false;
    }

    soma = 0;
    for (int i = 0; i < 10; i++) {
      int num = Character.getNumericValue(cpf.charAt(i));
      soma = soma + num * (11 - i);
    }

    int digitoVerificador2 = (11 - (soma % 11)) > 9 ? 0 : 11 - (soma % 11);
    if (digitoVerificador2 != Character.getNumericValue(cpf.charAt(10))) {
      return false;
    }

    return true;

  }
}