package beans;

public class Pessoa {
	public int id;
    public String nome;
    public String cidade;
    private String sentimento;
    private int idade;
	public String comer;
	    
    private void setSentimento(String texto) {
    	this.sentimento = texto;
    }

    public void setIdade(int idade) {
    	if (idade < 0) {
    		this.idade = 0;
    	}else {
    		this.idade = idade;
    	}
    }
    
    public String getSentimento() {
    	return this.sentimento;
    }

	public String getIdade() {
		
		return null;
	}
}
