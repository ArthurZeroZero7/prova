
/* Se você está vendo esta mensagem é porque fez tudo certo até aqui. 
    Boa prova! */

void main() {
    int defeitos = Integer.parseInt(IO.readln("Digite a quantidade de peças defeituosas do lote: "));
    int totalDefeitos = 0;
    int totalLotes = 0;
    double media;
    
    while (defeitos >= 0) {
        totalDefeitos = totalDefeitos + defeitos;
        totalLotes = totalLotes + 1;
        defeitos = Integer.parseInt(IO.readln("Digite a quantidade de peças defeituosas do lote: "));
    }

    if (totalLotes == 0) {
        IO.println("Aviso: Valor negativo digitado no primeiro lote.");
    } else {
        media = (double) totalDefeitos/totalLotes;

        IO.println("Total de defeitos: " + totalDefeitos);
        IO.println("Total de lotes analisados: " + totalLotes);
        IO.println(String.format("Média de defeitos por lote: %.2f", media));

        if (media <= 2) {
            IO.println("Máquina Regulada (Excelente)");
        } else if (media <= 5) {
            IO.println("Alerta: Necessita de Manutenção Preventiva");
        } else {
            IO.println("Paragem Crítica: Máquina Danificada");
        }
    }
}
