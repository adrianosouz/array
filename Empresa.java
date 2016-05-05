
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/* ATENÇÃO: VIDE TAMBÉM O MÉTODO CONTÉM E INDEXOF, AMBOS PERTECENTES AO ARRAYLIST. COMO ORDENAR UM ARRAY?*/
public class Empresa {
	ArrayList<Empregado> empregados = new ArrayList<>();
	/*private int quantidade;*/
	
	/*public Empresa()
	{
		
	}*/
    
	public void inserir(Empregado e){
		
		empregados.add(e);
		
		
		
	}
	
	public void inserir(){
		System.out.println("Nome do empregado que deseja inserir \n:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Salário do empregado:\n");
		double sal = scanner.nextDouble();
		Empregado e1 = new Empregado(sal, name);
		inserir(e1);
	}

	
	 public void remover(Empregado e) {
		 empregados.remove(e);
		 
	 }
	  
	 public void remover(){
		 System.out.println("Nome do empregado que deseja remover \n:");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.next();
			for (Iterator<Empregado> i = empregados.iterator(); i.hasNext();) {
				  Empregado e1 = i.next();
				  if (e1.getNome().equals(name)) {
				    i.remove();
				  }
				}
	          }
	     
	 
	 
	 public void imprimir(){
		 for(Empregado e:empregados){
			 System.out.println(e);
		 }
		 
		 /*outras formas:
		  *  Iterator it = empregados.iterator();
             while (it.hasNext()) {
            System.out.println(it.next());
        }
        
            for(int i =0; i<emopregados.size();i++){
            System.out.println(empregados.get(i);}
		  * */
		 
	 }
	 
	 
	/* public void imprimir(String name){
		for(Empregado e: empregados){
			if(e.getNome() == name){
				System.out.println(e);
			}
		}
	 }*/
	 
	 
	 public void buscar(String name){
		 for(Empregado e: empregados){
				if(e.getNome() == name){
					System.out.println("esse empregado está na lista");
				}
				
				else
					System.out.println("esse empregado n existe");}
		 
		
	 }
			 
		
	 
	 public int quantEmp(){
		return empregados.size();
	
}
	 

}
