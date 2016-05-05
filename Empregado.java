
public class Empregado {
	private double salario;
	private  String nome;
	
	
	
	public Empregado(double s, String name){
		nome = name;
		salario = s;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString(){
	       return "Nome:"+this.nome+"\n"+"\n"+"Salario:"+this.salario+"\n";    
	       }
}