package view;

import Model.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa ();
		
		pessoa.setNome("Thiago Alves");
		System.out.println(pessoa.getNome());
		
		pessoa.setEndereco("AV.John Adams");
		System.out.println(pessoa.getEndereco());
		
		pessoa.setBairro("JD.America");
		System.out.println(pessoa.getBairro());
		
		pessoa.setCep(32567548);
		System.out.println(pessoa.getCep());
		
		pessoa.setCidade("São Paulo");
		System.out.println(pessoa.getCidade());
		
		pessoa.setEstado("SP");
		System.out.println(pessoa.getEstado());
		
	}
}
