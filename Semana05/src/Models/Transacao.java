package Models;

import java.util.Date;
import java.util.UUID;

public class Transacao {
    
    private final UUID id;
    private final Date data;
    private final Tipo tipo;
    private final Double transacao;
    private final UUID conta_id;
    
    public Transacao(Date data,Tipo tipo, Double transacao) {
        this.data = data;
        this.tipo = tipo;
        this.transacao = transacao; 
        this.id = UUID.randomUUID();
        this.conta_id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Double getTransacao() {
        return transacao;
    }

    public UUID getConta_id() {
        return conta_id;
    }
    
}
/*

DATA
TIPO(ENTRADA, SAIDA)
SALDO DA CONTA

*/