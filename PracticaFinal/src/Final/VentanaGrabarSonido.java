package Final;

import java.io.File;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import sm.sound.SMRecorder;
import sm.sound.SMSoundRecorder;

/**
 *
 * @author Javier Aranda
 */
public class VentanaGrabarSonido extends javax.swing.JInternalFrame {

    SMRecorder grabar;
    
    public VentanaGrabarSonido(File f) {
        initComponents();
        grabar=new SMSoundRecorder(f);
        //grabar.setLineListener(escuchador);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BotonGrabar = new javax.swing.JToggleButton();
        BotonParar = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);

        buttonGroup1.add(BotonGrabar);
        BotonGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RecordDisabled_48x48.png"))); // NOI18N
        BotonGrabar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RecordPressed_48x48.png"))); // NOI18N
        BotonGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGrabarActionPerformed(evt);
            }
        });

        buttonGroup1.add(BotonParar);
        BotonParar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/StopNormalRed_48x48.png"))); // NOI18N
        BotonParar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/StopPessedBlue_48x48.png"))); // NOI18N
        BotonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BotonGrabar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonParar)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonParar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGrabarActionPerformed
        // Grabar un sonido
        if(grabar!=null)grabar.record();
    }//GEN-LAST:event_BotonGrabarActionPerformed

    private void BotonPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPararActionPerformed
        // Dejar de grabar
        if(grabar!=null)grabar.stop();
    }//GEN-LAST:event_BotonPararActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonGrabar;
    private javax.swing.JToggleButton BotonParar;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables

    
    LineListener escuchador = new LineListener(){
        @Override
        public void update(LineEvent le) {
            if(le.getType()==LineEvent.Type.STOP){
                buttonGroup1.clearSelection();
            } 
        }
    };


}
