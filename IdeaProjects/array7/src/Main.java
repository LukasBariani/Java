public class Main {
    public static void main(String[] args) {
        String[][] tabelaClassificacao = {
                {"Botafogo", "60", "29", "18", "6", "5"},
                {"Palmeiras", "57", "29", "17", "6", "6"},
                {"Fortaleza", "56", "30", "16", "8", "6"},
                {"Flamengo", "51", "28", "15", "6", "7"},
                {"São Paulo", "50", "30", "15", "5", "10"},
                {"Internacional", "46", "28", "12", "10", "6"},
                {"Bahia", "45", "29", "13", "6", "10"},
                {"Cruzeiro", "43", "29", "12", "7", "10"},
                {"Atlético-MG", "41", "29", "10", "11", "8"},
                {"Vasco", "37", "28", "10", "7", "12"},
                {"Grêmio", "35", "29", "10", "5", "15"},
                {"Criciúma", "35", "29", "10", "5", "15"},
                {"Juventude", "31", "29", "8", "7", "14"},
                {"Corinthians", "30", "29", "8", "6", "15"},
                {"Fluminense", "29", "29", "7", "8", "14"},
                {"Atlético-GO", "19", "29", "4", "7", "18"},
                {"Cuiabá", "17", "29", "4", "5", "20"},
                {"Vitória", "15", "29", "3", "6", "20"},
                {"Santos", "12", "29", "2", "6", "21"},
                {"Sport Recife", "11", "29", "2", "5", "22"}
        };

        // Exemplo de impressão da tabela
        for (String[] time : tabelaClassificacao) {
            System.out.println("Clube: " + time[0] + ", Pontos: " + time[1] + ", Jogos: " + time[2] +
                    ", Vitórias: " + time[3] + ", Empates: " + time[4] + ", Derrotas: " + time[5]);
        }
    }
}
