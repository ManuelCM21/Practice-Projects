package igu.ventas;

import entidades.Detalle;
import entidades.Producto;
import entidades.Ventas;
import implementacion.ImplProducto;
import implementacion.ImplVentas;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAB REDES
 */
public class VentasJDialog extends javax.swing.JDialog {

    //MetodosSistema metodos= new MetodosSistema();
    ImplVentas metodos = new ImplVentas();
    ImplProducto ipro = new ImplProducto();
    Producto pro = new Producto();
    Ventas v = new Ventas();
    Detalle Dv = new Detalle();
    DefaultTableModel modelo;
    DefaultTableModel tabla = new DefaultTableModel();
    Date fechaVenta = new Date();
    String fechaActual = new SimpleDateFormat("dd/MM/yyyy").format(fechaVenta);
    int item;
    double Totalpagar = 0.00;

    public VentasJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ListarVentas();
        setTitle("Gestion de Ventas");
    }

    public void limpiarTabla(JTable table) {
        modelo = (DefaultTableModel) table.getModel();
        int fila = table.getRowCount();
        for (int i = 0; i < fila; i++) {
            modelo.removeRow(0);
        }
    }

    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void TotalPagar() {
        Totalpagar = 0.00;
        int numFila = jTableVentas.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(jTableVentas.getModel().getValueAt(i, 4)));
            Totalpagar = Totalpagar + cal;
        }
        LabelTotal.setText(String.format("%.2f", Totalpagar));
    }

    private void RegistrarVenta() {
        String cliente = v_cliente.getText();
        double monto = Totalpagar;
        v.setNombre_cli(cliente);
        v.setTotal(monto);
        v.setFecha(fechaActual);
        metodos.RegistrarVenta(v);
    }

    public void ListarVentas() {
        List<Ventas> ListarVenta = metodos.Listarventas();
        modelo = (DefaultTableModel) jTableDetalleVentas.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < ListarVenta.size(); i++) {
            ob[0] = ListarVenta.get(i).getId();
            ob[1] = ListarVenta.get(i).getNombre_cli();
            ob[2] = ListarVenta.get(i).getTotal();
            ob[3] = ListarVenta.get(i).getFecha();
            modelo.addRow(ob);
        }
        jTableDetalleVentas.setModel(modelo);

    }

    private void RegistrarDetalle() {
        int id = metodos.IdVenta();
        for (int i = 0; i < jTableVentas.getRowCount(); i++) {
            String id_pro = jTableVentas.getValueAt(i, 0).toString();
            int cant = Integer.parseInt(jTableVentas.getValueAt(i, 2).toString());
            double precio = Double.parseDouble(jTableVentas.getValueAt(i, 3).toString());
            Dv.setId_pro(id_pro);
            Dv.setCantidad(cant);
            Dv.setPrecio(precio);
            Dv.setId(id);
            metodos.RegistrarDetalle(Dv);
        }
//        int cliente = Integer.parseInt(txtIdCV.getText());
//        Vdao.pdfV(id, cliente, Totalpagar, LabelVendedor.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LabelTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        v_producto = new javax.swing.JTextField();
        v_cliente = new javax.swing.JTextField();
        jButtonGrabar = new javax.swing.JButton();
        v_cantidad = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        p_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        v_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDetalleVentas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        v_precio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        v_stock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTotal.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        LabelTotal.setForeground(new java.awt.Color(255, 255, 255));
        LabelTotal.setText("-----");
        jPanel1.add(LabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 90, 40));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Producto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLIENTE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 65, -1, -1));

        v_producto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        v_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_productoActionPerformed(evt);
            }
        });
        v_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                v_productoKeyPressed(evt);
            }
        });
        jPanel1.add(v_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 20, 180, -1));

        v_cliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(v_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 60, 180, -1));

        jButtonGrabar.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jButtonGrabar.setText("Grabar");
        jButtonGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrabarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 100, 30));

        v_cantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(v_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 70, -1));

        jButtonEliminar.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 100, 30));

        p_id.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 0, 0));

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TOTAL:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));
        jPanel1.add(v_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 0));

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cantidad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 25, -1, -1));

        btnGenerar.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 20, 110, 60));

        jPanelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 760, 100));
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jTableVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripcion", "Cantidad", "Precio Uni.", "Total"
            }
        ));
        jTableVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVentas);
        if (jTableVentas.getColumnModel().getColumnCount() > 0) {
            jTableVentas.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTableVentas.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTableVentas.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTableVentas.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jPanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 650, 130));

        jTableDetalleVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTableDetalleVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Total", "Fecha"
            }
        ));
        jTableDetalleVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDetalleVentasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableDetalleVentas);
        if (jTableDetalleVentas.getColumnModel().getColumnCount() > 0) {
            jTableDetalleVentas.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jPanelPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 760, 190));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        v_precio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        v_precio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(v_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("STOCK:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 85, -1, -1));

        v_stock.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel2.add(v_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanelPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 100, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void v_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_productoActionPerformed

    private void jButtonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrabarActionPerformed
        if (!"".equals(v_cantidad.getText())) {
            String id = v_id.getText();
            String descripcion = v_producto.getText();
            int cant = Integer.parseInt(v_cantidad.getText());
            double precio = Double.parseDouble(v_precio.getText());
            double total = cant * precio;
            int stock = Integer.parseInt(v_stock.getText());
            if (stock >= cant) {
                item = item + 1;
                tabla = (DefaultTableModel) jTableVentas.getModel();
                for (int i = 0; i < jTableVentas.getRowCount(); i++) {
                    if (jTableVentas.getValueAt(i, 1).equals(v_producto.getText())) {
                        JOptionPane.showMessageDialog(null, "El producto ya esta registrado");
                        return;
                    }
                }
                ArrayList lista = new ArrayList();
                lista.add(item);
                lista.add(id);
                lista.add(descripcion);
                lista.add(cant);
                lista.add(precio);
                lista.add(total);
                Object[] O = new Object[5];
                O[0] = lista.get(1);
                O[1] = lista.get(2);
                O[2] = lista.get(3);
                O[3] = lista.get(4);
                O[4] = lista.get(5);
                tabla.addRow(O);
                jTableVentas.setModel(tabla);
                TotalPagar();
                v_id.setText("");
                v_producto.setText("");
                v_cantidad.setText("");
                v_precio.setText("");
                v_producto.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Stock no disponible");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese Cantidad");
        }
    }//GEN-LAST:event_jButtonGrabarActionPerformed

    private void jTableVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVentasMouseClicked

    }//GEN-LAST:event_jTableVentasMouseClicked

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        modelo = (DefaultTableModel) jTableVentas.getModel();
        modelo.removeRow(jTableVentas.getSelectedRow());
        TotalPagar();
        v_producto.requestFocus();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableDetalleVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDetalleVentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableDetalleVentasMouseClicked

    private void v_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_v_productoKeyPressed
        Producto pro = new Producto();
        ImplVentas metodos = new ImplVentas();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(v_producto.getText())) {
                String nombre = v_producto.getText();
                pro = metodos.BuscarPro(nombre);
                if (pro.getNombre() != null) {
                    v_id.setText("" + pro.getId());
                    v_precio.setText("" + pro.getPrecio());
                    v_stock.setText("" + pro.getStock());
                    v_cantidad.requestFocus();
                } else {
                    LimpiarTable();
                    v_producto.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese el codigo del producto");
                v_producto.requestFocus();
            }
        }
    }//GEN-LAST:event_v_productoKeyPressed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (jTableVentas.getRowCount() > 0) {
            if (!"".equals(v_cliente.getText())) {
                RegistrarVenta();
                RegistrarDetalle();
                //ActualizarStock();
                limpiarTabla(jTableVentas);
                LabelTotal.setText("-------");
                limpiarTabla(jTableDetalleVentas);
                ListarVentas();
            } else {
                JOptionPane.showMessageDialog(null, "Debes buscar un cliente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos en la venta");
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void ActualizarStock() {
        for (int i = 0; i < jTableVentas.getRowCount(); i++) {
            String id = jTableVentas.getValueAt(i, 0).toString();
            int cant = Integer.parseInt(jTableVentas.getValueAt(i, 2).toString());
            pro = ipro.BuscarId(id);
            int StockActual = pro.getStock() - cant;
            metodos.ActualizarStock(StockActual, id);
        }
    }

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
            java.util.logging.Logger.getLogger(VentasJDialog.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentasJDialog.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentasJDialog.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentasJDialog.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentasJDialog dialog = new VentasJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JButton btnGenerar;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDetalleVentas;
    private javax.swing.JTable jTableVentas;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField v_cantidad;
    private javax.swing.JTextField v_cliente;
    private javax.swing.JTextField v_id;
    private javax.swing.JTextField v_precio;
    private javax.swing.JTextField v_producto;
    private javax.swing.JTextField v_stock;
    // End of variables declaration//GEN-END:variables
}
