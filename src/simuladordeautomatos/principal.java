/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladordeautomatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


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
    public static boolean opt = false;
    public static char vazio = 949;
    public static char nula = 981;

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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(250, 0));
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
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Escolher arquivo");
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

        jButton7.setText("Converter p/ RegEx");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Converter p/ Autômato");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Lista AFD");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Expressão Regular");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(497, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String instList = jTextArea1.getText();
        jLabel3.setText("");
        if (instList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista sem instruções!", "Erro", 0);
        } else {
            int i, j, d1 = 0, d2 , state = 0;
            char c, simb = ' ';
            if(listaEstado!=null){
                listaEstado.clear();
                listaEstado=null;
            }
            estado e = new estado(), e1 = new estado();
            simbolo s = new simbolo();
            String dt1 = new String(), dt2 = new String(), finais = new String(), inicial = new String();

            if(!opt){
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
            
                if(listaEstado!=null){
                    JOptionPane.showMessageDialog(null, "Autômato criado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null, "Lista não corresponde a autômato!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Modo de \"Expressões Regulares\" "
                        + "selecionado!\n"
                        + "Não é necessário criar, somente testar a sentença.");
            }
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
        if(!opt){
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
        } else {
            String rx = jTextArea1.getText();
            if(sentence.matches(rx)){
                out += String.format(sentence+" <br> <span color=green> Sentenca reconhecida </span>");
            }else{
                out += String.format(sentence+" <br> <span color=red> Sentenca não reconhecida </span>");
            }
            jLabel3.setText(out);
        }
    }//GEN-LAST:event_jButton6ActionPerformed



    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        doLayout();
        ajuda window3;
        window3 = new ajuda();
        window3.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        opt = false;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        opt = true;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    public String simplify(String r1,String r2,String r3,String r4){
        String str="",s = String.valueOf(nula);
        boolean b1 = r1.equals(String.valueOf(nula)),
                b2 = r2.equals(String.valueOf(nula)),
                        b3 = r3.equals(String.valueOf(nula));
        if(b1 || b2 || b3){
            if(r4.equals(String.valueOf(nula)) || r4.equals(String.valueOf(vazio))){
                str="";
            } else {
                str+=r4;
            }
        } else {
            if(r1.equals(String.valueOf(vazio))){
                r1 = "";
            } else {
                if(r1.length()>1){
                    r1 = "("+r1+")";
                }
            }
            
            if(r2.equals(String.valueOf(vazio))){
                r2 = "";
            } else {
                if(r2.length()>1){
                    r2 = "("+r2+")*";
                } else {
                    r2 += "*";
                }
            }
            
            if(r3.equals(String.valueOf(vazio))){
                r3 = "";
            } else {
                if(r3.length()>1){
                    r3 = "("+r3+")";
                }
            }
            
            str = r1+r2+r3;
            
            if(r4.equals(String.valueOf(vazio)) || r4.equals(String.valueOf(nula))){
                r4 = "";
            } else {
                if(r4.length()>1){
                    if(str.length()>0){
                        r4 = "|("+r4+")";
                    }else{
                        r4 = "("+r4+")";
                    }
                } else {
                    if(str.length()>0)
                        r4 = "|"+r4;
                }
            }
            str += r4;
        }        
        return str;
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(listaEstado!=null){
            estado e = new estado(), inicial = new estado();
            estado ef = new estado();
            simbolo s;
            e.setInicial(true);
            ArrayList<estado> finais = new ArrayList<>();
            for(int i=0;i<listaEstado.size();i++){
                if(listaEstado.get(i).isAceit()){
                    finais.add(listaEstado.get(i));
                }else{
                    s = new simbolo();
                    s.setValor(nula);
                    s.setProxEstado(ef);
                    listaEstado.get(i).setListaSimb(s);
                }
                if(listaEstado.get(i).isInicial()){
                    inicial = listaEstado.get(i);
                }else{
                    s = new simbolo();
                    s.setValor(nula);
                    s.setProxEstado(listaEstado.get(i));
                    e.setListaSimb(s);
                }
            }
            inicial.setInicial(false);
            e.setInicial(true);
            ef.setAceit(true);
            s = new simbolo();
            s.setValor(vazio);
            s.setProxEstado(inicial);
            e.setListaSimb(s);
            s = new simbolo();
            s.setValor(nula);
            s.setProxEstado(ef);
            e.setListaSimb(s);
            
            
            for(int i=0;i<finais.size();i++){
                finais.get(i).setAceit(false);
                s = new simbolo();
                s.setValor(vazio);
                s.setProxEstado(ef);
                finais.get(i).setListaSimb(s);
            }
            
            listaEstado.add(e);
            listaEstado.add(ef);
            estado eaux , qi, qj, qdel;
            reg raux;
            ArrayList<estado> origem, destino, estA = new ArrayList<>();
            ArrayList<reg> regA = new ArrayList<>();
            reg r;
            int i;
            String r1,r2,r3,r4,r0;
            while(listaEstado.size()>2){
                qdel = null;
                origem = new ArrayList<>();
                destino = new ArrayList<>();
                i=0;
                while(qdel==null){
                    if(!listaEstado.get(i).isInicial() && !listaEstado.get(i).isAceit()){
                        qdel = listaEstado.get(i);
                    }
                    i++;
                }
                for(int j=0;j<listaEstado.size();j++){
                    eaux = listaEstado.get(j);
                    if(!eaux.equals(qdel)){
                        if(eaux.temTrans(qdel))
                            origem.add(eaux);
                        if(qdel.temTrans(eaux))
                            destino.add(eaux);
                    }
                }
                for(int j=0;j<origem.size();j++){
                    for(int k=0;k<destino.size();k++){
                        qi=origem.get(j);
                        qj=destino.get(k);
                        r1 = qi.getExp(qdel);
                        r2 = qdel.getExp(qdel);
                        r3 = qdel.getExp(qj);
                        r4 = qi.getExp(qj);
                        
                        
                        r0 = simplify(r1, r2, r3, r4);
                        
                        
                        
                        r = new reg(r0, qj);
                        estA.add(qi);
                        regA.add(r);
                    }
                }
                listaEstado.remove(qdel);
                for(int j=0;j<estA.size();j++){
                    eaux = estA.get(j);
                    raux = regA.get(j);
                    eaux.setReg(raux);
                }
            }
            jTextArea1.setText(listaEstado.get(0).getExp(listaEstado.get(1)));
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Não há autômato criado!\n");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
