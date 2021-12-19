import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
/*
Name: Vasu Choudhary
Roll No: A251
SAP ID: 70012000337
B Tech IT 2nd Year
*/
public class MainPage extends javax.swing.JFrame {
    String out="X";
    int i=0;
    public MainPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Player 2:");

        p2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Player 1:");

        p1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1.setText("0");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("TIC TAC TOE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(p1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(p2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>                        

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        b7.setEnabled(false);
        if(i%2==0){
            out="X";
        }
        else{
            out="O";
        }
        b7.setText(out);
        i++;
        if((b1.isEnabled()==false)
            &&(b2.isEnabled()==false)
            &&(b3.isEnabled()==false)
            &&(b4.isEnabled()==false)
            &&(b5.isEnabled()==false)
            &&(b6.isEnabled()==false)
            &&(b7.isEnabled()==false)
            &&(b8.isEnabled()==false)
            &&(b9.isEnabled()==false)){
            JOptionPane.showMessageDialog(this,"Game Tied");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            i=0;
        }
        if((((b1.getText()).equals(out))&&(b2.getText()).equals(out)&&(b3.getText()).equals(out))
        ||(((b4.getText()).equals(out))&&(b5.getText()).equals(out)&&(b6.getText()).equals(out))
        ||(((b7.getText()).equals(out))&&(b8.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b4.getText()).equals(out)&&(b7.getText()).equals(out))
        ||(((b2.getText()).equals(out))&&(b5.getText()).equals(out)&&(b8.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b6.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b5.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b5.getText()).equals(out)&&(b7.getText()).equals(out))){
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                i=0;
            if(out.equals("X")){
                p1.setText(Integer.toString(parseInt(p1.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 1 WON");
            }
            else if(out.equals("O")){
                p2.setText(Integer.toString(parseInt(p2.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 2 WON");
            }
        }
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        b1.setEnabled(false);
        if(i%2==0){
            out="X";
        }
        else{
            out="O";
        }
        b1.setText(out);
        i++;
        if((((b1.getText()).equals(out))&&(b2.getText()).equals(out)&&(b3.getText()).equals(out))
        ||(((b4.getText()).equals(out))&&(b5.getText()).equals(out)&&(b6.getText()).equals(out))
        ||(((b7.getText()).equals(out))&&(b8.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b4.getText()).equals(out)&&(b7.getText()).equals(out))
        ||(((b2.getText()).equals(out))&&(b5.getText()).equals(out)&&(b8.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b6.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b5.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b5.getText()).equals(out)&&(b7.getText()).equals(out))){
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                i=0;
            if(out.equals("X")){
                p1.setText(Integer.toString(parseInt(p1.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 1 WON");
            }
            else if(out.equals("O")){
                p2.setText(Integer.toString(parseInt(p2.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 2 WON");
            }
        }
        else if((b1.isEnabled()==false)
            &&(b2.isEnabled()==false)
            &&(b3.isEnabled()==false)
            &&(b4.isEnabled()==false)
            &&(b5.isEnabled()==false)
            &&(b6.isEnabled()==false)
            &&(b7.isEnabled()==false)
            &&(b8.isEnabled()==false)
            &&(b9.isEnabled()==false)){
            JOptionPane.showMessageDialog(this,"Game Tied");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            i=0;
        }
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        b2.setEnabled(false);
        if(i%2==0){
            out="X";
        }
        else{
            out="O";
        }
        b2.setText(out);
        i++;
        if((((b1.getText()).equals(out))&&(b2.getText()).equals(out)&&(b3.getText()).equals(out))
        ||(((b4.getText()).equals(out))&&(b5.getText()).equals(out)&&(b6.getText()).equals(out))
        ||(((b7.getText()).equals(out))&&(b8.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b4.getText()).equals(out)&&(b7.getText()).equals(out))
        ||(((b2.getText()).equals(out))&&(b5.getText()).equals(out)&&(b8.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b6.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b5.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b5.getText()).equals(out)&&(b7.getText()).equals(out))){
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                i=0;
            if(out.equals("X")){
                p1.setText(Integer.toString(parseInt(p1.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 1 WON");
            }
            else if(out.equals("O")){
                p2.setText(Integer.toString(parseInt(p2.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 2 WON");
            }
        }
        else if((b1.isEnabled()==false)
            &&(b2.isEnabled()==false)
            &&(b3.isEnabled()==false)
            &&(b4.isEnabled()==false)
            &&(b5.isEnabled()==false)
            &&(b6.isEnabled()==false)
            &&(b7.isEnabled()==false)
            &&(b8.isEnabled()==false)
            &&(b9.isEnabled()==false)){
            JOptionPane.showMessageDialog(this,"Game Tied");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            i=0;
        }
    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        b3.setEnabled(false);
        if(i%2==0){
            out="X";
        }
        else{
            out="O";
        }
        b3.setText(out);
        i++;
        if((((b1.getText()).equals(out))&&(b2.getText()).equals(out)&&(b3.getText()).equals(out))
        ||(((b4.getText()).equals(out))&&(b5.getText()).equals(out)&&(b6.getText()).equals(out))
        ||(((b7.getText()).equals(out))&&(b8.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b4.getText()).equals(out)&&(b7.getText()).equals(out))
        ||(((b2.getText()).equals(out))&&(b5.getText()).equals(out)&&(b8.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b6.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b5.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b5.getText()).equals(out)&&(b7.getText()).equals(out))){
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                i=0;
            if(out.equals("X")){
                p1.setText(Integer.toString(parseInt(p1.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 1 WON");
            }
            else if(out.equals("O")){
                p2.setText(Integer.toString(parseInt(p2.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 2 WON");
            }
        }
        else if((b1.isEnabled()==false)
            &&(b2.isEnabled()==false)
            &&(b3.isEnabled()==false)
            &&(b4.isEnabled()==false)
            &&(b5.isEnabled()==false)
            &&(b6.isEnabled()==false)
            &&(b7.isEnabled()==false)
            &&(b8.isEnabled()==false)
            &&(b9.isEnabled()==false)){
            JOptionPane.showMessageDialog(this,"Game Tied");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            i=0;
        }
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        b4.setEnabled(false);
        if(i%2==0){
            out="X";
        }
        else{
            out="O";
        }
        b4.setText(out);
        i++;
        if((((b1.getText()).equals(out))&&(b2.getText()).equals(out)&&(b3.getText()).equals(out))
        ||(((b4.getText()).equals(out))&&(b5.getText()).equals(out)&&(b6.getText()).equals(out))
        ||(((b7.getText()).equals(out))&&(b8.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b4.getText()).equals(out)&&(b7.getText()).equals(out))
        ||(((b2.getText()).equals(out))&&(b5.getText()).equals(out)&&(b8.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b6.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b5.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b5.getText()).equals(out)&&(b7.getText()).equals(out))){
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                i=0;
            if(out.equals("X")){
                p1.setText(Integer.toString(parseInt(p1.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 1 WON");
            }
            else if(out.equals("O")){
                p2.setText(Integer.toString(parseInt(p2.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 2 WON");
            }
        }
        else if((b1.isEnabled()==false)
            &&(b2.isEnabled()==false)
            &&(b3.isEnabled()==false)
            &&(b4.isEnabled()==false)
            &&(b5.isEnabled()==false)
            &&(b6.isEnabled()==false)
            &&(b7.isEnabled()==false)
            &&(b8.isEnabled()==false)
            &&(b9.isEnabled()==false)){
            JOptionPane.showMessageDialog(this,"Game Tied");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            i=0;
        }
    }                                  

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        b5.setEnabled(false);
        if(i%2==0){
            out="X";
        }
        else{
            out="O";
        }
        b5.setText(out);
        i++;
        if((((b1.getText()).equals(out))&&(b2.getText()).equals(out)&&(b3.getText()).equals(out))
        ||(((b4.getText()).equals(out))&&(b5.getText()).equals(out)&&(b6.getText()).equals(out))
        ||(((b7.getText()).equals(out))&&(b8.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b4.getText()).equals(out)&&(b7.getText()).equals(out))
        ||(((b2.getText()).equals(out))&&(b5.getText()).equals(out)&&(b8.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b6.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b5.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b5.getText()).equals(out)&&(b7.getText()).equals(out))){
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                i=0;
            if(out.equals("X")){
                p1.setText(Integer.toString(parseInt(p1.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 1 WON");
            }
            else if(out.equals("O")){
                p2.setText(Integer.toString(parseInt(p2.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 2 WON");
            }
        }
        else if((b1.isEnabled()==false)
            &&(b2.isEnabled()==false)
            &&(b3.isEnabled()==false)
            &&(b4.isEnabled()==false)
            &&(b5.isEnabled()==false)
            &&(b6.isEnabled()==false)
            &&(b7.isEnabled()==false)
            &&(b8.isEnabled()==false)
            &&(b9.isEnabled()==false)){
            JOptionPane.showMessageDialog(this,"Game Tied");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            i=0;
        }
    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        b6.setEnabled(false);
        if(i%2==0){
            out="X";
        }
        else{
            out="O";
        }
        b6.setText(out);
        i++;
        if((((b1.getText()).equals(out))&&(b2.getText()).equals(out)&&(b3.getText()).equals(out))
        ||(((b4.getText()).equals(out))&&(b5.getText()).equals(out)&&(b6.getText()).equals(out))
        ||(((b7.getText()).equals(out))&&(b8.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b4.getText()).equals(out)&&(b7.getText()).equals(out))
        ||(((b2.getText()).equals(out))&&(b5.getText()).equals(out)&&(b8.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b6.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b5.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b5.getText()).equals(out)&&(b7.getText()).equals(out))){
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                i=0;
            if(out.equals("X")){
                p1.setText(Integer.toString(parseInt(p1.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 1 WON");
            }
            else if(out.equals("O")){
                p2.setText(Integer.toString(parseInt(p2.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 2 WON");
            }
        }
        else if((b1.isEnabled()==false)
            &&(b2.isEnabled()==false)
            &&(b3.isEnabled()==false)
            &&(b4.isEnabled()==false)
            &&(b5.isEnabled()==false)
            &&(b6.isEnabled()==false)
            &&(b7.isEnabled()==false)
            &&(b8.isEnabled()==false)
            &&(b9.isEnabled()==false)){
            JOptionPane.showMessageDialog(this,"Game Tied");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            i=0;
        }
    }                                  

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        b8.setEnabled(false);
        if(i%2==0){
            out="X";
        }
        else{
            out="O";
        }
        b8.setText(out);
        i++;
        if((((b1.getText()).equals(out))&&(b2.getText()).equals(out)&&(b3.getText()).equals(out))
        ||(((b4.getText()).equals(out))&&(b5.getText()).equals(out)&&(b6.getText()).equals(out))
        ||(((b7.getText()).equals(out))&&(b8.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b4.getText()).equals(out)&&(b7.getText()).equals(out))
        ||(((b2.getText()).equals(out))&&(b5.getText()).equals(out)&&(b8.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b6.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b5.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b5.getText()).equals(out)&&(b7.getText()).equals(out))){
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                i=0;
            if(out.equals("X")){
                p1.setText(Integer.toString(parseInt(p1.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 1 WON");
            }
            else if(out.equals("O")){
                p2.setText(Integer.toString(parseInt(p2.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 2 WON");
            }
        }
        else if((b1.isEnabled()==false)
            &&(b2.isEnabled()==false)
            &&(b3.isEnabled()==false)
            &&(b4.isEnabled()==false)
            &&(b5.isEnabled()==false)
            &&(b6.isEnabled()==false)
            &&(b7.isEnabled()==false)
            &&(b8.isEnabled()==false)
            &&(b9.isEnabled()==false)){
            JOptionPane.showMessageDialog(this,"Game Tied");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            i=0;
        }
    }                                  

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        b9.setEnabled(false);
        if(i%2==0){
            out="X";
        }
        else{
            out="O";
        }
        b9.setText(out);
        i++;
        if((((b1.getText()).equals(out))&&(b2.getText()).equals(out)&&(b3.getText()).equals(out))
        ||(((b4.getText()).equals(out))&&(b5.getText()).equals(out)&&(b6.getText()).equals(out))
        ||(((b7.getText()).equals(out))&&(b8.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b4.getText()).equals(out)&&(b7.getText()).equals(out))
        ||(((b2.getText()).equals(out))&&(b5.getText()).equals(out)&&(b8.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b6.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b1.getText()).equals(out))&&(b5.getText()).equals(out)&&(b9.getText()).equals(out))
        ||(((b3.getText()).equals(out))&&(b5.getText()).equals(out)&&(b7.getText()).equals(out))){
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                i=0;
            if(out.equals("X")){
                p1.setText(Integer.toString(parseInt(p1.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 1 WON");
            }
            else if(out.equals("O")){
                p2.setText(Integer.toString(parseInt(p2.getText())+1));
                JOptionPane.showMessageDialog(this,"Player 2 WON");
            }
        }
        else if((b1.isEnabled()==false)
            &&(b2.isEnabled()==false)
            &&(b3.isEnabled()==false)
            &&(b4.isEnabled()==false)
            &&(b5.isEnabled()==false)
            &&(b6.isEnabled()==false)
            &&(b7.isEnabled()==false)
            &&(b8.isEnabled()==false)
            &&(b9.isEnabled()==false)){
            JOptionPane.showMessageDialog(this,"Game Tied");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            i=0;
        }
    }                                  

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        i=0;
        p1.setText("0");
        p2.setText("0");
    }                                        

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    // End of variables declaration                   
}
