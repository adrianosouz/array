
import java.util.Scanner;

public class EmpresaUI {
	
	
	public EmpresaUI(Empresa e){
		boolean check = true;
	
		while(check){
			System.out.println("o que você deseja fazer? \n 1-adicionar empregado \n 2- listar empregados  \n 3-buscar empregado \n");
	        Scanner scanner = new Scanner(System.in);
	        int check2 = scanner.nextInt();
	      
	        if( check2 == 1){
	        	
	        	e.inserir();
	        	System.out.println("Deseja fazer outra operação? Sim-1 Não 2");
	        	if(scanner.nextInt() == 1){
	        		check = true;
	        	
	        	}
	        	else 
	        		check = false;
	        }
	        
	        else if (check2 == 2){
	        	e.imprimir();
	        	System.out.println("Deseja fazer outra operação? Sim-1 Não 2");
	        	if(scanner.nextInt() == 1){
	        		check = true;
	        	
	        	}
	        	else 
	        		check = false;
	        }
	        
	        else if (check2 == 3){
	        	
	        
	        	System.out.println("entre com o nome do empregado a ser buscado ");
	        	
	            Scanner scanner2 = new Scanner(System.in);
	          
	        	e.buscar(scanner2.next());
	        	System.out.println("Deseja fazer outra operação? Sim-1 Não 2");
	        	if(scanner.nextInt() == 1){
	        		check = true;
	        	
	        	}
	        	else 
	        		check = false;
	        	
	        }
	        
		}
	}

}