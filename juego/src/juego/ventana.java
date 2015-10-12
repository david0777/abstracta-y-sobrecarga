
package juego;

import java.util.Random;
import javax.swing.DefaultListModel;

public class ventana extends javax.swing.JFrame {

    Random andrea = new Random();
    DefaultListModel plana;
   
    public ventana() {
        initComponents();
   setLocationRelativeTo(null);
    
    plana = new   DefaultListModel();
    pele.setModel(plana);
    
    
    }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ronaldo = new javax.swing.JButton();
        messi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pele = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ronaldo.setText("ordenar");
        ronaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ronaldoActionPerformed(evt);
            }
        });

        messi.setText("desordenar");
        messi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messiActionPerformed(evt);
            }
        });

        pele.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(pele);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messi)
                    .addComponent(ronaldo))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(ronaldo)
                        .addGap(33, 33, 33)
                        .addComponent(messi)))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ronaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ronaldoActionPerformed
       plana.clear();
        
     plana.addElement("1. Las Sagradas Escrituras");
     plana.addElement("2. La Trinidad");
     plana.addElement("3. Dios Padre");
     plana.addElement("4. Dios Hijo");
     plana.addElement("5. Dios Espíritu Santo");
     plana.addElement("6. Dios es el Creador");
     plana.addElement("7. La Naturaleza del Hombre");
     plana.addElement("8. El Gran Conflicto");
     plana.addElement("9. Vida, Muerte y Ressurrección de Cristo");
     plana.addElement("10. La Experiencia de la Salvación");
     plana.addElement("11. El crecimiento en Cristo");
     plana.addElement("12. La Iglesia");
     plana.addElement("13. El Remaneciente y su Misión");
     plana.addElement("14. Unidad en el Cuerpo de Cristo");
     plana.addElement("15. El Bautisimo");
     plana.addElement("16. La Cena del Señor");
     plana.addElement("17. Dones y Ministerios Espirituales");
     plana.addElement("18. El Don de Profecía");
     plana.addElement("19. La Ley de Dios");
     plana.addElement("20. El Sábado");
     plana.addElement("21. Mayordomía");
     plana.addElement("22. Conducta Cristiana");
     plana.addElement("23. Matrimonio y Familia");
     plana.addElement("24. El Ministerio de Cristo en el Santuario Celestial");
     plana.addElement("25. La Segunda Venida de Cristo");
     plana.addElement("26. Muerte y Resurrección");
     plana.addElement("27. El Milenio y el Fin del Pecado");
     plana.addElement("28. La Nueva Tierra");
    }//GEN-LAST:event_ronaldoActionPerformed

    private void messiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messiActionPerformed
    String[] gaus = new String[28];
    
    gaus [0] = "1. Las Sagradas Escrituras";
    gaus [1] = "2. La Trinida";
    gaus [2] = "3. Dios Padre";       
    gaus [3] = "4. Dios Hijo";
    gaus [4] = "5. Dios Espíritu Santo";
    gaus [5] = "6. Dios es el Creador";
    gaus [6] = "7.La Naturaleza del Hombre";
    gaus [7] ="8. El Gran Conflicto";
    gaus[8] = "9. Vida, Muerte y Ressurrección de Cristo";
    gaus [9] = "10. La Experiencia de la Salvación";
    gaus [10] = "11. El crecimiento en Cristo";
    gaus [11] = "12. La Iglesia";
    gaus [12] = "13. El Remaneciente y su Misión";
    gaus [13] = "14. Unidad en el Cuerpo de Cristo";      
    gaus [14] = "15. El Bautisimo";       
    gaus [15] = "16. La Cena del Señor";    
    gaus [16] =  "17. Dones y Ministerios Espirituales";      
    gaus [17] = "18. El Don de Profecía";       
    gaus [18] =  "19. La Ley de Dios";    
    gaus [19] =  "20. El Sábado";      
    gaus [20] =  "21. Mayordomía";   
    gaus [21] =  "22. Conducta Cristiana";     
    gaus [22] =  "23. Matrimonio y Familia";     
    gaus [23] =  "24. El Ministerio de Cristo en el Santuario Celestial";
    gaus [24] =   "25. La Segunda Venida de Cristo";     
    gaus [25] = "26. Muerte y Resurrección";       
    gaus [26] = "27. El Milenio y el Fin del Pecado";
    gaus [27] = "28. La Nueva Tierra";   
     
       plana.clear();
        for (int i = 0; i < 28; i++) {
       
      plana.addElement(gaus [ andrea.nextInt(28)]);
            
        }
            
            
            
    }//GEN-LAST:event_messiActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton messi;
    private javax.swing.JList pele;
    private javax.swing.JButton ronaldo;
    // End of variables declaration//GEN-END:variables
}
