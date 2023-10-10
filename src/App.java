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

    //Funções principais-------------------------------------------------------------------------------

    //Menu 
    public void menu(){
        while(true){
        print("Menu");
        print("1 - Adicionar aluno");
        print("2 - Media");
        print("3 - Mediana");
        print("4 - Moda");
        print("5 - Desvio padrao");
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
        if(opt >7 || opt <1) print("Opçao invalida");
    }
}
    //Calcula a media com base no array de notas
    public double media(){
       double total = 0; 
       
       for(int i = 0 ; i<tamanhoArrays; i++){
          total+= idades[i];
        }
        double media = total/tamanhoArrays;

       print("Media: "+ str(media));
       return media;
    }

    public void mediana() {
        if (tamanhoArrays == 0) {
            print("Não há dados para calcular a mediana.");
            return;
        }
    
        // Ordena o array em ordem crescente (usando o algoritmo de ordenação de bolha)
        for (int i = 0; i < tamanhoArrays - 1; i++) {
            for (int j = 0; j < tamanhoArrays - i - 1; j++) {
                if (idades[j] > idades[j + 1]) {
                    double temp = idades[j];
                    String tempNome = nomes[j];
                    idades[j] = idades[j + 1];
                    nomes[j] = nomes[j+1];
                    idades[j + 1] = temp;
                    nomes[j+1] = tempNome;
                }
            }
        }
    
        if (tamanhoArrays % 2 == 0) {
            // Se o tamanho do array for par, a mediana é a média dos dois valores do meio
            int meio1 = tamanhoArrays / 2 - 1;
            int meio2 = tamanhoArrays / 2;
            double mediana = (idades[meio1] + idades[meio2]) / 2.0;
            print("Mediana: " + str(mediana));
        } else {
            // Se o tamanho do array for ímpar, a mediana é o valor do meio
            int meio = tamanhoArrays / 2;
            double mediana = idades[meio];
            print("Mediana: " + str(mediana));
        }
    }
    

    public void moda(){
    if (tamanhoArrays == 0) {
        print("Não há dados para calcular a moda.");
        return;
    }

    double moda = idades[0];  // Valor inicial para a moda
    int maxContagem = 1;      // Contagem do valor mais frequente
    int contagemAtual = 1;    // Contagem do valor atual

    for (int i = 1; i < tamanhoArrays; i++) {
        if (idades[i] == idades[i - 1]) {
            contagemAtual++;
        } else {
            contagemAtual = 1;
        }

        if (contagemAtual > maxContagem) {
            maxContagem = contagemAtual;
            moda = idades[i];
        }
    }

    if (maxContagem > 1) {
        print("Moda: " + str(moda) + " (apareceu " + maxContagem + " vezes)");
    } else {
        print("Não há moda (todos os valores são únicos)");
    }



    }
    public void desvioPadrao(){
        double media = media();
        for(int i = 0 ; i<tamanhoArrays; i++){
         double desvio = media - idades[i];
         print( "O desvio padrão de " + nomes[i] + " é " + str(desvio));
}
    }

    public void buscaNome(){
        print("Digite o nome para busca");
        String busca = inputString();
        for(int i = 0 ; i < tamanhoArrays; i++){
          if(nomes[i].equals(busca)) {
          // Mostra o nome e idade do aluno
            print( "Aluno: " + busca + " idade: " + str(idades[i]));

}

        }
    }

    
}

