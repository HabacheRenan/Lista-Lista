package model;

public class Cliente {
	
	public String nome;
	public int qtdPeças;
	public float valorPeças;

	public Cliente(){
		this.nome = "";
		this.qtdPeças = 0;
		this.valorPeças = 0;
	}
	
	public Cliente(String nome){
		this.nome = nome;
	}
	
	public Cliente(String nome, int qtdPeças){
		this.nome = nome;
		this.qtdPeças = qtdPeças;
	}
	
	public Cliente(String nome, int qtdPeças,float valorPeças){
		this.nome = nome;
		this.qtdPeças = qtdPeças;
		this.valorPeças = valorPeças;
	}
	
}
