
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa e1 =  new Empresa();
		
		Empregado e2 = new Empregado(435, "joao");
		Empregado e3 = new Empregado(435, "jose");
		Empregado e4 = new Empregado(435, "adriano");
		Empregado e5 = new Empregado(435, "sarah");
		
		e1.inserir(e2);
		e1.inserir(e3);
		e1.inserir(e4);
		e1.inserir(e5);
		e1.imprimir();
		e1.buscar("joao");
		e1.imprimir();
	    e1.remover();
	    e1.imprimir();
	    e1.buscar("joao");
	   
	    
		
	}
	}
	
	