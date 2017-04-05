package xyz.cescoferraro.java;


import java.util.Scanner;


public class PascoaTask {

    public static void main(String[] args) {
        Questions questions = new Questions().invoke();
        int peso = questions.getPeso();
        int casca = questions.getCasca();
        int personagem = questions.getPersonagem();
        int brinquedo = questions.getBrinquedo();
        Double preco = Preco(peso, casca, personagem, brinquedo);


        System.out.println("Preco : " + preco);

    }

    private static Double Preco(int peso, int casca, int personagem, int brinquedo) {
        // Custo incial
        Double preco = 5.00;
        // Casca
        preco = CustoCasca(peso, casca, preco);
        // Personagem
        preco = CustoPersonagem(personagem, preco);
        // Brinquedo
        preco = CustoBrinquedo(brinquedo, preco);
        // Embalagem
        preco = CustoEmbalagem(preco);
        // Transport
        preco = CustoTransporte(peso, preco);
        // Lucro
        preco = MargemdeLucro(preco);
        return preco;
    }


    private static int AskPeso(Scanner input) {
        int peso;
        System.out.println("Peso do ovo");
        peso = input.nextInt();
        System.out.println("Peso: " + peso);
        return peso;
    }

    private static int AskCasca(Scanner input) {
        int casca;
        System.out.println("Tipo de casca? " +
                "0=normal " +
                "1=casca-bombom " +
                "2=casca-recheio");
        casca = input.nextInt();
        System.out.println("Casca: " + casca);
        return casca;
    }

    private static int AskPersonagem(Scanner input) {
        int personagem;
        System.out.println("categoria Personagem? " +
                "0=p1 " +
                "1=p1 " +
                "2=p2 " +
                "3=p3 " +
                "4=p4");
        personagem = input.nextInt();
        System.out.println("personagem: " + personagem);
        return personagem;
    }

    private static int AskBrinquedo(Scanner input) {
        int brinquedo;
        System.out.println("categoria Brinquedo? " +
                "0=b1 " +
                "1=b1 " +
                "2=b2 " +
                "3=b3 ");
        brinquedo = input.nextInt();
        System.out.println("categoria: " + brinquedo);
        return brinquedo;
    }

    private static Double MargemdeLucro(Double preco) {
        preco = preco * 1.18;
        return preco;
    }

    private static Double CustoTransporte(int peso, Double preco) {
        switch (peso) {
            case 300:
                preco = preco + 3.00;
                break;
            case 400:
                preco = preco + 4.00;
                break;
            case 500:
                preco = preco + 4.50;
                break;
            case 700:
                preco = preco + 5.00;
                break;
            case 1000:
                preco = preco + 5.50;
                break;
        }
        return preco;
    }

    private static Double CustoEmbalagem(Double preco) {
        preco = preco + 1.5;
        return preco;
    }

    private static Double CustoBrinquedo(int brinquedo, Double preco) {
        switch (brinquedo) {
            case 1:
                preco = preco + 3.00;
                break;
            case 2:
                preco = preco + 8.00;
                break;
            case 3:
                preco = preco + 10.00;
                break;
        }
        return preco;
    }

    private static Double CustoPersonagem(int personagem, Double preco) {
        switch (personagem) {
            case 1:
                preco = preco + 5.00;
                break;
            case 2:
                preco = preco + 8.00;
                break;
            case 3:
                preco = preco + 13.00;
                break;
            case 4:
                preco = preco + 15.00;
                break;
        }
        return preco;
    }

    private static Double CustoCasca(int peso, int casca, Double preco) {
        // Peso e Casca
        switch (casca) {
            // Casca Normal
            case 0:
                switch (peso) {
                    case 300:
                        preco = preco + 10.00;
                        break;
                    case 400:
                        preco = preco + 15.00;
                        break;
                    case 500:
                        preco = preco + 20.00;
                        break;
                    case 700:
                        preco = preco + 30.00;
                        break;
                    case 1000:
                        preco = preco + 45.00;
                        break;
                }
                break;
            //Casca Bombom
            case 1:
                switch (peso) {
                    case 300:
                        preco = preco + 12.00;
                        break;
                    case 400:
                        preco = preco + 18.00;
                        break;
                    case 500:
                        preco = preco + 23.00;
                        break;
                    case 700:
                        preco = preco + 33.00;
                        break;
                    case 1000:
                        preco = preco + 48.00;
                        break;
                }
                break;
            case 2:
                switch (peso) {
                    case 300:
                        preco = preco + 15.00;
                        break;
                    case 400:
                        preco = preco + 20.00;
                        break;
                    case 500:
                        preco = preco + 30.00;
                        break;
                    case 700:
                        preco = preco + 40.00;
                        break;
                    case 1000:
                        preco = preco + 50.00;
                        break;
                }
                break;
        }
        return preco;
    }

    private static class Questions {
        private int peso;
        private int casca;
        private int personagem;
        private int brinquedo;

        public int getPeso() {
            return peso;
        }

        public int getCasca() {
            return casca;
        }

        public int getPersonagem() {
            return personagem;
        }

        public int getBrinquedo() {
            return brinquedo;
        }

        public Questions invoke() {
            Scanner input = new Scanner(System.in);
            peso = AskPeso(input);
            casca = AskCasca(input);
            personagem = AskPersonagem(input);
            brinquedo = AskBrinquedo(input);
            return this;
        }
    }
}


