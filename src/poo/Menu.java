package poo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu
{

	static Scanner leitor = new Scanner(System.in);
	public static void main(String[] args) throws IOException
	{
		Menu myprogram = new Menu();
		myprogram.menu();
	}
	public void menu() throws IOException
	{
		// Menu
				System.out.println("Escolha a função:");
				System.out.println("1: Cadastro de Aluno");
				System.out.println("2: Consultar Aluno");
				System.out.println("3: Cadastro de Professores");
				System.out.println("4: Listar Professores");
				System.out.println("5: Modificar Alunos");
				System.out.println("0: Sair");
				
				int numMenu;
				System.out.println("Digite o numero: ");
				numMenu = leitor.nextInt();
			switch (numMenu) {
				case 1 -> cadAluno();
				case 2 -> listAluno();
				case 3 -> cadProfessor();
				case 4 -> listProfessor();
				case 5 -> modAluno();
				case 0 -> System.out.println("!Você Fechou o Programa!\n");
				default -> {
					System.out.println("\n!Numero Incorreto!");
					menu();
					}
			}
		 
			}
		List <Aluno> listA = new ArrayList<>();
		public void cadAluno() throws IOException
		{
			//Vetor de lista de Alunos

			// Pega as informações dos Alunos
				Aluno A = new Aluno();
				System.out.println("Digite a Matricula:");
				A.setMatricula(leitor.nextInt());
				System.out.println("Digite um nome:");
				A.setNome(leitor.next());
				System.out.println("Digite a idade:");
				A.setIdade(leitor.nextInt());
				System.out.println("Digite o sexo:");
				A.setSexo(leitor.next());
				System.out.println("Digite a Disciplina:");
				A.setDisciplina(leitor.next());
				System.out.println("Digite a Nota1:");
				A.setNota1(leitor.nextDouble());
				System.out.println("Digite a Nota2:");
				A.setNota2(leitor.nextDouble());
				System.out.println("Digite a Nota3:");
				A.setNota3(leitor.nextDouble());
				//Adiciona na lista
				listA.add(A);
				menu();
		}


		public void listAluno() throws IOException {

			System.out.println("Digite a matricula do aluno:");
			int M = (leitor.nextInt());
			int i = 0;

			while (!((listA.get(i).getMatricula()) == M)) {
				i++;
			}

			System.out.println("Nome: " + listA.get(i).getNome());
			System.out.println("Idade: " + listA.get(i).getIdade());
			System.out.println("Sexo: " + listA.get(i).getSexo());
			System.out.println("Disciplina: " + listA.get(i).getDisciplina());
			System.out.println("Nota av1: " + listA.get(i).getNota1());
			System.out.println("Nota av2: " + listA.get(i).getNota2());
			System.out.println("Nota av3: " + listA.get(i).getNota3());
			System.out.println("Media: " + listA.get(i).getMedia());

			System.out.println("Deseja consultar outro aluno? Aperte 1 para sim");
			int testar = (leitor.nextInt());
			if (testar == 1) {
				listAluno();
			} else {
				menu();
			}
		}
		List<Professor> listP = new ArrayList<>();
		public void cadProfessor() throws IOException
		{

			Professor Pr = new Professor();
			System.out.println("Digite o ID:");
			Pr.setID(leitor.nextInt());
			System.out.println("Digite um nome:");
			Pr.setNome(leitor.next());
			System.out.println("Digite a idade:");
			Pr.setIdade(leitor.nextInt());
			System.out.println("Digite o sexo:");
			Pr.setSexo(leitor.next());
			System.out.println("Digite a Disciplina:");
			Pr.setDisciplina(leitor.next());
			listP.add(Pr);

			menu();
		}

		public void listProfessor() throws IOException
		{
			//FAZER
			System.out.println("Digite o ID do professor:");
			int M = (leitor.nextInt());
			int i = 0;

			while (!((listP.get(i).getID()) == M)) {
				i++;
			}

			System.out.println("Nome: " + listP.get(i).getNome());
			System.out.println("Idade: " + listP.get(i).getIdade());
			System.out.println("Sexo: " + listP.get(i).getSexo());
			System.out.println("Disciplina: " + listP.get(i).getDisciplina());


			System.out.println("Deseja consultar outro professor? Aperte 1 para sim");
			int testar = (leitor.nextInt());
			if (testar == 1) {
				listProfessor();
			} else {
				menu();
			}
		}
		public void modAluno() throws IOException
		{


			System.out.println("Digite a matricula do aluno:");
			int M = (leitor.nextInt());
			int i = 0;

			while (!((listA.get(i).getMatricula()) == M)) {
				i++;
			}

			System.out.println("1- Nome: " + listA.get(i).getNome());
			System.out.println("2- Idade: " + listA.get(i).getIdade());
			System.out.println("3- Sexo: " + listA.get(i).getSexo());
			System.out.println("4- Disciplina: " + listA.get(i).getDisciplina());
			System.out.println("5- Nota av1: " + listA.get(i).getNota1());
			System.out.println("6- Nota av2: " + listA.get(i).getNota2());
			System.out.println("7- Nota av3: " + listA.get(i).getNota3());
			System.out.println("Selecione o dado que deseja modificar: ");
			int sel = leitor.nextInt();
			switch (sel)
			{
				case 1:
					{
					System.out.println("Digite um nome:");
					listA.get(i).setNome(leitor.next());
					menu();
				    }
				case 2: {
					System.out.println("Digite a idade:");
					listA.get(i).setIdade(leitor.nextInt());
					menu();
				}
				case 3: {
					System.out.println("Digite o sexo:");
					listA.get(i).setSexo(leitor.next());
					menu();
				}
				case 4: {
					System.out.println("Digite a Disciplina:");
					listA.get(i).setDisciplina(leitor.next());
					menu();
				}
				case 5: {
					System.out.println("Digite a Nota1:");
					listA.get(i).setNota1(leitor.nextDouble());
					menu();
				}
				case 6: {
					System.out.println("Digite a Nota2:");
					listA.get(i).setNota2(leitor.nextDouble());
					menu();
				}
				case 7: {
					System.out.println("Digite a Nota3:");
					listA.get(i).setNota3(leitor.nextDouble());
					menu();
				}
				default:
					{
						System.out.println("\n!Numero Incorreto, voltando ao menu");
						menu();
					}
			}
		}
}






