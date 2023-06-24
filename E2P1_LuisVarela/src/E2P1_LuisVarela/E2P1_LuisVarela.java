/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package E2P1_LuisVarela;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Luis Andres Varela
 */
public class E2P1_LuisVarela extends javax.swing.JFrame {

    private Scanner lea = new Scanner(System.in);
    private Numero m = new Numero();
    private ArrayList<Numero> Num = new ArrayList<>();

    /**
     * Creates new form E2P1_LuisVarela
     */
    public E2P1_LuisVarela() {
        initComponents();
    }

    //String letras="ABCDEF"
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numero = new javax.swing.JButton();
        operaciones = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        numero.setBackground(new java.awt.Color(255, 255, 255));
        numero.setForeground(new java.awt.Color(0, 0, 0));
        numero.setText("Numero");
        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        operaciones.setBackground(new java.awt.Color(255, 255, 255));
        operaciones.setForeground(new java.awt.Color(0, 0, 0));
        operaciones.setText("operaciones");
        operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacionesActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText(" Examen ll");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(numero)
                .addGap(18, 18, 18)
                .addComponent(operaciones)
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Agregar numero:");
            System.out.println("2.Eliminar numero:");
            System.out.println("3.Volver al menu");
            int opcion1 = lea.nextInt();
            switch (opcion1) {
                case 1: {
                    int base;
                    do {
                        System.out.println("Ingrese un numero base");
                        base = lea.nextInt();
                    } while (base >= 36 || base <= 1);
                    boolean no_validado = true;
                    int numero1 = 0;
                    String numero;
                    do {
                        System.out.println("Ingrese un numero");
                        numero = lea.next();
                        boolean validado = validar(numero);
                        if (validado) {
                            numero1 = Integer.parseInt(numero);
                        }
                        if (numero1 >= 0) {
                            no_validado = false;
                        } else {
                            System.out.println("Error ");
                        }
                    } while (no_validado);
                    String decimal = m.baseToDec(base, numero1);
                    System.out.println(decimal);
                    Numero m = new Numero(base, numero1, decimal);
                    Num.add(m);
                }
                break;
                case 2: {
                    imprimir();
                    System.out.println("Ingrese el indice del numero que desea eliminar:");
                    int posicion = lea.nextInt();
                    Num.remove(posicion - 1);
                }
                break;
                case 3: {
                    seguir = false;
                }
                break;
                default:
                    System.out.println("Error");
            }
        }
    }//GEN-LAST:event_numeroActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void operacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacionesActionPerformed
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Suma numero:");
            System.out.println("2.Restar numero:");
            System.out.println("3.Multiplicar numero:");
            System.out.println("4.Volver al menu");
            int opcion1 = lea.nextInt();
            switch (opcion1) {
                case 1: {
                    imprimir();
                    System.out.println("Ingrese el indice del primer numero");
                    int primero = lea.nextInt();
                    System.out.println("Ingrese el indice del segundo numero");
                    int segundo = lea.nextInt();
//                    Numero a;
//                    a = Num.get(num1 - 1);
//                    int num1 =
                }
                break;
                case 2: {
                    imprimir();
                    System.out.println("Ingrese el indice del primer numero");
                    int primero = lea.nextInt();
                    System.out.println("Ingrese el indice del segundo numero");
                    int segundo = lea.nextInt();
                }
                break;
                case 3: {
                    imprimir();
                    System.out.println("Ingrese el indice del primer numero");
                    int primero = lea.nextInt();
                    System.out.println("Ingrese el indice del segundo numero");
                    int segundo = lea.nextInt();
                }
                break;
                case 4: {
                    seguir = false;
                }
                break;
                default:
                    System.out.println("Error");
            }
        }

    }//GEN-LAST:event_operacionesActionPerformed

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
            java.util.logging.Logger.getLogger(E2P1_LuisVarela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E2P1_LuisVarela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E2P1_LuisVarela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E2P1_LuisVarela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E2P1_LuisVarela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton numero;
    private javax.swing.JButton operaciones;
    // End of variables declaration//GEN-END:variables

    public boolean validar(String numero) {
        String num = "0123456789";
        int cantidad = 0;
        boolean validado = false;
        for (int i = 0; i < numero.length(); i++) {
            for (int j = 0; j < num.length(); j++) {
                if (numero.charAt(i) == num.charAt(j)) {
                    cantidad++;
                }
            }
        }
        if (cantidad == numero.length()) {
            validado = true;
        }
        return validado;
    }

    public void imprimir() {
        int num1 = 1;
        Numero a;
        while (num1 <= Num.size()) {
            a = Num.get(num1 - 1);
            System.out.println("Lista de Numero:");
            System.out.println(num1 + "." + a.getresultado() + " base " + a.getbase() + ":" + a.getnumero()+"\n");
            num1++;
        }
    }

}
