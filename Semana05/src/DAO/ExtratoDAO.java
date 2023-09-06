package DAO;

import Models.Tipo;
import Models.Transacao;
import java.util.Date;
import java.util.UUID;

public interface ExtratoDAO {
    public UUID id(Transacao id);
    public Date data(Transacao data);
    public Tipo tipo(Transacao tipo);
    public Double transacao(Transacao transacao);
    public UUID conta_id(Transacao conta_id);
}
