package DAO.Postgres;

import Views.Extrato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;
public class ExtratoDAOPostegrs {
    
    private final Connection conexao;

    public ExtratoDAOPostegrs(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void insereConta(Extrato extrato) {
        String sql = "INSERT INTO Extrato (id, data, tipo, valor, pessoa_id) VALUES (?, ?, CAST (? as tipo_extrato), ?, ?)";
        //String tipoConta = (extrato instanceof ContaCorrente) ? "corrente" : (conta instanceof ContaSalario) ? "salario" : "poupanca";

        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setObject(1, extrato.getId());
            stm.setInt(2, extrato.getData());
            stm.setDouble(3, extrato.getTipo());
            stm.setString(4, tipoValor);
            stm.setObject(5, extrato.getPessoaId().getId());

            stm.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    @Override
    public Extrato buscarExtrato(String documento) {
        String sql = "SELECT e.id, e.numero, e.saldo, e.tipo, e.pessoa_id p.tipo AS pessoa_tipo FROM Extrato AS e"
                + " JOIN pessoa AS p ON c.pessoa_id = p.id WHERE p.documento = ?";

        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setString(1, documento);

            ResultSet resultado = stm.executeQuery();
            if (resultado.next()) {
                UUID id = resultado.getObject("pessoa_id", UUID.class);
                String nome = resultado.getString("nome");
                String tipo = resultado.getString("pessoa_tipo");
                Pessoa pessoa = (tipo.equals("PF")) ? new PessoaFisica(id, nome, documento) : new PessoaJuridica(id, nome, documento);

                UUID idConta = resultado.getObject("id", UUID.class);
                int numero = resultado.getInt("numero");
                double saldo = resultado.getDouble("saldo");
                String tipoC = resultado.getString("tipo");
                String senha = resultado.getString("senha");

                switch (tipoC) {
                    case "corrente":
                        return new ContaCorrente(idConta, numero, saldo, pessoa, senha);
                    case "poupanca":
                        return new ContaPoupanca(idConta, numero, saldo, pessoa, senha);
                    case "salario":
                        return new ContaSalario(idConta, numero, saldo, pessoa, senha);
                    default:
                        return null;
                }
            }
        } catch (SQLException error) {
            System.out.println(error);
        }
        return null;
    }
}
