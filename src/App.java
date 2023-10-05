import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);
    double [] idades = new double[100];
    String[] nomes = new String[100];
    int tamanhoArrays = 0;

    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo");
        App app = new App();
        app.menu();
        //Fecha o scanner ao fechar o programa
        sc.close();
        
        

    }
    //Funções auxiliares -------------------------------------------------------------------------------

    //Input de uma String
    public String inputString(){
        //Scanner sc = new Scanner(System.in);
        //Pega o input
        String resp = sc.nextLine();
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
        }
        }
    }

//Traz menos verbosidade

    public void print(String texto){
        System.out.println(texto);
    }

//Converte para string
    public String str(double string){
      return String.valueOf(string);
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
    //Organiza o array em ordem crescente
    public void sort(){
        
    }

    //Funções principais-------------------------------------------------------------------------------

    //Menu 
    public void menu(){
        while(true){
        print("Menu");
        print("1 - Adicionar aluno");
        print("2 - Media");
        print("3 - Mediana");
        print("4 - Moda");
        print("5 - Desvio padrão");
        print("6 - Buscar nome");
        print("7 - Sair");
        print("Digite uma opcão");
       
        double opt = inputDouble();
        if(opt == 1) adicionaAluno();
        if(opt == 2) media();
        if(opt == 3) mediana();
        if(opt == 4) moda();
        if(opt == 5) desvioPadrao();
        if(opt == 6 ) buscaNome();
        if(opt == 7) break; 
    }
}
    //Calcula a media com base no array de notas
    public double media(){
       double total = 0; 
       
       for(int i = 0 ; i<tamanhoArrays; i++){
          total+= idades[i];
        }
        double media = total/tamanhoArrays;

       print(str(media));
       return media;
    }

    public void mediana(){
        int[] idadesSort = new int[idades.length];


       
    }
    public void moda(){

    }
    public void desvioPadrao(){
        double media = media();
        for(int i = 0 ; i<tamanhoArrays; i++){
         double desvio = media - idades[i];
         print( "O desvio padrão de " + nomes[i] + "é" + str(desvio));
}
    }

    public void buscaNome(){
        print("Digite o nome para busca");
        String busca = inputString();
        for(int i = 0 ; i < tamanhoArrays; i++){
          if(nomes[i].equals(busca)) {
          // Mostra o nome e idade do aluno
            print( "Aluno: " + busca + "idade: " + str(idades[i]));

}

        }
    }

    
}

