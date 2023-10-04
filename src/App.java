import java.util.Scanner;

public class App {

    double [] idades = new double[500];
    String[] nomes = new String[500];
    int tamanhoArrays = 0;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    }
    //Funções auxiliares -------------------------------------------------------------------------------

    //Input de uma String
    public String inputString(){
        Scanner sc = new Scanner(System.in);
        //Pega o input
        String resp = sc.nextLine();

        sc.close();
        return resp;

    }
    //Input de um double
    public double inputDouble(){
        while (true){
        //Chama a função anterior e converte para double
        String input = inputString();
        try {
            double inputDouble = Double.parseDouble(input);
            return inputDouble;
            //Se não for um numero, continua até um ser digitado
        } catch (Exception e) {
            System.out.println("Numero incorreto, digite novamente");
            continue;
        }
        }
    }
    public void print(String texto){
        System.out.println(texto);
    }
    //Adiciona nomes ao array
    public void adicionaAluno(){

        //Adiciona nome do aluno
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = inputString();
        nomes[tamanhoArrays] = nomeAluno;

        //Adiciona a idade do Aluno
        System.out.println("Digite a idade do aluno:");
        double idadeAluno = inputDouble();
        idades[tamanhoArrays] = idadeAluno;
       
        //Aumenta o tamanho do array manualmente
        tamanhoArrays++;
    }


    //Funções principais-------------------------------------------------------------------------------

    //Calcula a media com base no array de notas
    public void media(){

    }
    public void mediana(){

    }
    public void moda(){

    }
    public void desvioPadrao(){

    }
    public void buscaNome(){
        print("Digite o nome para busca");
        String busca = inputString();
        for(int i = 0 ; i < tamanhoArrays; i++){

          if(nomes[i] == busca) {
          // Mostra o nome e idade do aluno
            print( "Aluno: " + busca + "idade: " + String.parseString(idades[i]);

}

        }
    }

    
}
