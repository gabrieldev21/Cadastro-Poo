package poo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu
{

	static Scanner leitor = new Scanner(System.in);
	public static void main(String[] args) throws IOException
	{
		menu();
	}
	public static void menu() throws IOException
	{
		// Menu
			
				System.out.println("Escolha a função:");
				System.out.println("1: Cadastro de Aluno");
				System.out.println("2: Listar Alunos");
				System.out.println("3: Cadastro de Professores");
				System.out.println("4: Listar Professores");
				System.out.println("0: Sair");
				
				int numMenu;
				System.out.println("Digite o numero: ");
				numMenu = leitor.nextInt();
			switch (numMenu) {
				case 1 -> cadAluno();
				case 2 -> listAluno();
				case 3 -> cadProfessor();
				case 4 -> listProfessor();
				case 0 -> System.out.println("!Você Fechou o Programa!\n");
				default -> {
					System.out.println("\n!Numero Incorreto!");
					menu();
					}
			}
		 
			}
		public static void cadAluno() throws IOException
		{
			//Vetor de lista de Alunos
			List <Aluno> lista = new ArrayList<>();
			// Pega as informações dos Alunos
				Aluno A = new Aluno();
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
				lista.add(A);
				menu();
		}


		public static void listAluno() throws IOException
		{
			//n sei fazer ajudaaaaaaaaaa
			System.out.println();
			menu();

		}
		public static void cadProfessor() throws IOException
		{
			List<Professor> lista = new ArrayList<>();
			Professor Pr = new Professor();
			System.out.println("Digite um nome:");
			Pr.setNome(leitor.next());
			System.out.println("Digite a idade:");
			Pr.setIdade(leitor.nextInt());
			System.out.println("Digite o sexo:");
			Pr.setSexo(leitor.next());
			System.out.println("Digite a Disciplina:");
			Pr.setDisciplina(leitor.next());
			lista.add(Pr);

			menu();
		}

		public static void listProfessor() throws IOException
		{
			//n sei fazer ajudaaaaaaaaaa
			System.out.println();
			menu();

		}

}






