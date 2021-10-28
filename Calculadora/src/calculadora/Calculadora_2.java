package calculadora;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Calculadora_2 extends javax.swing.JFrame {

    double[] numeros = new double[2];

    boolean decimal = false;

    boolean division = false;
    boolean multiplicacion = false;
    boolean resta = false;
    boolean suma = false;
    boolean porcentaje = false;
    boolean exponente = false;

    public Calculadora_2() {
        initComponents();
        setTitle("Calculadora Básica");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btnAspecto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnIgual = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btnExponente = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 252, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 280, 30));

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 280, 47));

        btnAspecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_Apagado.png"))); // NOI18N
        btnAspecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAspectoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAspecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 30, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIgual.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_3.png"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setFocusPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 50, 50));

        btn_9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botom_2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 50, 50));

        btnExponente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExponente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnExponente.setText("^");
        btnExponente.setFocusPainted(false);
        btnExponente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExponente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnExponente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btnExponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExponenteActionPerformed(evt);
            }
        });
        jPanel2.add(btnExponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 50, 50));

        btnPorcentaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.setFocusPainted(false);
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 50, 50));

        btnDivision.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnDivision.setText("/");
        btnDivision.setFocusPainted(false);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 50, 50));

        btnMultiplicacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnMultiplicacion.setText("x");
        btnMultiplicacion.setFocusPainted(false);
        btnMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnMultiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 50, 50));

        btnResta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setFocusPainted(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 50, 50));

        btnSuma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setFocusPainted(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 50, 50));

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnBorrar.setText("C");
        btnBorrar.setFocusPainted(false);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn_7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botom_2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 50));

        btn_8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botom_2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 50, 50));

        btn_4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botom_2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        btn_5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botom_2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, 50));

        btn_6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botom_2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 50, 50));

        btn_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botom_2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        btn_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botom_2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, 50));

        btn_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botom_2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 50, 50));

        btn_0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botom_2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, 50));

        btnPunto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botom_2.png"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setFocusPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_1.png"))); // NOI18N
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 300, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        Double resultado;
        String entero;
        try {
            numeros[1] = Double.parseDouble(txtResultado.getText());
            if (division == true) {
                if (numeros[1] == 0) {
                    txtResultado.setText("Error");
                } else {
                    resultado = numeros[0] / numeros[1];
                    if (resultado % 1 == 0) {
                        entero = Double.toString(resultado);
                        txtResultado.setText(entero.substring(0, entero.length() - 2));
                    } else {
                        txtResultado.setText(Double.toString(resultado));
                    }
                }
            } else if (multiplicacion == true) {
                resultado = numeros[0] * numeros[1];
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    txtResultado.setText(entero.substring(0, entero.length() - 2));
                } else {
                    txtResultado.setText(Double.toString(resultado));
                }
            } else if (resta == true) {
                resultado = numeros[0] - numeros[1];
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    txtResultado.setText(entero.substring(0, entero.length() - 2));
                } else {
                    txtResultado.setText(Double.toString(resultado));
                }
            } else if (suma == true) {
                resultado = numeros[0] + numeros[1];
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    txtResultado.setText(entero.substring(0, entero.length() - 2));
                } else {
                    txtResultado.setText(Double.toString(resultado));
                }
            } else if (porcentaje == true) {
                resultado = numeros[1] * (numeros[0] / 100.0);
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    txtResultado.setText(entero.substring(0, entero.length() - 2));
                } else {
                    txtResultado.setText(Double.toString(resultado));
                }
            } else if (exponente == true) {
                resultado = Math.pow(numeros[0], numeros[1]);
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    txtResultado.setText(entero.substring(0, entero.length() - 2));
                } else {
                    txtResultado.setText(Double.toString(resultado));
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnExponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExponenteActionPerformed
        try {
            numeros[0] = Double.parseDouble(txtResultado.getText());
            txtResultado.setText("");
            txtOperacion.setText(txtOperacion.getText() + "^");
            exponente = true;
            decimal = true;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnExponenteActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        try {
            numeros[0] = Double.parseDouble(txtResultado.getText());
            txtResultado.setText("");
            porcentaje = true;
            decimal = true;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        try {
            numeros[0] = Double.parseDouble(txtResultado.getText());
            txtResultado.setText("");
            txtOperacion.setText(txtOperacion.getText() + "/");
            division = true;
            decimal = true;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        try {
            numeros[0] = Double.parseDouble(txtResultado.getText());
            txtResultado.setText("");
            txtOperacion.setText(txtOperacion.getText() + "x");
            multiplicacion = true;
            decimal = true;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        try {
            numeros[0] = Double.parseDouble(txtResultado.getText());
            txtResultado.setText("");
            txtOperacion.setText(txtOperacion.getText() + "-");
            resta = true;
            decimal = true;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        try {
            Double resultado;
            String entero;
            numeros[0] = Double.parseDouble(txtResultado.getText());
            txtResultado.setText("");
            txtOperacion.setText(txtOperacion.getText() + "+");
            suma = true;
            decimal = true;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        txtResultado.setText(txtResultado.getText() + "9");
        txtOperacion.setText(txtOperacion.getText() + "9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        txtResultado.setText(txtResultado.getText() + "7");
        txtOperacion.setText(txtOperacion.getText() + "7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        txtResultado.setText(txtResultado.getText() + "8");
        txtOperacion.setText(txtOperacion.getText() + "8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        txtResultado.setText(txtResultado.getText() + "4");
        txtOperacion.setText(txtOperacion.getText() + "4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        txtResultado.setText(txtResultado.getText() + "5");
        txtOperacion.setText(txtOperacion.getText() + "5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        txtResultado.setText(txtResultado.getText() + "6");
        txtOperacion.setText(txtOperacion.getText() + "6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        txtResultado.setText(txtResultado.getText() + "1");
        txtOperacion.setText(txtOperacion.getText() + "1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        txtResultado.setText(txtResultado.getText() + "3");
        txtOperacion.setText(txtOperacion.getText() + "3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        txtResultado.setText(txtResultado.getText() + "2");
        txtOperacion.setText(txtOperacion.getText() + "2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        txtResultado.setText(txtResultado.getText() + "0");
        txtOperacion.setText(txtOperacion.getText() + "0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        if (decimal == false) {
            txtResultado.setText(txtResultado.getText() + ".");
            decimal = true;
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    boolean modoOscuro = false;

    private void btnAspectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAspectoActionPerformed
        if (!modoOscuro) {
            jPanel1.setBackground(Color.decode("#202D42"));
            jPanel2.setBackground(Color.decode("#323F55"));
            txtResultado.setForeground(Color.decode("#3AB298"));
            txtOperacion.setForeground(Color.decode("#3AB298"));
            btn_1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_1.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btn_1.setForeground(Color.decode("#F1F2F4"));
            btn_2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_2.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_2.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btn_2.setForeground(Color.decode("#F1F2F4"));
            btn_3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_3.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_3.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btn_3.setForeground(Color.decode("#F1F2F4"));
            btn_4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_4.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_4.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btn_4.setForeground(Color.decode("#F1F2F4"));
            btn_5.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_5.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_5.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btn_5.setForeground(Color.decode("#F1F2F4"));
            btn_6.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_6.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_6.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btn_6.setForeground(Color.decode("#F1F2F4"));
            btn_7.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_7.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_7.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btn_7.setForeground(Color.decode("#F1F2F4"));
            btn_8.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_8.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_8.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btn_8.setForeground(Color.decode("#F1F2F4"));
            btn_9.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_9.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_9.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btn_9.setForeground(Color.decode("#F1F2F4"));
            btn_0.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_0.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btn_0.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btn_0.setForeground(Color.decode("#F1F2F4"));
            btnPunto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btnPunto.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btnPunto.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnPunto.setForeground(Color.decode("#F1F2F4"));
            btnIgual.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_igual_dark.png")));
            btnIgual.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_igual_dark.png")));
            btnIgual.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnIgual.setForeground(Color.decode("#202D42"));
            btnBorrar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnBorrar.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnBorrar.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btnBorrar.setForeground(Color.decode("#3AB298"));
            btnExponente.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnExponente.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnExponente.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btnExponente.setForeground(Color.decode("#3AB298"));
            btnPorcentaje.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnPorcentaje.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnPorcentaje.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btnPorcentaje.setForeground(Color.decode("#3AB298"));
            btnDivision.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnDivision.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnDivision.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btnDivision.setForeground(Color.decode("#3AB298"));
            btnMultiplicacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnMultiplicacion.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnMultiplicacion.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btnMultiplicacion.setForeground(Color.decode("#3AB298"));
            btnResta.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnResta.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnResta.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btnResta.setForeground(Color.decode("#3AB298"));
            btnSuma.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnSuma.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_press_dark.png")));
            btnSuma.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_dark.png")));
            btnSuma.setForeground(Color.decode("#3AB298"));
            btnAspecto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_Oscuro.png")));
            modoOscuro = true;
        } else {
            Calculadora_2 frame = new Calculadora_2();
            this.dispose();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btnAspectoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAspecto;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnExponente;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
