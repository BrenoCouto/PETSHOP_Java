package teste_DTI;

//CRIADO POR: BRENO SILVA DOS SANTOS COUTO
//TESTE EMPREGATÍCIO FORNECIDO POR: DTI DIGITAL

//LINGUAGEM UTILIZADA: JAVA
//MOTIVO: POR SER UMA LINGUAGEM QUE APRENDI RECENTEMENTE GOSTARIA DE COLOCAR EM TESTE O MEU APRENDIZADO DA LINGUAGEM E SAIR 
																									//DA ZONA DE CONFORTO DO PHP E DO C#

//INSTRUÇÃO/RECOMENDAÇÃO DE USO: RECOMENDO UTILIZAR A IDE: Eclipse, POR CAUSA DE TODAS AS BIBLIOTECAS QUE JA 
																							//VEM JUNTAS NA IDE E O DEBUG FICA MAIS FÁCIL
																							//NO ECLIPSE, QUE NO CASO SERIA APENAS 
																							//EXECUTAR O CÓDIGO NELE MESMO.

//IMPORTAÇÃO DE TODAS AS BIBLIOTECAS BÁSICAS DO JAVA

import java.util.*;

public class Melhor_petshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// BIBLIOTECA DE CONSOLE DO JAVA, AONDE PODEMOS INSERIR OS VALORES DIGITADOS
		// PELO USUÁRIO DENTRO DA PRÓPRIA IDE
		Scanner teclado = new Scanner(System.in);

		// CRIAÇÃO DAS VARIÁVEIS
		String dia_semana; // PARA FACILITAR O MANEJO DO CÓDIGO, CRIEI UMA VARIÁVEL PARA RECEBER O DIA DA
							// SEMANA E NÃO DA DATA DO ANO INTEIRO, ALGO QUE SERIA DESNECESSÁRIO NO NOSSO
							// PROJETO ATUAL

		// CRIANDO VARIÁVEL PARA CALCULAR OS PREÇOS DE TODOS OS PETSHOPS E ARMAZENAR
		// SEUS VALORES

		// PARA EVITAR ERROS, JA INSTANCIO A VARIÁVEL DECLARANDO VALORES VAZIOS PARA ELA
		double preco_canino_feliz = 0.00;
		double preco_vai_rex = 0.00;
		double preco_chow_chawgas = 0.00;

		// CRIANDO VARIÁVEL PARA RECEBER A QUANTIDADE DE CÃES

		// PARA EVITAR ERROS, JA INSTANCIO A VARIÁVEL DECLARANDO VALORES VAZIOS PARA ELA
		int quant_caes_pequenos = 0;
		int quant_caes_grandes = 0;

		// COMEÇAMOS AGORA A CRIAR O PROJETO

		// COMANDO PARA CRIAR UMA LINHA NO CONSOLE COM O QUE FOR DIGITADO DENTRO DO
		// PARÊNTESES, E SEMPRE QUE APERTAR 'ENTER' MUDA A LINHA E O VALOR É ARMAZENADO
		// NA VARIÁVEL DESEJADA

		System.out.println("Insira o dia da semana (ex:SÁBADO, TERÇA-FEIRA, SEGUNDA): ");
		dia_semana = teclado.nextLine(); // ATRIBUINDO O VALOR DIGITADO PELO USUÁRIO NA VARIÁVEL 'dia_semana'

		System.out.println("Insira a quantidade de cães pequenos: ");
		quant_caes_pequenos = teclado.nextInt(); // ATRIBUINDO VALOR ÀS VARIÁVEIS DOS CÃES PEQUENOS

		System.out.println("Insira a quantidade de cães grandes: ");
		quant_caes_grandes = teclado.nextInt(); // ATRIBUINDO VALOR ÀS VARIÁVEIS DOS CÃES GRANDES

		// AGORA COM TODAS AS VARIÁVEIS ARMAZENADAS, AGORA MANIPULAMOS OS DADOS DE
		// ACORDO COM O DIA DA SEMANA INSERIDO

		// COMO STRING EM JAVA NÃO É UM TIPO DE VARIÁVEL PRIMITIVO(COMO INT, CHAR,
		// DOUBLE) PARA REALIZAR TESTES LÓGICOS, PODEMOS UTILIZAR MÉTODOS COMO O
		// 'equalIsIgnoreCase' PARA VERIFICAR SE UMA STRING É IGUAL A OUTRA IGNORANDO SE
		// ESTÁ EM LETRA MAIÚSCULA OU MINÚSCULA
		// SE O VALOR DA VARIAVEL 'dia_semana' FOR IGUAL A DOMINGO OU SÁBADO, AS
		// VARIÁVEIS SERÃO MANIPULADAS DESTE MODO:
		if (dia_semana.equalsIgnoreCase("DOMINGO") || dia_semana.equalsIgnoreCase("SÁBADO")) {
			preco_canino_feliz = ((20 * quant_caes_pequenos) + (40 * quant_caes_grandes)) * 0.20; // SE FOR FINAL DE
																									// SEMANA, O VALOR
																									// DESTE PET SHOP
																									// TERÁ 20% DE
																									// AUMENTO DE PREÇO,
																									// PORTANTO PARA
																									// REDUZIR CONTAS,
																									// MULTIPLICAMOS POR
																									// 0.20 QUE É O
																									// MESMO DE FAZER
																									// "conta +
																									// conta*porcentagem"
			preco_vai_rex = (20 * quant_caes_pequenos) + (55 * quant_caes_grandes);
			preco_chow_chawgas = (30 * quant_caes_pequenos) + (45 * quant_caes_grandes);

			// AGORA FAZEMOS O TESTE PARA VER QUAL DOS PETSHOPS FORAM OS MAIS BARATOS E
			// IMPRIMIMOS O TEXTO CONFORME O RESULTADO:
			if (preco_canino_feliz > preco_vai_rex && preco_canino_feliz > preco_chow_chawgas) {
				System.out.println("O PetShop que mais vale a pena é o Canino Feliz, com o preço total de: "
						+ preco_canino_feliz + " Reais");
			} else if (preco_vai_rex > preco_canino_feliz && preco_vai_rex > preco_chow_chawgas) {
				System.out.println("O PetShop que mais vale a pena é o Vai Rex, com o preço total de: " + preco_vai_rex
						+ " Reais");
			} else if (preco_chow_chawgas > preco_canino_feliz && preco_chow_chawgas > preco_canino_feliz) {
				System.out.println("O PetShop que mais vale a pena é o Chow Chawgas, com o preço total de: "
						+ preco_chow_chawgas + " Reais");
			} else { // ESTE ELSE SÓ IRÁ OCORRER SE TODOS OS VALORES FOREM IGUAIS, E COMO O PETSHOP
						// SHOW CHAWGAS É O MAIS PRÓXIMO DO CLIENTE, ENTÃO ELE É O QUE MAIS VALE À PENA
				System.out.println("O PetShop que mais vale a pena é o Chow Chawgas, com o preço total de: "
						+ preco_chow_chawgas + " Reais");

			}
		}
		else { // SE OS VALORES DO DIA DA SEMANA NÃO FOREM IGUAIS A 'DOMINGO' OU 'SÁBADO' ENTÃO
				// OS VALORES SERÃO MANIPULADOS DESTA FORMA:

			preco_canino_feliz = (20 * quant_caes_pequenos) + (40 * quant_caes_grandes);
			preco_vai_rex = (15 * quant_caes_pequenos) + (50 * quant_caes_grandes);
			preco_chow_chawgas = (30 * quant_caes_pequenos) + (45 * quant_caes_grandes);

			if (preco_canino_feliz > preco_vai_rex && preco_canino_feliz > preco_chow_chawgas) {
				System.out.println("O PetShop que mais vale a pena é o Canino Feliz, com o preço total de: "
						+ preco_canino_feliz + " Reais");
			} else if (preco_vai_rex > preco_canino_feliz && preco_vai_rex > preco_chow_chawgas) {
				System.out.println("O PetShop que mais vale a pena é o Vai Rex, com o preço total de: " + preco_vai_rex
						+ " Reais");
			} else if (preco_chow_chawgas > preco_canino_feliz && preco_chow_chawgas > preco_canino_feliz) {
				System.out.println("O PetShop que mais vale a pena é o Chow Chawgas, com o preço total de: "
						+ preco_chow_chawgas + " Reais");
			} else { // ESTE ELSE SÓ IRÁ OCORRER SE TODOS OS VALORES FOREM IGUAIS, E COMO O PETSHOP
						// SHOW CHAWGAS É O MAIS PRÓXIMO DO CLIENTE, ENTÃO ELE É O QUE MAIS VALE À PENA
				System.out.println("O PetShop que mais vale a pena é o Chow Chawgas, com o preço total de: "
						+ preco_chow_chawgas + " Reais");
			}

		}
		
		teclado.close(); // APENAS FECHANDO O 'teclado.scanner' POR CONVENÇÕES GERAIS DA LINGUAGEM JAVA
	}

}
