public class cursojava {

    public static void main(String[] args) {

        int nota1 = 90;
        int nota2 = 90;
        int nota3 = 180;
        int nota4 = 90;
        int media = 0;


        media = (nota1 +nota2 + nota3 + nota4)/4;

        if(media >=50){
            if(media >= 70){
                if (media > 90) {
                    System.out.println("Aluno está aprovado direto - Parabéns"  +  media);
                }else{
                    System.out.println("Aluno foi aprovado direto"  +  media);
                }
            }else{
                System.out.println("Aluno está em recuperação"  +  media);
            }
        }else{
            System.out.println("Aluno reprovado direto"  +  media);
        }

    }

}
