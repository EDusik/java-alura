public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();        
        } 
        catch(Exception e) {
	    	// String msg = e.getMessage();
	    	// System.out.println(msg);
        	String msg = e.getMessage();
	    	System.out.println("Exception " + msg);	    	
	    	e.printStackTrace();
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo 2");
        throw new MinhaExcecao("Deu Errado");
        // System.out.println("Fim do metodo 2");
    }
}