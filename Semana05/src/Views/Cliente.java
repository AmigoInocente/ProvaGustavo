package Views;

import Controllers.ContaController;
import Models.Conta;
import javax.swing.JOptionPane;

public class Cliente extends javax.swing.JFrame {

    private final ContaController contaController;
    private Conta conta = null;

    public Cliente() {
        initComponents();
        contaController = new ContaController();
        solicitaDocumentoCliente();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numeroConta = new javax.swing.JLabel();
        nomeTitular = new javax.swing.JLabel();
        Depositar = new javax.swing.JButton();
        Sacar = new javax.swing.JButton();
        Transferir = new javax.swing.JButton();
        Extrato = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("JetBrainsMono NF", 1, 13)); // NOI18N
        jLabel1.setText("Nº Conta:");

        jLabel2.setFont(new java.awt.Font("JetBrainsMono NF", 1, 13)); // NOI18N
        jLabel2.setText("Titular:");

        Depositar.setFont(new java.awt.Font("JetBrainsMono NF", 1, 24)); // NOI18N
        Depositar.setText("Depositar");
        Depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositarActionPerformed(evt);
            }
        });

        Sacar.setFont(new java.awt.Font("JetBrainsMono NF", 1, 24)); // NOI18N
        Sacar.setText("Sacar");
        Sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SacarActionPerformed(evt);
            }
        });

        Transferir.setFont(new java.awt.Font("JetBrainsMono NF", 1, 24)); // NOI18N
        Transferir.setText("Transferir");
        Transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferirActionPerformed(evt);
            }
        });

        Extrato.setFont(new java.awt.Font("JetBrainsMono NF", 1, 24)); // NOI18N
        Extrato.setText("Extrato");
        Extrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtratoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("JetBrainsMono NF", 1, 13)); // NOI18N
        jLabel3.setText("Saldo");

        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Depositar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Extrato, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeTitular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Depositar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Extrato, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solicitaDocumentoCliente() {
        do {
            String doc = JOptionPane.showInputDialog("Informe seu documento (CPF/CNPJ)");
            conta = contaController.buscarContaPorDocumentoTitular(doc);
            
            if(conta != null){
                boolean senhaValida = false;
                do{
                String senha = JOptionPane.showInputDialog("INFORME SUA SENHA");
                senhaValida = conta.validaSenha(senha);
                if(senhaValida == false){
                    JOptionPane.showMessageDialog(this, "SENHA INCORRETA!");
                }
                }while(senhaValida == false);
            }
            
        } while (conta == null);

        this.numeroConta.setText(String.valueOf(conta.getNumero()));
        this.nomeTitular.setText(conta.getTitular().getNome());
        this.saldo.setText("R$ " + String.valueOf(conta.getSaldo()));
    }

    private void DepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositarActionPerformed
        String valor = JOptionPane.showInputDialog("INFORME O VALOR DO DEPÓSITO.");
        double valorConvertido = Double.parseDouble(valor);

        conta = this.contaController.depositar(this.conta, valorConvertido);

        this.saldo.setText("R$ " + String.valueOf(conta.getSaldo()));
        
    }//GEN-LAST:event_DepositarActionPerformed

    private void ExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtratoActionPerformed
        this.dispose();
        new Extrato().setVisible(true);
    }//GEN-LAST:event_ExtratoActionPerformed

    private void SacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SacarActionPerformed
        String valor = JOptionPane.showInputDialog("INFORME O VALOR DO SAQUE.");
        double valorConvertido = Double.parseDouble(valor);

        conta = this.contaController.sacar(this.conta, valorConvertido);

        this.saldo.setText("R$ " + String.valueOf(conta.getSaldo()));
    }//GEN-LAST:event_SacarActionPerformed

    private void TransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferirActionPerformed
        String pergunta = JOptionPane.showInputDialog("Digite o documento da conta para transferir:");
        Conta contaTrans = contaController.buscarContaPorDocumentoTitular(pergunta);

        Double valor = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR DO SAQUE."));
        conta = contaController.transferir(this.conta, contaTrans, valor);
        this.saldo.setText("R$ " + String.valueOf(conta.getSaldo()));
        


    }//GEN-LAST:event_TransferirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new Sistema().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Depositar;
    private javax.swing.JButton Extrato;
    private javax.swing.JButton Sacar;
    private javax.swing.JButton Transferir;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nomeTitular;
    private javax.swing.JLabel numeroConta;
    private javax.swing.JLabel saldo;
    // End of variables declaration//GEN-END:variables
}
