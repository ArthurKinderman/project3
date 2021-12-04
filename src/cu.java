public class cu {
    public static void main(String[] args) {

        int nota1 = 90;
        int nota2 = 90;
        int nota3 = 60;
        int nota4 = 90;
        int media = 0;

        media = (nota1 +nota2 + nota3 + nota4)/4;

        /*SWITCH CASE: operações exatas*/

        switch (media){
            case 70:
                System.out.println("Aluno aprovado");
                break;
            default: System.out.println("Outro valor" + media);
                break;
        }

    }
}
