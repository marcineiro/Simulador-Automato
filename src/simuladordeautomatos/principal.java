/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladordeautomatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author murilo
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public static BufferedReader lerArq;
    public static String file;

    /**
     *
     */
    public static ArrayList<estado> listaEstado;

    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarthis.listaSimb.add(simb);principal("unchecked"))
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1059, 900));
        setSize(new java.awt.Dimension(800, 780));

        jTextArea1.setColumns(6);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Lista <br>de Instruções");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Sentença:");

        jButton6.setText("Testar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("Criar Autômato");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Escolher arquivo");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Limpar Lista");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Salvar Lista");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Help");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem2.setText("Ajuda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(518, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 238, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String instList = jTextArea1.getText();
        if (instList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista sem instruções!", "Erro", 0);
        } else {
            int i = 0, j = 0, d1 = 0, d2 = 0, state = 0;
            char c, simb = ' ';
            estado e = new estado(), e1 = new estado();
            simbolo s = new simbolo();
            String dt1 = new String(), dt2 = new String(), finais = new String(), inicial = new String();

            for (i = 0; i < instList.length(); i++) {
                c = instList.charAt(i);
                switch (state) {
                    case 0:
                        e = new estado();
                        e1 = new estado();
                        s = new simbolo();
                        if (c >= '0' && c <= '9') {
                            state = 1;
                            dt1 += c;
                        }
                        if (c == 'I') {
                            state = 9;
                        }
                        if (c == 'F') {
                            state = 6;
                        }
                        break;

                    case 1:
                        if (c == ',') {
                            state = 2;
                            d1 = Integer.parseInt(dt1);
                        } else if (c <= '9' && c >= '0') {
                            dt1 += c;
                        }
                        break;

                    case 2:
                        if (c == '\\') {
                            state = 12;
                        } else {
                            simb = c;
                            state = 3;
                        }
                        break;

                    case 3:
                        if (c == ',') {
                            state = 4;
                        }
                        break;

                    case 4:
                        if (c >= '0' && c <= '9') {
                            state = 5;
                            dt2 += c;
                        }
                        break;

                    case 5:
                        if (c >= '0' && c <= '9') {
                            dt2 += c;
                        } else if (c == '\n') {
                            state = 0;
                            dt1 = new String();
                            d2 = Integer.parseInt(dt2);
                            dt2 = new String();
                            s.setValor(simb);                            
                            if (listaEstado != null) {
                                for (j = 0; j < listaEstado.size(); j++) {
                                    if (listaEstado.get(j).getNum() == d1) {
                                        e = listaEstado.get(j);
                                    }
                                    if (listaEstado.get(j).getNum() == d2) {
                                        if(d1!=d2){
                                            e1 = listaEstado.get(j);
                                        } else {
                                            e1 = e;
                                        }
                                    }
                                }
                                if(e1.equals(e)){
                                    s.setProxEstado(e1);
                                    e.setListaSimb(s);
                                } else {
                                    if(!e1.isInicializado()){
                                        e1.setNum(d2);
                                        listaEstado.add(e1);
                                    }            
                                    s.setProxEstado(e1);
                                    e.setListaSimb(s);
                                    
                                }
                            } else {
                                listaEstado = new ArrayList<estado>();
                                e.setNum(d1);
                                s.setValor(simb);
                                e.setInicializado(true);
                                if(d1!=d2){
                                    e1.setInicializado(true);
                                    e1.setNum(d2);
                                    s.setProxEstado(e1);
                                    listaEstado.add(e1);
                                } else {
                                    s.setProxEstado(e);
                                }
                                e.setListaSimb(s);
                                listaEstado.add(e);
                            }
                        }
                        break;
                        
                    case 6:
                        if(c=='=')
                            state = 7;
                        break;
                        
                    case 7:
                        if(c>='0'&&c<='9'){
                            state = 8;
                            finais += c;
                        }
                        break;
                        
                    case 8:
                        if(c==','){
                            state = 7;
                            for(j=0;j<listaEstado.size();j++){
                                if(listaEstado.get(j).getNum()==Integer.parseInt(finais)){
                                    listaEstado.get(j).setAceit(true);
                                }
                            }
                            finais = new String();
                        }
                        if(c>='0'&&c<='9'){
                            finais += c;
                        }
                        if(c=='\n'){
                            state = 0;
                            for(j=0;j<listaEstado.size();j++){
                                if(listaEstado.get(j).getNum()==Integer.parseInt(finais)){
                                    listaEstado.get(j).setAceit(true);
                                }
                            }
                            finais = new String();
                        }
                        break;
                        
                    case 9:
                        if(c=='=')
                            state = 10;
                        break;
                        
                    case 10:
                        if(c>='0'&&c<='9'){
                            state = 11;
                            inicial += c;
                        }
                        break;
                        
                    case 11:
                        if(c>='0'&&c<='9')
                            inicial += c;
                        if(c=='\n'){
                            state = 0;
                            for(j=0;j<listaEstado.size();j++){
                                if(listaEstado.get(j).getNum()==Integer.parseInt(inicial)){
                                    listaEstado.get(j).setInicial(true);
                                }
                            }
                            inicial = new String();
                        }
                        break;
                        
                    case 12:
                        if(c==','||c=='I'||c=='F'||c=='\\'||c=='='){
                            simb = c;
                            state = 3;
                        }
                        break;
                            
                }
            }
            JOptionPane.showMessageDialog(null, "Autômato criado com sucesso!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        fileChooseA window2;
//        window2 = new fileChooseA();
//        window2.setVisible(true);
        
        JFileChooser a = new JFileChooser();
        int ret = a.showOpenDialog(this);
        if (ret == JFileChooser.APPROVE_OPTION) {
            File f = a.getSelectedFile();
            try {
                // What to do with the file, e.g. display it in a TextArea
                lerArq = new BufferedReader(new FileReader(f.getAbsolutePath()));
            } catch (IOException ex) {
                System.out.println("problem accessing file" + f.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
        
        
        try {
            String t = principal.lerArq.readLine();
            String st = new String();
            while (t != null) {
                st = st.concat(t);
                st = st.concat("\n");
                t = lerArq.readLine();
            }
            jTextArea1.setText(st);
        } catch (IOException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void setjTextArea1(String t) {
        this.jTextArea1.setText(t);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        jLabel3.setText("");
        jTextField1.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        file = jTextArea1.getText();
        new fileChoose().setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Simulador Universal de Autômatos\n"
                + "Autor: Murilo Marcineiro de Almeida\n"
                + "2/2018");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String sentence = jTextField1.getText(), toPut = new String(), out = new String("<html>");
        char c;
        int n = 0;
        boolean rec = false;
        estado e;
        ArrayList<simbolo> s = new ArrayList<simbolo>();
        if(listaEstado!=null){
            e = listaEstado.get(n);
            try{
                    while(!e.isInicial()){
                        e=listaEstado.get(n++);
                    }
                } catch(NullPointerException npe){
                    JOptionPane.showMessageDialog(null,npe
                            +"\nNão foi definido estado inicial para o autômato.");
                }
            for(int i = 0;i<sentence.length();i++){
                c = sentence.charAt(i);
                s = e.getListaSimb();
                toPut = String.format("<span color=red> q%d </span>",e.getNum());
                try{
                    out += sentence.substring(0,i)+toPut+"<span color=blue>"+sentence.charAt(i)+"</span>"+sentence.substring(i+1)+"<br>";
                } catch(IndexOutOfBoundsException iobe){
                    out += toPut+sentence.substring(i)+"<br>";
                }
                if(s!=null){
                    for(int j=0;j<s.size();j++){
                        if(s.get(j).valor==c){
                            e=s.get(j).getProxEstado();
                        }
                    }
                }

            }
            out += String.format(sentence+"<span color=red> q%d </span>", e.getNum());
            jLabel3.setText(out);
            if(e.isAceit()){
                JOptionPane.showMessageDialog(null, "Sentença reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "Sentença não reconhecida!","",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe autômato criado."
                    + "\nPara criar adicione texto na Lista de Instruções", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed



    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        doLayout();
        ajuda window3;
        window3 = new ajuda();
        window3.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            principal a = new principal();
            a.setExtendedState(6);
            a.setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
