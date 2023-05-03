/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import database.Conexion;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import libreriabasica.PasswordUtils;
import libreriabasica.Usuario;


public class Login extends javax.swing.JFrame
{

    /**
     * Creates new form Login
     */
    public Login ()
    {
        initComponents ();
        //Verifico si abre la Base de Datos
        //Conexion conn;//=new Conexion();
        //conn.
        Conexion.getInstancia ();
        if(Conexion.instancia==null)
        {
            System.out.println("NO conectado");
           
        }
        else
        {
             System.out.println("Conectado");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        IniciaS = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsuario1 = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        Btn_login = new javax.swing.JLabel();
        CheRecordarC = new javax.swing.JLabel();
        lblGenerarClave = new javax.swing.JLabel();
        btnCrearC = new javax.swing.JButton();
        User = new javax.swing.JLabel();
        Padlock = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 175, 198));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        Login.setForeground(new java.awt.Color(93, 95, 239));
        Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login.setText("Login");
        jPanel2.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 140, 50));

        IniciaS.setBackground(new java.awt.Color(0, 0, 0));
        IniciaS.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        IniciaS.setText("Iniciar Sesión");
        jPanel2.add(IniciaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel3.setBackground(new java.awt.Color(236, 236, 236));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Candado.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 50, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 130, 10));

        txtUsuario1.setBackground(new java.awt.Color(236, 236, 236));
        txtUsuario1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        txtUsuario1.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario1.setText("Nombre de usuario");
        txtUsuario1.setBorder(null);
        txtUsuario1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                txtUsuario1MouseClicked(evt);
            }
        });
        txtUsuario1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtUsuario1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 300, 50));

        txtContrasena.setBackground(new java.awt.Color(236, 236, 236));
        txtContrasena.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(204, 204, 204));
        txtContrasena.setText("Contrasena");
        txtContrasena.setBorder(null);
        txtContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                txtContrasenaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                txtContrasenaMousePressed(evt);
            }
        });
        txtContrasena.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtContrasenaActionPerformed(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtContrasenaKeyReleased(evt);
            }
        });
        jPanel2.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 300, 50));

        Btn_login.setBackground(new java.awt.Color(120, 121, 241));
        Btn_login.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        Btn_login.setForeground(new java.awt.Color(255, 255, 255));
        Btn_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_login.setText("Login");
        Btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_login.setOpaque(true);
        Btn_login.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                Btn_loginMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                Btn_loginMousePressed(evt);
            }
        });
        jPanel2.add(Btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 340, 50));

        CheRecordarC.setBackground(new java.awt.Color(204, 204, 204));
        CheRecordarC.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        CheRecordarC.setForeground(new java.awt.Color(102, 102, 102));
        CheRecordarC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheRecordarC.setText("Recordar Contraseña");
        CheRecordarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheRecordarC.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CheRecordarCMouseClicked(evt);
            }
        });
        jPanel2.add(CheRecordarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 150, 20));

        lblGenerarClave.setBackground(new java.awt.Color(204, 204, 204));
        lblGenerarClave.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblGenerarClave.setForeground(new java.awt.Color(102, 102, 102));
        lblGenerarClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenerarClave.setText("Generar Contraseña");
        lblGenerarClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGenerarClave.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblGenerarClaveMouseClicked(evt);
            }
        });
        jPanel2.add(lblGenerarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 150, 20));

        btnCrearC.setBackground(new java.awt.Color(236, 236, 236));
        btnCrearC.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btnCrearC.setText("Crear cuenta");
        btnCrearC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearC.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCrearCActionPerformed(evt);
            }
        });
        jPanel2.add(btnCrearC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 426, 350, 50));

        User.setBackground(new java.awt.Color(236, 236, 236));
        User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Usuario.png"))); // NOI18N
        User.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        User.setOpaque(true);
        jPanel2.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 50, 50));

        Padlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MicrosoftTeams-image.png"))); // NOI18N
        jPanel2.add(Padlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 446, 512));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bk1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bk2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, -1, -1));
        jPanel1.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtContrasenaActionPerformed
    {//GEN-HEADEREND:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtContrasenaMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtContrasenaMousePressed
    {//GEN-HEADEREND:event_txtContrasenaMousePressed

    }//GEN-LAST:event_txtContrasenaMousePressed

    private void txtContrasenaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtContrasenaKeyReleased
    {//GEN-HEADEREND:event_txtContrasenaKeyReleased
        //Jeje para cada tecla   pulsada
    }//GEN-LAST:event_txtContrasenaKeyReleased

    private void Btn_loginMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_Btn_loginMouseClicked
    {//GEN-HEADEREND:event_Btn_loginMouseClicked

        Usuario objU = new Usuario (txtUsuario1.getText ());
        if (objU.ValidarUsuario ())
        {
            System.out.println ("Usuario Valido");

        } else
        {
            System.out.println ("Usuario no valido");
            if (objU.tipo_error == 1)
            {
                System.out.println ("Cadena no  tiene caracteres suficientes");
            }
            if (objU.tipo_error == 2)
            {
                System.out.println ("No cuenta con mayuscula");
            }
            if (objU.tipo_error == 3)
            {
                System.out.println ("No cuenta con minusculas");
            }
            if (objU.tipo_error == 4)
            {
                System.out.println ("No cuenta con Numeros");
            }
            if (objU.tipo_error == 5)
            {
                System.out.println ("No cuenta con caracteres");
            }
        }

        char[] passwordChars = txtContrasena.getPassword ();
        String password = new String (passwordChars);
        boolean hasUpperCase =  ! password.equals (password.toLowerCase ());
        boolean hasLowerCase =  ! password.equals (password.toUpperCase ());
        boolean hasNumber = password.matches (".*\\d.*");
        boolean hasSpecialChar =  ! password.matches ("[A-Za-z0-9]*");
        boolean hasValidLength = password.length () >= 8;

        if (hasValidLength && hasUpperCase && hasLowerCase && hasNumber && hasSpecialChar)
        {
            txtContrasena.setForeground (Color.green);
        } else
        {
            txtContrasena.setForeground (Color.red);
        }

        if (txtUsuario1.getText ().isEmpty () || txtUsuario1.getText ().equals ("Nombre de usuario"))
        {
            JOptionPane.showMessageDialog (this, "Debes escribir un  nombre", "Bienvenido al sistema...", JOptionPane.ERROR_MESSAGE);
        } else
        {
            if (String.valueOf (txtContrasena.getPassword ()).isEmpty () || txtContrasena.getPassword ().equals ("Contrasena"))
            {
                JOptionPane.showMessageDialog (this, "Debes escribir una contrasena");
            } else if (txtUsuario1.getText ().equals ("Admin") && String.valueOf (txtContrasena.getPassword ()).equals ("12345"))
            {

                // System.out.println("Entrando al sistema...");
                FrmPrincipal frmPrincipal = new FrmPrincipal ();
                frmPrincipal.setVisible (true);
                //this.setVisible (false);
                dispose ();
            } else
            {
                JOptionPane.showMessageDialog (this, "Nombre de Usuario o Contrasena");
            }
        }
        PasswordUtils RC = new PasswordUtils ();
       // RC.recuperarContrasena (password);
       // JOptionPane.showMessageDialog (this, password);
        String contrasena = RC.recuperarContrasena (txtUsuario1.getText ());
        if (contrasena != null)
        {
            txtContrasena.setText (contrasena);
            txtContrasena.setForeground (Color.blue);

        } /*else
        {
            JOptionPane.showMessageDialog (this, password);
        }*/

    }//GEN-LAST:event_Btn_loginMouseClicked

    private void txtUsuario1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtUsuario1MouseClicked
    {//GEN-HEADEREND:event_txtUsuario1MouseClicked
        if (txtUsuario1.getText ().equals ("Nombre de usuario"))
        {
            txtUsuario1.setText ("");
            txtUsuario1.setForeground (Color.black);
        }
        if (String.valueOf (txtContrasena.getPassword ()).isEmpty ())
        {
            txtContrasena.setText ("Contrasena");
            txtContrasena.setForeground (Color.gray);
        }
    }//GEN-LAST:event_txtUsuario1MouseClicked

    private void txtContrasenaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtContrasenaMouseClicked
    {//GEN-HEADEREND:event_txtContrasenaMouseClicked
        if (String.valueOf (txtContrasena.getPassword ()).equals ("Contrasena"))
        {
            txtContrasena.setText ("");
            txtContrasena.setForeground (Color.black);
        }
        if (txtUsuario1.getText ().isEmpty ())
        {
            txtUsuario1.setText ("Nombre de usuario");
            txtUsuario1.setForeground (Color.gray);
        }
    }//GEN-LAST:event_txtContrasenaMouseClicked

    private void txtUsuario1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtUsuario1ActionPerformed
    {//GEN-HEADEREND:event_txtUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1ActionPerformed

    private void btnCrearCActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCrearCActionPerformed
    {//GEN-HEADEREND:event_btnCrearCActionPerformed
        CrearCuenta CC = new CrearCuenta ();
        CC.setVisible (true);
        dispose ();
    }//GEN-LAST:event_btnCrearCActionPerformed

    private void lblGenerarClaveMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblGenerarClaveMouseClicked
    {//GEN-HEADEREND:event_lblGenerarClaveMouseClicked
        // TODO add your handling code here:
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiales = "!@#$%^&*()_+-=[]{};':\"\\|,.<>/?";
        String caracteres = mayusculas + minusculas + numeros + especiales;
        StringBuilder contraseña = new StringBuilder ();
        Random rnd = new Random ();
        int longitudMinima = 8;

        // Agregar una letra mayúscula
        contraseña.append (mayusculas.charAt (rnd.nextInt (mayusculas.length ())));

        // Agregar una letra minúscula
        contraseña.append (minusculas.charAt (rnd.nextInt (minusculas.length ())));

        // Agregar un número
        contraseña.append (numeros.charAt (rnd.nextInt (numeros.length ())));

        // Agregar un caracter especial
        contraseña.append (especiales.charAt (rnd.nextInt (especiales.length ())));

        // Agregar caracteres aleatorios hasta cumplir la longitud mínima
        while (contraseña.length () < longitudMinima)
        {
            contraseña.append (caracteres.charAt (rnd.nextInt (caracteres.length ())));
        }

        txtContrasena.setText (contraseña.toString ());
        System.out.println ("La contrasena es: " + contraseña.toString ());

    }//GEN-LAST:event_lblGenerarClaveMouseClicked

    private void Btn_loginMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_Btn_loginMousePressed
    {//GEN-HEADEREND:event_Btn_loginMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_loginMousePressed

    private void CheRecordarCMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CheRecordarCMouseClicked
    {//GEN-HEADEREND:event_CheRecordarCMouseClicked
        // TODO add your handling code here:
        if(txtUsuario1.getText ().equals ("Admin"))
        {
            txtUsuario1.setForeground (Color.blue);
            txtContrasena.setText ("12345");
            txtContrasena.setForeground (Color.blue);
        }
    }//GEN-LAST:event_CheRecordarCMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main (String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels ())
            {
                if ("Nimbus".equals (info.getName ()))
                {
                    javax.swing.UIManager.setLookAndFeel (info.getClassName ());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger (Login.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger (Login.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger (Login.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger (Login.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater (new Runnable ()
        {
            public void run ()
            {
                new Login ().setVisible (true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_login;
    private javax.swing.JLabel CheRecordarC;
    private javax.swing.JLabel IniciaS;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Padlock;
    private javax.swing.JLabel User;
    private javax.swing.JButton btnCrearC;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblGenerarClave;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
