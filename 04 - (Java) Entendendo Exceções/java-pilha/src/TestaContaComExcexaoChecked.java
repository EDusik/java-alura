public class TestaContaComExcexaoChecked {
    public static void main(String[] args) {
        Conta c = new Conta();

        try {
            c.deposita();
        } catch (MinhaExcecao exceptions) {
            System.out.println("Tratamento da exceptions");
        }
    }
}