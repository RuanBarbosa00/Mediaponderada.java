package ucsal;
import java.util.Scanner;
public class MediaPonderada {
public static void main(String[] args) {
	
Scanner input = new Scanner(System.in);	
double nota1, nota2, media;

System.out.println("Digite a primeira nota: ");
nota1 = input.nextDouble();
if (nota1 < 0 || nota1 > 10) {
	System.out.println("A nota esta fora do intervalo");
	System.exit(0);
}
System.out.println("Digite a segunda nota: ");
nota2 = input.nextDouble();
if (nota2 < 0 || nota2 > 10) {
	System.out.println("A nota esta fora do intervalo");
	System.exit(0);
}
media = ( (nota1 * 3) + (nota2 * 7)/10);
if (media < 3) {
    System.out.println("O aluno está reprovado");
} else if (media >= 6) {
    System.out.println("O aluno está aprovado");
} else {
    System.out.println("O aluno fará prova final");
}	
}
}
