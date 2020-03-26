
public class Arco {

	private int tamanho=10;
	
	private String espaco = " ";
	private String frame = "*";
	private String setaCorpo = "=";
	private String corda = "|";
	private String setaPonta = ">";
	private String frameEnd = "===";
	
	private String oldCorpo = "";
	
	public void desenharArco() {
		System.out.println(espaco);
		topoFim();
		frameEsquerda();
		Setas();
		frameDireita();
	}
	
	public void topoFim() {
		System.out.println(espaco.substring(0,1) + frameEnd);
	}
	
	public void frameEsquerda() {
		for(int i=0;i<tamanho+tamanho/2;i++) {
			
			System.out.println(espaco.substring(0,1) + corda + espaco + frame);
			espaco += " ";
		}	
	}
	
	public void Setas() {
		for (int i = 0;i<(tamanho/2);i++) {
			for (int c = 0;c<(tamanho*2);c++) {
				if(c==(tamanho*2-1)) {
					System.out.print(setaCorpo + corda + setaPonta);
					oldCorpo = setaCorpo;
					setaCorpo = setaPonta;
				}else if(c == 0) {
					System.out.print(setaCorpo + corda);
				}else{
					System.out.print(setaCorpo);
				}
			}
			System.out.print("\n");
			setaCorpo = oldCorpo;
		}
	}
	
	public void frameDireita() {
		for(int i=0;i<tamanho+tamanho/2;i++) {
			if(i==tamanho+(tamanho/2)-1) {
				topoFim();
			}else {
				System.out.println(espaco.substring(0,1) + corda + espaco.substring(i+1) + frame);	
			}

		}
	}
	
}
