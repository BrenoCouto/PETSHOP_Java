package teste_DTI;

//CRIADO POR: BRENO SILVA DOS SANTOS COUTO
//TESTE EMPREGAT�CIO FORNECIDO POR: DTI DIGITAL

//LINGUAGEM UTILIZADA: JAVA
//MOTIVO: POR SER UMA LINGUAGEM QUE APRENDI RECENTEMENTE GOSTARIA DE COLOCAR EM TESTE O MEU APRENDIZADO DA LINGUAGEM E SAIR 
																									//DA ZONA DE CONFORTO DO PHP E DO C#

//INSTRU��O/RECOMENDA��O DE USO: RECOMENDO UTILIZAR A IDE: Eclipse, POR CAUSA DE TODAS AS BIBLIOTECAS QUE JA 
																							//VEM JUNTAS NA IDE E O DEBUG FICA MAIS F�CIL
																							//NO ECLIPSE, QUE NO CASO SERIA APENAS 
																							//EXECUTAR O C�DIGO NELE MESMO.

//IMPORTA��O DE TODAS AS BIBLIOTECAS B�SICAS DO JAVA

import java.util.*;

public class Melhor_petshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// BIBLIOTECA DE CONSOLE DO JAVA, AONDE PODEMOS INSERIR OS VALORES DIGITADOS
		// PELO USU�RIO DENTRO DA PR�PRIA IDE
		Scanner teclado = new Scanner(System.in);

		// CRIA��O DAS VARI�VEIS
		String dia_semana; // PARA FACILITAR O MANEJO DO C�DIGO, CRIEI UMA VARI�VEL PARA RECEBER O DIA DA
							// SEMANA E N�O DA DATA DO ANO INTEIRO, ALGO QUE SERIA DESNECESS�RIO NO NOSSO
							// PROJETO ATUAL

		// CRIANDO VARI�VEL PARA CALCULAR OS PRE�OS DE TODOS OS PETSHOPS E ARMAZENAR
		// SEUS VALORES

		// PARA EVITAR ERROS, JA INSTANCIO A VARI�VEL DECLARANDO VALORES VAZIOS PARA ELA
		double preco_canino_feliz = 0.00;
		double preco_vai_rex = 0.00;
		double preco_chow_chawgas = 0.00;

		// CRIANDO VARI�VEL PARA RECEBER A QUANTIDADE DE C�ES

		// PARA EVITAR ERROS, JA INSTANCIO A VARI�VEL DECLARANDO VALORES VAZIOS PARA ELA
		int quant_caes_pequenos = 0;
		int quant_caes_grandes = 0;

		// COME�AMOS AGORA A CRIAR O PROJETO

		// COMANDO PARA CRIAR UMA LINHA NO CONSOLE COM O QUE FOR DIGITADO DENTRO DO
		// PAR�NTESES, E SEMPRE QUE APERTAR 'ENTER' MUDA A LINHA E O VALOR � ARMAZENADO
		// NA VARI�VEL DESEJADA

		System.out.println("Insira o dia da semana (ex:S�BADO, TER�A-FEIRA, SEGUNDA): ");
		dia_semana = teclado.nextLine(); // ATRIBUINDO O VALOR DIGITADO PELO USU�RIO NA VARI�VEL 'dia_semana'

		System.out.println("Insira a quantidade de c�es pequenos: ");
		quant_caes_pequenos = teclado.nextInt(); // ATRIBUINDO VALOR �S VARI�VEIS DOS C�ES PEQUENOS

		System.out.println("Insira a quantidade de c�es grandes: ");
		quant_caes_grandes = teclado.nextInt(); // ATRIBUINDO VALOR �S VARI�VEIS DOS C�ES GRANDES

		// AGORA COM TODAS AS VARI�VEIS ARMAZENADAS, AGORA MANIPULAMOS OS DADOS DE
		// ACORDO COM O DIA DA SEMANA INSERIDO

		// COMO STRING EM JAVA N�O � UM TIPO DE VARI�VEL PRIMITIVO(COMO INT, CHAR,
		// DOUBLE) PARA REALIZAR TESTES L�GICOS, PODEMOS UTILIZAR M�TODOS COMO O
		// 'equalIsIgnoreCase' PARA VERIFICAR SE UMA STRING � IGUAL A OUTRA IGNORANDO SE
		// EST� EM LETRA MAI�SCULA OU MIN�SCULA
		// SE O VALOR DA VARIAVEL 'dia_semana' FOR IGUAL A DOMINGO OU S�BADO, AS
		// VARI�VEIS SER�O MANIPULADAS DESTE MODO:
		if (dia_semana.equalsIgnoreCase("DOMINGO") || dia_semana.equalsIgnoreCase("S�BADO")) {
			preco_canino_feliz = ((20 * quant_caes_pequenos) + (40 * quant_caes_grandes)) * 0.20; // SE FOR FINAL DE
																									// SEMANA, O VALOR
																									// DESTE PET SHOP
																									// TER� 20% DE
																									// AUMENTO DE PRE�O,
																									// PORTANTO PARA
																									// REDUZIR CONTAS,
																									// MULTIPLICAMOS POR
																									// 0.20 QUE � O
																									// MESMO DE FAZER
																									// "conta +
																									// conta*porcentagem"
			preco_vai_rex = (20 * quant_caes_pequenos) + (55 * quant_caes_grandes);
			preco_chow_chawgas = (30 * quant_caes_pequenos) + (45 * quant_caes_grandes);

			// AGORA FAZEMOS O TESTE PARA VER QUAL DOS PETSHOPS FORAM OS MAIS BARATOS E
			// IMPRIMIMOS O TEXTO CONFORME O RESULTADO:
			if (preco_canino_feliz > preco_vai_rex && preco_canino_feliz > preco_chow_chawgas) {
				System.out.println("O PetShop que mais vale a pena � o Canino Feliz, com o pre�o total de: "
						+ preco_canino_feliz + " Reais");
			} else if (preco_vai_rex > preco_canino_feliz && preco_vai_rex > preco_chow_chawgas) {
				System.out.println("O PetShop que mais vale a pena � o Vai Rex, com o pre�o total de: " + preco_vai_rex
						+ " Reais");
			} else if (preco_chow_chawgas > preco_canino_feliz && preco_chow_chawgas > preco_canino_feliz) {
				System.out.println("O PetShop que mais vale a pena � o Chow Chawgas, com o pre�o total de: "
						+ preco_chow_chawgas + " Reais");
			} else { // ESTE ELSE S� IR� OCORRER SE TODOS OS VALORES FOREM IGUAIS, E COMO O PETSHOP
						// SHOW CHAWGAS � O MAIS PR�XIMO DO CLIENTE, ENT�O ELE � O QUE MAIS VALE � PENA
				System.out.println("O PetShop que mais vale a pena � o Chow Chawgas, com o pre�o total de: "
						+ preco_chow_chawgas + " Reais");

			}
		}
		else { // SE OS VALORES DO DIA DA SEMANA N�O FOREM IGUAIS A 'DOMINGO' OU 'S�BADO' ENT�O
				// OS VALORES SER�O MANIPULADOS DESTA FORMA:

			preco_canino_feliz = (20 * quant_caes_pequenos) + (40 * quant_caes_grandes);
			preco_vai_rex = (15 * quant_caes_pequenos) + (50 * quant_caes_grandes);
			preco_chow_chawgas = (30 * quant_caes_pequenos) + (45 * quant_caes_grandes);

			if (preco_canino_feliz > preco_vai_rex && preco_canino_feliz > preco_chow_chawgas) {
				System.out.println("O PetShop que mais vale a pena � o Canino Feliz, com o pre�o total de: "
						+ preco_canino_feliz + " Reais");
			} else if (preco_vai_rex > preco_canino_feliz && preco_vai_rex > preco_chow_chawgas) {
				System.out.println("O PetShop que mais vale a pena � o Vai Rex, com o pre�o total de: " + preco_vai_rex
						+ " Reais");
			} else if (preco_chow_chawgas > preco_canino_feliz && preco_chow_chawgas > preco_canino_feliz) {
				System.out.println("O PetShop que mais vale a pena � o Chow Chawgas, com o pre�o total de: "
						+ preco_chow_chawgas + " Reais");
			} else { // ESTE ELSE S� IR� OCORRER SE TODOS OS VALORES FOREM IGUAIS, E COMO O PETSHOP
						// SHOW CHAWGAS � O MAIS PR�XIMO DO CLIENTE, ENT�O ELE � O QUE MAIS VALE � PENA
				System.out.println("O PetShop que mais vale a pena � o Chow Chawgas, com o pre�o total de: "
						+ preco_chow_chawgas + " Reais");
			}

		}
		
		teclado.close(); // APENAS FECHANDO O 'teclado.scanner' POR CONVEN��ES GERAIS DA LINGUAGEM JAVA
	}

}
