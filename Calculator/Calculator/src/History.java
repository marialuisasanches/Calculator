import java.util.ArrayList;

public class History {

    private ArrayList<String> registro = new ArrayList<>();

    public void adicionarRegistro(String operacao) {
        this.registro.add(operacao);
    }

    public void mostrarRegistro(String operacao) {
        System.out.println(operacao);
    }

    public void removerRegistro(String operacao) {
        this.registro.remove(operacao);
    }

    public void limparRegistro() {
        this.registro.clear();
    }
}
