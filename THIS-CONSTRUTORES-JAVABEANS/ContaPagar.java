
public class ContaPagar {
	private String descricao;
	private Double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	
	//CONSTRUTOR PADRÃO
	public ContaPagar() {
	}
	
	//CONSTRUTOR COM PARAMETROS
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor,
			String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
	}
	
	void pagar() {
		System.out.println("Fornecedor: " + this.getFornecedor().getNome() +
				" \nDescricao: " + this.descricao + " \nValor: " + this.valor + 
				" \nData Vencimento: " + this.dataVencimento +"\n" );	
	}
	
	//METODOS ACESSORES 
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValor() {
		return valor;
	}
	public void setValor (Double valor) {
		this.valor = valor;
	}
	
	public String getDataVencimento () {
		return dataVencimento;
	}
	public void setDataVencimento(String datavencimento) {
		this.dataVencimento = datavencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
	this.fornecedor = fornecedor;
	}
	


	

	
}
